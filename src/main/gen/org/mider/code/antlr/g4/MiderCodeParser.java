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
		GlissandoConnector=1, ChordConnector=2, AppoggiaturaConnector=3, TupletConnector=4, 
		Ttail=5, PitchPrefix=6, PitchSuffix=7, OctaveSuffix=8, MoveOctaveSuffix=9, 
		DurationSuffix=10, VelocitySuffix=11, RepeatSuffix=12, ArpeggioSuffix=13, 
		Comment=14, Blank=15, SectionLine=16, NoteName=17, RestNote=18, ModifyPitchBase=19, 
		Clone=20, TrackStart=21, LyricStart=22, ProgramStart=23, LyricContent=24, 
		LyricEnd=25, TrackTreble=26, TrackBass=27, TrackConfigSeperator=28, TrackBPMInteger=29, 
		TrackOcatve=30, TrackDuration=31, TrackSpeed=32, TrackSpace=33, TrackTonality=34, 
		TrackVelocity=35, TrackUseInstrumnt=36, TrackPair=37, TrackEnd=38, LetKeyWord=39, 
		LoopKeyWord=40, InKeyWord=41, IfKeyWord=42, ElseKeyWord=43, ForKeyWord=44, 
		WhileKeyWord=45, ReturnKeyWord=46, BreakKeyWord=47, ContinueKeyWord=48, 
		NullKeyWord=49, TrueKeyWord=50, FalseKeyWord=51, FunctionDefKeyWord=52, 
		ProgramComma=53, AssignEqual=54, AssignPlusEqual=55, AssignMinusEqual=56, 
		AssignMulEqual=57, AssignDivEqual=58, AssignModEqual=59, BracesLeft=60, 
		BracesRight=61, SqualBracesLeft=62, SqualBracesRight=63, ParenthesesLeft=64, 
		ParenthesesRight=65, Mul=66, Div=67, Add=68, Sub=69, Mod=70, Not=71, And=72, 
		Or=73, Xor=74, JugdeEqual=75, JugdeNotEqual=76, Integer=77, Float=78, 
		SymbolID=79, ProgramBlank=80, ProgramEnd=81;
	public static final int
		RULE_track = 0, RULE_midercode = 1, RULE_note = 2, RULE_chord = 3, RULE_rest = 4, 
		RULE_tuplet = 5, RULE_glissando = 6, RULE_appoggiatura = 7, RULE_restBase = 8, 
		RULE_noteBase = 9, RULE_chordTailBase = 10, RULE_comment = 11, RULE_lyric = 12, 
		RULE_trackHeader = 13, RULE_sigleTrackConfig = 14, RULE_trackBpmConfig = 15, 
		RULE_trackOctaveAndDurationConfig = 16, RULE_trackSpeedConfig = 17, RULE_trackTonalityConfig = 18, 
		RULE_trackVelocityConfig = 19, RULE_trackInstrumentConfig = 20, RULE_trackCustomConfig = 21, 
		RULE_program = 22, RULE_programBody = 23, RULE_programStatement = 24, 
		RULE_functionDef = 25, RULE_functionDefParamList = 26, RULE_functionCall = 27, 
		RULE_functionBody = 28, RULE_expression = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"track", "midercode", "note", "chord", "rest", "tuplet", "glissando", 
			"appoggiatura", "restBase", "noteBase", "chordTailBase", "comment", "lyric", 
			"trackHeader", "sigleTrackConfig", "trackBpmConfig", "trackOctaveAndDurationConfig", 
			"trackSpeedConfig", "trackTonalityConfig", "trackVelocityConfig", "trackInstrumentConfig", 
			"trackCustomConfig", "program", "programBody", "programStatement", "functionDef", 
			"functionDefParamList", "functionCall", "functionBody", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'(:'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'let'", "'loop'", "'in'", "'if'", "'else'", "'for'", 
			"'while'", "'return'", "'break'", "'continue'", "'null'", "'true'", "'false'", 
			"'fun'", "','", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'{'", 
			"'}'", null, null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'%'", "'!'", 
			"'&'", "'|'", "'^'", "'=='", "'!='", null, null, null, null, "':)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GlissandoConnector", "ChordConnector", "AppoggiaturaConnector", 
			"TupletConnector", "Ttail", "PitchPrefix", "PitchSuffix", "OctaveSuffix", 
			"MoveOctaveSuffix", "DurationSuffix", "VelocitySuffix", "RepeatSuffix", 
			"ArpeggioSuffix", "Comment", "Blank", "SectionLine", "NoteName", "RestNote", 
			"ModifyPitchBase", "Clone", "TrackStart", "LyricStart", "ProgramStart", 
			"LyricContent", "LyricEnd", "TrackTreble", "TrackBass", "TrackConfigSeperator", 
			"TrackBPMInteger", "TrackOcatve", "TrackDuration", "TrackSpeed", "TrackSpace", 
			"TrackTonality", "TrackVelocity", "TrackUseInstrumnt", "TrackPair", "TrackEnd", 
			"LetKeyWord", "LoopKeyWord", "InKeyWord", "IfKeyWord", "ElseKeyWord", 
			"ForKeyWord", "WhileKeyWord", "ReturnKeyWord", "BreakKeyWord", "ContinueKeyWord", 
			"NullKeyWord", "TrueKeyWord", "FalseKeyWord", "FunctionDefKeyWord", "ProgramComma", 
			"AssignEqual", "AssignPlusEqual", "AssignMinusEqual", "AssignMulEqual", 
			"AssignDivEqual", "AssignModEqual", "BracesLeft", "BracesRight", "SqualBracesLeft", 
			"SqualBracesRight", "ParenthesesLeft", "ParenthesesRight", "Mul", "Div", 
			"Add", "Sub", "Mod", "Not", "And", "Or", "Xor", "JugdeEqual", "JugdeNotEqual", 
			"Integer", "Float", "SymbolID", "ProgramBlank", "ProgramEnd"
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
		public TerminalNode EOF() { return getToken(MiderCodeParser.EOF, 0); }
		public List<TrackHeaderContext> trackHeader() {
			return getRuleContexts(TrackHeaderContext.class);
		}
		public TrackHeaderContext trackHeader(int i) {
			return getRuleContext(TrackHeaderContext.class,i);
		}
		public List<MidercodeContext> midercode() {
			return getRuleContexts(MidercodeContext.class);
		}
		public MidercodeContext midercode(int i) {
			return getRuleContext(MidercodeContext.class,i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TrackStart:
					{
					setState(60);
					trackHeader();
					}
					break;
				case PitchPrefix:
				case Comment:
				case NoteName:
				case RestNote:
					{
					setState(61);
					midercode();
					}
					break;
				case ProgramStart:
					{
					setState(62);
					program();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10895424L) != 0) );
			setState(67);
			match(EOF);
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
		public MidercodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midercode; }
	 
		public MidercodeContext() { }
		public void copyFrom(MidercodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoteExperssionContext extends MidercodeContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public NoteExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterNoteExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitNoteExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitNoteExperssion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlissandoExperssionContext extends MidercodeContext {
		public GlissandoContext glissando() {
			return getRuleContext(GlissandoContext.class,0);
		}
		public GlissandoExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterGlissandoExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitGlissandoExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitGlissandoExperssion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppoggiaturaExperssionContext extends MidercodeContext {
		public AppoggiaturaContext appoggiatura() {
			return getRuleContext(AppoggiaturaContext.class,0);
		}
		public AppoggiaturaExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterAppoggiaturaExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitAppoggiaturaExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitAppoggiaturaExperssion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentExperssionContext extends MidercodeContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterCommentExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitCommentExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitCommentExperssion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChordExperssionContext extends MidercodeContext {
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public ChordExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterChordExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitChordExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitChordExperssion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupletExperssionContext extends MidercodeContext {
		public TupletContext tuplet() {
			return getRuleContext(TupletContext.class,0);
		}
		public TupletExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTupletExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTupletExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTupletExperssion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestExperssionContext extends MidercodeContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public RestExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterRestExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitRestExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitRestExperssion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidercodeContext midercode() throws RecognitionException {
		MidercodeContext _localctx = new MidercodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_midercode);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NoteExperssionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				note(0);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LyricStart) {
					{
					setState(70);
					lyric();
					}
				}

				}
				break;
			case 2:
				_localctx = new ChordExperssionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				chord();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LyricStart) {
					{
					setState(74);
					lyric();
					}
				}

				}
				break;
			case 3:
				_localctx = new RestExperssionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				rest(0);
				}
				break;
			case 4:
				_localctx = new TupletExperssionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				tuplet();
				}
				break;
			case 5:
				_localctx = new GlissandoExperssionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				glissando();
				}
				break;
			case 6:
				_localctx = new AppoggiaturaExperssionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				appoggiatura();
				}
				break;
			case 7:
				_localctx = new CommentExperssionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
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
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public List<NoteBaseContext> noteBase() {
			return getRuleContexts(NoteBaseContext.class);
		}
		public NoteBaseContext noteBase(int i) {
			return getRuleContext(NoteBaseContext.class,i);
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
		return note(0);
	}

	private NoteContext note(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoteContext _localctx = new NoteContext(_ctx, _parentState);
		NoteContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_note, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(85);
				match(PitchPrefix);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(NoteName);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoteContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_note);
					setState(98);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(100); 
					_errHandler.sync(this);
					_alt = 1+1;
					do {
						switch (_alt) {
						case 1+1:
							{
							{
							setState(99);
							noteBase();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(102); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		public List<ChordTailBaseContext> chordTailBase() {
			return getRuleContexts(ChordTailBaseContext.class);
		}
		public ChordTailBaseContext chordTailBase(int i) {
			return getRuleContext(ChordTailBaseContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_chord);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				note(0);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					match(ChordConnector);
					setState(111);
					note(0);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ChordConnector );
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArpeggioSuffix) {
					{
					setState(116);
					match(ArpeggioSuffix);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				note(0);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(ChordConnector);
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(121);
						note(0);
						}
						break;
					case 2:
						{
						setState(122);
						chordTailBase();
						}
						break;
					}
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ChordConnector );
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArpeggioSuffix) {
					{
					setState(129);
					match(ArpeggioSuffix);
					}
				}

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
	public static class RestContext extends ParserRuleContext {
		public TerminalNode RestNote() { return getToken(MiderCodeParser.RestNote, 0); }
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public List<RestBaseContext> restBase() {
			return getRuleContexts(RestBaseContext.class);
		}
		public RestBaseContext restBase(int i) {
			return getRuleContext(RestBaseContext.class,i);
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
		return rest(0);
	}

	private RestContext rest(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RestContext _localctx = new RestContext(_ctx, _parentState);
		RestContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_rest, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(135);
			match(RestNote);
			}
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(DurationSuffix);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RestContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_rest);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(144); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(143);
							restBase();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(146); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 10, RULE_tuplet);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PitchPrefix:
			case NoteName:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				note(0);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(TupletConnector);
					setState(155);
					note(0);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TupletConnector );
				}
				break;
			case RestNote:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				rest(0);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					match(TupletConnector);
					setState(162);
					rest(0);
					}
					}
					setState(165); 
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
		enterRule(_localctx, 12, RULE_glissando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			note(0);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(GlissandoConnector);
				setState(171);
				note(0);
				}
				}
				setState(174); 
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
		public TerminalNode AppoggiaturaConnector() { return getToken(MiderCodeParser.AppoggiaturaConnector, 0); }
		public TerminalNode Ttail() { return getToken(MiderCodeParser.Ttail, 0); }
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
		enterRule(_localctx, 14, RULE_appoggiatura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			note(0);
			setState(177);
			match(AppoggiaturaConnector);
			setState(178);
			note(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ttail) {
				{
				setState(179);
				match(Ttail);
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
	public static class RestBaseContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public List<TerminalNode> RepeatSuffix() { return getTokens(MiderCodeParser.RepeatSuffix); }
		public TerminalNode RepeatSuffix(int i) {
			return getToken(MiderCodeParser.RepeatSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public RestBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterRestBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitRestBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitRestBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestBaseContext restBase() throws RecognitionException {
		RestBaseContext _localctx = new RestBaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_restBase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(Clone);
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==DurationSuffix || _la==RepeatSuffix) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class NoteBaseContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public TerminalNode ModifyPitchBase() { return getToken(MiderCodeParser.ModifyPitchBase, 0); }
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
		public List<TerminalNode> RepeatSuffix() { return getTokens(MiderCodeParser.RepeatSuffix); }
		public TerminalNode RepeatSuffix(int i) {
			return getToken(MiderCodeParser.RepeatSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public List<TerminalNode> VelocitySuffix() { return getTokens(MiderCodeParser.VelocitySuffix); }
		public TerminalNode VelocitySuffix(int i) {
			return getToken(MiderCodeParser.VelocitySuffix, i);
		}
		public List<TerminalNode> PitchSuffix() { return getTokens(MiderCodeParser.PitchSuffix); }
		public TerminalNode PitchSuffix(int i) {
			return getToken(MiderCodeParser.PitchSuffix, i);
		}
		public NoteBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterNoteBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitNoteBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitNoteBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteBaseContext noteBase() throws RecognitionException {
		NoteBaseContext _localctx = new NoteBaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_noteBase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(188);
				match(PitchPrefix);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==ModifyPitchBase || _la==Clone) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class ChordTailBaseContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public TerminalNode ModifyPitchBase() { return getToken(MiderCodeParser.ModifyPitchBase, 0); }
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
		public List<TerminalNode> PitchSuffix() { return getTokens(MiderCodeParser.PitchSuffix); }
		public TerminalNode PitchSuffix(int i) {
			return getToken(MiderCodeParser.PitchSuffix, i);
		}
		public ChordTailBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chordTailBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterChordTailBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitChordTailBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitChordTailBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordTailBaseContext chordTailBase() throws RecognitionException {
		ChordTailBaseContext _localctx = new ChordTailBaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chordTailBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(201);
				match(PitchPrefix);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==ModifyPitchBase || _la==Clone) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) {
				{
				{
				setState(208);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(213);
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
		enterRule(_localctx, 22, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LyricContext extends ParserRuleContext {
		public TerminalNode LyricStart() { return getToken(MiderCodeParser.LyricStart, 0); }
		public TerminalNode LyricContent() { return getToken(MiderCodeParser.LyricContent, 0); }
		public TerminalNode LyricEnd() { return getToken(MiderCodeParser.LyricEnd, 0); }
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitLyric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitLyric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lyric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LyricStart);
			setState(217);
			match(LyricContent);
			setState(218);
			match(LyricEnd);
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
	public static class TrackHeaderContext extends ParserRuleContext {
		public TerminalNode TrackStart() { return getToken(MiderCodeParser.TrackStart, 0); }
		public List<SigleTrackConfigContext> sigleTrackConfig() {
			return getRuleContexts(SigleTrackConfigContext.class);
		}
		public SigleTrackConfigContext sigleTrackConfig(int i) {
			return getRuleContext(SigleTrackConfigContext.class,i);
		}
		public TerminalNode TrackEnd() { return getToken(MiderCodeParser.TrackEnd, 0); }
		public List<TerminalNode> TrackConfigSeperator() { return getTokens(MiderCodeParser.TrackConfigSeperator); }
		public TerminalNode TrackConfigSeperator(int i) {
			return getToken(MiderCodeParser.TrackConfigSeperator, i);
		}
		public TrackHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackHeaderContext trackHeader() throws RecognitionException {
		TrackHeaderContext _localctx = new TrackHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trackHeader);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(TrackStart);
			setState(221);
			sigleTrackConfig();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(222);
					match(TrackConfigSeperator);
					setState(223);
					sigleTrackConfig();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(229);
			match(TrackEnd);
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
	public static class SigleTrackConfigContext extends ParserRuleContext {
		public TrackBpmConfigContext trackBpmConfig() {
			return getRuleContext(TrackBpmConfigContext.class,0);
		}
		public TrackOctaveAndDurationConfigContext trackOctaveAndDurationConfig() {
			return getRuleContext(TrackOctaveAndDurationConfigContext.class,0);
		}
		public TrackSpeedConfigContext trackSpeedConfig() {
			return getRuleContext(TrackSpeedConfigContext.class,0);
		}
		public TrackTonalityConfigContext trackTonalityConfig() {
			return getRuleContext(TrackTonalityConfigContext.class,0);
		}
		public TrackVelocityConfigContext trackVelocityConfig() {
			return getRuleContext(TrackVelocityConfigContext.class,0);
		}
		public TrackInstrumentConfigContext trackInstrumentConfig() {
			return getRuleContext(TrackInstrumentConfigContext.class,0);
		}
		public TrackCustomConfigContext trackCustomConfig() {
			return getRuleContext(TrackCustomConfigContext.class,0);
		}
		public SigleTrackConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigleTrackConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterSigleTrackConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitSigleTrackConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitSigleTrackConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigleTrackConfigContext sigleTrackConfig() throws RecognitionException {
		SigleTrackConfigContext _localctx = new SigleTrackConfigContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sigleTrackConfig);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrackBPMInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				trackBpmConfig();
				}
				break;
			case TrackTreble:
			case TrackBass:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				trackOctaveAndDurationConfig();
				}
				break;
			case TrackSpeed:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				trackSpeedConfig();
				}
				break;
			case TrackTonality:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				trackTonalityConfig();
				}
				break;
			case TrackVelocity:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				trackVelocityConfig();
				}
				break;
			case TrackUseInstrumnt:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				trackInstrumentConfig();
				}
				break;
			case TrackPair:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				trackCustomConfig();
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
	public static class TrackBpmConfigContext extends ParserRuleContext {
		public TerminalNode TrackBPMInteger() { return getToken(MiderCodeParser.TrackBPMInteger, 0); }
		public TrackBpmConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackBpmConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackBpmConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackBpmConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackBpmConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackBpmConfigContext trackBpmConfig() throws RecognitionException {
		TrackBpmConfigContext _localctx = new TrackBpmConfigContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_trackBpmConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TrackBPMInteger);
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
	public static class TrackOctaveAndDurationConfigContext extends ParserRuleContext {
		public TerminalNode TrackTreble() { return getToken(MiderCodeParser.TrackTreble, 0); }
		public TerminalNode TrackBass() { return getToken(MiderCodeParser.TrackBass, 0); }
		public List<TerminalNode> TrackOcatve() { return getTokens(MiderCodeParser.TrackOcatve); }
		public TerminalNode TrackOcatve(int i) {
			return getToken(MiderCodeParser.TrackOcatve, i);
		}
		public List<TerminalNode> TrackDuration() { return getTokens(MiderCodeParser.TrackDuration); }
		public TerminalNode TrackDuration(int i) {
			return getToken(MiderCodeParser.TrackDuration, i);
		}
		public TrackOctaveAndDurationConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackOctaveAndDurationConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackOctaveAndDurationConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackOctaveAndDurationConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackOctaveAndDurationConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackOctaveAndDurationConfigContext trackOctaveAndDurationConfig() throws RecognitionException {
		TrackOctaveAndDurationConfigContext _localctx = new TrackOctaveAndDurationConfigContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trackOctaveAndDurationConfig);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==TrackTreble || _la==TrackBass) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(243);
					_la = _input.LA(1);
					if ( !(_la==TrackOcatve || _la==TrackDuration) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class TrackSpeedConfigContext extends ParserRuleContext {
		public TerminalNode TrackSpeed() { return getToken(MiderCodeParser.TrackSpeed, 0); }
		public TrackSpeedConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackSpeedConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackSpeedConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackSpeedConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackSpeedConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackSpeedConfigContext trackSpeedConfig() throws RecognitionException {
		TrackSpeedConfigContext _localctx = new TrackSpeedConfigContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_trackSpeedConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(TrackSpeed);
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
	public static class TrackTonalityConfigContext extends ParserRuleContext {
		public TerminalNode TrackTonality() { return getToken(MiderCodeParser.TrackTonality, 0); }
		public TrackTonalityConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackTonalityConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackTonalityConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackTonalityConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackTonalityConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackTonalityConfigContext trackTonalityConfig() throws RecognitionException {
		TrackTonalityConfigContext _localctx = new TrackTonalityConfigContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_trackTonalityConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(TrackTonality);
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
	public static class TrackVelocityConfigContext extends ParserRuleContext {
		public TerminalNode TrackVelocity() { return getToken(MiderCodeParser.TrackVelocity, 0); }
		public TrackVelocityConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackVelocityConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackVelocityConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackVelocityConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackVelocityConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackVelocityConfigContext trackVelocityConfig() throws RecognitionException {
		TrackVelocityConfigContext _localctx = new TrackVelocityConfigContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_trackVelocityConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(TrackVelocity);
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
	public static class TrackInstrumentConfigContext extends ParserRuleContext {
		public TerminalNode TrackUseInstrumnt() { return getToken(MiderCodeParser.TrackUseInstrumnt, 0); }
		public TrackInstrumentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackInstrumentConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackInstrumentConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackInstrumentConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackInstrumentConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackInstrumentConfigContext trackInstrumentConfig() throws RecognitionException {
		TrackInstrumentConfigContext _localctx = new TrackInstrumentConfigContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trackInstrumentConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TrackUseInstrumnt);
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
	public static class TrackCustomConfigContext extends ParserRuleContext {
		public TerminalNode TrackPair() { return getToken(MiderCodeParser.TrackPair, 0); }
		public TrackCustomConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackCustomConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackCustomConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackCustomConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackCustomConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackCustomConfigContext trackCustomConfig() throws RecognitionException {
		TrackCustomConfigContext _localctx = new TrackCustomConfigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_trackCustomConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(TrackPair);
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ProgramStart() { return getToken(MiderCodeParser.ProgramStart, 0); }
		public TerminalNode ProgramEnd() { return getToken(MiderCodeParser.ProgramEnd, 0); }
		public List<ProgramBodyContext> programBody() {
			return getRuleContexts(ProgramBodyContext.class);
		}
		public ProgramBodyContext programBody(int i) {
			return getRuleContext(ProgramBodyContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ProgramStart);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1928473885699L) != 0)) {
				{
				{
				setState(260);
				programBody();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(ProgramEnd);
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
	public static class ProgramBodyContext extends ParserRuleContext {
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterProgramBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitProgramBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitProgramBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBodyContext programBody() throws RecognitionException {
		ProgramBodyContext _localctx = new ProgramBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_programBody);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				programStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				functionDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				expression(0);
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
	public static class ProgramStatementContext extends ParserRuleContext {
		public ProgramStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStatement; }
	 
		public ProgramStatementContext() { }
		public void copyFrom(ProgramStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignEqualStatementContext extends ProgramStatementContext {
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode AssignEqual() { return getToken(MiderCodeParser.AssignEqual, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignEqualStatementContext(ProgramStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterAssignEqualStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitAssignEqualStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitAssignEqualStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ProgramStatementContext {
		public TerminalNode LoopKeyWord() { return getToken(MiderCodeParser.LoopKeyWord, 0); }
		public TerminalNode BracesLeft() { return getToken(MiderCodeParser.BracesLeft, 0); }
		public TerminalNode BracesRight() { return getToken(MiderCodeParser.BracesRight, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public LoopStatementContext(ProgramStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineStatementContext extends ProgramStatementContext {
		public TerminalNode LetKeyWord() { return getToken(MiderCodeParser.LetKeyWord, 0); }
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode AssignEqual() { return getToken(MiderCodeParser.AssignEqual, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefineStatementContext(ProgramStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterDefineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitDefineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitDefineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramStatementContext programStatement() throws RecognitionException {
		ProgramStatementContext _localctx = new ProgramStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_programStatement);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LetKeyWord:
				_localctx = new DefineStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(LetKeyWord);
				setState(274);
				match(SymbolID);
				setState(275);
				match(AssignEqual);
				setState(276);
				expression(0);
				}
				break;
			case SymbolID:
				_localctx = new AssignEqualStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(SymbolID);
				setState(278);
				match(AssignEqual);
				setState(279);
				expression(0);
				}
				break;
			case LoopKeyWord:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(LoopKeyWord);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 1883275271L) != 0)) {
					{
					setState(281);
					expression(0);
					}
				}

				setState(284);
				match(BracesLeft);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1928473885699L) != 0)) {
					{
					setState(285);
					programBody();
					}
				}

				setState(288);
				match(BracesRight);
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
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode FunctionDefKeyWord() { return getToken(MiderCodeParser.FunctionDefKeyWord, 0); }
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode ParenthesesLeft() { return getToken(MiderCodeParser.ParenthesesLeft, 0); }
		public TerminalNode ParenthesesRight() { return getToken(MiderCodeParser.ParenthesesRight, 0); }
		public TerminalNode BracesLeft() { return getToken(MiderCodeParser.BracesLeft, 0); }
		public TerminalNode BracesRight() { return getToken(MiderCodeParser.BracesRight, 0); }
		public FunctionDefParamListContext functionDefParamList() {
			return getRuleContext(FunctionDefParamListContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(FunctionDefKeyWord);
			setState(292);
			match(SymbolID);
			setState(293);
			match(ParenthesesLeft);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SymbolID) {
				{
				setState(294);
				functionDefParamList();
				}
			}

			setState(297);
			match(ParenthesesRight);
			setState(298);
			match(BracesLeft);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1928473885699L) != 0)) {
				{
				setState(299);
				functionBody();
				}
			}

			setState(302);
			match(BracesRight);
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
	public static class FunctionDefParamListContext extends ParserRuleContext {
		public List<TerminalNode> SymbolID() { return getTokens(MiderCodeParser.SymbolID); }
		public TerminalNode SymbolID(int i) {
			return getToken(MiderCodeParser.SymbolID, i);
		}
		public List<TerminalNode> ProgramComma() { return getTokens(MiderCodeParser.ProgramComma); }
		public TerminalNode ProgramComma(int i) {
			return getToken(MiderCodeParser.ProgramComma, i);
		}
		public FunctionDefParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterFunctionDefParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitFunctionDefParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitFunctionDefParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefParamListContext functionDefParamList() throws RecognitionException {
		FunctionDefParamListContext _localctx = new FunctionDefParamListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionDefParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(SymbolID);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ProgramComma) {
				{
				{
				setState(305);
				match(ProgramComma);
				setState(306);
				match(SymbolID);
				}
				}
				setState(311);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode ParenthesesLeft() { return getToken(MiderCodeParser.ParenthesesLeft, 0); }
		public TerminalNode ParenthesesRight() { return getToken(MiderCodeParser.ParenthesesRight, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ProgramComma() { return getTokens(MiderCodeParser.ProgramComma); }
		public TerminalNode ProgramComma(int i) {
			return getToken(MiderCodeParser.ProgramComma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(SymbolID);
			setState(313);
			match(ParenthesesLeft);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 1883275271L) != 0)) {
				{
				setState(314);
				expression(0);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramComma) {
					{
					{
					setState(315);
					match(ProgramComma);
					setState(316);
					expression(0);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(ParenthesesRight);
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<ProgramBodyContext> programBody() {
			return getRuleContexts(ProgramBodyContext.class);
		}
		public ProgramBodyContext programBody(int i) {
			return getRuleContext(ProgramBodyContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				programBody();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1928473885699L) != 0) );
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(MiderCodeParser.Integer, 0); }
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode TrueKeyWord() { return getToken(MiderCodeParser.TrueKeyWord, 0); }
		public TerminalNode FalseKeyWord() { return getToken(MiderCodeParser.FalseKeyWord, 0); }
		public TerminalNode NullKeyWord() { return getToken(MiderCodeParser.NullKeyWord, 0); }
		public TerminalNode Float() { return getToken(MiderCodeParser.Float, 0); }
		public TerminalNode Not() { return getToken(MiderCodeParser.Not, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ParenthesesLeft() { return getToken(MiderCodeParser.ParenthesesLeft, 0); }
		public TerminalNode ParenthesesRight() { return getToken(MiderCodeParser.ParenthesesRight, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Mul() { return getToken(MiderCodeParser.Mul, 0); }
		public TerminalNode Div() { return getToken(MiderCodeParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MiderCodeParser.Mod, 0); }
		public TerminalNode Add() { return getToken(MiderCodeParser.Add, 0); }
		public TerminalNode Sub() { return getToken(MiderCodeParser.Sub, 0); }
		public TerminalNode And() { return getToken(MiderCodeParser.And, 0); }
		public TerminalNode Or() { return getToken(MiderCodeParser.Or, 0); }
		public TerminalNode Xor() { return getToken(MiderCodeParser.Xor, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(332);
				match(Integer);
				}
				break;
			case 2:
				{
				setState(333);
				match(SymbolID);
				}
				break;
			case 3:
				{
				setState(334);
				match(TrueKeyWord);
				}
				break;
			case 4:
				{
				setState(335);
				match(FalseKeyWord);
				}
				break;
			case 5:
				{
				setState(336);
				match(NullKeyWord);
				}
				break;
			case 6:
				{
				setState(337);
				match(Float);
				}
				break;
			case 7:
				{
				setState(338);
				match(Not);
				setState(339);
				expression(6);
				}
				break;
			case 8:
				{
				setState(340);
				match(ParenthesesLeft);
				setState(341);
				expression(0);
				setState(342);
				match(ParenthesesRight);
				}
				break;
			case 9:
				{
				setState(344);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(348);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 19L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(351);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(354);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return note_sempred((NoteContext)_localctx, predIndex);
		case 4:
			return rest_sempred((RestContext)_localctx, predIndex);
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean note_sempred(NoteContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean rest_sempred(RestContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Q\u016a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001L\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002W\b\u0002\n\u0002\f\u0002Z\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002e\b\u0002\u000b\u0002\f\u0002f\u0005\u0002i\b\u0002\n\u0002\f\u0002"+
		"l\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003q\b\u0003\u000b"+
		"\u0003\f\u0003r\u0001\u0003\u0003\u0003v\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0004\u0003~\b\u0003\u000b"+
		"\u0003\f\u0003\u007f\u0001\u0003\u0003\u0003\u0083\b\u0003\u0003\u0003"+
		"\u0085\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008a\b"+
		"\u0004\n\u0004\f\u0004\u008d\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u0091\b\u0004\u000b\u0004\f\u0004\u0092\u0005\u0004\u0095\b\u0004\n\u0004"+
		"\f\u0004\u0098\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"\u009d\b\u0005\u000b\u0005\f\u0005\u009e\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0004\u0005\u00a4\b\u0005\u000b\u0005\f\u0005\u00a5\u0003\u0005"+
		"\u00a8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00ad\b"+
		"\u0006\u000b\u0006\f\u0006\u00ae\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00b5\b\u0007\u0001\b\u0001\b\u0004\b\u00b9\b\b\u000b"+
		"\b\f\b\u00ba\u0001\t\u0005\t\u00be\b\t\n\t\f\t\u00c1\t\t\u0001\t\u0001"+
		"\t\u0005\t\u00c5\b\t\n\t\f\t\u00c8\t\t\u0001\n\u0005\n\u00cb\b\n\n\n\f"+
		"\n\u00ce\t\n\u0001\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00e1\b\r\n\r\f\r\u00e4\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ef\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00f5\b\u0010\n\u0010\f\u0010\u00f8\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0106"+
		"\b\u0016\n\u0016\f\u0016\u0109\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0110\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u011b\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u011f\b\u0018\u0001\u0018\u0003\u0018\u0122\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0128\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012d\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0134\b\u001a\n\u001a\f\u001a"+
		"\u0137\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u013e\b\u001b\n\u001b\f\u001b\u0141\t\u001b\u0003\u001b\u0143"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u0148\b\u001c"+
		"\u000b\u001c\f\u001c\u0149\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u015a\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0165\b\u001d\n\u001d"+
		"\f\u001d\u0168\t\u001d\u0001\u001d\u0003f\u00e2\u00f6\u0003\u0004\b:\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\t\u0001\u0000\u0007\f\u0002\u0000\n"+
		"\n\f\f\u0001\u0000\u0013\u0014\u0001\u0000\u0007\u000b\u0001\u0000\u001a"+
		"\u001b\u0001\u0000\u001e\u001f\u0002\u0000BCFF\u0001\u0000DE\u0001\u0000"+
		"HJ\u018d\u0000?\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000"+
		"\u0004T\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000\u0000\u0000\b"+
		"\u0086\u0001\u0000\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00a9"+
		"\u0001\u0000\u0000\u0000\u000e\u00b0\u0001\u0000\u0000\u0000\u0010\u00b6"+
		"\u0001\u0000\u0000\u0000\u0012\u00bf\u0001\u0000\u0000\u0000\u0014\u00cc"+
		"\u0001\u0000\u0000\u0000\u0016\u00d6\u0001\u0000\u0000\u0000\u0018\u00d8"+
		"\u0001\u0000\u0000\u0000\u001a\u00dc\u0001\u0000\u0000\u0000\u001c\u00ee"+
		"\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000\u0000 \u00f2\u0001"+
		"\u0000\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u00fb\u0001\u0000"+
		"\u0000\u0000&\u00fd\u0001\u0000\u0000\u0000(\u00ff\u0001\u0000\u0000\u0000"+
		"*\u0101\u0001\u0000\u0000\u0000,\u0103\u0001\u0000\u0000\u0000.\u010f"+
		"\u0001\u0000\u0000\u00000\u0121\u0001\u0000\u0000\u00002\u0123\u0001\u0000"+
		"\u0000\u00004\u0130\u0001\u0000\u0000\u00006\u0138\u0001\u0000\u0000\u0000"+
		"8\u0147\u0001\u0000\u0000\u0000:\u0159\u0001\u0000\u0000\u0000<@\u0003"+
		"\u001a\r\u0000=@\u0003\u0002\u0001\u0000>@\u0003,\u0016\u0000?<\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0000\u0000\u0001D\u0001\u0001"+
		"\u0000\u0000\u0000EG\u0003\u0004\u0002\u0000FH\u0003\u0018\f\u0000GF\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HS\u0001\u0000\u0000\u0000"+
		"IK\u0003\u0006\u0003\u0000JL\u0003\u0018\f\u0000KJ\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LS\u0001\u0000\u0000\u0000MS\u0003\b\u0004\u0000"+
		"NS\u0003\n\u0005\u0000OS\u0003\f\u0006\u0000PS\u0003\u000e\u0007\u0000"+
		"QS\u0003\u0016\u000b\u0000RE\u0001\u0000\u0000\u0000RI\u0001\u0000\u0000"+
		"\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0003"+
		"\u0001\u0000\u0000\u0000TX\u0006\u0002\uffff\uffff\u0000UW\u0005\u0006"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[_\u0005\u0011\u0000\u0000\\^\u0007\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`j\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bd\n\u0001\u0000\u0000ce\u0003\u0012\t\u0000dc\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\u0005\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mp\u0003\u0004\u0002\u0000no\u0005\u0002\u0000\u0000oq\u0003\u0004\u0002"+
		"\u0000pn\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0005"+
		"\r\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0085"+
		"\u0001\u0000\u0000\u0000w}\u0003\u0004\u0002\u0000x{\u0005\u0002\u0000"+
		"\u0000y|\u0003\u0004\u0002\u0000z|\u0003\u0014\n\u0000{y\u0001\u0000\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}x\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0005\r\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084"+
		"m\u0001\u0000\u0000\u0000\u0084w\u0001\u0000\u0000\u0000\u0085\u0007\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0006\u0004\uffff\uffff\u0000\u0087\u008b"+
		"\u0005\u0012\u0000\u0000\u0088\u008a\u0005\n\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0096\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090\n\u0001"+
		"\u0000\u0000\u008f\u0091\u0003\u0010\b\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0003\u0004\u0002\u0000\u009a\u009b\u0005\u0004\u0000\u0000"+
		"\u009b\u009d\u0003\u0004\u0002\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0003\b\u0004\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2"+
		"\u00a4\u0003\b\u0004\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u0099"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a8\u000b"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003\u0004\u0002\u0000\u00aa\u00ab"+
		"\u0005\u0001\u0000\u0000\u00ab\u00ad\u0003\u0004\u0002\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\r\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0003\u0004\u0002\u0000\u00b1\u00b2\u0005"+
		"\u0003\u0000\u0000\u00b2\u00b4\u0003\u0004\u0002\u0000\u00b3\u00b5\u0005"+
		"\u0005\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u000f\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005"+
		"\u0014\u0000\u0000\u00b7\u00b9\u0007\u0001\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u0011\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0005\u0006\u0000\u0000\u00bd\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c6\u0007"+
		"\u0002\u0000\u0000\u00c3\u00c5\u0007\u0000\u0000\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0013\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005"+
		"\u0006\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d3\u0007\u0002\u0000\u0000\u00d0\u00d2\u0007"+
		"\u0003\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u000e\u0000\u0000\u00d7\u0017\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u0016\u0000\u0000\u00d9\u00da\u0005"+
		"\u0018\u0000\u0000\u00da\u00db\u0005\u0019\u0000\u0000\u00db\u0019\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\u0015\u0000\u0000\u00dd\u00e2\u0003"+
		"\u001c\u000e\u0000\u00de\u00df\u0005\u001c\u0000\u0000\u00df\u00e1\u0003"+
		"\u001c\u000e\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005&\u0000\u0000\u00e6\u001b\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ef\u0003\u001e\u000f\u0000\u00e8\u00ef\u0003 \u0010"+
		"\u0000\u00e9\u00ef\u0003\"\u0011\u0000\u00ea\u00ef\u0003$\u0012\u0000"+
		"\u00eb\u00ef\u0003&\u0013\u0000\u00ec\u00ef\u0003(\u0014\u0000\u00ed\u00ef"+
		"\u0003*\u0015\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u001d\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u001d\u0000\u0000\u00f1\u001f\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f6\u0007\u0004\u0000\u0000\u00f3\u00f5\u0007"+
		"\u0005\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7!\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005 \u0000\u0000\u00fa#\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\"\u0000\u0000\u00fc%\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005#\u0000\u0000\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005$\u0000\u0000\u0100)\u0001\u0000\u0000\u0000\u0101\u0102\u0005%"+
		"\u0000\u0000\u0102+\u0001\u0000\u0000\u0000\u0103\u0107\u0005\u0017\u0000"+
		"\u0000\u0104\u0106\u0003.\u0017\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0005Q\u0000\u0000\u010b"+
		"-\u0001\u0000\u0000\u0000\u010c\u0110\u00030\u0018\u0000\u010d\u0110\u0003"+
		"2\u0019\u0000\u010e\u0110\u0003:\u001d\u0000\u010f\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000"+
		"\u0000\u0110/\u0001\u0000\u0000\u0000\u0111\u0112\u0005\'\u0000\u0000"+
		"\u0112\u0113\u0005O\u0000\u0000\u0113\u0114\u00056\u0000\u0000\u0114\u0122"+
		"\u0003:\u001d\u0000\u0115\u0116\u0005O\u0000\u0000\u0116\u0117\u00056"+
		"\u0000\u0000\u0117\u0122\u0003:\u001d\u0000\u0118\u011a\u0005(\u0000\u0000"+
		"\u0119\u011b\u0003:\u001d\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011e\u0005<\u0000\u0000\u011d\u011f\u0003.\u0017\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0122\u0005=\u0000\u0000\u0121\u0111\u0001\u0000"+
		"\u0000\u0000\u0121\u0115\u0001\u0000\u0000\u0000\u0121\u0118\u0001\u0000"+
		"\u0000\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0124\u00054\u0000\u0000"+
		"\u0124\u0125\u0005O\u0000\u0000\u0125\u0127\u0005@\u0000\u0000\u0126\u0128"+
		"\u00034\u001a\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005"+
		"A\u0000\u0000\u012a\u012c\u0005<\u0000\u0000\u012b\u012d\u00038\u001c"+
		"\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005=\u0000\u0000"+
		"\u012f3\u0001\u0000\u0000\u0000\u0130\u0135\u0005O\u0000\u0000\u0131\u0132"+
		"\u00055\u0000\u0000\u0132\u0134\u0005O\u0000\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u01365\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005O\u0000\u0000"+
		"\u0139\u0142\u0005@\u0000\u0000\u013a\u013f\u0003:\u001d\u0000\u013b\u013c"+
		"\u00055\u0000\u0000\u013c\u013e\u0003:\u001d\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0005A\u0000\u0000\u01457\u0001\u0000\u0000\u0000"+
		"\u0146\u0148\u0003.\u0017\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a9\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0006\u001d\uffff\uffff\u0000\u014c\u015a\u0005M\u0000\u0000\u014d\u015a"+
		"\u0005O\u0000\u0000\u014e\u015a\u00052\u0000\u0000\u014f\u015a\u00053"+
		"\u0000\u0000\u0150\u015a\u00051\u0000\u0000\u0151\u015a\u0005N\u0000\u0000"+
		"\u0152\u0153\u0005G\u0000\u0000\u0153\u015a\u0003:\u001d\u0006\u0154\u0155"+
		"\u0005@\u0000\u0000\u0155\u0156\u0003:\u001d\u0000\u0156\u0157\u0005A"+
		"\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u015a\u00036\u001b"+
		"\u0000\u0159\u014b\u0001\u0000\u0000\u0000\u0159\u014d\u0001\u0000\u0000"+
		"\u0000\u0159\u014e\u0001\u0000\u0000\u0000\u0159\u014f\u0001\u0000\u0000"+
		"\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u0159\u0151\u0001\u0000\u0000"+
		"\u0000\u0159\u0152\u0001\u0000\u0000\u0000\u0159\u0154\u0001\u0000\u0000"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u0166\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\n\u0005\u0000\u0000\u015c\u015d\u0007\u0006\u0000\u0000"+
		"\u015d\u0165\u0003:\u001d\u0006\u015e\u015f\n\u0004\u0000\u0000\u015f"+
		"\u0160\u0007\u0007\u0000\u0000\u0160\u0165\u0003:\u001d\u0005\u0161\u0162"+
		"\n\u0003\u0000\u0000\u0162\u0163\u0007\b\u0000\u0000\u0163\u0165\u0003"+
		":\u001d\u0004\u0164\u015b\u0001\u0000\u0000\u0000\u0164\u015e\u0001\u0000"+
		"\u0000\u0000\u0164\u0161\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167;\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000-?AGKRX_fjru{\u007f\u0082\u0084\u008b\u0092\u0096\u009e\u00a5\u00a7"+
		"\u00ae\u00b4\u00ba\u00bf\u00c6\u00cc\u00d3\u00e2\u00ee\u00f6\u0107\u010f"+
		"\u011a\u011e\u0121\u0127\u012c\u0135\u013f\u0142\u0149\u0159\u0164\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}