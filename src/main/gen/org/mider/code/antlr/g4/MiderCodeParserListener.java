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
	 * Enter a parse tree produced by {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void enterMidercode(MiderCodeParser.MidercodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 */
	void exitMidercode(MiderCodeParser.MidercodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code note_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNote_expr(MiderCodeParser.Note_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code note_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNote_expr(MiderCodeParser.Note_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chord_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChord_expr(MiderCodeParser.Chord_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chord_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChord_expr(MiderCodeParser.Chord_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rest_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRest_expr(MiderCodeParser.Rest_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rest_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRest_expr(MiderCodeParser.Rest_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tuplet_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTuplet_expr(MiderCodeParser.Tuplet_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tuplet_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTuplet_expr(MiderCodeParser.Tuplet_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glissando_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGlissando_expr(MiderCodeParser.Glissando_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glissando_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGlissando_expr(MiderCodeParser.Glissando_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appoggiatura_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAppoggiatura_expr(MiderCodeParser.Appoggiatura_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appoggiatura_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAppoggiatura_expr(MiderCodeParser.Appoggiatura_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clone_action_exper}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClone_action_exper(MiderCodeParser.Clone_action_experContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clone_action_exper}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClone_action_exper(MiderCodeParser.Clone_action_experContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lyric_exper}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLyric_exper(MiderCodeParser.Lyric_experContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lyric_exper}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLyric_exper(MiderCodeParser.Lyric_experContext ctx);
	/**
	 * Enter a parse tree produced by the {@code a_comment}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterA_comment(MiderCodeParser.A_commentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code a_comment}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitA_comment(MiderCodeParser.A_commentContext ctx);
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
	 * Enter a parse tree produced by {@link MiderCodeParser#midercode_has_duration}.
	 * @param ctx the parse tree
	 */
	void enterMidercode_has_duration(MiderCodeParser.Midercode_has_durationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#midercode_has_duration}.
	 * @param ctx the parse tree
	 */
	void exitMidercode_has_duration(MiderCodeParser.Midercode_has_durationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#midercode_has_pitch}.
	 * @param ctx the parse tree
	 */
	void enterMidercode_has_pitch(MiderCodeParser.Midercode_has_pitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#midercode_has_pitch}.
	 * @param ctx the parse tree
	 */
	void exitMidercode_has_pitch(MiderCodeParser.Midercode_has_pitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#clone_action_suffix}.
	 * @param ctx the parse tree
	 */
	void enterClone_action_suffix(MiderCodeParser.Clone_action_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#clone_action_suffix}.
	 * @param ctx the parse tree
	 */
	void exitClone_action_suffix(MiderCodeParser.Clone_action_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiderCodeParser#with_lyric}.
	 * @param ctx the parse tree
	 */
	void enterWith_lyric(MiderCodeParser.With_lyricContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiderCodeParser#with_lyric}.
	 * @param ctx the parse tree
	 */
	void exitWith_lyric(MiderCodeParser.With_lyricContext ctx);
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
}