// Generated from D:/ProjectFiles/idea/mider-antlr/src/main/java/org/mider/code/antlr/g4/MiderCodeParser.g4 by ANTLR 4.13.1
package org.mider.code.antlr.g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiderCodeParser}.
 */
public interface MiderCodeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#tracks}.
	 * @param ctx the parse tree
	 */
	void enterTracks(MiderCodeParser.TracksContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#tracks}.
	 * @param ctx the parse tree
	 */
	void exitTracks(MiderCodeParser.TracksContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#scopeBlock}.
	 * @param ctx the parse tree
	 */
	void enterScopeBlock(MiderCodeParser.ScopeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#scopeBlock}.
	 * @param ctx the parse tree
	 */
	void exitScopeBlock(MiderCodeParser.ScopeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#trackBody}.
	 * @param ctx the parse tree
	 */
	void enterTrackBody(MiderCodeParser.TrackBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackBody}.
	 * @param ctx the parse tree
	 */
	void exitTrackBody(MiderCodeParser.TrackBodyContext ctx);
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
	 * Enter a parse tree produced by the {@code tripletsExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterTripletsExperssion(MiderCodeParser.TripletsExperssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tripletsExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitTripletsExperssion(MiderCodeParser.TripletsExperssionContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#triplets}.
	 * @param ctx the parse tree
	 */
	void enterTriplets(MiderCodeParser.TripletsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#triplets}.
	 * @param ctx the parse tree
	 */
	void exitTriplets(MiderCodeParser.TripletsContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#restClone}.
	 * @param ctx the parse tree
	 */
	void enterRestClone(MiderCodeParser.RestCloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#restClone}.
	 * @param ctx the parse tree
	 */
	void exitRestClone(MiderCodeParser.RestCloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#noteClone}.
	 * @param ctx the parse tree
	 */
	void enterNoteClone(MiderCodeParser.NoteCloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#noteClone}.
	 * @param ctx the parse tree
	 */
	void exitNoteClone(MiderCodeParser.NoteCloneContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#noteListClone}.
	 * @param ctx the parse tree
	 */
	void enterNoteListClone(MiderCodeParser.NoteListCloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#noteListClone}.
	 * @param ctx the parse tree
	 */
	void exitNoteListClone(MiderCodeParser.NoteListCloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#chordMode}.
	 * @param ctx the parse tree
	 */
	void enterChordMode(MiderCodeParser.ChordModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#chordMode}.
	 * @param ctx the parse tree
	 */
	void exitChordMode(MiderCodeParser.ChordModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#globalConfig}.
	 * @param ctx the parse tree
	 */
	void enterGlobalConfig(MiderCodeParser.GlobalConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#globalConfig}.
	 * @param ctx the parse tree
	 */
	void exitGlobalConfig(MiderCodeParser.GlobalConfigContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#inlineTrackHeader}.
	 * @param ctx the parse tree
	 */
	void enterInlineTrackHeader(MiderCodeParser.InlineTrackHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#inlineTrackHeader}.
	 * @param ctx the parse tree
	 */
	void exitInlineTrackHeader(MiderCodeParser.InlineTrackHeaderContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#trackTimesignatureConfig}.
	 * @param ctx the parse tree
	 */
	void enterTrackTimesignatureConfig(MiderCodeParser.TrackTimesignatureConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#trackTimesignatureConfig}.
	 * @param ctx the parse tree
	 */
	void exitTrackTimesignatureConfig(MiderCodeParser.TrackTimesignatureConfigContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#hexData}.
	 * @param ctx the parse tree
	 */
	void enterHexData(MiderCodeParser.HexDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#hexData}.
	 * @param ctx the parse tree
	 */
	void exitHexData(MiderCodeParser.HexDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#hexContent}.
	 * @param ctx the parse tree
	 */
	void enterHexContent(MiderCodeParser.HexContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#hexContent}.
	 * @param ctx the parse tree
	 */
	void exitHexContent(MiderCodeParser.HexContentContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiderCodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiderCodeParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(MiderCodeParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(MiderCodeParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiderCodeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiderCodeParser.IfStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#listBody}.
	 * @param ctx the parse tree
	 */
	void enterListBody(MiderCodeParser.ListBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#listBody}.
	 * @param ctx the parse tree
	 */
	void exitListBody(MiderCodeParser.ListBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#mapBody}.
	 * @param ctx the parse tree
	 */
	void enterMapBody(MiderCodeParser.MapBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#mapBody}.
	 * @param ctx the parse tree
	 */
	void exitMapBody(MiderCodeParser.MapBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MiderCodeParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MiderCodeParser.PrimaryContext ctx);
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