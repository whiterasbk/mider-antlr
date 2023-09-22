// Generated from D:/ProjectFiles/idea/mider-antlr/src/main/java/org/mider/code/antlr/g4/MiderCodeParser.g4 by ANTLR 4.13.1
package org.mider.code.antlr.g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiderCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiderCodeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#tracks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTracks(MiderCodeParser.TracksContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#track}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrack(MiderCodeParser.TrackContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#scopeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeBlock(MiderCodeParser.ScopeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackBody(MiderCodeParser.TrackBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noteExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteExperssion(MiderCodeParser.NoteExperssionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chordExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChordExperssion(MiderCodeParser.ChordExperssionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code restExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestExperssion(MiderCodeParser.RestExperssionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupletExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupletExperssion(MiderCodeParser.TupletExperssionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tripletsExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripletsExperssion(MiderCodeParser.TripletsExperssionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code glissandoExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlissandoExperssion(MiderCodeParser.GlissandoExperssionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appoggiaturaExperssion}
	 * labeled alternative in {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppoggiaturaExperssion(MiderCodeParser.AppoggiaturaExperssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(MiderCodeParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord(MiderCodeParser.ChordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(MiderCodeParser.RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#tuplet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplet(MiderCodeParser.TupletContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#triplets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplets(MiderCodeParser.TripletsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#glissando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlissando(MiderCodeParser.GlissandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#appoggiatura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppoggiatura(MiderCodeParser.AppoggiaturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#restClone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestClone(MiderCodeParser.RestCloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#noteClone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteClone(MiderCodeParser.NoteCloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#chordTailBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChordTailBase(MiderCodeParser.ChordTailBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#noteListClone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteListClone(MiderCodeParser.NoteListCloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#chordMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChordMode(MiderCodeParser.ChordModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#globalConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalConfig(MiderCodeParser.GlobalConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#lyric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLyric(MiderCodeParser.LyricContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackHeader(MiderCodeParser.TrackHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#inlineTrackHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTrackHeader(MiderCodeParser.InlineTrackHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#sigleTrackConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigleTrackConfig(MiderCodeParser.SigleTrackConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackBpmConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackBpmConfig(MiderCodeParser.TrackBpmConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackOctaveAndDurationConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackOctaveAndDurationConfig(MiderCodeParser.TrackOctaveAndDurationConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackSpeedConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackSpeedConfig(MiderCodeParser.TrackSpeedConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackTimesignatureConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackTimesignatureConfig(MiderCodeParser.TrackTimesignatureConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackTonalityConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackTonalityConfig(MiderCodeParser.TrackTonalityConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackVelocityConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackVelocityConfig(MiderCodeParser.TrackVelocityConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackInstrumentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackInstrumentConfig(MiderCodeParser.TrackInstrumentConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#trackCustomConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackCustomConfig(MiderCodeParser.TrackCustomConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#hexData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexData(MiderCodeParser.HexDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#hexContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexContent(MiderCodeParser.HexContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiderCodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#programBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBody(MiderCodeParser.ProgramBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiderCodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStatement(MiderCodeParser.DefineStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignEqualStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignEqualStatement(MiderCodeParser.AssignEqualStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MiderCodeParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(MiderCodeParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiderCodeParser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiderCodeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(MiderCodeParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#functionDefParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefParamList(MiderCodeParser.FunctionDefParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MiderCodeParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(MiderCodeParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#listBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBody(MiderCodeParser.ListBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#mapBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapBody(MiderCodeParser.MapBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MiderCodeParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiderCodeParser.ExpressionContext ctx);
}