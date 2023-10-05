package org.mider.code.antlr.listener

import org.mider.code.antlr.NoteDurationMode
import org.mider.code.antlr.TrackConfigContext
import org.mider.code.antlr.g4.MiderCodeParser
import org.mider.code.antlr.g4.MiderCodeParserBaseListener
import org.mider.code.antlr.stave.StaveElement
import org.mider.code.antlr.visitor.MiderCodeVisitor

class MiderCodeListener : MiderCodeParserBaseListener() {

    val tcc = TrackConfigContext(durationMode = NoteDurationMode.Relative)
    val list = mutableListOf<StaveElement>()

    override fun exitNoteExperssion(ctx: MiderCodeParser.NoteExperssionContext) {
        val notes = MiderCodeVisitor(tcc).visitNoteExperssion(ctx)
        list += notes
    }

    override fun exitChordExperssion(ctx: MiderCodeParser.ChordExperssionContext) {
        val chords = MiderCodeVisitor(tcc).visitChordExperssion(ctx)
        list += chords
    }
}