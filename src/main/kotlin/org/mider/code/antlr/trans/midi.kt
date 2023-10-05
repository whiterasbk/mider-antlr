package org.mider.code.antlr.trans

import org.mider.code.antlr.ArpeggioType
import org.mider.code.antlr.stave.Chord
import org.mider.code.antlr.stave.Note
import org.mider.code.antlr.stave.StaveElement
import whiter.music.mider.EventType
import whiter.music.mider.Message

fun transfer(list: List<StaveElement>) {

    for (element in list) {
        when (element) {
            is Note -> {

            }

            is Chord -> {

            }
        }
    }
}

private class MidiEventChain {
    private var previousTicks = 0L
    private val chain: MutableList<Message> = emptyList<Message>().toMutableList()
    private val baseValue = 1f

    fun pushNote(note: Note) {
        val onTicks = note.duration.value(baseValue).toLong()
        chain +=  noteOn(note.code(), previousTicks, note.velocity.on, note.expectChannel)
        chain += noteOff(note.code(), onTicks, note.velocity.off, note.expectChannel)
        previousTicks = 0
    }

    fun pushChord(chord: Chord) {

        val sorted = chord.notes.sortedBy { it.duration.value(baseValue) }.toMutableList()
        val root = sorted.removeFirst()
        chain += noteOn(root.code(), previousTicks, root.velocity.on, root.expectChannel)

        when (chord.arpeggio) {
            ArpeggioType.None -> {
                for (note in sorted)
                    chain +=  noteOn(note.code(), 0, note.velocity.on, note.expectChannel)
                for (note in sorted)
                    chain += noteOff(note.code(), 0, note.velocity.off, note.expectChannel)
            }

            else -> ""
        }

        chain += noteOff(root.code(), 0, root.velocity.off, root.expectChannel)
    }

    private fun noteOn(code: Int, duration: Long, velocity: Number, channel: Int): Message {
        return Message(EventType.note_on, byteArrayOf(code.toByte(), velocity.toByte()), time = duration.toInt(), channel = channel.toByte())
    }

    private fun noteOff(code: Int, duration: Long, velocity: Number, channel: Int): Message {
        return Message(EventType.note_off, byteArrayOf(code.toByte(), velocity.toByte()), time = duration.toInt(), channel = channel.toByte())
    }
}

