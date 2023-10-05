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
		EnterScope=1, ExitScope=2, GlissandoConnector=3, ChordConnector=4, AppoggiaturaConnector=5, 
		TupletConnector=6, TripletsConnector=7, Ttail=8, PitchPrefix=9, AbsoluteOctaveSuffix=10, 
		MoveOctaveSuffix=11, DurationSuffix=12, VelocitySuffix=13, RepeatSuffix=14, 
		ArpeggioSuffix=15, Comment=16, Blank=17, SectionLine=18, NoteName=19, 
		RestNote=20, ModifyPitchBase=21, Clone=22, InlineTrackStart=23, TrackStart=24, 
		LyricStart=25, ProgramStart=26, HexStart=27, ChordModeStart=28, GlobalConfigStrat=29, 
		LyricContent=30, LyricEnd=31, GlobalConfigEnd=32, ChordModeEnd=33, TrackTreble=34, 
		TrackBass=35, TrackAlto=36, TrackConfigSeperator=37, TrackBPMInteger=38, 
		TrackAbsoluteOcatve=39, TrackMoveOcatve=40, TrackDuration=41, TrackSpeed=42, 
		TrackSpace=43, TrackTonality=44, TrackBaseNotePitch=45, TrackVelocity=46, 
		TrackTimesignature=47, TrackUseInstrumnt=48, TrackPair=49, TrackDefaultCnofig=50, 
		TrackEnd=51, LetKeyWord=52, LoopKeyWord=53, InKeyWord=54, IsKeyWord=55, 
		IfKeyWord=56, ElseKeyWord=57, ForKeyWord=58, WhileKeyWord=59, ReturnKeyWord=60, 
		BreakKeyWord=61, ContinueKeyWord=62, ImportKeyWord=63, ClassKeyWord=64, 
		ThisKeyWord=65, StaticKeyWord=66, SuperKeyWord=67, NullKeyWord=68, TrueKeyWord=69, 
		FalseKeyWord=70, FunctionDefKeyWord=71, AdressEqual=72, Xor=73, And=74, 
		Or=75, JugdeNotEqual=76, JugdeEqual=77, ShiftLeft=78, ShiftRight=79, GreaterEqual=80, 
		LesserEqual=81, AssignPlusEqual=82, AssignMinusEqual=83, AssignMulEqual=84, 
		AssignDivEqual=85, AssignModEqual=86, BracesLeft=87, BracesRight=88, SqualBracesLeft=89, 
		SqualBracesRight=90, ParenthesesLeft=91, ParenthesesRight=92, ProgramComma=93, 
		ProgramColon=94, ProgramSemicolon=95, ProgramDot=96, Greater=97, Lesser=98, 
		Mul=99, Div=100, Add=101, Sub=102, Mod=103, Not=104, LogicAnd=105, LogicOr=106, 
		Caret=107, AssignEqual=108, Integer=109, Float=110, SymbolID=111, String=112, 
		ProgramBlank=113, ProgramEnd=114, PureHexContent=115, HexNewLine=116, 
		MIDIHexDigit=117, HexEnd=118;
	public static final int
		RULE_tracks = 0, RULE_track = 1, RULE_outterScopeBlock = 2, RULE_innerScopeBlock = 3, 
		RULE_trackBody = 4, RULE_midercode = 5, RULE_note = 6, RULE_chord = 7, 
		RULE_rest = 8, RULE_tuplet = 9, RULE_triplets = 10, RULE_glissando = 11, 
		RULE_appoggiatura = 12, RULE_restClone = 13, RULE_noteClone = 14, RULE_chordTailBase = 15, 
		RULE_noteListClone = 16, RULE_chordMode = 17, RULE_globalConfig = 18, 
		RULE_lyric = 19, RULE_trackHeader = 20, RULE_inlineTrackHeader = 21, RULE_trackDefault = 22, 
		RULE_trackConfig = 23, RULE_sigleTrackConfig = 24, RULE_trackBpmConfig = 25, 
		RULE_trackOctaveAndDurationConfig = 26, RULE_trackSpeedConfig = 27, RULE_trackTimesignatureConfig = 28, 
		RULE_trackTonalityConfig = 29, RULE_trackInstrumentConfig = 30, RULE_trackCustomConfig = 31, 
		RULE_hexData = 32, RULE_hexContent = 33, RULE_program = 34, RULE_programBody = 35, 
		RULE_block = 36, RULE_programStatement = 37, RULE_functionDef = 38, RULE_functionDefParamList = 39, 
		RULE_functionCall = 40, RULE_functionBody = 41, RULE_listBody = 42, RULE_mapBody = 43, 
		RULE_primary = 44, RULE_expression = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"tracks", "track", "outterScopeBlock", "innerScopeBlock", "trackBody", 
			"midercode", "note", "chord", "rest", "tuplet", "triplets", "glissando", 
			"appoggiatura", "restClone", "noteClone", "chordTailBase", "noteListClone", 
			"chordMode", "globalConfig", "lyric", "trackHeader", "inlineTrackHeader", 
			"trackDefault", "trackConfig", "sigleTrackConfig", "trackBpmConfig", 
			"trackOctaveAndDurationConfig", "trackSpeedConfig", "trackTimesignatureConfig", 
			"trackTonalityConfig", "trackInstrumentConfig", "trackCustomConfig", 
			"hexData", "hexContent", "program", "programBody", "block", "programStatement", 
			"functionDef", "functionDefParamList", "functionCall", "functionBody", 
			"listBody", "mapBody", "primary", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'(='", null, "'<|'", "'<%'", null, null, "'%>'", "'|>'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'default'", null, "'let'", "'loop'", "'in'", 
			"'is'", "'if'", "'else'", "'for'", "'while'", "'return'", "'break'", 
			"'continue'", "'import'", "'class'", "'this'", "'static'", "'super'", 
			"'null'", "'true'", "'false'", "'fun'", "'==='", null, "'&&'", "'||'", 
			"'!='", "'=='", "'<<'", "'>>'", "'>='", "'<='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", null, null, null, null, "'('", "')'", "';'", "':'", "','", 
			"'.'", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'!'", "'&'", 
			"'|'", "'^'", "'='", null, null, null, null, null, "'=)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EnterScope", "ExitScope", "GlissandoConnector", "ChordConnector", 
			"AppoggiaturaConnector", "TupletConnector", "TripletsConnector", "Ttail", 
			"PitchPrefix", "AbsoluteOctaveSuffix", "MoveOctaveSuffix", "DurationSuffix", 
			"VelocitySuffix", "RepeatSuffix", "ArpeggioSuffix", "Comment", "Blank", 
			"SectionLine", "NoteName", "RestNote", "ModifyPitchBase", "Clone", "InlineTrackStart", 
			"TrackStart", "LyricStart", "ProgramStart", "HexStart", "ChordModeStart", 
			"GlobalConfigStrat", "LyricContent", "LyricEnd", "GlobalConfigEnd", "ChordModeEnd", 
			"TrackTreble", "TrackBass", "TrackAlto", "TrackConfigSeperator", "TrackBPMInteger", 
			"TrackAbsoluteOcatve", "TrackMoveOcatve", "TrackDuration", "TrackSpeed", 
			"TrackSpace", "TrackTonality", "TrackBaseNotePitch", "TrackVelocity", 
			"TrackTimesignature", "TrackUseInstrumnt", "TrackPair", "TrackDefaultCnofig", 
			"TrackEnd", "LetKeyWord", "LoopKeyWord", "InKeyWord", "IsKeyWord", "IfKeyWord", 
			"ElseKeyWord", "ForKeyWord", "WhileKeyWord", "ReturnKeyWord", "BreakKeyWord", 
			"ContinueKeyWord", "ImportKeyWord", "ClassKeyWord", "ThisKeyWord", "StaticKeyWord", 
			"SuperKeyWord", "NullKeyWord", "TrueKeyWord", "FalseKeyWord", "FunctionDefKeyWord", 
			"AdressEqual", "Xor", "And", "Or", "JugdeNotEqual", "JugdeEqual", "ShiftLeft", 
			"ShiftRight", "GreaterEqual", "LesserEqual", "AssignPlusEqual", "AssignMinusEqual", 
			"AssignMulEqual", "AssignDivEqual", "AssignModEqual", "BracesLeft", "BracesRight", 
			"SqualBracesLeft", "SqualBracesRight", "ParenthesesLeft", "ParenthesesRight", 
			"ProgramComma", "ProgramColon", "ProgramSemicolon", "ProgramDot", "Greater", 
			"Lesser", "Mul", "Div", "Add", "Sub", "Mod", "Not", "LogicAnd", "LogicOr", 
			"Caret", "AssignEqual", "Integer", "Float", "SymbolID", "String", "ProgramBlank", 
			"ProgramEnd", "PureHexContent", "HexNewLine", "MIDIHexDigit", "HexEnd"
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
	public static class TracksContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiderCodeParser.EOF, 0); }
		public GlobalConfigContext globalConfig() {
			return getRuleContext(GlobalConfigContext.class,0);
		}
		public List<TrackContext> track() {
			return getRuleContexts(TrackContext.class);
		}
		public TrackContext track(int i) {
			return getRuleContext(TrackContext.class,i);
		}
		public TracksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tracks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTracks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTracks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTracks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TracksContext tracks() throws RecognitionException {
		TracksContext _localctx = new TracksContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tracks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GlobalConfigStrat) {
				{
				setState(92);
				globalConfig();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496501250L) != 0)) {
				{
				{
				setState(95);
				track();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
	public static class TrackContext extends ParserRuleContext {
		public List<TrackHeaderContext> trackHeader() {
			return getRuleContexts(TrackHeaderContext.class);
		}
		public TrackHeaderContext trackHeader(int i) {
			return getRuleContext(TrackHeaderContext.class,i);
		}
		public List<TrackBodyContext> trackBody() {
			return getRuleContexts(TrackBodyContext.class);
		}
		public TrackBodyContext trackBody(int i) {
			return getRuleContext(TrackBodyContext.class,i);
		}
		public List<InlineTrackHeaderContext> inlineTrackHeader() {
			return getRuleContexts(InlineTrackHeaderContext.class);
		}
		public InlineTrackHeaderContext inlineTrackHeader(int i) {
			return getRuleContext(InlineTrackHeaderContext.class,i);
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
		enterRule(_localctx, 2, RULE_track);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TrackStart) {
				{
				{
				setState(103);
				trackHeader();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(109);
					trackBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					inlineTrackHeader();
					setState(116); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(115);
							trackBody();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(118); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class OutterScopeBlockContext extends ParserRuleContext {
		public TerminalNode EnterScope() { return getToken(MiderCodeParser.EnterScope, 0); }
		public TerminalNode ExitScope() { return getToken(MiderCodeParser.ExitScope, 0); }
		public InlineTrackHeaderContext inlineTrackHeader() {
			return getRuleContext(InlineTrackHeaderContext.class,0);
		}
		public List<InnerScopeBlockContext> innerScopeBlock() {
			return getRuleContexts(InnerScopeBlockContext.class);
		}
		public InnerScopeBlockContext innerScopeBlock(int i) {
			return getRuleContext(InnerScopeBlockContext.class,i);
		}
		public OutterScopeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outterScopeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterOutterScopeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitOutterScopeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitOutterScopeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutterScopeBlockContext outterScopeBlock() throws RecognitionException {
		OutterScopeBlockContext _localctx = new OutterScopeBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_outterScopeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InlineTrackStart) {
				{
				setState(125);
				inlineTrackHeader();
				}
			}

			setState(128);
			match(EnterScope);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==InlineTrackStart || _la==TrackStart) {
				{
				{
				setState(129);
				innerScopeBlock();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(ExitScope);
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
	public static class InnerScopeBlockContext extends ParserRuleContext {
		public TerminalNode EnterScope() { return getToken(MiderCodeParser.EnterScope, 0); }
		public TerminalNode ExitScope() { return getToken(MiderCodeParser.ExitScope, 0); }
		public TrackHeaderContext trackHeader() {
			return getRuleContext(TrackHeaderContext.class,0);
		}
		public InlineTrackHeaderContext inlineTrackHeader() {
			return getRuleContext(InlineTrackHeaderContext.class,0);
		}
		public List<TrackBodyContext> trackBody() {
			return getRuleContexts(TrackBodyContext.class);
		}
		public TrackBodyContext trackBody(int i) {
			return getRuleContext(TrackBodyContext.class,i);
		}
		public InnerScopeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerScopeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterInnerScopeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitInnerScopeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitInnerScopeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerScopeBlockContext innerScopeBlock() throws RecognitionException {
		InnerScopeBlockContext _localctx = new InnerScopeBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_innerScopeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrackStart:
				{
				setState(137);
				trackHeader();
				}
				break;
			case InlineTrackStart:
				{
				setState(138);
				inlineTrackHeader();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			match(EnterScope);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 479724034L) != 0)) {
				{
				{
				setState(142);
				trackBody();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(ExitScope);
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
	public static class TrackBodyContext extends ParserRuleContext {
		public MidercodeContext midercode() {
			return getRuleContext(MidercodeContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public HexDataContext hexData() {
			return getRuleContext(HexDataContext.class,0);
		}
		public ChordModeContext chordMode() {
			return getRuleContext(ChordModeContext.class,0);
		}
		public OutterScopeBlockContext outterScopeBlock() {
			return getRuleContext(OutterScopeBlockContext.class,0);
		}
		public TrackBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackBodyContext trackBody() throws RecognitionException {
		TrackBodyContext _localctx = new TrackBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_trackBody);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PitchPrefix:
			case NoteName:
			case RestNote:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				midercode();
				}
				break;
			case ProgramStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				program();
				}
				break;
			case HexStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				hexData();
				}
				break;
			case ChordModeStart:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				chordMode();
				}
				break;
			case EnterScope:
			case InlineTrackStart:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				outterScopeBlock();
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
		public List<NoteListCloneContext> noteListClone() {
			return getRuleContexts(NoteListCloneContext.class);
		}
		public NoteListCloneContext noteListClone(int i) {
			return getRuleContext(NoteListCloneContext.class,i);
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
		public List<NoteCloneContext> noteClone() {
			return getRuleContexts(NoteCloneContext.class);
		}
		public NoteCloneContext noteClone(int i) {
			return getRuleContext(NoteCloneContext.class,i);
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
		public List<NoteListCloneContext> noteListClone() {
			return getRuleContexts(NoteListCloneContext.class);
		}
		public NoteListCloneContext noteListClone(int i) {
			return getRuleContext(NoteListCloneContext.class,i);
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
		public List<NoteListCloneContext> noteListClone() {
			return getRuleContexts(NoteListCloneContext.class);
		}
		public NoteListCloneContext noteListClone(int i) {
			return getRuleContext(NoteListCloneContext.class,i);
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
	public static class ChordExperssionContext extends MidercodeContext {
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public List<NoteListCloneContext> noteListClone() {
			return getRuleContexts(NoteListCloneContext.class);
		}
		public NoteListCloneContext noteListClone(int i) {
			return getRuleContext(NoteListCloneContext.class,i);
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
		public List<NoteListCloneContext> noteListClone() {
			return getRuleContexts(NoteListCloneContext.class);
		}
		public NoteListCloneContext noteListClone(int i) {
			return getRuleContext(NoteListCloneContext.class,i);
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
		public List<RestCloneContext> restClone() {
			return getRuleContexts(RestCloneContext.class);
		}
		public RestCloneContext restClone(int i) {
			return getRuleContext(RestCloneContext.class,i);
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
		enterRule(_localctx, 10, RULE_midercode);
		int _la;
		try {
			int _alt;
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new NoteExperssionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				note();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LyricStart) {
					{
					setState(158);
					lyric();
					}
				}

				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						noteClone();
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new ChordExperssionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				chord();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LyricStart) {
					{
					setState(168);
					lyric();
					}
				}

				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Clone) {
					{
					{
					setState(171);
					noteListClone();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new RestExperssionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				rest();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Clone) {
					{
					{
					setState(178);
					restClone();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new TupletExperssionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				tuplet();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Clone) {
					{
					{
					setState(185);
					noteListClone();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new TripletsExperssionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				triplets();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Clone) {
					{
					{
					setState(192);
					noteListClone();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new GlissandoExperssionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				glissando();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Clone) {
					{
					{
					setState(199);
					noteListClone();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new AppoggiaturaExperssionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				appoggiatura();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Clone) {
					{
					{
					setState(206);
					noteListClone();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NoteName() { return getToken(MiderCodeParser.NoteName, 0); }
		public List<TerminalNode> PitchPrefix() { return getTokens(MiderCodeParser.PitchPrefix); }
		public TerminalNode PitchPrefix(int i) {
			return getToken(MiderCodeParser.PitchPrefix, i);
		}
		public TerminalNode AbsoluteOctaveSuffix() { return getToken(MiderCodeParser.AbsoluteOctaveSuffix, 0); }
		public TerminalNode VelocitySuffix() { return getToken(MiderCodeParser.VelocitySuffix, 0); }
		public TerminalNode RepeatSuffix() { return getToken(MiderCodeParser.RepeatSuffix, 0); }
		public List<TerminalNode> MoveOctaveSuffix() { return getTokens(MiderCodeParser.MoveOctaveSuffix); }
		public TerminalNode MoveOctaveSuffix(int i) {
			return getToken(MiderCodeParser.MoveOctaveSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
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
		enterRule(_localctx, 12, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(214);
				match(PitchPrefix);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(NoteName);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AbsoluteOctaveSuffix) {
				{
				setState(221);
				match(AbsoluteOctaveSuffix);
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VelocitySuffix) {
				{
				setState(224);
				match(VelocitySuffix);
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RepeatSuffix) {
				{
				setState(227);
				match(RepeatSuffix);
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MoveOctaveSuffix || _la==DurationSuffix) {
				{
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==MoveOctaveSuffix || _la==DurationSuffix) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(235);
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
		enterRule(_localctx, 14, RULE_chord);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				note();
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					match(ChordConnector);
					setState(238);
					note();
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ChordConnector );
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArpeggioSuffix) {
					{
					setState(243);
					match(ArpeggioSuffix);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				note();
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(247);
					match(ChordConnector);
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(248);
						note();
						}
						break;
					case 2:
						{
						setState(249);
						chordTailBase();
						}
						break;
					}
					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ChordConnector );
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArpeggioSuffix) {
					{
					setState(256);
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
		enterRule(_localctx, 16, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261);
			match(RestNote);
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DurationSuffix) {
				{
				{
				setState(262);
				match(DurationSuffix);
				}
				}
				setState(267);
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
		enterRule(_localctx, 18, RULE_tuplet);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PitchPrefix:
			case NoteName:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				note();
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					match(TupletConnector);
					setState(270);
					note();
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TupletConnector );
				}
				break;
			case RestNote:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				rest();
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					match(TupletConnector);
					setState(277);
					rest();
					}
					}
					setState(280); 
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
		public List<TerminalNode> TripletsConnector() { return getTokens(MiderCodeParser.TripletsConnector); }
		public TerminalNode TripletsConnector(int i) {
			return getToken(MiderCodeParser.TripletsConnector, i);
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
		enterRule(_localctx, 20, RULE_triplets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			note();
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				match(TripletsConnector);
				setState(286);
				note();
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TripletsConnector );
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
		enterRule(_localctx, 22, RULE_glissando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			note();
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(292);
				match(GlissandoConnector);
				setState(293);
				note();
				}
				}
				setState(296); 
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
		enterRule(_localctx, 24, RULE_appoggiatura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			note();
			setState(299);
			match(AppoggiaturaConnector);
			setState(300);
			note();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ttail) {
				{
				setState(301);
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
	public static class RestCloneContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public List<TerminalNode> RepeatSuffix() { return getTokens(MiderCodeParser.RepeatSuffix); }
		public TerminalNode RepeatSuffix(int i) {
			return getToken(MiderCodeParser.RepeatSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public RestCloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restClone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterRestClone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitRestClone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitRestClone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestCloneContext restClone() throws RecognitionException {
		RestCloneContext _localctx = new RestCloneContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_restClone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Clone);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
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
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DurationSuffix || _la==RepeatSuffix );
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
	public static class NoteCloneContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public TerminalNode ModifyPitchBase() { return getToken(MiderCodeParser.ModifyPitchBase, 0); }
		public List<TerminalNode> PitchPrefix() { return getTokens(MiderCodeParser.PitchPrefix); }
		public TerminalNode PitchPrefix(int i) {
			return getToken(MiderCodeParser.PitchPrefix, i);
		}
		public TerminalNode AbsoluteOctaveSuffix() { return getToken(MiderCodeParser.AbsoluteOctaveSuffix, 0); }
		public TerminalNode VelocitySuffix() { return getToken(MiderCodeParser.VelocitySuffix, 0); }
		public TerminalNode RepeatSuffix() { return getToken(MiderCodeParser.RepeatSuffix, 0); }
		public List<TerminalNode> MoveOctaveSuffix() { return getTokens(MiderCodeParser.MoveOctaveSuffix); }
		public TerminalNode MoveOctaveSuffix(int i) {
			return getToken(MiderCodeParser.MoveOctaveSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public NoteCloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteClone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterNoteClone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitNoteClone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitNoteClone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteCloneContext noteClone() throws RecognitionException {
		NoteCloneContext _localctx = new NoteCloneContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_noteClone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(310);
				match(PitchPrefix);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==ModifyPitchBase || _la==Clone) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AbsoluteOctaveSuffix) {
				{
				setState(317);
				match(AbsoluteOctaveSuffix);
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VelocitySuffix) {
				{
				setState(320);
				match(VelocitySuffix);
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RepeatSuffix) {
				{
				setState(323);
				match(RepeatSuffix);
				}
			}

			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MoveOctaveSuffix || _la==DurationSuffix) {
				{
				{
				setState(326);
				_la = _input.LA(1);
				if ( !(_la==MoveOctaveSuffix || _la==DurationSuffix) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(331);
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
	public static class ChordTailBaseContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public TerminalNode ModifyPitchBase() { return getToken(MiderCodeParser.ModifyPitchBase, 0); }
		public List<TerminalNode> PitchPrefix() { return getTokens(MiderCodeParser.PitchPrefix); }
		public TerminalNode PitchPrefix(int i) {
			return getToken(MiderCodeParser.PitchPrefix, i);
		}
		public TerminalNode AbsoluteOctaveSuffix() { return getToken(MiderCodeParser.AbsoluteOctaveSuffix, 0); }
		public TerminalNode VelocitySuffix() { return getToken(MiderCodeParser.VelocitySuffix, 0); }
		public List<TerminalNode> MoveOctaveSuffix() { return getTokens(MiderCodeParser.MoveOctaveSuffix); }
		public TerminalNode MoveOctaveSuffix(int i) {
			return getToken(MiderCodeParser.MoveOctaveSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
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
		enterRule(_localctx, 30, RULE_chordTailBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PitchPrefix) {
				{
				{
				setState(332);
				match(PitchPrefix);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==ModifyPitchBase || _la==Clone) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AbsoluteOctaveSuffix) {
				{
				setState(339);
				match(AbsoluteOctaveSuffix);
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VelocitySuffix) {
				{
				setState(342);
				match(VelocitySuffix);
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MoveOctaveSuffix || _la==DurationSuffix) {
				{
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==MoveOctaveSuffix || _la==DurationSuffix) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(350);
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
	public static class NoteListCloneContext extends ParserRuleContext {
		public TerminalNode Clone() { return getToken(MiderCodeParser.Clone, 0); }
		public TerminalNode AbsoluteOctaveSuffix() { return getToken(MiderCodeParser.AbsoluteOctaveSuffix, 0); }
		public TerminalNode VelocitySuffix() { return getToken(MiderCodeParser.VelocitySuffix, 0); }
		public List<TerminalNode> RepeatSuffix() { return getTokens(MiderCodeParser.RepeatSuffix); }
		public TerminalNode RepeatSuffix(int i) {
			return getToken(MiderCodeParser.RepeatSuffix, i);
		}
		public List<TerminalNode> DurationSuffix() { return getTokens(MiderCodeParser.DurationSuffix); }
		public TerminalNode DurationSuffix(int i) {
			return getToken(MiderCodeParser.DurationSuffix, i);
		}
		public NoteListCloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteListClone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterNoteListClone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitNoteListClone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitNoteListClone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteListCloneContext noteListClone() throws RecognitionException {
		NoteListCloneContext _localctx = new NoteListCloneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_noteListClone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(Clone);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AbsoluteOctaveSuffix) {
				{
				setState(352);
				match(AbsoluteOctaveSuffix);
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VelocitySuffix) {
				{
				setState(355);
				match(VelocitySuffix);
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DurationSuffix || _la==RepeatSuffix) {
				{
				{
				setState(358);
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
				setState(363);
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
	public static class ChordModeContext extends ParserRuleContext {
		public TerminalNode ChordModeStart() { return getToken(MiderCodeParser.ChordModeStart, 0); }
		public TerminalNode ChordModeEnd() { return getToken(MiderCodeParser.ChordModeEnd, 0); }
		public ChordModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chordMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterChordMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitChordMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitChordMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordModeContext chordMode() throws RecognitionException {
		ChordModeContext _localctx = new ChordModeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chordMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ChordModeStart);
			setState(365);
			match(ChordModeEnd);
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
	public static class GlobalConfigContext extends ParserRuleContext {
		public TerminalNode GlobalConfigStrat() { return getToken(MiderCodeParser.GlobalConfigStrat, 0); }
		public TerminalNode GlobalConfigEnd() { return getToken(MiderCodeParser.GlobalConfigEnd, 0); }
		public GlobalConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterGlobalConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitGlobalConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitGlobalConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalConfigContext globalConfig() throws RecognitionException {
		GlobalConfigContext _localctx = new GlobalConfigContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_globalConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(GlobalConfigStrat);
			setState(368);
			match(GlobalConfigEnd);
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
		enterRule(_localctx, 38, RULE_lyric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(LyricStart);
			setState(371);
			match(LyricContent);
			setState(372);
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
		public TerminalNode TrackEnd() { return getToken(MiderCodeParser.TrackEnd, 0); }
		public TrackDefaultContext trackDefault() {
			return getRuleContext(TrackDefaultContext.class,0);
		}
		public TrackConfigContext trackConfig() {
			return getRuleContext(TrackConfigContext.class,0);
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
		enterRule(_localctx, 40, RULE_trackHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(TrackStart);
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrackDefaultCnofig:
				{
				setState(375);
				trackDefault();
				}
				break;
			case TrackTreble:
			case TrackBass:
			case TrackAlto:
			case TrackBPMInteger:
			case TrackSpeed:
			case TrackTonality:
			case TrackBaseNotePitch:
			case TrackTimesignature:
			case TrackUseInstrumnt:
			case TrackPair:
				{
				setState(376);
				trackConfig();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(379);
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
	public static class InlineTrackHeaderContext extends ParserRuleContext {
		public TerminalNode InlineTrackStart() { return getToken(MiderCodeParser.InlineTrackStart, 0); }
		public TerminalNode TrackEnd() { return getToken(MiderCodeParser.TrackEnd, 0); }
		public TrackDefaultContext trackDefault() {
			return getRuleContext(TrackDefaultContext.class,0);
		}
		public TrackConfigContext trackConfig() {
			return getRuleContext(TrackConfigContext.class,0);
		}
		public InlineTrackHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTrackHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterInlineTrackHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitInlineTrackHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitInlineTrackHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTrackHeaderContext inlineTrackHeader() throws RecognitionException {
		InlineTrackHeaderContext _localctx = new InlineTrackHeaderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inlineTrackHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(InlineTrackStart);
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrackDefaultCnofig:
				{
				setState(382);
				trackDefault();
				}
				break;
			case TrackTreble:
			case TrackBass:
			case TrackAlto:
			case TrackBPMInteger:
			case TrackSpeed:
			case TrackTonality:
			case TrackBaseNotePitch:
			case TrackTimesignature:
			case TrackUseInstrumnt:
			case TrackPair:
				{
				setState(383);
				trackConfig();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
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
	public static class TrackDefaultContext extends ParserRuleContext {
		public TerminalNode TrackDefaultCnofig() { return getToken(MiderCodeParser.TrackDefaultCnofig, 0); }
		public TrackDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackDefaultContext trackDefault() throws RecognitionException {
		TrackDefaultContext _localctx = new TrackDefaultContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_trackDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(TrackDefaultCnofig);
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
	public static class TrackConfigContext extends ParserRuleContext {
		public List<SigleTrackConfigContext> sigleTrackConfig() {
			return getRuleContexts(SigleTrackConfigContext.class);
		}
		public SigleTrackConfigContext sigleTrackConfig(int i) {
			return getRuleContext(SigleTrackConfigContext.class,i);
		}
		public List<TerminalNode> TrackConfigSeperator() { return getTokens(MiderCodeParser.TrackConfigSeperator); }
		public TerminalNode TrackConfigSeperator(int i) {
			return getToken(MiderCodeParser.TrackConfigSeperator, i);
		}
		public TrackConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterTrackConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitTrackConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitTrackConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackConfigContext trackConfig() throws RecognitionException {
		TrackConfigContext _localctx = new TrackConfigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trackConfig);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			sigleTrackConfig();
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(391);
					match(TrackConfigSeperator);
					setState(392);
					sigleTrackConfig();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 48, RULE_sigleTrackConfig);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrackBPMInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				trackBpmConfig();
				}
				break;
			case TrackTreble:
			case TrackBass:
			case TrackAlto:
			case TrackBaseNotePitch:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				trackOctaveAndDurationConfig();
				}
				break;
			case TrackTimesignature:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				trackTimesignatureConfig();
				}
				break;
			case TrackSpeed:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				trackSpeedConfig();
				}
				break;
			case TrackTonality:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				trackTonalityConfig();
				}
				break;
			case TrackUseInstrumnt:
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				trackInstrumentConfig();
				}
				break;
			case TrackPair:
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
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
		enterRule(_localctx, 50, RULE_trackBpmConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		public TerminalNode TrackBaseNotePitch() { return getToken(MiderCodeParser.TrackBaseNotePitch, 0); }
		public TerminalNode TrackAbsoluteOcatve() { return getToken(MiderCodeParser.TrackAbsoluteOcatve, 0); }
		public TerminalNode TrackVelocity() { return getToken(MiderCodeParser.TrackVelocity, 0); }
		public List<TerminalNode> TrackMoveOcatve() { return getTokens(MiderCodeParser.TrackMoveOcatve); }
		public TerminalNode TrackMoveOcatve(int i) {
			return getToken(MiderCodeParser.TrackMoveOcatve, i);
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
		enterRule(_localctx, 52, RULE_trackOctaveAndDurationConfig);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TrackBaseNotePitch) {
				{
				setState(409);
				match(TrackBaseNotePitch);
				}
			}

			setState(412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TrackAbsoluteOcatve) {
				{
				setState(413);
				match(TrackAbsoluteOcatve);
				}
			}

			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TrackVelocity) {
				{
				setState(416);
				match(TrackVelocity);
				}
			}

			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(419);
					_la = _input.LA(1);
					if ( !(_la==TrackMoveOcatve || _la==TrackDuration) ) {
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
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 54, RULE_trackSpeedConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 56, RULE_trackTimesignatureConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 58, RULE_trackTonalityConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 60, RULE_trackInstrumentConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 62, RULE_trackCustomConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 64, RULE_hexData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(HexStart);
			setState(436);
			hexContent();
			setState(437);
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
		enterRule(_localctx, 66, RULE_hexContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 68, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ProgramStart);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 2167920992180961363L) != 0)) {
				{
				{
				setState(442);
				programBody();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
		enterRule(_localctx, 70, RULE_programBody);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				programStatement();
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ProgramComma) {
					{
					setState(451);
					match(ProgramComma);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				functionDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BracesLeft() { return getToken(MiderCodeParser.BracesLeft, 0); }
		public TerminalNode BracesRight() { return getToken(MiderCodeParser.BracesRight, 0); }
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(BracesLeft);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 2167920992180961363L) != 0)) {
				{
				setState(459);
				programBody();
				}
			}

			setState(462);
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
	public static class ForInStatementContext extends ProgramStatementContext {
		public TerminalNode ForKeyWord() { return getToken(MiderCodeParser.ForKeyWord, 0); }
		public TerminalNode ParenthesesLeft() { return getToken(MiderCodeParser.ParenthesesLeft, 0); }
		public TerminalNode SymbolID() { return getToken(MiderCodeParser.SymbolID, 0); }
		public TerminalNode InKeyWord() { return getToken(MiderCodeParser.InKeyWord, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ParenthesesRight() { return getToken(MiderCodeParser.ParenthesesRight, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInStatementContext(ProgramStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ProgramStatementContext {
		public TerminalNode LoopKeyWord() { return getToken(MiderCodeParser.LoopKeyWord, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ProgramStatementContext {
		public List<TerminalNode> IfKeyWord() { return getTokens(MiderCodeParser.IfKeyWord); }
		public TerminalNode IfKeyWord(int i) {
			return getToken(MiderCodeParser.IfKeyWord, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ElseKeyWord() { return getTokens(MiderCodeParser.ElseKeyWord); }
		public TerminalNode ElseKeyWord(int i) {
			return getToken(MiderCodeParser.ElseKeyWord, i);
		}
		public IfStatementContext(ProgramStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiderCodeParserListener ) ((MiderCodeParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiderCodeParserVisitor ) return ((MiderCodeParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramStatementContext programStatement() throws RecognitionException {
		ProgramStatementContext _localctx = new ProgramStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_programStatement);
		int _la;
		try {
			int _alt;
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LetKeyWord:
				_localctx = new DefineStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(LetKeyWord);
				setState(465);
				match(SymbolID);
				setState(466);
				match(AssignEqual);
				setState(467);
				expression(0);
				}
				break;
			case SymbolID:
				_localctx = new AssignEqualStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(SymbolID);
				setState(469);
				match(AssignEqual);
				setState(470);
				expression(0);
				}
				break;
			case LoopKeyWord:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(LoopKeyWord);
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(472);
					expression(0);
					}
					break;
				}
				setState(475);
				block();
				}
				break;
			case ForKeyWord:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(ForKeyWord);
				setState(477);
				match(ParenthesesLeft);
				setState(478);
				match(SymbolID);
				setState(479);
				match(InKeyWord);
				setState(480);
				expression(0);
				setState(481);
				match(ParenthesesRight);
				setState(482);
				block();
				}
				break;
			case IfKeyWord:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				match(IfKeyWord);
				setState(485);
				expression(0);
				setState(486);
				block();
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						match(ElseKeyWord);
						setState(488);
						match(IfKeyWord);
						setState(489);
						expression(0);
						setState(490);
						block();
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ElseKeyWord) {
					{
					setState(497);
					match(ElseKeyWord);
					setState(498);
					block();
					}
				}

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
		enterRule(_localctx, 76, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(FunctionDefKeyWord);
			setState(504);
			match(SymbolID);
			setState(505);
			match(ParenthesesLeft);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SymbolID) {
				{
				setState(506);
				functionDefParamList();
				}
			}

			setState(509);
			match(ParenthesesRight);
			setState(510);
			match(BracesLeft);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 2167920992180961363L) != 0)) {
				{
				setState(511);
				functionBody();
				}
			}

			setState(514);
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
		enterRule(_localctx, 78, RULE_functionDefParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(SymbolID);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ProgramSemicolon) {
				{
				{
				setState(517);
				match(ProgramSemicolon);
				setState(518);
				match(SymbolID);
				}
				}
				setState(523);
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
		enterRule(_localctx, 80, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(SymbolID);
			setState(525);
			match(ParenthesesLeft);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 33079849123847L) != 0)) {
				{
				setState(526);
				expression(0);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramSemicolon) {
					{
					{
					setState(527);
					match(ProgramSemicolon);
					setState(528);
					expression(0);
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(536);
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
		enterRule(_localctx, 82, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(538);
				programBody();
				}
				}
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 2167920992180961363L) != 0) );
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
		enterRule(_localctx, 84, RULE_listBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(SqualBracesLeft);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 33079849123847L) != 0)) {
				{
				setState(544);
				expression(0);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramSemicolon) {
					{
					{
					setState(545);
					match(ProgramSemicolon);
					setState(546);
					expression(0);
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(554);
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
		enterRule(_localctx, 86, RULE_mapBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(BracesLeft);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 33079849123847L) != 0)) {
				{
				setState(557);
				expression(0);
				setState(558);
				match(ProgramColon);
				setState(559);
				expression(0);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ProgramSemicolon) {
					{
					{
					setState(560);
					match(ProgramSemicolon);
					setState(561);
					expression(0);
					setState(562);
					match(ProgramColon);
					setState(563);
					expression(0);
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(572);
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
		enterRule(_localctx, 88, RULE_primary);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParenthesesLeft:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(ParenthesesLeft);
				setState(575);
				expression(0);
				setState(576);
				match(ParenthesesRight);
				}
				break;
			case NullKeyWord:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(NullKeyWord);
				}
				break;
			case TrueKeyWord:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(TrueKeyWord);
				}
				break;
			case FalseKeyWord:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(FalseKeyWord);
				}
				break;
			case SymbolID:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				match(SymbolID);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				match(Float);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 8);
				{
				setState(584);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(588);
				primary();
				}
				break;
			case 2:
				{
				setState(589);
				match(Not);
				setState(590);
				expression(11);
				}
				break;
			case 3:
				{
				setState(591);
				match(Add);
				setState(592);
				expression(10);
				}
				break;
			case 4:
				{
				setState(593);
				match(Sub);
				setState(594);
				expression(9);
				}
				break;
			case 5:
				{
				setState(595);
				listBody();
				}
				break;
			case 6:
				{
				setState(596);
				mapBody();
				}
				break;
			case 7:
				{
				setState(597);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(600);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(601);
						match(Caret);
						setState(602);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(603);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(604);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 19L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(605);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(606);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(607);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(608);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(610);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(611);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(612);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(613);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 100664113L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(614);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(615);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(616);
						match(BracesLeft);
						setState(617);
						expression(0);
						setState(618);
						match(BracesRight);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(620);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(621);
						((ExpressionContext)_localctx).bop = match(ProgramDot);
						setState(624);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(622);
							match(SymbolID);
							}
							break;
						case 2:
							{
							setState(623);
							functionCall();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		case 45:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001v\u0278\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0003\u0000^\b\u0000\u0001\u0000\u0005\u0000a\b\u0000"+
		"\n\u0000\f\u0000d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"i\b\u0001\n\u0001\f\u0001l\t\u0001\u0001\u0001\u0004\u0001o\b\u0001\u000b"+
		"\u0001\f\u0001p\u0001\u0001\u0001\u0001\u0004\u0001u\b\u0001\u000b\u0001"+
		"\f\u0001v\u0005\u0001y\b\u0001\n\u0001\f\u0001|\t\u0001\u0001\u0002\u0003"+
		"\u0002\u007f\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0083\b\u0002"+
		"\n\u0002\f\u0002\u0086\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008c\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0090"+
		"\b\u0003\n\u0003\f\u0003\u0093\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00a3\b\u0005\n\u0005\f\u0005\u00a6\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00aa\b\u0005\u0001\u0005\u0005\u0005\u00ad\b\u0005\n\u0005\f\u0005"+
		"\u00b0\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b4\b\u0005\n\u0005"+
		"\f\u0005\u00b7\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bb\b\u0005"+
		"\n\u0005\f\u0005\u00be\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c2"+
		"\b\u0005\n\u0005\f\u0005\u00c5\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00c9\b\u0005\n\u0005\f\u0005\u00cc\t\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00d0\b\u0005\n\u0005\f\u0005\u00d3\t\u0005\u0003\u0005\u00d5\b"+
		"\u0005\u0001\u0006\u0005\u0006\u00d8\b\u0006\n\u0006\f\u0006\u00db\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00df\b\u0006\u0001\u0006\u0003\u0006"+
		"\u00e2\b\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001\u0006\u0005"+
		"\u0006\u00e8\b\u0006\n\u0006\f\u0006\u00eb\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u00f0\b\u0007\u000b\u0007\f\u0007\u00f1\u0001"+
		"\u0007\u0003\u0007\u00f5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00fb\b\u0007\u0004\u0007\u00fd\b\u0007\u000b\u0007"+
		"\f\u0007\u00fe\u0001\u0007\u0003\u0007\u0102\b\u0007\u0003\u0007\u0104"+
		"\b\u0007\u0001\b\u0001\b\u0005\b\u0108\b\b\n\b\f\b\u010b\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u0110\b\t\u000b\t\f\t\u0111\u0001\t\u0001\t\u0001\t"+
		"\u0004\t\u0117\b\t\u000b\t\f\t\u0118\u0003\t\u011b\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0004\n\u0120\b\n\u000b\n\f\n\u0121\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0127\b\u000b\u000b\u000b\f\u000b\u0128\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u012f\b\f\u0001\r\u0001\r\u0004\r\u0133\b\r"+
		"\u000b\r\f\r\u0134\u0001\u000e\u0005\u000e\u0138\b\u000e\n\u000e\f\u000e"+
		"\u013b\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013f\b\u000e\u0001"+
		"\u000e\u0003\u000e\u0142\b\u000e\u0001\u000e\u0003\u000e\u0145\b\u000e"+
		"\u0001\u000e\u0005\u000e\u0148\b\u000e\n\u000e\f\u000e\u014b\t\u000e\u0001"+
		"\u000f\u0005\u000f\u014e\b\u000f\n\u000f\f\u000f\u0151\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0155\b\u000f\u0001\u000f\u0003\u000f\u0158\b"+
		"\u000f\u0001\u000f\u0005\u000f\u015b\b\u000f\n\u000f\f\u000f\u015e\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0162\b\u0010\u0001\u0010\u0003\u0010"+
		"\u0165\b\u0010\u0001\u0010\u0005\u0010\u0168\b\u0010\n\u0010\f\u0010\u016b"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u017a\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0181\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u018a\b\u0017\n\u0017\f\u0017\u018d\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0196\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u019b\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u019f\b\u001a\u0001\u001a\u0003"+
		"\u001a\u01a2\b\u001a\u0001\u001a\u0005\u001a\u01a5\b\u001a\n\u001a\f\u001a"+
		"\u01a8\t\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0005\"\u01bc\b\"\n\"\f"+
		"\"\u01bf\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u01c5\b#\u0001#\u0001"+
		"#\u0003#\u01c9\b#\u0001$\u0001$\u0003$\u01cd\b$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01da\b%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01ed\b%\n%\f%\u01f0"+
		"\t%\u0001%\u0001%\u0003%\u01f4\b%\u0003%\u01f6\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u01fc\b&\u0001&\u0001&\u0001&\u0003&\u0201\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u0208\b\'\n\'\f\'\u020b\t\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u0212\b(\n(\f(\u0215\t(\u0003(\u0217\b("+
		"\u0001(\u0001(\u0001)\u0004)\u021c\b)\u000b)\f)\u021d\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u0224\b*\n*\f*\u0227\t*\u0003*\u0229\b*\u0001*\u0001*"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u0236\b+\n+\f+\u0239\t+\u0003+\u023b\b+\u0001+\u0001+\u0001,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u024a\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0257\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0271"+
		"\b-\u0005-\u0273\b-\n-\f-\u0276\t-\u0001-\u0002\u018b\u01a6\u0001Z.\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\t\u0001\u0000\u000b\f\u0002"+
		"\u0000\f\f\u000e\u000e\u0001\u0000\u0015\u0016\u0001\u0000\"$\u0001\u0000"+
		"()\u0002\u0000cdgg\u0001\u0000ef\u0001\u0000IK\u0004\u0000HHLMPQab\u02bd"+
		"\u0000]\u0001\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004~"+
		"\u0001\u0000\u0000\u0000\u0006\u008b\u0001\u0000\u0000\u0000\b\u009b\u0001"+
		"\u0000\u0000\u0000\n\u00d4\u0001\u0000\u0000\u0000\f\u00d9\u0001\u0000"+
		"\u0000\u0000\u000e\u0103\u0001\u0000\u0000\u0000\u0010\u0105\u0001\u0000"+
		"\u0000\u0000\u0012\u011a\u0001\u0000\u0000\u0000\u0014\u011c\u0001\u0000"+
		"\u0000\u0000\u0016\u0123\u0001\u0000\u0000\u0000\u0018\u012a\u0001\u0000"+
		"\u0000\u0000\u001a\u0130\u0001\u0000\u0000\u0000\u001c\u0139\u0001\u0000"+
		"\u0000\u0000\u001e\u014f\u0001\u0000\u0000\u0000 \u015f\u0001\u0000\u0000"+
		"\u0000\"\u016c\u0001\u0000\u0000\u0000$\u016f\u0001\u0000\u0000\u0000"+
		"&\u0172\u0001\u0000\u0000\u0000(\u0176\u0001\u0000\u0000\u0000*\u017d"+
		"\u0001\u0000\u0000\u0000,\u0184\u0001\u0000\u0000\u0000.\u0186\u0001\u0000"+
		"\u0000\u00000\u0195\u0001\u0000\u0000\u00002\u0197\u0001\u0000\u0000\u0000"+
		"4\u019a\u0001\u0000\u0000\u00006\u01a9\u0001\u0000\u0000\u00008\u01ab"+
		"\u0001\u0000\u0000\u0000:\u01ad\u0001\u0000\u0000\u0000<\u01af\u0001\u0000"+
		"\u0000\u0000>\u01b1\u0001\u0000\u0000\u0000@\u01b3\u0001\u0000\u0000\u0000"+
		"B\u01b7\u0001\u0000\u0000\u0000D\u01b9\u0001\u0000\u0000\u0000F\u01c8"+
		"\u0001\u0000\u0000\u0000H\u01ca\u0001\u0000\u0000\u0000J\u01f5\u0001\u0000"+
		"\u0000\u0000L\u01f7\u0001\u0000\u0000\u0000N\u0204\u0001\u0000\u0000\u0000"+
		"P\u020c\u0001\u0000\u0000\u0000R\u021b\u0001\u0000\u0000\u0000T\u021f"+
		"\u0001\u0000\u0000\u0000V\u022c\u0001\u0000\u0000\u0000X\u0249\u0001\u0000"+
		"\u0000\u0000Z\u0256\u0001\u0000\u0000\u0000\\^\u0003$\u0012\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^b\u0001\u0000\u0000\u0000"+
		"_a\u0003\u0002\u0001\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0000\u0000\u0001f\u0001"+
		"\u0001\u0000\u0000\u0000gi\u0003(\u0014\u0000hg\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\b\u0004"+
		"\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qz\u0001\u0000\u0000\u0000rt\u0003"+
		"*\u0015\u0000su\u0003\b\u0004\u0000ts\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0003\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003*\u0015\u0000"+
		"~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0084\u0005\u0001\u0000\u0000\u0081\u0083"+
		"\u0003\u0006\u0003\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u0005"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0003(\u0014\u0000\u008a\u008c\u0003"+
		"*\u0015\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0091\u0005\u0001"+
		"\u0000\u0000\u008e\u0090\u0003\b\u0004\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0002\u0000"+
		"\u0000\u0095\u0007\u0001\u0000\u0000\u0000\u0096\u009c\u0003\n\u0005\u0000"+
		"\u0097\u009c\u0003D\"\u0000\u0098\u009c\u0003@ \u0000\u0099\u009c\u0003"+
		"\"\u0011\u0000\u009a\u009c\u0003\u0004\u0002\u0000\u009b\u0096\u0001\u0000"+
		"\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\t\u0001\u0000\u0000\u0000\u009d\u009f\u0003\f\u0006"+
		"\u0000\u009e\u00a0\u0003&\u0013\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0003\u001c\u000e\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00d5\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u000e\u0007\u0000"+
		"\u00a8\u00aa\u0003&\u0013\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ae\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0003 \u0010\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00d5\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b5\u0003\u0010\b\u0000\u00b2\u00b4\u0003"+
		"\u001a\r\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00d5\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bc\u0003\u0012\t\u0000\u00b9\u00bb\u0003 \u0010"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00d5\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c3\u0003\u0014\n\u0000\u00c0\u00c2\u0003 \u0010\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00d5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00ca\u0003\u0016\u000b\u0000\u00c7\u00c9\u0003 \u0010\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00d5\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d1\u0003\u0018\f\u0000\u00ce\u00d0\u0003 \u0010\u0000\u00cf\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u009d"+
		"\u0001\u0000\u0000\u0000\u00d4\u00a7\u0001\u0000\u0000\u0000\u00d4\u00b1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00b8\u0001\u0000\u0000\u0000\u00d4\u00bf"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c6\u0001\u0000\u0000\u0000\u00d4\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0005\t\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0005\u0013\u0000\u0000\u00dd\u00df\u0005"+
		"\n\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00e2\u0005\r\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e5\u0005\u000e\u0000"+
		"\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e9\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\r\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0003\f\u0006\u0000\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee"+
		"\u00f0\u0003\f\u0006\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f5"+
		"\u0005\u000f\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u0104\u0001\u0000\u0000\u0000\u00f6\u00fc"+
		"\u0003\f\u0006\u0000\u00f7\u00fa\u0005\u0004\u0000\u0000\u00f8\u00fb\u0003"+
		"\f\u0006\u0000\u00f9\u00fb\u0003\u001e\u000f\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u0102\u0005\u000f"+
		"\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00ec\u0001\u0000"+
		"\u0000\u0000\u0103\u00f6\u0001\u0000\u0000\u0000\u0104\u000f\u0001\u0000"+
		"\u0000\u0000\u0105\u0109\u0005\u0014\u0000\u0000\u0106\u0108\u0005\f\u0000"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u0011\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0003\f\u0006\u0000\u010d\u010e\u0005\u0006\u0000\u0000"+
		"\u010e\u0110\u0003\f\u0006\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u011b\u0001\u0000\u0000\u0000\u0113"+
		"\u0116\u0003\u0010\b\u0000\u0114\u0115\u0005\u0006\u0000\u0000\u0115\u0117"+
		"\u0003\u0010\b\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u010c\u0001"+
		"\u0000\u0000\u0000\u011a\u0113\u0001\u0000\u0000\u0000\u011b\u0013\u0001"+
		"\u0000\u0000\u0000\u011c\u011f\u0003\f\u0006\u0000\u011d\u011e\u0005\u0007"+
		"\u0000\u0000\u011e\u0120\u0003\f\u0006\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0015\u0001\u0000\u0000"+
		"\u0000\u0123\u0126\u0003\f\u0006\u0000\u0124\u0125\u0005\u0003\u0000\u0000"+
		"\u0125\u0127\u0003\f\u0006\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u0017\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0003\f\u0006\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c\u012e"+
		"\u0003\f\u0006\u0000\u012d\u012f\u0005\b\u0000\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0019\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0005\u0016\u0000\u0000\u0131\u0133\u0007"+
		"\u0001\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u001b\u0001\u0000\u0000\u0000\u0136\u0138\u0005"+
		"\t\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013e\u0007\u0002\u0000\u0000\u013d\u013f\u0005\n\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0142\u0005\r\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0145\u0005\u000e\u0000\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0149\u0001\u0000\u0000\u0000\u0146\u0148\u0007\u0000\u0000\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u001d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0005\t\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e"+
		"\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0152\u0154\u0007\u0002\u0000\u0000\u0153"+
		"\u0155\u0005\n\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0005\r\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u015c\u0001\u0000\u0000\u0000\u0159\u015b\u0007"+
		"\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015e\u0001"+
		"\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d\u001f\u0001\u0000\u0000\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0005\u0016\u0000\u0000\u0160\u0162\u0005"+
		"\n\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0165\u0005\r\u0000"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0169\u0001\u0000\u0000\u0000\u0166\u0168\u0007\u0001\u0000"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a!\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0005\u001c\u0000\u0000\u016d\u016e\u0005!\u0000\u0000\u016e"+
		"#\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u001d\u0000\u0000\u0170\u0171"+
		"\u0005 \u0000\u0000\u0171%\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0019"+
		"\u0000\u0000\u0173\u0174\u0005\u001e\u0000\u0000\u0174\u0175\u0005\u001f"+
		"\u0000\u0000\u0175\'\u0001\u0000\u0000\u0000\u0176\u0179\u0005\u0018\u0000"+
		"\u0000\u0177\u017a\u0003,\u0016\u0000\u0178\u017a\u0003.\u0017\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u00053\u0000\u0000\u017c)\u0001"+
		"\u0000\u0000\u0000\u017d\u0180\u0005\u0017\u0000\u0000\u017e\u0181\u0003"+
		",\u0016\u0000\u017f\u0181\u0003.\u0017\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u00053\u0000\u0000\u0183+\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u00052\u0000\u0000\u0185-\u0001\u0000\u0000\u0000\u0186\u018b\u0003"+
		"0\u0018\u0000\u0187\u0188\u0005%\u0000\u0000\u0188\u018a\u00030\u0018"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c/\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018e\u0196\u00032\u0019\u0000\u018f\u0196\u00034\u001a\u0000\u0190\u0196"+
		"\u00038\u001c\u0000\u0191\u0196\u00036\u001b\u0000\u0192\u0196\u0003:"+
		"\u001d\u0000\u0193\u0196\u0003<\u001e\u0000\u0194\u0196\u0003>\u001f\u0000"+
		"\u0195\u018e\u0001\u0000\u0000\u0000\u0195\u018f\u0001\u0000\u0000\u0000"+
		"\u0195\u0190\u0001\u0000\u0000\u0000\u0195\u0191\u0001\u0000\u0000\u0000"+
		"\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u01961\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005&\u0000\u0000\u01983\u0001\u0000\u0000\u0000\u0199\u019b\u0005"+
		"-\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0007\u0003"+
		"\u0000\u0000\u019d\u019f\u0005\'\u0000\u0000\u019e\u019d\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a2\u0005.\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a5\u0007\u0004\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a75\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005*\u0000\u0000\u01aa7\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005/\u0000\u0000\u01ac9\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0005,\u0000\u0000\u01ae;\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u00050\u0000\u0000\u01b0=\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"1\u0000\u0000\u01b2?\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u001b\u0000"+
		"\u0000\u01b4\u01b5\u0003B!\u0000\u01b5\u01b6\u0005v\u0000\u0000\u01b6"+
		"A\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005s\u0000\u0000\u01b8C\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bd\u0005\u001a\u0000\u0000\u01ba\u01bc\u0003"+
		"F#\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0005r\u0000\u0000\u01c1E\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c4\u0003J%\u0000\u01c3\u01c5\u0005]\u0000\u0000\u01c4\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c9\u0003L&\u0000\u01c7\u01c9\u0003Z-\u0000"+
		"\u01c8\u01c2\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9G\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cc\u0005W\u0000\u0000\u01cb\u01cd\u0003F#\u0000\u01cc\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0005X\u0000\u0000\u01cfI\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u00054\u0000\u0000\u01d1\u01d2\u0005o\u0000\u0000\u01d2"+
		"\u01d3\u0005l\u0000\u0000\u01d3\u01f6\u0003Z-\u0000\u01d4\u01d5\u0005"+
		"o\u0000\u0000\u01d5\u01d6\u0005l\u0000\u0000\u01d6\u01f6\u0003Z-\u0000"+
		"\u01d7\u01d9\u00055\u0000\u0000\u01d8\u01da\u0003Z-\u0000\u01d9\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01f6\u0003H$\u0000\u01dc\u01dd\u0005:"+
		"\u0000\u0000\u01dd\u01de\u0005[\u0000\u0000\u01de\u01df\u0005o\u0000\u0000"+
		"\u01df\u01e0\u00056\u0000\u0000\u01e0\u01e1\u0003Z-\u0000\u01e1\u01e2"+
		"\u0005\\\u0000\u0000\u01e2\u01e3\u0003H$\u0000\u01e3\u01f6\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u00058\u0000\u0000\u01e5\u01e6\u0003Z-\u0000"+
		"\u01e6\u01ee\u0003H$\u0000\u01e7\u01e8\u00059\u0000\u0000\u01e8\u01e9"+
		"\u00058\u0000\u0000\u01e9\u01ea\u0003Z-\u0000\u01ea\u01eb\u0003H$\u0000"+
		"\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2\u00059\u0000\u0000\u01f2"+
		"\u01f4\u0003H$\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01d0\u0001"+
		"\u0000\u0000\u0000\u01f5\u01d4\u0001\u0000\u0000\u0000\u01f5\u01d7\u0001"+
		"\u0000\u0000\u0000\u01f5\u01dc\u0001\u0000\u0000\u0000\u01f5\u01e4\u0001"+
		"\u0000\u0000\u0000\u01f6K\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005G\u0000"+
		"\u0000\u01f8\u01f9\u0005o\u0000\u0000\u01f9\u01fb\u0005[\u0000\u0000\u01fa"+
		"\u01fc\u0003N\'\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0005\\\u0000\u0000\u01fe\u0200\u0005W\u0000\u0000\u01ff\u0201\u0003"+
		"R)\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005X\u0000\u0000"+
		"\u0203M\u0001\u0000\u0000\u0000\u0204\u0209\u0005o\u0000\u0000\u0205\u0206"+
		"\u0005_\u0000\u0000\u0206\u0208\u0005o\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020aO\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0005o\u0000\u0000"+
		"\u020d\u0216\u0005[\u0000\u0000\u020e\u0213\u0003Z-\u0000\u020f\u0210"+
		"\u0005_\u0000\u0000\u0210\u0212\u0003Z-\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000"+
		"\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u020e\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0005\\\u0000\u0000\u0219Q\u0001\u0000\u0000"+
		"\u0000\u021a\u021c\u0003F#\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021eS\u0001\u0000\u0000\u0000\u021f\u0228"+
		"\u0005Y\u0000\u0000\u0220\u0225\u0003Z-\u0000\u0221\u0222\u0005_\u0000"+
		"\u0000\u0222\u0224\u0003Z-\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224"+
		"\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227"+
		"\u0225\u0001\u0000\u0000\u0000\u0228\u0220\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005Z\u0000\u0000\u022bU\u0001\u0000\u0000\u0000\u022c\u023a\u0005"+
		"W\u0000\u0000\u022d\u022e\u0003Z-\u0000\u022e\u022f\u0005^\u0000\u0000"+
		"\u022f\u0237\u0003Z-\u0000\u0230\u0231\u0005_\u0000\u0000\u0231\u0232"+
		"\u0003Z-\u0000\u0232\u0233\u0005^\u0000\u0000\u0233\u0234\u0003Z-\u0000"+
		"\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0230\u0001\u0000\u0000\u0000"+
		"\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000"+
		"\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u022d\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0005X\u0000\u0000\u023dW\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005[\u0000\u0000\u023f\u0240\u0003Z-\u0000\u0240\u0241\u0005\\\u0000"+
		"\u0000\u0241\u024a\u0001\u0000\u0000\u0000\u0242\u024a\u0005D\u0000\u0000"+
		"\u0243\u024a\u0005E\u0000\u0000\u0244\u024a\u0005F\u0000\u0000\u0245\u024a"+
		"\u0005o\u0000\u0000\u0246\u024a\u0005m\u0000\u0000\u0247\u024a\u0005n"+
		"\u0000\u0000\u0248\u024a\u0005p\u0000\u0000\u0249\u023e\u0001\u0000\u0000"+
		"\u0000\u0249\u0242\u0001\u0000\u0000\u0000\u0249\u0243\u0001\u0000\u0000"+
		"\u0000\u0249\u0244\u0001\u0000\u0000\u0000\u0249\u0245\u0001\u0000\u0000"+
		"\u0000\u0249\u0246\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024aY\u0001\u0000\u0000\u0000"+
		"\u024b\u024c\u0006-\uffff\uffff\u0000\u024c\u0257\u0003X,\u0000\u024d"+
		"\u024e\u0005h\u0000\u0000\u024e\u0257\u0003Z-\u000b\u024f\u0250\u0005"+
		"e\u0000\u0000\u0250\u0257\u0003Z-\n\u0251\u0252\u0005f\u0000\u0000\u0252"+
		"\u0257\u0003Z-\t\u0253\u0257\u0003T*\u0000\u0254\u0257\u0003V+\u0000\u0255"+
		"\u0257\u0003P(\u0000\u0256\u024b\u0001\u0000\u0000\u0000\u0256\u024d\u0001"+
		"\u0000\u0000\u0000\u0256\u024f\u0001\u0000\u0000\u0000\u0256\u0251\u0001"+
		"\u0000\u0000\u0000\u0256\u0253\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u0274\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\n\b\u0000\u0000\u0259\u025a\u0005k\u0000"+
		"\u0000\u025a\u0273\u0003Z-\b\u025b\u025c\n\u0007\u0000\u0000\u025c\u025d"+
		"\u0007\u0005\u0000\u0000\u025d\u0273\u0003Z-\b\u025e\u025f\n\u0006\u0000"+
		"\u0000\u025f\u0260\u0007\u0006\u0000\u0000\u0260\u0273\u0003Z-\u0007\u0261"+
		"\u0262\n\u0005\u0000\u0000\u0262\u0263\u0007\u0007\u0000\u0000\u0263\u0273"+
		"\u0003Z-\u0006\u0264\u0265\n\u0004\u0000\u0000\u0265\u0266\u0007\b\u0000"+
		"\u0000\u0266\u0273\u0003Z-\u0005\u0267\u0268\n\r\u0000\u0000\u0268\u0269"+
		"\u0005W\u0000\u0000\u0269\u026a\u0003Z-\u0000\u026a\u026b\u0005X\u0000"+
		"\u0000\u026b\u0273\u0001\u0000\u0000\u0000\u026c\u026d\n\f\u0000\u0000"+
		"\u026d\u0270\u0005`\u0000\u0000\u026e\u0271\u0005o\u0000\u0000\u026f\u0271"+
		"\u0003P(\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000"+
		"\u0000\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u0258\u0001\u0000"+
		"\u0000\u0000\u0272\u025b\u0001\u0000\u0000\u0000\u0272\u025e\u0001\u0000"+
		"\u0000\u0000\u0272\u0261\u0001\u0000\u0000\u0000\u0272\u0264\u0001\u0000"+
		"\u0000\u0000\u0272\u0267\u0001\u0000\u0000\u0000\u0272\u026c\u0001\u0000"+
		"\u0000\u0000\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275[\u0001\u0000\u0000"+
		"\u0000\u0276\u0274\u0001\u0000\u0000\u0000S]bjpvz~\u0084\u008b\u0091\u009b"+
		"\u009f\u00a4\u00a9\u00ae\u00b5\u00bc\u00c3\u00ca\u00d1\u00d4\u00d9\u00de"+
		"\u00e1\u00e4\u00e9\u00f1\u00f4\u00fa\u00fe\u0101\u0103\u0109\u0111\u0118"+
		"\u011a\u0121\u0128\u012e\u0134\u0139\u013e\u0141\u0144\u0149\u014f\u0154"+
		"\u0157\u015c\u0161\u0164\u0169\u0179\u0180\u018b\u0195\u019a\u019e\u01a1"+
		"\u01a6\u01bd\u01c4\u01c8\u01cc\u01d9\u01ee\u01f3\u01f5\u01fb\u0200\u0209"+
		"\u0213\u0216\u021d\u0225\u0228\u0237\u023a\u0249\u0256\u0270\u0272\u0274";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}