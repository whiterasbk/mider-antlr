package org.mider.code.antlr

enum class NoteOctaveMode {
    Fixed, Relative
}

enum class NotePitchMode {
    Fixed, Relative, Absolute
}

enum class NoteDurationMode {
    Fixed, Relative
}

enum class NoteVelocityMode {
    Fixed, Relative
}

enum class Tonality {
    Cmajor
}

enum class Instrument {
    Piano
}

enum class ArpeggioType {
    None, Ascending, Downward
}