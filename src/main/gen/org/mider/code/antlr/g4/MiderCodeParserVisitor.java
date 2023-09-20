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
	 * Visit a parse tree produced by {@link MiderCodeParser#track}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrack(MiderCodeParser.TrackContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#midercode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidercode(MiderCodeParser.MidercodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code note_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_expr(MiderCodeParser.Note_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chord_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord_expr(MiderCodeParser.Chord_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rest_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest_expr(MiderCodeParser.Rest_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tuplet_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplet_expr(MiderCodeParser.Tuplet_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code glissando_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlissando_expr(MiderCodeParser.Glissando_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appoggiatura_expr}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppoggiatura_expr(MiderCodeParser.Appoggiatura_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clone_action_exper}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone_action_exper(MiderCodeParser.Clone_action_experContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lyric_exper}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLyric_exper(MiderCodeParser.Lyric_experContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_comment}
	 * labeled alternative in {@link MiderCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_comment(MiderCodeParser.A_commentContext ctx);
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
	 * Visit a parse tree produced by {@link MiderCodeParser#midercode_has_duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidercode_has_duration(MiderCodeParser.Midercode_has_durationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#midercode_has_pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidercode_has_pitch(MiderCodeParser.Midercode_has_pitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#clone_action_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone_action_suffix(MiderCodeParser.Clone_action_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#with_lyric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_lyric(MiderCodeParser.With_lyricContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiderCodeParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(MiderCodeParser.CommentContext ctx);
}