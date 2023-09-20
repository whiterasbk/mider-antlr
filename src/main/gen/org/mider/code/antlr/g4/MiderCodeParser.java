// Generated from D:/ProjectFiles/idea/mider-antlr/src/main/java/org/mider/code/antlr/g4/MiderCodeParser.g4 by ANTLR 4.13.1
package org.mider.code.antlr.g4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiderCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TrackScopeSymbol=1, TrackHead=2, ChordConnector=3, TupletConnector=4, 
		GlissandoConnector=5, AppoggiaturaConnector=6, AppoggiaturaTail=7, PitchPrefix=8, 
		PitchSuffix=9, OctaveSuffix=10, MoveOctaveSuffix=11, DurationSuffix=12, 
		VelocitySuffix=13, RepeatSuffix=14, ArpeggioSuffix=15, Comment=16, NoteName=17, 
		RestNote=18, CloneActionOperator=19, CloneAndModifyPitchOperator=20, SingleDigital=21, 
		Whitespace=22, NewLine=23, Lyric=24;
	public static final int
		RULE_track = 0, RULE_midercode = 1, RULE_expr = 2, RULE_note = 3, RULE_chord = 4, 
		RULE_rest = 5, RULE_tuplet = 6, RULE_glissando = 7, RULE_appoggiatura = 8, 
		RULE_midercode_has_duration = 9, RULE_midercode_has_pitch = 10, RULE_clone_action_suffix = 11, 
		RULE_with_lyric = 12, RULE_comment = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"track", "midercode", "expr", "note", "chord", "rest", "tuplet", "glissando", 
			"appoggiatura", "midercode_has_duration", "midercode_has_pitch", "clone_action_suffix", 
			"with_lyric", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", null, "':'", "'&'", null, "';'", "'t'", null, "'''", null, 
			null, null, null, null, null, null, null, null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TrackScopeSymbol", "TrackHead", "ChordConnector", "TupletConnector", 
			"GlissandoConnector", "AppoggiaturaConnector", "AppoggiaturaTail", "PitchPrefix", 
			"PitchSuffix", "OctaveSuffix", "MoveOctaveSuffix", "DurationSuffix", 
			"VelocitySuffix", "RepeatSuffix", "ArpeggioSuffix", "Comment", "NoteName", 
			"RestNote", "CloneActionOperator", "CloneAndModifyPitchOperator", "SingleDigital", 
			"Whitespace", "NewLine", "Lyric"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiderCodeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiderCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrackContext extends ParserRuleContext {
		public MidercodeContext midercode() {
			return getRuleContext(MidercodeContext.class,0);
		}
		public TerminalNode TrackHead() { return getToken(MiderCodeParser.TrackHead, 0); }
		public TrackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_track; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackContext track() throws RecognitionException {
		TrackContext _localctx = new TrackContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_track);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TrackHead) {
				{
				setState(28);
				match(TrackHead);
				}
			}

			setState(31);
			midercode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MidercodeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MidercodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midercode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterMidercode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitMidercode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitMidercode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidercodeContext midercode() throws RecognitionException {
		MidercodeContext _localctx = new MidercodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_midercode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				expr();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 459008L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Note_exprContext extends ExprContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Note_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterNote_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitNote_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitNote_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Appoggiatura_exprContext extends ExprContext {
		public AppoggiaturaContext appoggiatura() {
			return getRuleContext(AppoggiaturaContext.class,0);
		}
		public Appoggiatura_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterAppoggiatura_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitAppoggiatura_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitAppoggiatura_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class A_commentContext extends ExprContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public A_commentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterA_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitA_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitA_comment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chord_exprContext extends ExprContext {
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public Chord_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterChord_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitChord_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitChord_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Glissando_exprContext extends ExprContext {
		public GlissandoContext glissando() {
			return getRuleContext(GlissandoContext.class,0);
		}
		public Glissando_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterGlissando_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitGlissando_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitGlissando_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rest_exprContext extends ExprContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public Rest_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterRest_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitRest_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitRest_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lyric_experContext extends ExprContext {
		public With_lyricContext with_lyric() {
			return getRuleContext(With_lyricContext.class,0);
		}
		public Lyric_experContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterLyric_exper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitLyric_exper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitLyric_exper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tuplet_exprContext extends ExprContext {
		public TupletContext tuplet() {
			return getRuleContext(TupletContext.class,0);
		}
		public Tuplet_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTuplet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTuplet_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTuplet_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Clone_action_experContext extends ExprContext {
		public Clone_action_suffixContext clone_action_suffix() {
			return getRuleContext(Clone_action_suffixContext.class,0);
		}
		public Clone_action_experContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterClone_action_exper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitClone_action_exper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitClone_action_exper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Note_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				note();
				}
				break;
			case 2:
				_localctx = new Chord_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				chord();
				}
				break;
			case 3:
				_localctx = new Rest_exprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				rest();
				}
				break;
			case 4:
				_localctx = new Tuplet_exprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				tuplet();
				}
				break;
			case 5:
				_localctx = new Glissando_exprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				glissando();
				}
				break;
			case 6:
				_localctx = new Appoggiatura_exprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				appoggiatura();
				}
				break;
			case 7:
				_localctx = new Clone_action_experContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				clone_action_suffix();
				}
				break;
			case 8:
				_localctx = new Lyric_experContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				with_lyric();
				}
				break;
			case 9:
				_localctx = new A_commentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				comment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NoteName() { return getToken(MiderCodeParser.NoteName, 0); }
		public List<TerminalNode> PitchPrefix() { return getTokens(MiderCodeParser.PitchPrefix); }
		public TerminalNode PitchPrefix(int i) {
			return getToken(MiderCodeParser.PitchPrefix, i);
		}
		public List<TerminalNode> MoveOctaveSuffix() { return getTokens(MiderCodeParser.MoveOctaveSuffix); }
		public TerminalNode MoveOctaveSuffix(int i) {
			return getToken(MiderCodeParser.MoveOctaveSuffix, i);
		}
		public List<TerminalNode> OctaveSuffix() { return getTokens(MiderCodeParser.OctaveSuffix); }
		public TerminalNode OctaveSuffix(int i) {
			return getToken(MiderCodeParser.OctaveSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public List<TerminalNode> VelocitySuffix() { return getTokens(MiderCodeParser.VelocitySuffix); }
		public TerminalNode VelocitySuffix(int i) {
			return getToken(MiderCodeParser.VelocitySuffix, i);
		}
		public List<TerminalNode> RepeatSuffix() { return getTokens(MiderCodeParser.RepeatSuffix); }
		public TerminalNode RepeatSuffix(int i) {
			return getToken(MiderCodeParser.RepeatSuffix, i);
		}
		public List<TerminalNode> PitchSuffix() { return getTokens(MiderCodeParser.PitchSuffix); }
		public TerminalNode PitchSuffix(int i) {
			return getToken(MiderCodeParser.PitchSuffix, i);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(49);
				match(PitchPrefix);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(NoteName);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChordContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<TerminalNode> ChordConnector() { return getTokens(MiderCodeParser.ChordConnector); }
		public TerminalNode ChordConnector(int i) {
			return getToken(MiderCodeParser.ChordConnector, i);
		}
		public TerminalNode ArpeggioSuffix() { return getToken(MiderCodeParser.ArpeggioSuffix, 0); }
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitChord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitChord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			note();
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				match(ChordConnector);
				setState(64);
				note();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ChordConnector );
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArpeggioSuffix) {
				{
				setState(69);
				match(ArpeggioSuffix);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestContext extends ParserRuleContext {
		public TerminalNode RestNote() { return getToken(MiderCodeParser.RestNote, 0); }
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(72);
			match(RestNote);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DurationSuffix) {
				{
				{
				setState(73);
				match(DurationSuffix);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupletContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<TerminalNode> TupletConnector() { return getTokens(MiderCodeParser.TupletConnector); }
		public TerminalNode TupletConnector(int i) {
			return getToken(MiderCodeParser.TupletConnector, i);
		}
		public List<RestContext> rest() {
			return getRuleContexts(RestContext.class);
		}
		public RestContext rest(int i) {
			return getRuleContext(RestContext.class,i);
		}
		public TupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTuplet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTuplet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupletContext tuplet() throws RecognitionException {
		TupletContext _localctx = new TupletContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tuplet);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PitchPrefix:
			case NoteName:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				note();
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					match(TupletConnector);
					setState(81);
					note();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TupletConnector );
				}
				break;
			case RestNote:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				rest();
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					match(TupletConnector);
					setState(88);
					rest();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TupletConnector );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlissandoContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<TerminalNode> GlissandoConnector() { return getTokens(MiderCodeParser.GlissandoConnector); }
		public TerminalNode GlissandoConnector(int i) {
			return getToken(MiderCodeParser.GlissandoConnector, i);
		}
		public GlissandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glissando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterGlissando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitGlissando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitGlissando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlissandoContext glissando() throws RecognitionException {
		GlissandoContext _localctx = new GlissandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_glissando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			note();
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				match(GlissandoConnector);
				setState(97);
				note();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GlissandoConnector );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppoggiaturaContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<TerminalNode> AppoggiaturaConnector() { return getTokens(MiderCodeParser.AppoggiaturaConnector); }
		public TerminalNode AppoggiaturaConnector(int i) {
			return getToken(MiderCodeParser.AppoggiaturaConnector, i);
		}
		public TerminalNode AppoggiaturaTail() { return getToken(MiderCodeParser.AppoggiaturaTail, 0); }
		public AppoggiaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appoggiatura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterAppoggiatura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitAppoggiatura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitAppoggiatura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppoggiaturaContext appoggiatura() throws RecognitionException {
		AppoggiaturaContext _localctx = new AppoggiaturaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_appoggiatura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			note();
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				match(AppoggiaturaConnector);
				setState(104);
				note();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AppoggiaturaConnector );
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AppoggiaturaTail) {
				{
				setState(109);
				match(AppoggiaturaTail);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Midercode_has_durationContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public TupletContext tuplet() {
			return getRuleContext(TupletContext.class,0);
		}
		public GlissandoContext glissando() {
			return getRuleContext(GlissandoContext.class,0);
		}
		public AppoggiaturaContext appoggiatura() {
			return getRuleContext(AppoggiaturaContext.class,0);
		}
		public Midercode_has_durationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midercode_has_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterMidercode_has_duration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitMidercode_has_duration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitMidercode_has_duration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Midercode_has_durationContext midercode_has_duration() throws RecognitionException {
		Midercode_has_durationContext _localctx = new Midercode_has_durationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_midercode_has_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(112);
				note();
				}
				break;
			case 2:
				{
				setState(113);
				chord();
				}
				break;
			case 3:
				{
				setState(114);
				rest();
				}
				break;
			case 4:
				{
				setState(115);
				tuplet();
				}
				break;
			case 5:
				{
				setState(116);
				glissando();
				}
				break;
			case 6:
				{
				setState(117);
				appoggiatura();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Midercode_has_pitchContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public TupletContext tuplet() {
			return getRuleContext(TupletContext.class,0);
		}
		public GlissandoContext glissando() {
			return getRuleContext(GlissandoContext.class,0);
		}
		public AppoggiaturaContext appoggiatura() {
			return getRuleContext(AppoggiaturaContext.class,0);
		}
		public Midercode_has_pitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midercode_has_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterMidercode_has_pitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitMidercode_has_pitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitMidercode_has_pitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Midercode_has_pitchContext midercode_has_pitch() throws RecognitionException {
		Midercode_has_pitchContext _localctx = new Midercode_has_pitchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_midercode_has_pitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(120);
				note();
				}
				break;
			case 2:
				{
				setState(121);
				chord();
				}
				break;
			case 3:
				{
				setState(122);
				tuplet();
				}
				break;
			case 4:
				{
				setState(123);
				glissando();
				}
				break;
			case 5:
				{
				setState(124);
				appoggiatura();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clone_action_suffixContext extends ParserRuleContext {
		public Midercode_has_durationContext midercode_has_duration() {
			return getRuleContext(Midercode_has_durationContext.class,0);
		}
		public List<TerminalNode> CloneActionOperator() { return getTokens(MiderCodeParser.CloneActionOperator); }
		public TerminalNode CloneActionOperator(int i) {
			return getToken(MiderCodeParser.CloneActionOperator, i);
		}
		public Midercode_has_pitchContext midercode_has_pitch() {
			return getRuleContext(Midercode_has_pitchContext.class,0);
		}
		public List<TerminalNode> CloneAndModifyPitchOperator() { return getTokens(MiderCodeParser.CloneAndModifyPitchOperator); }
		public TerminalNode CloneAndModifyPitchOperator(int i) {
			return getToken(MiderCodeParser.CloneAndModifyPitchOperator, i);
		}
		public Clone_action_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clone_action_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterClone_action_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitClone_action_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitClone_action_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clone_action_suffixContext clone_action_suffix() throws RecognitionException {
		Clone_action_suffixContext _localctx = new Clone_action_suffixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clone_action_suffix);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				midercode_has_duration();
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(CloneActionOperator);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CloneActionOperator );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				midercode_has_pitch();
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					_la = _input.LA(1);
					if ( !(_la==CloneActionOperator || _la==CloneAndModifyPitchOperator) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CloneActionOperator || _la==CloneAndModifyPitchOperator );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_lyricContext extends ParserRuleContext {
		public TerminalNode Lyric() { return getToken(MiderCodeParser.Lyric, 0); }
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public With_lyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterWith_lyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitWith_lyric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitWith_lyric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_lyricContext with_lyric() throws RecognitionException {
		With_lyricContext _localctx = new With_lyricContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_with_lyric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(141);
				note();
				}
				break;
			case 2:
				{
				setState(142);
				chord();
				}
				break;
			}
			setState(145);
			match(Lyric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode Comment() { return getToken(MiderCodeParser.Comment, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Comment);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0003\u0000\u001e\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001#\b\u0001\u000b\u0001"+
		"\f\u0001$\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002"+
		"\u0001\u0003\u0005\u00033\b\u0003\n\u0003\f\u00036\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004B\b\u0004\u000b\u0004\f\u0004C\u0001"+
		"\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005K\b\u0005"+
		"\n\u0005\f\u0005N\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"S\b\u0006\u000b\u0006\f\u0006T\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006Z\b\u0006\u000b\u0006\f\u0006[\u0003\u0006^\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007c\b\u0007\u000b\u0007\f\u0007d\u0001"+
		"\b\u0001\b\u0001\b\u0004\bj\b\b\u000b\b\f\bk\u0001\b\u0003\bo\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n~\b\n\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u0082\b\u000b\u000b\u000b\f\u000b\u0083\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0088\b\u000b\u000b\u000b\f\u000b\u0089\u0003\u000b\u008c"+
		"\b\u000b\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u0000\u0002\u0001\u0000\t\u000e\u0001\u0000"+
		"\u0013\u0014\u00a9\u0000\u001d\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000"+
		"\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000"+
		"\b>\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\f]\u0001\u0000"+
		"\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000"+
		"\u0012v\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u008b"+
		"\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u0093"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0005\u0002\u0000\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f \u0003\u0002\u0001\u0000 \u0001\u0001\u0000"+
		"\u0000\u0000!#\u0003\u0004\u0002\u0000\"!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\u0003\u0001\u0000\u0000\u0000&0\u0003\u0006\u0003\u0000\'0\u0003\b\u0004"+
		"\u0000(0\u0003\n\u0005\u0000)0\u0003\f\u0006\u0000*0\u0003\u000e\u0007"+
		"\u0000+0\u0003\u0010\b\u0000,0\u0003\u0016\u000b\u0000-0\u0003\u0018\f"+
		"\u0000.0\u0003\u001a\r\u0000/&\u0001\u0000\u0000\u0000/\'\u0001\u0000"+
		"\u0000\u0000/(\u0001\u0000\u0000\u0000/)\u0001\u0000\u0000\u0000/*\u0001"+
		"\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0005\u0001\u0000"+
		"\u0000\u000013\u0005\b\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u00007;\u0005\u0011\u0000\u0000"+
		"8:\u0007\u0000\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0007\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0003\u0006\u0003\u0000"+
		"?@\u0005\u0003\u0000\u0000@B\u0003\u0006\u0003\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000EG\u0005\u000f\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000"+
		"HL\u0005\u0012\u0000\u0000IK\u0005\f\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u000b\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OR\u0003"+
		"\u0006\u0003\u0000PQ\u0005\u0004\u0000\u0000QS\u0003\u0006\u0003\u0000"+
		"RP\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U^\u0001\u0000\u0000\u0000VY\u0003\n\u0005"+
		"\u0000WX\u0005\u0004\u0000\u0000XZ\u0003\n\u0005\u0000YW\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000]O\u0001\u0000\u0000\u0000]V\u0001"+
		"\u0000\u0000\u0000^\r\u0001\u0000\u0000\u0000_b\u0003\u0006\u0003\u0000"+
		"`a\u0005\u0005\u0000\u0000ac\u0003\u0006\u0003\u0000b`\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fi\u0003\u0006\u0003\u0000"+
		"gh\u0005\u0006\u0000\u0000hj\u0003\u0006\u0003\u0000ig\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mo\u0005\u0007\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0011\u0001\u0000\u0000"+
		"\u0000pw\u0003\u0006\u0003\u0000qw\u0003\b\u0004\u0000rw\u0003\n\u0005"+
		"\u0000sw\u0003\f\u0006\u0000tw\u0003\u000e\u0007\u0000uw\u0003\u0010\b"+
		"\u0000vp\u0001\u0000\u0000\u0000vq\u0001\u0000\u0000\u0000vr\u0001\u0000"+
		"\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000x~\u0003\u0006\u0003"+
		"\u0000y~\u0003\b\u0004\u0000z~\u0003\f\u0006\u0000{~\u0003\u000e\u0007"+
		"\u0000|~\u0003\u0010\b\u0000}x\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000"+
		"\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0081\u0003\u0012\t"+
		"\u0000\u0080\u0082\u0005\u0013\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u008c\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0003\u0014\n\u0000\u0086\u0088\u0007\u0001\u0000\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u007f\u0001\u0000\u0000\u0000"+
		"\u008b\u0085\u0001\u0000\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0003\u0006\u0003\u0000\u008e\u0090\u0003\b\u0004\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0018\u0000\u0000\u0092"+
		"\u0019\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000\u0094"+
		"\u001b\u0001\u0000\u0000\u0000\u0014\u001d$/4;CFLT[]dknv}\u0083\u0089"+
		"\u008b\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}