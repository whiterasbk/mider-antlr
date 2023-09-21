// Generated from D:/ProjectFiles/idea/mider-antlr/src/main/java/org/mider/code/antlr/g4/MiderCodeParser.g4 by ANTLR 4.13.1
package org.mider.code.antlr.g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiderCodeParser}.
 */
public interface MiderCodeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#track}.
	 * @param ctx the parse tree
	 */
	void enterTrack(MiderCodeParser.TrackContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#track}.
	 * @param ctx the parse tree
	 */
	void exitTrack(MiderCodeParser.TrackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noteExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterNoteExperssion(MiderCodeParser.NoteExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noteExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitNoteExperssion(MiderCodeParser.NoteExperssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chordExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterChordExperssion(MiderCodeParser.ChordExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chordExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitChordExperssion(MiderCodeParser.ChordExperssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code restExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterRestExperssion(MiderCodeParser.RestExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code restExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitRestExperssion(MiderCodeParser.RestExperssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupletExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterTupletExperssion(MiderCodeParser.TupletExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupletExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitTupletExperssion(MiderCodeParser.TupletExperssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glissandoExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterGlissandoExperssion(MiderCodeParser.GlissandoExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glissandoExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitGlissandoExperssion(MiderCodeParser.GlissandoExperssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appoggiaturaExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterAppoggiaturaExperssion(MiderCodeParser.AppoggiaturaExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appoggiaturaExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitAppoggiaturaExperssion(MiderCodeParser.AppoggiaturaExperssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterCommentExperssion(MiderCodeParser.CommentExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitCommentExperssion(MiderCodeParser.CommentExperssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(MiderCodeParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(MiderCodeParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(MiderCodeParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(MiderCodeParser.ChordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(MiderCodeParser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(MiderCodeParser.RestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#tuplet}.
	 * @param ctx the parse tree
	 */
	void enterTuplet(MiderCodeParser.TupletContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#tuplet}.
	 * @param ctx the parse tree
	 */
	void exitTuplet(MiderCodeParser.TupletContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#glissando}.
	 * @param ctx the parse tree
	 */
	void enterGlissando(MiderCodeParser.GlissandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#glissando}.
	 * @param ctx the parse tree
	 */
	void exitGlissando(MiderCodeParser.GlissandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#appoggiatura}.
	 * @param ctx the parse tree
	 */
	void enterAppoggiatura(MiderCodeParser.AppoggiaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#appoggiatura}.
	 * @param ctx the parse tree
	 */
	void exitAppoggiatura(MiderCodeParser.AppoggiaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#restBase}.
	 * @param ctx the parse tree
	 */
	void enterRestBase(MiderCodeParser.RestBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#restBase}.
	 * @param ctx the parse tree
	 */
	void exitRestBase(MiderCodeParser.RestBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#noteBase}.
	 * @param ctx the parse tree
	 */
	void enterNoteBase(MiderCodeParser.NoteBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#noteBase}.
	 * @param ctx the parse tree
	 */
	void exitNoteBase(MiderCodeParser.NoteBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#chordTailBase}.
	 * @param ctx the parse tree
	 */
	void enterChordTailBase(MiderCodeParser.ChordTailBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#chordTailBase}.
	 * @param ctx the parse tree
	 */
	void exitChordTailBase(MiderCodeParser.ChordTailBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(MiderCodeParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(MiderCodeParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#lyric}.
	 * @param ctx the parse tree
	 */
	void enterLyric(MiderCodeParser.LyricContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#lyric}.
	 * @param ctx the parse tree
	 */
	void exitLyric(MiderCodeParser.LyricContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackHeader}.
	 * @param ctx the parse tree
	 */
	void enterTrackHeader(MiderCodeParser.TrackHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackHeader}.
	 * @param ctx the parse tree
	 */
	void exitTrackHeader(MiderCodeParser.TrackHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#sigleTrackConfig}.
	 * @param ctx the parse tree
	 */
	void enterSigleTrackConfig(MiderCodeParser.SigleTrackConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#sigleTrackConfig}.
	 * @param ctx the parse tree
	 */
	void exitSigleTrackConfig(MiderCodeParser.SigleTrackConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackBpmConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackBpmConfig(MiderCodeParser.TrackBpmConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackBpmConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackBpmConfig(MiderCodeParser.TrackBpmConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackOctaveAndDurationConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackOctaveAndDurationConfig(MiderCodeParser.TrackOctaveAndDurationConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackOctaveAndDurationConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackOctaveAndDurationConfig(MiderCodeParser.TrackOctaveAndDurationConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackSpeedConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackSpeedConfig(MiderCodeParser.TrackSpeedConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackSpeedConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackSpeedConfig(MiderCodeParser.TrackSpeedConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackTonalityConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackTonalityConfig(MiderCodeParser.TrackTonalityConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackTonalityConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackTonalityConfig(MiderCodeParser.TrackTonalityConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackVelocityConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackVelocityConfig(MiderCodeParser.TrackVelocityConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackVelocityConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackVelocityConfig(MiderCodeParser.TrackVelocityConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackInstrumentConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackInstrumentConfig(MiderCodeParser.TrackInstrumentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackInstrumentConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackInstrumentConfig(MiderCodeParser.TrackInstrumentConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackCustomConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackCustomConfig(MiderCodeParser.TrackCustomConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackCustomConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackCustomConfig(MiderCodeParser.TrackCustomConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiderCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiderCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#programBody}.
	 * @param ctx the parse tree
	 */
	void enterProgramBody(MiderCodeParser.ProgramBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#programBody}.
	 * @param ctx the parse tree
	 */
	void exitProgramBody(MiderCodeParser.ProgramBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefineStatement(MiderCodeParser.DefineStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefineStatement(MiderCodeParser.DefineStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignEqualStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignEqualStatement(MiderCodeParser.AssignEqualStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignEqualStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignEqualStatement(MiderCodeParser.AssignEqualStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MiderCodeParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MiderCodeParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(MiderCodeParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(MiderCodeParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#functionDefParamList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefParamList(MiderCodeParser.FunctionDefParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#functionDefParamList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefParamList(MiderCodeParser.FunctionDefParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MiderCodeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MiderCodeParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(MiderCodeParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(MiderCodeParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiderCodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiderCodeParser.ExpressionContext ctx);
}