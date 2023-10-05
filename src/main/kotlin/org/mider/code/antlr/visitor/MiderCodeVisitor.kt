package org.mider.code.antlr.visitor

import org.antlr.v4.runtime.tree.TerminalNode
import org.mider.code.antlr.*
import org.mider.code.antlr.g4.MiderCodeParser
import org.mider.code.antlr.g4.MiderCodeParserBaseVisitor
import org.mider.code.antlr.stave.*

class MiderCodeVisitor(
    private val tcc: TrackConfigContext
): MiderCodeParserBaseVisitor<MutableList<StaveElement>>() {

    override fun visitNoteExperssion(ctx: MiderCodeParser.NoteExperssionContext): MutableList<StaveElement> {
        return tcc.use {
            val list = mutableListOf<StaveElement>()
            val expectChannel = tcc.channel
            val generate = parseSingleNote(ctx.note(), expectChannel)
            list += generate

            ctx.note().RepeatSuffix()?.let {
                val times = it.symbol.text.removePrefix("x").removePrefix("X").toInt() - 1
                repeat(times) {
                    list += generate
                }
            }

            val provideTCC = this.copy().apply {
                relativeBaseNoteDuration = generate.duration
                relativeBaseNoteOctave = generate.octave
                relativeBaseNotePrefix = generate.prefix
                relativeBaseNoteVelocity = generate.velocity
                octaveMode = NoteOctaveMode.Relative
                durationMode = NoteDurationMode.Relative
                pitchMode = NotePitchMode.Relative
                velocityMode = NoteVelocityMode.Relative
            }

            for (cloneContext in ctx.noteClone()) {
                list += parseCloneNote(
                    provide = provideTCC,
                    base = generate,
                    prefix = cloneContext.PitchPrefix(),
                    duration = cloneContext.DurationSuffix(),
                    absOctave = cloneContext.AbsoluteOctaveSuffix(),
                    moveOctave = cloneContext.MoveOctaveSuffix(),
                    velocity = cloneContext.VelocitySuffix(),
                    expectChannel = expectChannel,
                    cloneSymbol = cloneContext.Clone()?.let { "~" } ?: cloneContext.ModifyPitchBase().symbol.text
                )
            }

            list
        }
    }

    override fun visitChordExperssion(ctx: MiderCodeParser.ChordExperssionContext): MutableList<StaveElement> {
        return tcc.use {
            val list = mutableListOf<StaveElement>()
            val chord = ctx.chord()



            list += Chord(mutableListOf<Note>().apply {
                for (note in chord.note()) {
                    this += parseSingleNote(note, channel)
                }
            }, ArpeggioType.None)

            list
        }
    }

    private fun TrackConfigContext.parseSingleNote(note: MiderCodeParser.NoteContext, expectChannel: Int): Note {
        val name = note.NoteName().symbol.text
        val prefix: NotePrefix = parsePrefix(note.PitchPrefix())
        val octave: Int = note.AbsoluteOctaveSuffix()?.let {
            it.symbol.text.toInt()
        } ?: run {
            parseOctave(note.AbsoluteOctaveSuffix(), note.MoveOctaveSuffix()) + (if (name.first().isUpperCase()) 1 else 0 )
        }
        val duration: Duration = parseDuration(note.DurationSuffix())
        val velocity: Velocity = parseVelocity(note.VelocitySuffix())
        return Note(name, prefix, duration, octave, velocity, expectChannel)
    }

    private fun parseCloneNote(
        provide: TrackConfigContext, // will be modified
        base: Note,
        prefix: List<TerminalNode>,
        duration: List<TerminalNode>,
        absOctave: TerminalNode?,
        moveOctave: List<TerminalNode>,
        velocity: TerminalNode?,
        expectChannel: Int,
        cloneSymbol: String
    ): Note {
        return provide.use {

            val purePrefix = TrackConfigContext(pitchMode = NotePitchMode.Absolute).parsePrefix(prefix)

            Note(
                name = base.name,
                duration = parseDuration(duration),
                octave = parseOctave(absOctave, moveOctave),
                expectChannel = expectChannel,
                velocity = parseVelocity(velocity),
                prefix = if (cloneSymbol == "~") parsePrefix(prefix) else relativeNotePrefixOffset(
                    when (cloneSymbol) {
                        "^" -> NotePrefix.sharp() + purePrefix
                        "m" -> NotePrefix.sharp(2) + purePrefix
                        "v" -> NotePrefix.flat() + purePrefix
                        "w" -> NotePrefix.flat(2) + purePrefix
                        else -> error("unsupported clone operation: '$cloneSymbol'")
                    }
                )
            )
        }
    }

    private fun TrackConfigContext.parseVelocity(velocity: TerminalNode?): Velocity {
        return velocity?.let {

            var on: Int? = null
            var off: Int? = null

            // this branch will contain % if it is attached, one is set amount of on and off
            val sp = it.symbol.text.split("%")

            if (sp.size == 2) {
                // ['', 'on12']
                // ['', 'off12']
                // ['', '12']
                if (sp[1].startsWith("on"))
                    on = sp[1].toInt()
                else if (sp[1].startsWith("off"))
                    off = sp[1].toInt()
                else {
                    on = sp[1].toInt()
                    off = sp[1].toInt()
                }
            } else if (sp.size == 3) {
                // ['', 'on12', 'off11']
                // ['', 'off12', 'on11']
                on = sp.first { it.startsWith("on") }.toInt()
                off = sp.first { it.startsWith("off") }.toInt()
            }

            on = on ?: when(this.velocityMode) {
                org.mider.code.antlr.NoteVelocityMode.Fixed -> this.fixedBaseNote.velocity.on
                org.mider.code.antlr.NoteVelocityMode.Relative -> this.relativeBaseNoteVelocity.on
            }

            off = off ?: when(this.velocityMode) {
                org.mider.code.antlr.NoteVelocityMode.Fixed -> this.fixedBaseNote.velocity.off
                org.mider.code.antlr.NoteVelocityMode.Relative -> this.relativeBaseNoteVelocity.off
            }

            val retVel = Velocity(on, off)
            if (this.velocityMode == org.mider.code.antlr.NoteVelocityMode.Relative) {
                relativeNoteVelocity(retVel)
            }

            retVel
        } ?: run {
            when (this.velocityMode) {
                org.mider.code.antlr.NoteVelocityMode.Fixed -> this.fixedBaseNote.velocity
                org.mider.code.antlr.NoteVelocityMode.Relative -> this.relativeBaseNoteVelocity
            }
        }
    }
    private fun TrackConfigContext.parseDuration(durationTerminalNodes: List<TerminalNode>): Duration {
        val durationOffset = durationTerminalNodes.let { ds ->
            Duration(
                dots = ds.count { it.symbol.text == "." },
                pluses = ds.count { it.symbol.text == "+" } - ds.count { it.symbol.text == "-" },
                multiples = ds.filter { it.symbol.text.startsWith("*") }
                    .map { it.symbol.text.removePrefix("*").toInt() },
                divisions = ds.filter { it.symbol.text.startsWith("/") }
                    .map { it.symbol.text.removePrefix("/").toInt() }
            )
        }

        return when (this.durationMode) {
            org.mider.code.antlr.NoteDurationMode.Fixed -> this.fixedBaseNote.duration + durationOffset
            org.mider.code.antlr.NoteDurationMode.Relative -> relativeNoteDurationOffset(durationOffset)
        }
    }
    private fun TrackConfigContext.parseOctave(absOctave: TerminalNode?, moveOctaves: List<TerminalNode>): Int {
        return absOctave?.symbol?.text?.toInt() ?: run {
            val octaveOffset = with(moveOctaves) {
                 count { it.symbol.text in "hh" } + count { it.symbol.text == "H" } * 2 -
                (count { it.symbol.text in "↓l" } + count { it.symbol.text == "L" } * 2)
            }

            when (this.octaveMode) {
                org.mider.code.antlr.NoteOctaveMode.Fixed -> this.fixedBaseNote.octave + octaveOffset
                else -> relativeNoteOctaveOffset(octaveOffset)
            }
        }
    }
    private fun TrackConfigContext.parsePrefix(pitchPrefix: List<TerminalNode>): NotePrefix {
        val sharps = pitchPrefix.count { it.symbol.text in "#" }
        val flats = pitchPrefix.count { it.symbol.text in "b$" }
        val naturals = pitchPrefix.count { it.symbol.text in "@" }

        return when(this.pitchMode) {
            org.mider.code.antlr.NotePitchMode.Absolute -> NotePrefix(sharps, flats, naturals)
            org.mider.code.antlr.NotePitchMode.Fixed -> this.fixedBaseNote.prefix + NotePrefix(sharps, flats, naturals)
            org.mider.code.antlr.NotePitchMode.Relative -> relativeNotePrefixOffset(NotePrefix(sharps, flats, naturals))
        }
    }
}