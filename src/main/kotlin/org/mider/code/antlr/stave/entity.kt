package org.mider.code.antlr.stave

import org.mider.code.antlr.ArpeggioType
import kotlin.math.pow

data class Velocity(
    val on: Int = 100,
    val off: Int = 100
) {
    operator fun plus(other: Velocity): Velocity = if (other.isZero()) this else Velocity(
        on + other.on,
        off + other.off
    )

    private fun isZero() = on == 0 && off == 0

    override fun toString(): String {
        return "on=$on;off=$off"
    }
}

data class NotePrefix(
    val sharps: Int = 0,
    val flats: Int = 0,
    val naturals: Int = 0,
) {

    companion object {
        fun sharp(n: Int = 1) = NotePrefix(n, 0, 0)
        fun flat(n: Int = 1) = NotePrefix(0, n, 0)
        fun natural() = NotePrefix(0, 0, 1)
    }

    fun value(): Int = sharps - flats

    fun hasNatural() = naturals != 0

    operator fun plus(other: NotePrefix): NotePrefix = if (other.isZero()) this else NotePrefix(
        other.sharps + sharps,
        other.flats + flats,
        other.naturals + naturals
    )
    private fun isZero() = sharps == 0 && flats == 0 && naturals == 0

    override fun toString(): String {

        val sb0 = StringBuffer().apply {
            if (value() > 0)
                repeat(value()) { append("#") }
            else
                repeat(-value()) { append("b") }
        }

        val sb3 = StringBuffer().apply { repeat(naturals) { append("@") } }
        return "$sb0$sb3"
    }
}

data class Duration(
    val dots: Int = 0,
    val pluses: Int = 0,
    val multiples: List<Int> = emptyList(),
    val divisions: List<Int> = emptyList(),
) {

    fun value(base: Float): Float {
        var retVal = base * 1.5f.pow(dots) * 2.0f.pow(pluses)

        for (m in multiples) retVal *= m
        for (m in divisions) retVal /= m

        return retVal
    }
    operator fun plus(other: Duration): Duration = if (other.isZero()) this else Duration(
        dots + other.dots,
        pluses + other.pluses,
        multiples + other.multiples,
        divisions + other.divisions
    )
    private fun isZero() = dots == 0 && pluses == 0 && multiples.isEmpty() && divisions.isEmpty()
    override fun toString(): String {
        val sb1 = StringBuffer().apply { repeat(dots) { append(".") } }
        val sb2 = StringBuffer().apply {
            if (pluses > 0)
                repeat(pluses) { append("+") }
            else
                repeat(-pluses) { append("-") }
        }
        return "$sb1$sb2${multiples.joinToString("x")}${divisions.joinToString("/")}"
    }
}

sealed interface StaveElement
data class Note(
    val name: String,
    val prefix: NotePrefix,
    val duration: Duration,
    val octave: Int,
    val velocity: Velocity,
    val expectChannel: Int
) : StaveElement {
    override fun toString(): String {
        return "<$prefix($name$octave)$duration:$velocity:ch$expectChannel>"
    }

    fun code(): Int {
        // todo natural
        prefix.value()
        return when(name.uppercase()) {
            "C" -> 0 "D" -> 2 "E" -> 4
            "F" -> 5 "G" -> 7 "A" -> 9
            "B" -> 11 else -> error("unsupported note name: '$name'")
        } + (octave + 1) * 12 + prefix.value()
    }
}

data class Chord(
    val notes: List<Note>,
    val arpeggio: ArpeggioType
) : StaveElement {
    override fun toString(): String {
        return "<--\n${notes.joinToString("\n")}-->"
    }
}