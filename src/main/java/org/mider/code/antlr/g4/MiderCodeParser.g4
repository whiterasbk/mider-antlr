
parser grammar MiderCodeParser;

options { tokenVocab = MiderCodeLexer; }
// todo 简谱模式，和弦模式
//tracks: globalConfig? (trackHeader | midercode | program | hexData | chordMode | scope)+ EOF;

tracks: globalConfig? track* EOF;

track
    : trackHeader* trackBody+ (inlineTrackHeader trackBody+)*
    ;
scopeBlock: trackHeader EnterScope trackBody* ExitScope;
trackBody: midercode | program | hexData | chordMode | scopeBlock;

midercode
    : note lyric? noteClone*               # noteExperssion
    | chord lyric? noteListClone*          # chordExperssion
    | rest restClone*                      # restExperssion
    | tuplet noteListClone*                # tupletExperssion
    | triplets noteListClone*              # tripletsExperssion
    | glissando noteListClone*             # glissandoExperssion
    | appoggiatura noteListClone*          # appoggiaturaExperssion
    ;

note
    : (PitchPrefix)* NoteName (MoveOctaveSuffix | OctaveSuffix | DurationSuffix | VelocitySuffix | RepeatSuffix)*
    ;
chord
    : note (ChordConnector note) + (ArpeggioSuffix)?
    | note (ChordConnector (note | chordTailBase))+ (ArpeggioSuffix)?
    ;
rest: (RestNote) DurationSuffix*;
tuplet
    : note (TupletConnector note)+
    | rest (TupletConnector rest)+
    ;
triplets
    : note (TripletsConnector note)+
    ;
glissando
    : note (GlissandoConnector note)+
    ;
appoggiatura
    : note AppoggiaturaConnector note Ttail?
    ;
// todo 三连音 q 表示前一个和弦

restClone: Clone (RepeatSuffix | DurationSuffix)+;
noteClone: (PitchPrefix)* (Clone | ModifyPitchBase) (MoveOctaveSuffix | OctaveSuffix | RepeatSuffix | DurationSuffix | VelocitySuffix)*;
chordTailBase: (PitchPrefix)* (Clone | ModifyPitchBase) (MoveOctaveSuffix | OctaveSuffix | DurationSuffix | VelocitySuffix)*;
noteListClone: Clone (RepeatSuffix | DurationSuffix | VelocitySuffix | OctaveSuffix)*; // unreachable

// reggion chord mode
chordMode: ChordModeStart ChordModeEnd;
// endregion

// reggion chord mode
globalConfig: GlobalConfigStrat GlobalConfigEnd;
// endregion

// lyric
lyric: LyricStart LyricContent LyricEnd;

// region track
trackHeader: TrackStart sigleTrackConfig (TrackConfigSeperator sigleTrackConfig)*? TrackEnd;
inlineTrackHeader: InlineTrackStart sigleTrackConfig (TrackConfigSeperator sigleTrackConfig)*? TrackEnd;
sigleTrackConfig
    : trackBpmConfig
    | trackOctaveAndDurationConfig
    | trackTimesignatureConfig
    | trackSpeedConfig
    | trackTonalityConfig
    | trackVelocityConfig
    | trackInstrumentConfig
    | trackCustomConfig
    ;

trackBpmConfig: TrackBPMInteger;
trackOctaveAndDurationConfig: (TrackTreble | TrackBass | TrackAlto) (TrackOcatve | TrackDuration)*?;
trackSpeedConfig: TrackSpeed;
trackTimesignatureConfig: TrackTimesignature;
trackTonalityConfig: TrackTonality;
trackVelocityConfig: TrackVelocity;
trackInstrumentConfig: TrackUseInstrumnt;
trackCustomConfig: TrackPair;
// endregion

// region hexdata
hexData: HexStart hexContent HexEnd;

hexContent
    : PureHexContent
    ;
// endregion

// region program
program: ProgramStart programBody* ProgramEnd;

programBody
    : programStatement ProgramComma?
    | functionDef
    | expression
    ;

block
    : BracesLeft programBody? BracesRight
    ;

programStatement
    : LetKeyWord SymbolID AssignEqual expression                                                            # defineStatement
    | SymbolID AssignEqual expression                                                                       # assignEqualStatement
    | LoopKeyWord expression? block                                                                         # loopStatement
    | ForKeyWord ParenthesesLeft SymbolID InKeyWord expression ParenthesesRight block                       # forInStatement
    | IfKeyWord expression block (ElseKeyWord IfKeyWord expression block)* (ElseKeyWord block)?             # ifStatement
    ;

functionDef
    : FunctionDefKeyWord SymbolID ParenthesesLeft functionDefParamList? ParenthesesRight BracesLeft functionBody? BracesRight
    ;

functionDefParamList
    : SymbolID (ProgramSemicolon SymbolID)*
    ;

functionCall
    : SymbolID ParenthesesLeft (expression (ProgramSemicolon expression)*)?  ParenthesesRight
    ;


//hava: primary ((ProgramDot SymbolID) | (SqualBracesLeft Integer SqualBracesRight) | ParenthesesLeft (expression (ProgramSemicolon expression)*)? ParenthesesRight )* ;
//primary: SymbolID | functionCall | ParenthesesLeft expression ParenthesesRight;
//
//objectGet
//    : (SymbolID | functionCall) ProgramDot (SymbolID | functionCall) (ProgramDot SymbolID)*
//    ;
//
//objectGetAndCall
//    : (SymbolID | functionCall) (ProgramDot (SymbolID | functionCall))* ParenthesesLeft (expression (ProgramSemicolon expression)*)? ParenthesesRight
//    ;
//
//listGet
//    : SymbolID SqualBracesLeft expression SqualBracesRight (SqualBracesLeft expression SqualBracesRight)*
//    ;

functionBody
    : programBody+
    ;

listBody
    : SqualBracesLeft (expression (ProgramSemicolon expression)*)? SqualBracesRight
    ;

mapBody
    : BracesLeft (expression ProgramColon expression (ProgramSemicolon expression ProgramColon expression)*)? BracesRight
    ;

primary
    : ParenthesesLeft expression ParenthesesRight
    | NullKeyWord
    | TrueKeyWord
    | FalseKeyWord
    | SymbolID
    | Integer
    | Float
    | String
    ;

expression
    : primary
    | expression BracesLeft expression BracesRight
    | expression bop='.' (SymbolID | functionCall) // todo fix
    | Not expression
    | Add expression
    | Sub expression
    | <assoc=right> expression Caret expression
    | expression (Mul | Div | Mod) expression
    | expression (Add | Sub) expression
    | expression (And | Or | Xor) expression
    | expression (JugdeEqual | AdressEqual | JugdeNotEqual | Greater | GreaterEqual | Lesser | LesserEqual) expression
    | listBody
    | mapBody
    | functionCall
    ;

// endregion