package org.mider.code.antlr

import org.mider.code.antlr.midi.TimeSignature
import org.mider.code.antlr.stave.Duration
import org.mider.code.antlr.stave.Note
import org.mider.code.antlr.stave.NotePrefix
import org.mider.code.antlr.stave.Velocity


val bbb = Note("C",  NotePrefix(), Duration() ,4, Velocity(), 0)

data class TrackConfigContext (
    var fixedBaseNote: Note = bbb,
    var relativeBaseNotePrefix: NotePrefix = fixedBaseNote.prefix,
    var relativeBaseNoteDuration: Duration = fixedBaseNote.duration,
    var relativeBaseNoteOctave: Int = fixedBaseNote.octave,
    var relativeBaseNoteVelocity: Velocity = fixedBaseNote.velocity,
    var previousElement: Any? = null,
    var timeSignature: TimeSignature = TimeSignature(4, 4),
    var tonality: Tonality = Tonality.Cmajor,
    var pitchMode: NotePitchMode = NotePitchMode.Absolute,
    var octaveMode: NoteOctaveMode = NoteOctaveMode.Fixed,
    var durationMode: NoteDurationMode = NoteDurationMode.Fixed,
    var velocityMode: NoteVelocityMode = NoteVelocityMode.Fixed,
    var bpm: Int = 120,
    var instrument: Instrument = Instrument.Piano,
    var channel: Int = 0,
    var customPair: Map<String, String> = emptyMap(),
) {
    inline fun <R> use(block: TrackConfigContext.() -> R): R = this.block()

    fun relativeNotePrefix(tobe: NotePrefix): NotePrefix {
        this.relativeBaseNotePrefix = tobe
        return this.relativeBaseNotePrefix
    }

    fun relativeNotePrefixOffset(offset: NotePrefix) = relativeNotePrefix(this.relativeBaseNotePrefix + offset)

    fun relativeNoteDuration(tobe: Duration): Duration {
        this.relativeBaseNoteDuration = tobe
        return this.relativeBaseNoteDuration
    }

    fun relativeNoteDurationOffset(offset: Duration) = relativeNoteDuration(this.relativeBaseNoteDuration + offset)

    fun relativeNoteVelocity(tobe: Velocity): Velocity {
        this.relativeBaseNoteVelocity = tobe
        return this.relativeBaseNoteVelocity
    }

    fun relativeNoteVelocityOffset(offset: Velocity) = relativeNoteVelocity(this.relativeBaseNoteVelocity + offset)

    fun relativeNoteOctave(tobe: Int): Int {
        this.relativeBaseNoteOctave = tobe
        return this.relativeBaseNoteOctave
    }

    fun relativeNoteOctaveOffset(offset: Int) = relativeNoteOctave(this.relativeBaseNoteOctave + offset)

}