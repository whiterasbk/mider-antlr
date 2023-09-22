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
		TripletsConnector=5, Ttail=6, PitchPrefix=7, PitchSuffix=8, OctaveSuffix=9, 
		MoveOctaveSuffix=10, DurationSuffix=11, VelocitySuffix=12, RepeatSuffix=13, 
		ArpeggioSuffix=14, Comment=15, Blank=16, SectionLine=17, NoteName=18, 
		RestNote=19, ModifyPitchBase=20, Clone=21, TrackStart=22, LyricStart=23, 
		ProgramStart=24, HexStart=25, LyricContent=26, LyricEnd=27, TrackTreble=28, 
		TrackBass=29, TrackAlto=30, TrackConfigSeperator=31, TrackBPMInteger=32, 
		TrackOcatve=33, TrackDuration=34, TrackSpeed=35, TrackSpace=36, TrackTonality=37, 
		TrackVelocity=38, TrackTimesignature=39, TrackUseInstrumnt=40, TrackPair=41, 
		TrackEnd=42, LetKeyWord=43, LoopKeyWord=44, InKeyWord=45, IfKeyWord=46, 
		ElseKeyWord=47, ForKeyWord=48, WhileKeyWord=49, ReturnKeyWord=50, BreakKeyWord=51, 
		ContinueKeyWord=52, NullKeyWord=53, TrueKeyWord=54, FalseKeyWord=55, FunctionDefKeyWord=56, 
		LogicAnd=57, LogicOr=58, Caret=59, AdressEqual=60, Xor=61, And=62, Or=63, 
		JugdeNotEqual=64, JugdeEqual=65, GreaterEqual=66, LesserEqual=67, AssignPlusEqual=68, 
		AssignMinusEqual=69, AssignMulEqual=70, AssignDivEqual=71, AssignModEqual=72, 
		BracesLeft=73, BracesRight=74, SqualBracesLeft=75, SqualBracesRight=76, 
		ParenthesesLeft=77, ParenthesesRight=78, ProgramComma=79, ProgramColon=80, 
		ProgramSemicolon=81, ProgramDot=82, Greater=83, Lesser=84, Mul=85, Div=86, 
		Add=87, Sub=88, Mod=89, Not=90, AssignEqual=91, Integer=92, Float=93, 
		SymbolID=94, String=95, ProgramBlank=96, ProgramEnd=97, PureHexContent=98, 
		HexNewLine=99, MIDIHexDigit=100, HexEnd=101;
	public static final int
		RULE_track = 0, RULE_midercode = 1, RULE_note = 2, RULE_chord = 3, RULE_rest = 4, 
		RULE_tuplet = 5, RULE_triplets = 6, RULE_glissando = 7, RULE_appoggiatura = 8, 
		RULE_restBase = 9, RULE_noteBase = 10, RULE_chordTailBase = 11, RULE_comment = 12, 
		RULE_lyric = 13, RULE_trackHeader = 14, RULE_sigleTrackConfig = 15, RULE_trackBpmConfig = 16, 
		RULE_trackOctaveAndDurationConfig = 17, RULE_trackSpeedConfig = 18, RULE_trackTimesignatureConfig = 19, 
		RULE_trackTonalityConfig = 20, RULE_trackVelocityConfig = 21, RULE_trackInstrumentConfig = 22, 
		RULE_trackCustomConfig = 23, RULE_hexData = 24, RULE_hexContent = 25, 
		RULE_program = 26, RULE_programBody = 27, RULE_programStatement = 28, 
		RULE_functionDef = 29, RULE_functionDefParamList = 30, RULE_functionCall = 31, 
		RULE_functionBody = 32, RULE_listBody = 33, RULE_mapBody = 34, RULE_primary = 35, 
		RULE_expression = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"track", "midercode", "note", "chord", "rest", "tuplet", "triplets", 
			"glissando", "appoggiatura", "restBase", "noteBase", "chordTailBase", 
			"comment", "lyric", "trackHeader", "sigleTrackConfig", "trackBpmConfig", 
			"trackOctaveAndDurationConfig", "trackSpeedConfig", "trackTimesignatureConfig", 
			"trackTonalityConfig", "trackVelocityConfig", "trackInstrumentConfig", 
			"trackCustomConfig", "hexData", "hexContent", "program", "programBody", 
			"programStatement", "functionDef", "functionDefParamList", "functionCall", 
			"functionBody", "listBody", "mapBody", "primary", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'(='", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'let'", "'loop'", "'in'", 
			"'if'", "'else'", "'for'", "'while'", "'return'", "'break'", "'continue'", 
			"'null'", "'true'", "'false'", "'fun'", "'&'", "'|'", "'^'", "'==='", 
			null, "'&&'", "'||'", "'!='", "'=='", "'>='", "'<='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'{'", "'}'", null, null, "'('", "')'", "';'", 
			"':'", "','", "'.'", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'!'", "'='", null, null, null, null, null, "'=)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GlissandoConnector", "ChordConnector", "AppoggiaturaConnector", 
			"TupletConnector", "TripletsConnector", "Ttail", "PitchPrefix", "PitchSuffix", 
			"OctaveSuffix", "MoveOctaveSuffix", "DurationSuffix", "VelocitySuffix", 
			"RepeatSuffix", "ArpeggioSuffix", "Comment", "Blank", "SectionLine", 
			"NoteName", "RestNote", "ModifyPitchBase", "Clone", "TrackStart", "LyricStart", 
			"ProgramStart", "HexStart", "LyricContent", "LyricEnd", "TrackTreble", 
			"TrackBass", "TrackAlto", "TrackConfigSeperator", "TrackBPMInteger", 
			"TrackOcatve", "TrackDuration", "TrackSpeed", "TrackSpace", "TrackTonality", 
			"TrackVelocity", "TrackTimesignature", "TrackUseInstrumnt", "TrackPair", 
			"TrackEnd", "LetKeyWord", "LoopKeyWord", "InKeyWord", "IfKeyWord", "ElseKeyWord", 
			"ForKeyWord", "WhileKeyWord", "ReturnKeyWord", "BreakKeyWord", "ContinueKeyWord", 
			"NullKeyWord", "TrueKeyWord", "FalseKeyWord", "FunctionDefKeyWord", "LogicAnd", 
			"LogicOr", "Caret", "AdressEqual", "Xor", "And", "Or", "JugdeNotEqual", 
			"JugdeEqual", "GreaterEqual", "LesserEqual", "AssignPlusEqual", "AssignMinusEqual", 
			"AssignMulEqual", "AssignDivEqual", "AssignModEqual", "BracesLeft", "BracesRight", 
			"SqualBracesLeft", "SqualBracesRight", "ParenthesesLeft", "ParenthesesRight", 
			"ProgramComma", "ProgramColon", "ProgramSemicolon", "ProgramDot", "Greater", 
			"Lesser", "Mul", "Div", "Add", "Sub", "Mod", "Not", "AssignEqual", "Integer", 
			"Float", "SymbolID", "String", "ProgramBlank", "ProgramEnd", "PureHexContent", 
			"HexNewLine", "MIDIHexDigit", "HexEnd"
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
		public List<HexDataContext> hexData() {
			return getRuleContexts(HexDataContext.class);
		}
		public HexDataContext hexData(int i) {
			return getRuleContext(HexDataContext.class,i);
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
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TrackStart:
					{
					setState(74);
					trackHeader();
					}
					break;
				case PitchPrefix:
				case Comment:
				case NoteName:
				case RestNote:
					{
					setState(75);
					midercode();
					}
					break;
				case ProgramStart:
					{
					setState(76);
					program();
					}
					break;
				case HexStart:
					{
					setState(77);
					hexData();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 55345280L) != 0) );
			setState(82);
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
	public static class TripletsExperssionContext extends MidercodeContext {
		public TripletsContext triplets() {
			return getRuleContext(TripletsContext.class,0);
		}
		public TripletsExperssionContext(MidercodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTripletsExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTripletsExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTripletsExperssion(this);
			else return visitor.visitChildren(this);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NoteExperssionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				note(0);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LyricStart) {
					{
					setState(85);
					lyric();
					}
				}

				}
				break;
			case 2:
				_localctx = new ChordExperssionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				chord();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LyricStart) {
					{
					setState(89);
					lyric();
					}
				}

				}
				break;
			case 3:
				_localctx = new RestExperssionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				rest(0);
				}
				break;
			case 4:
				_localctx = new TupletExperssionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				tuplet();
				}
				break;
			case 5:
				_localctx = new TripletsExperssionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				triplets();
				}
				break;
			case 6:
				_localctx = new GlissandoExperssionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				glissando();
				}
				break;
			case 7:
				_localctx = new AppoggiaturaExperssionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				appoggiatura();
				}
				break;
			case 8:
				_localctx = new CommentExperssionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
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
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(101);
				match(PitchPrefix);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(NoteName);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
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
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
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
					setState(114);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(116); 
					_errHandler.sync(this);
					_alt = 1+1;
					do {
						switch (_alt) {
						case 1+1:
							{
							{
							setState(115);
							noteBase();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(118); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(124);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				note(0);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					match(ChordConnector);
					setState(127);
					note(0);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ChordConnector );
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArpeggioSuffix) {
					{
					setState(132);
					match(ArpeggioSuffix);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				note(0);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(ChordConnector);
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(137);
						note(0);
						}
						break;
					case 2:
						{
						setState(138);
						chordTailBase();
						}
						break;
					}
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ChordConnector );
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArpeggioSuffix) {
					{
					setState(145);
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
			setState(151);
			match(RestNote);
			}
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(DurationSuffix);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
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
					setState(158);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(160); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(159);
							restBase();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(162); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(168);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PitchPrefix:
			case NoteName:
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
					match(TupletConnector);
					setState(171);
					note(0);
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TupletConnector );
				}
				break;
			case RestNote:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				rest(0);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					match(TupletConnector);
					setState(178);
					rest(0);
					}
					}
					setState(181); 
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
	public static class TripletsContext extends ParserRuleContext {
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
		public TripletsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTriplets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTriplets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTriplets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripletsContext triplets() throws RecognitionException {
		TripletsContext _localctx = new TripletsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_triplets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			note(0);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(ChordConnector);
				setState(187);
				note(0);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ChordConnector );
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
			setState(192);
			note(0);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(GlissandoConnector);
				setState(194);
				note(0);
				}
				}
				setState(197); 
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
		enterRule(_localctx, 16, RULE_appoggiatura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			note(0);
			setState(200);
			match(AppoggiaturaConnector);
			setState(201);
			note(0);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ttail) {
				{
				setState(202);
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
		enterRule(_localctx, 18, RULE_restBase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Clone);
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(206);
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
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 20, RULE_noteBase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(211);
				match(PitchPrefix);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==ModifyPitchBase || _la==Clone) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
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
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 22, RULE_chordTailBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(224);
				match(PitchPrefix);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==ModifyPitchBase || _la==Clone) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(236);
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
		enterRule(_localctx, 24, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 26, RULE_lyric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LyricStart);
			setState(240);
			match(LyricContent);
			setState(241);
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
		enterRule(_localctx, 28, RULE_trackHeader);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(TrackStart);
			setState(244);
			sigleTrackConfig();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(245);
					match(TrackConfigSeperator);
					setState(246);
					sigleTrackConfig();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(252);
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
		public TrackTimesignatureConfigContext trackTimesignatureConfig() {
			return getRuleContext(TrackTimesignatureConfigContext.class,0);
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
		enterRule(_localctx, 30, RULE_sigleTrackConfig);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrackBPMInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				trackBpmConfig();
				}
				break;
			case TrackTreble:
			case TrackBass:
			case TrackAlto:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				trackOctaveAndDurationConfig();
				}
				break;
			case TrackTimesignature:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				trackTimesignatureConfig();
				}
				break;
			case TrackSpeed:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				trackSpeedConfig();
				}
				break;
			case TrackTonality:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				trackTonalityConfig();
				}
				break;
			case TrackVelocity:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				trackVelocityConfig();
				}
				break;
			case TrackUseInstrumnt:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				trackInstrumentConfig();
				}
				break;
			case TrackPair:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
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
		enterRule(_localctx, 32, RULE_trackBpmConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		public TerminalNode TrackAlto() { return getToken(MiderCodeParser.TrackAlto, 0); }
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
		enterRule(_localctx, 34, RULE_trackOctaveAndDurationConfig);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(267);
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
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 36, RULE_trackSpeedConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
	public static class TrackTimesignatureConfigContext extends ParserRuleContext {
		public TerminalNode TrackTimesignature() { return getToken(MiderCodeParser.TrackTimesignature, 0); }
		public TrackTimesignatureConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackTimesignatureConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackTimesignatureConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackTimesignatureConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackTimesignatureConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackTimesignatureConfigContext trackTimesignatureConfig() throws RecognitionException {
		TrackTimesignatureConfigContext _localctx = new TrackTimesignatureConfigContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_trackTimesignatureConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(TrackTimesignature);
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
		enterRule(_localctx, 40, RULE_trackTonalityConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 42, RULE_trackVelocityConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 44, RULE_trackInstrumentConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 46, RULE_trackCustomConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
	public static class HexDataContext extends ParserRuleContext {
		public TerminalNode HexStart() { return getToken(MiderCodeParser.HexStart, 0); }
		public HexContentContext hexContent() {
			return getRuleContext(HexContentContext.class,0);
		}
		public TerminalNode HexEnd() { return getToken(MiderCodeParser.HexEnd, 0); }
		public HexDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterHexData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitHexData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitHexData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexDataContext hexData() throws RecognitionException {
		HexDataContext _localctx = new HexDataContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_hexData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(HexStart);
			setState(286);
			hexContent();
			setState(287);
			match(HexEnd);
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
	public static class HexContentContext extends ParserRuleContext {
		public TerminalNode PureHexContent() { return getToken(MiderCodeParser.PureHexContent, 0); }
		public HexContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterHexContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitHexContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitHexContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexContentContext hexContent() throws RecognitionException {
		HexContentContext _localctx = new HexContentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hexContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(PureHexContent);
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
		enterRule(_localctx, 52, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ProgramStart);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 8637785896401923L) != 0)) {
				{
				{
				setState(292);
				programBody();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
		public TerminalNode ProgramComma() { return getToken(MiderCodeParser.ProgramComma, 0); }
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
		enterRule(_localctx, 54, RULE_programBody);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				programStatement();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ProgramComma) {
					{
					setState(301);
					match(ProgramComma);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				functionDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
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
		enterRule(_localctx, 56, RULE_programStatement);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LetKeyWord:
				_localctx = new DefineStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(LetKeyWord);
				setState(309);
				match(SymbolID);
				setState(310);
				match(AssignEqual);
				setState(311);
				expression(0);
				}
				break;
			case SymbolID:
				_localctx = new AssignEqualStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(SymbolID);
				setState(313);
				match(AssignEqual);
				setState(314);
				expression(0);
				}
				break;
			case LoopKeyWord:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(LoopKeyWord);
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(316);
					expression(0);
					}
					break;
				}
				setState(319);
				match(BracesLeft);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 8637785896401923L) != 0)) {
					{
					setState(320);
					programBody();
					}
				}

				setState(323);
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
		enterRule(_localctx, 58, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FunctionDefKeyWord);
			setState(327);
			match(SymbolID);
			setState(328);
			match(ParenthesesLeft);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SymbolID) {
				{
				setState(329);
				functionDefParamList();
				}
			}

			setState(332);
			match(ParenthesesRight);
			setState(333);
			match(BracesLeft);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 8637785896401923L) != 0)) {
				{
				setState(334);
				functionBody();
				}
			}

			setState(337);
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
		public List<TerminalNode> ProgramSemicolon() { return getTokens(MiderCodeParser.ProgramSemicolon); }
		public TerminalNode ProgramSemicolon(int i) {
			return getToken(MiderCodeParser.ProgramSemicolon, i);
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
		enterRule(_localctx, 60, RULE_functionDefParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(SymbolID);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ProgramSemicolon) {
				{
				{
				setState(340);
				match(ProgramSemicolon);
				setState(341);
				match(SymbolID);
				}
				}
				setState(346);
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
		public List<TerminalNode> ProgramSemicolon() { return getTokens(MiderCodeParser.ProgramSemicolon); }
		public TerminalNode ProgramSemicolon(int i) {
			return getToken(MiderCodeParser.ProgramSemicolon, i);
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
		enterRule(_localctx, 62, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(SymbolID);
			setState(348);
			match(ParenthesesLeft);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 8435337789447L) != 0)) {
				{
				setState(349);
				expression(0);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramSemicolon) {
					{
					{
					setState(350);
					match(ProgramSemicolon);
					setState(351);
					expression(0);
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(359);
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
		enterRule(_localctx, 64, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				programBody();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 8637785896401923L) != 0) );
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
	public static class ListBodyContext extends ParserRuleContext {
		public TerminalNode SqualBracesLeft() { return getToken(MiderCodeParser.SqualBracesLeft, 0); }
		public TerminalNode SqualBracesRight() { return getToken(MiderCodeParser.SqualBracesRight, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ProgramSemicolon() { return getTokens(MiderCodeParser.ProgramSemicolon); }
		public TerminalNode ProgramSemicolon(int i) {
			return getToken(MiderCodeParser.ProgramSemicolon, i);
		}
		public ListBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterListBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitListBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitListBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBodyContext listBody() throws RecognitionException {
		ListBodyContext _localctx = new ListBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(SqualBracesLeft);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 8435337789447L) != 0)) {
				{
				setState(367);
				expression(0);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramSemicolon) {
					{
					{
					setState(368);
					match(ProgramSemicolon);
					setState(369);
					expression(0);
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(377);
			match(SqualBracesRight);
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
	public static class MapBodyContext extends ParserRuleContext {
		public TerminalNode BracesLeft() { return getToken(MiderCodeParser.BracesLeft, 0); }
		public TerminalNode BracesRight() { return getToken(MiderCodeParser.BracesRight, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ProgramColon() { return getTokens(MiderCodeParser.ProgramColon); }
		public TerminalNode ProgramColon(int i) {
			return getToken(MiderCodeParser.ProgramColon, i);
		}
		public List<TerminalNode> ProgramSemicolon() { return getTokens(MiderCodeParser.ProgramSemicolon); }
		public TerminalNode ProgramSemicolon(int i) {
			return getToken(MiderCodeParser.ProgramSemicolon, i);
		}
		public MapBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterMapBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitMapBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitMapBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapBodyContext mapBody() throws RecognitionException {
		MapBodyContext _localctx = new MapBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mapBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(BracesLeft);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 8435337789447L) != 0)) {
				{
				setState(380);
				expression(0);
				setState(381);
				match(ProgramColon);
				setState(382);
				expression(0);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramSemicolon) {
					{
					{
					setState(383);
					match(ProgramSemicolon);
					setState(384);
					expression(0);
					setState(385);
					match(ProgramColon);
					setState(386);
					expression(0);
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(395);
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ParenthesesLeft() { return getToken(MiderCodeParser.ParenthesesLeft, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ParenthesesRight() { return getToken(MiderCodeParser.ParenthesesRight, 0); }
		public TerminalNode NullKeyWord() { return getToken(MiderCodeParser.NullKeyWord, 0); }
		public TerminalNode TrueKeyWord() { return getToken(MiderCodeParser.TrueKeyWord, 0); }
		public TerminalNode FalseKeyWord() { return getToken(MiderCodeParser.FalseKeyWord, 0); }
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode Integer() { return getToken(MiderCodeParser.Integer, 0); }
		public TerminalNode Float() { return getToken(MiderCodeParser.Float, 0); }
		public TerminalNode String() { return getToken(MiderCodeParser.String, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primary);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParenthesesLeft:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(ParenthesesLeft);
				setState(398);
				expression(0);
				setState(399);
				match(ParenthesesRight);
				}
				break;
			case NullKeyWord:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(NullKeyWord);
				}
				break;
			case TrueKeyWord:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(TrueKeyWord);
				}
				break;
			case FalseKeyWord:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				match(FalseKeyWord);
				}
				break;
			case SymbolID:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				match(SymbolID);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 7);
				{
				setState(406);
				match(Float);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 8);
				{
				setState(407);
				match(String);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Token bop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Not() { return getToken(MiderCodeParser.Not, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(MiderCodeParser.Add, 0); }
		public TerminalNode Sub() { return getToken(MiderCodeParser.Sub, 0); }
		public ListBodyContext listBody() {
			return getRuleContext(ListBodyContext.class,0);
		}
		public MapBodyContext mapBody() {
			return getRuleContext(MapBodyContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Caret() { return getToken(MiderCodeParser.Caret, 0); }
		public TerminalNode Mul() { return getToken(MiderCodeParser.Mul, 0); }
		public TerminalNode Div() { return getToken(MiderCodeParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MiderCodeParser.Mod, 0); }
		public TerminalNode And() { return getToken(MiderCodeParser.And, 0); }
		public TerminalNode Or() { return getToken(MiderCodeParser.Or, 0); }
		public TerminalNode Xor() { return getToken(MiderCodeParser.Xor, 0); }
		public TerminalNode JugdeEqual() { return getToken(MiderCodeParser.JugdeEqual, 0); }
		public TerminalNode AdressEqual() { return getToken(MiderCodeParser.AdressEqual, 0); }
		public TerminalNode JugdeNotEqual() { return getToken(MiderCodeParser.JugdeNotEqual, 0); }
		public TerminalNode Greater() { return getToken(MiderCodeParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(MiderCodeParser.GreaterEqual, 0); }
		public TerminalNode Lesser() { return getToken(MiderCodeParser.Lesser, 0); }
		public TerminalNode LesserEqual() { return getToken(MiderCodeParser.LesserEqual, 0); }
		public TerminalNode BracesLeft() { return getToken(MiderCodeParser.BracesLeft, 0); }
		public TerminalNode BracesRight() { return getToken(MiderCodeParser.BracesRight, 0); }
		public TerminalNode ProgramDot() { return getToken(MiderCodeParser.ProgramDot, 0); }
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(411);
				primary();
				}
				break;
			case 2:
				{
				setState(412);
				match(Not);
				setState(413);
				expression(11);
				}
				break;
			case 3:
				{
				setState(414);
				match(Add);
				setState(415);
				expression(10);
				}
				break;
			case 4:
				{
				setState(416);
				match(Sub);
				setState(417);
				expression(9);
				}
				break;
			case 5:
				{
				setState(418);
				listBody();
				}
				break;
			case 6:
				{
				setState(419);
				mapBody();
				}
				break;
			case 7:
				{
				setState(420);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(423);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(424);
						match(Caret);
						setState(425);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(427);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 19L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(428);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(431);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(432);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(433);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009213693952L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(434);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(436);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 25166065L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(437);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(439);
						match(BracesLeft);
						setState(440);
						expression(0);
						setState(441);
						match(BracesRight);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(443);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(444);
						((ExpressionContext)_localctx).bop = match(ProgramDot);
						setState(447);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(445);
							match(SymbolID);
							}
							break;
						case 2:
							{
							setState(446);
							functionCall();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		case 36:
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
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001e\u01c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000O\b\u0000\u000b\u0000\f\u0000P\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002g\b\u0002\n\u0002\f\u0002j\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002n\b\u0002\n\u0002\f\u0002q\t\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002u\b\u0002\u000b\u0002\f\u0002v\u0005\u0002y\b\u0002\n\u0002\f\u0002"+
		"|\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0081\b\u0003"+
		"\u000b\u0003\f\u0003\u0082\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008c\b\u0003\u0004"+
		"\u0003\u008e\b\u0003\u000b\u0003\f\u0003\u008f\u0001\u0003\u0003\u0003"+
		"\u0093\b\u0003\u0003\u0003\u0095\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u009a\b\u0004\n\u0004\f\u0004\u009d\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u00a1\b\u0004\u000b\u0004\f\u0004\u00a2\u0005"+
		"\u0004\u00a5\b\u0004\n\u0004\f\u0004\u00a8\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u00ad\b\u0005\u000b\u0005\f\u0005\u00ae\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00b4\b\u0005\u000b\u0005\f"+
		"\u0005\u00b5\u0003\u0005\u00b8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u00bd\b\u0006\u000b\u0006\f\u0006\u00be\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u00c4\b\u0007\u000b\u0007\f\u0007\u00c5"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cc\b\b\u0001\t\u0001\t\u0004"+
		"\t\u00d0\b\t\u000b\t\f\t\u00d1\u0001\n\u0005\n\u00d5\b\n\n\n\f\n\u00d8"+
		"\t\n\u0001\n\u0001\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t\n\u0001\u000b\u0005"+
		"\u000b\u00e2\b\u000b\n\u000b\f\u000b\u00e5\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00e9\b\u000b\n\u000b\f\u000b\u00ec\t\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00f8\b\u000e\n\u000e\f\u000e\u00fb\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0107\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u010d\b\u0011\n"+
		"\u0011\f\u0011\u0110\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0126"+
		"\b\u001a\n\u001a\f\u001a\u0129\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u012f\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0133\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u013e\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0142\b\u001c\u0001\u001c\u0003\u001c"+
		"\u0145\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u014b\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0150\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0157\b\u001e\n\u001e\f\u001e\u015a\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0161\b\u001f\n\u001f"+
		"\f\u001f\u0164\t\u001f\u0003\u001f\u0166\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0004 \u016b\b \u000b \f \u016c\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0173\b!\n!\f!\u0176\t!\u0003!\u0178\b!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0185"+
		"\b\"\n\"\f\"\u0188\t\"\u0003\"\u018a\b\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0199\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u01a6\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01c0"+
		"\b$\u0005$\u01c2\b$\n$\f$\u01c5\t$\u0001$\u0003v\u00f9\u010e\u0003\u0004"+
		"\bH%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\n\u0001\u0000\b\r\u0002"+
		"\u0000\u000b\u000b\r\r\u0001\u0000\u0014\u0015\u0001\u0000\b\f\u0001\u0000"+
		"\u001c\u001e\u0001\u0000!\"\u0002\u0000UVYY\u0001\u0000WX\u0001\u0000"+
		"=?\u0003\u0000<<@CST\u01f6\u0000N\u0001\u0000\u0000\u0000\u0002b\u0001"+
		"\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006\u0094\u0001\u0000"+
		"\u0000\u0000\b\u0096\u0001\u0000\u0000\u0000\n\u00b7\u0001\u0000\u0000"+
		"\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e\u00c0\u0001\u0000\u0000\u0000"+
		"\u0010\u00c7\u0001\u0000\u0000\u0000\u0012\u00cd\u0001\u0000\u0000\u0000"+
		"\u0014\u00d6\u0001\u0000\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000"+
		"\u0018\u00ed\u0001\u0000\u0000\u0000\u001a\u00ef\u0001\u0000\u0000\u0000"+
		"\u001c\u00f3\u0001\u0000\u0000\u0000\u001e\u0106\u0001\u0000\u0000\u0000"+
		" \u0108\u0001\u0000\u0000\u0000\"\u010a\u0001\u0000\u0000\u0000$\u0111"+
		"\u0001\u0000\u0000\u0000&\u0113\u0001\u0000\u0000\u0000(\u0115\u0001\u0000"+
		"\u0000\u0000*\u0117\u0001\u0000\u0000\u0000,\u0119\u0001\u0000\u0000\u0000"+
		".\u011b\u0001\u0000\u0000\u00000\u011d\u0001\u0000\u0000\u00002\u0121"+
		"\u0001\u0000\u0000\u00004\u0123\u0001\u0000\u0000\u00006\u0132\u0001\u0000"+
		"\u0000\u00008\u0144\u0001\u0000\u0000\u0000:\u0146\u0001\u0000\u0000\u0000"+
		"<\u0153\u0001\u0000\u0000\u0000>\u015b\u0001\u0000\u0000\u0000@\u016a"+
		"\u0001\u0000\u0000\u0000B\u016e\u0001\u0000\u0000\u0000D\u017b\u0001\u0000"+
		"\u0000\u0000F\u0198\u0001\u0000\u0000\u0000H\u01a5\u0001\u0000\u0000\u0000"+
		"JO\u0003\u001c\u000e\u0000KO\u0003\u0002\u0001\u0000LO\u00034\u001a\u0000"+
		"MO\u00030\u0018\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000"+
		"TV\u0003\u0004\u0002\u0000UW\u0003\u001a\r\u0000VU\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000Wc\u0001\u0000\u0000\u0000XZ\u0003\u0006\u0003"+
		"\u0000Y[\u0003\u001a\r\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[c\u0001\u0000\u0000\u0000\\c\u0003\b\u0004\u0000]c\u0003\n\u0005"+
		"\u0000^c\u0003\f\u0006\u0000_c\u0003\u000e\u0007\u0000`c\u0003\u0010\b"+
		"\u0000ac\u0003\u0018\f\u0000bT\u0001\u0000\u0000\u0000bX\u0001\u0000\u0000"+
		"\u0000b\\\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0003\u0001\u0000\u0000\u0000dh\u0006\u0002\uffff"+
		"\uffff\u0000eg\u0005\u0007\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ko\u0005\u0012\u0000"+
		"\u0000ln\u0007\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pz\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\n\u0001\u0000\u0000su\u0003"+
		"\u0014\n\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{\u0005\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}\u0080\u0003\u0004\u0002\u0000~\u007f\u0005\u0002\u0000"+
		"\u0000\u007f\u0081\u0003\u0004\u0002\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0005\u000e\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0095\u0001\u0000\u0000\u0000"+
		"\u0087\u008d\u0003\u0004\u0002\u0000\u0088\u008b\u0005\u0002\u0000\u0000"+
		"\u0089\u008c\u0003\u0004\u0002\u0000\u008a\u008c\u0003\u0016\u000b\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0005\u000e\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094}\u0001\u0000\u0000\u0000\u0094\u0087\u0001\u0000\u0000\u0000\u0095"+
		"\u0007\u0001\u0000\u0000\u0000\u0096\u0097\u0006\u0004\uffff\uffff\u0000"+
		"\u0097\u009b\u0005\u0013\u0000\u0000\u0098\u009a\u0005\u000b\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u00a6\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\n\u0001\u0000\u0000\u009f\u00a1\u0003\u0012\t\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\t\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003\u0004\u0002\u0000\u00aa\u00ab"+
		"\u0005\u0004\u0000\u0000\u00ab\u00ad\u0003\u0004\u0002\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0003\b\u0004\u0000\u00b1\u00b2\u0005"+
		"\u0004\u0000\u0000\u00b2\u00b4\u0003\b\u0004\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b7\u00a9\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9\u00bc\u0003\u0004"+
		"\u0002\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000\u00bb\u00bd\u0003\u0004"+
		"\u0002\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\r\u0001\u0000\u0000\u0000\u00c0\u00c3\u0003\u0004\u0002"+
		"\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u00c4\u0003\u0004\u0002"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u000f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u0004\u0002"+
		"\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00cb\u0003\u0004\u0002"+
		"\u0000\u00ca\u00cc\u0005\u0006\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0011\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0005\u0015\u0000\u0000\u00ce\u00d0\u0007\u0001\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u0013\u0001\u0000\u0000\u0000\u00d3\u00d5\u0005\u0007\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dd\u0007\u0002\u0000\u0000\u00da\u00dc\u0007\u0000\u0000"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0005\u0007\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00ea\u0007\u0002\u0000"+
		"\u0000\u00e7\u00e9\u0007\u0003\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u0017\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u000f\u0000"+
		"\u0000\u00ee\u0019\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0017\u0000"+
		"\u0000\u00f0\u00f1\u0005\u001a\u0000\u0000\u00f1\u00f2\u0005\u001b\u0000"+
		"\u0000\u00f2\u001b\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0016\u0000"+
		"\u0000\u00f4\u00f9\u0003\u001e\u000f\u0000\u00f5\u00f6\u0005\u001f\u0000"+
		"\u0000\u00f6\u00f8\u0003\u001e\u000f\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005*\u0000\u0000"+
		"\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe\u0107\u0003 \u0010\u0000\u00ff"+
		"\u0107\u0003\"\u0011\u0000\u0100\u0107\u0003&\u0013\u0000\u0101\u0107"+
		"\u0003$\u0012\u0000\u0102\u0107\u0003(\u0014\u0000\u0103\u0107\u0003*"+
		"\u0015\u0000\u0104\u0107\u0003,\u0016\u0000\u0105\u0107\u0003.\u0017\u0000"+
		"\u0106\u00fe\u0001\u0000\u0000\u0000\u0106\u00ff\u0001\u0000\u0000\u0000"+
		"\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0101\u0001\u0000\u0000\u0000"+
		"\u0106\u0102\u0001\u0000\u0000\u0000\u0106\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u001f\u0001\u0000\u0000\u0000\u0108\u0109\u0005 \u0000\u0000\u0109"+
		"!\u0001\u0000\u0000\u0000\u010a\u010e\u0007\u0004\u0000\u0000\u010b\u010d"+
		"\u0007\u0005\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010f#\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005#\u0000\u0000\u0112%\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\'\u0000\u0000\u0114\'\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005%\u0000\u0000\u0116)\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0005&\u0000\u0000\u0118+\u0001\u0000\u0000\u0000\u0119\u011a\u0005("+
		"\u0000\u0000\u011a-\u0001\u0000\u0000\u0000\u011b\u011c\u0005)\u0000\u0000"+
		"\u011c/\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0019\u0000\u0000\u011e"+
		"\u011f\u00032\u0019\u0000\u011f\u0120\u0005e\u0000\u0000\u01201\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005b\u0000\u0000\u01223\u0001\u0000\u0000"+
		"\u0000\u0123\u0127\u0005\u0018\u0000\u0000\u0124\u0126\u00036\u001b\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000"+
		"\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0005a\u0000\u0000\u012b5\u0001\u0000\u0000\u0000\u012c\u012e"+
		"\u00038\u001c\u0000\u012d\u012f\u0005O\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0133\u0001\u0000"+
		"\u0000\u0000\u0130\u0133\u0003:\u001d\u0000\u0131\u0133\u0003H$\u0000"+
		"\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u01337\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005+\u0000\u0000\u0135\u0136\u0005^\u0000\u0000\u0136\u0137\u0005"+
		"[\u0000\u0000\u0137\u0145\u0003H$\u0000\u0138\u0139\u0005^\u0000\u0000"+
		"\u0139\u013a\u0005[\u0000\u0000\u013a\u0145\u0003H$\u0000\u013b\u013d"+
		"\u0005,\u0000\u0000\u013c\u013e\u0003H$\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0141\u0005I\u0000\u0000\u0140\u0142\u00036\u001b\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0005J\u0000\u0000\u0144"+
		"\u0134\u0001\u0000\u0000\u0000\u0144\u0138\u0001\u0000\u0000\u0000\u0144"+
		"\u013b\u0001\u0000\u0000\u0000\u01459\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u00058\u0000\u0000\u0147\u0148\u0005^\u0000\u0000\u0148\u014a\u0005M"+
		"\u0000\u0000\u0149\u014b\u0003<\u001e\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0005N\u0000\u0000\u014d\u014f\u0005I\u0000\u0000\u014e"+
		"\u0150\u0003@ \u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"J\u0000\u0000\u0152;\u0001\u0000\u0000\u0000\u0153\u0158\u0005^\u0000"+
		"\u0000\u0154\u0155\u0005Q\u0000\u0000\u0155\u0157\u0005^\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"=\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005^\u0000\u0000\u015c\u0165\u0005M\u0000\u0000\u015d\u0162\u0003H"+
		"$\u0000\u015e\u015f\u0005Q\u0000\u0000\u015f\u0161\u0003H$\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165"+
		"\u015d\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0005N\u0000\u0000\u0168?\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u00036\u001b\u0000\u016a\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016dA\u0001\u0000\u0000"+
		"\u0000\u016e\u0177\u0005K\u0000\u0000\u016f\u0174\u0003H$\u0000\u0170"+
		"\u0171\u0005Q\u0000\u0000\u0171\u0173\u0003H$\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0178\u0001"+
		"\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u016f\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005L\u0000\u0000\u017aC\u0001\u0000\u0000"+
		"\u0000\u017b\u0189\u0005I\u0000\u0000\u017c\u017d\u0003H$\u0000\u017d"+
		"\u017e\u0005P\u0000\u0000\u017e\u0186\u0003H$\u0000\u017f\u0180\u0005"+
		"Q\u0000\u0000\u0180\u0181\u0003H$\u0000\u0181\u0182\u0005P\u0000\u0000"+
		"\u0182\u0183\u0003H$\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u017f"+
		"\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018a"+
		"\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u017c"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0005J\u0000\u0000\u018cE\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005M\u0000\u0000\u018e\u018f\u0003H$\u0000"+
		"\u018f\u0190\u0005N\u0000\u0000\u0190\u0199\u0001\u0000\u0000\u0000\u0191"+
		"\u0199\u00055\u0000\u0000\u0192\u0199\u00056\u0000\u0000\u0193\u0199\u0005"+
		"7\u0000\u0000\u0194\u0199\u0005^\u0000\u0000\u0195\u0199\u0005\\\u0000"+
		"\u0000\u0196\u0199\u0005]\u0000\u0000\u0197\u0199\u0005_\u0000\u0000\u0198"+
		"\u018d\u0001\u0000\u0000\u0000\u0198\u0191\u0001\u0000\u0000\u0000\u0198"+
		"\u0192\u0001\u0000\u0000\u0000\u0198\u0193\u0001\u0000\u0000\u0000\u0198"+
		"\u0194\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199"+
		"G\u0001\u0000\u0000\u0000\u019a\u019b\u0006$\uffff\uffff\u0000\u019b\u01a6"+
		"\u0003F#\u0000\u019c\u019d\u0005Z\u0000\u0000\u019d\u01a6\u0003H$\u000b"+
		"\u019e\u019f\u0005W\u0000\u0000\u019f\u01a6\u0003H$\n\u01a0\u01a1\u0005"+
		"X\u0000\u0000\u01a1\u01a6\u0003H$\t\u01a2\u01a6\u0003B!\u0000\u01a3\u01a6"+
		"\u0003D\"\u0000\u01a4\u01a6\u0003>\u001f\u0000\u01a5\u019a\u0001\u0000"+
		"\u0000\u0000\u01a5\u019c\u0001\u0000\u0000\u0000\u01a5\u019e\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a0\u0001\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01c3\u0001\u0000\u0000\u0000\u01a7\u01a8\n\b\u0000"+
		"\u0000\u01a8\u01a9\u0005;\u0000\u0000\u01a9\u01c2\u0003H$\b\u01aa\u01ab"+
		"\n\u0007\u0000\u0000\u01ab\u01ac\u0007\u0006\u0000\u0000\u01ac\u01c2\u0003"+
		"H$\b\u01ad\u01ae\n\u0006\u0000\u0000\u01ae\u01af\u0007\u0007\u0000\u0000"+
		"\u01af\u01c2\u0003H$\u0007\u01b0\u01b1\n\u0005\u0000\u0000\u01b1\u01b2"+
		"\u0007\b\u0000\u0000\u01b2\u01c2\u0003H$\u0006\u01b3\u01b4\n\u0004\u0000"+
		"\u0000\u01b4\u01b5\u0007\t\u0000\u0000\u01b5\u01c2\u0003H$\u0005\u01b6"+
		"\u01b7\n\r\u0000\u0000\u01b7\u01b8\u0005I\u0000\u0000\u01b8\u01b9\u0003"+
		"H$\u0000\u01b9\u01ba\u0005J\u0000\u0000\u01ba\u01c2\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\n\f\u0000\u0000\u01bc\u01bf\u0005R\u0000\u0000\u01bd"+
		"\u01c0\u0005^\u0000\u0000\u01be\u01c0\u0003>\u001f\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c1\u01a7\u0001\u0000\u0000\u0000\u01c1\u01aa\u0001"+
		"\u0000\u0000\u0000\u01c1\u01ad\u0001\u0000\u0000\u0000\u01c1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01c1\u01b3\u0001\u0000\u0000\u0000\u01c1\u01b6\u0001"+
		"\u0000\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4I\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u00005NPVZbhovz\u0082\u0085\u008b\u008f\u0092\u0094\u009b\u00a2"+
		"\u00a6\u00ae\u00b5\u00b7\u00be\u00c5\u00cb\u00d1\u00d6\u00dd\u00e3\u00ea"+
		"\u00f9\u0106\u010e\u0127\u012e\u0132\u013d\u0141\u0144\u014a\u014f\u0158"+
		"\u0162\u0165\u016c\u0174\u0177\u0186\u0189\u0198\u01a5\u01bf\u01c1\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}