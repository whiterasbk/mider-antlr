
parser grammar MiderCodeParser;

options { tokenVocab = MiderCodeLexer; }
// todo 简谱模式，和弦模式
// track: trackHeader? (midercode | program)+ EOF;
track: (trackHeader | midercode | program | hexData)+ EOF;

midercode
    : note lyric?              # noteExperssion
    | chord lyric?             # chordExperssion
    | rest                     # restExperssion
    | tuplet                   # tupletExperssion
    | triplets                 # tripletsExperssion
    | glissando                # glissandoExperssion
    | appoggiatura             # appoggiaturaExperssion
    | comment                  # commentExperssion
    ;

note
    : (PitchPrefix)* NoteName (MoveOctaveSuffix | OctaveSuffix | DurationSuffix | VelocitySuffix | RepeatSuffix | PitchSuffix)*
    | note noteBase+? // todo fix: if this branch attached, must be tarck -> midercode -> note -> noteBase, else error
    ;
chord
    : note (ChordConnector note) + (ArpeggioSuffix)?
    | note (ChordConnector (note | chordTailBase)) + (ArpeggioSuffix)?
    // | chord noteListBase+ // unreachable
    ;
rest
    : (RestNote) DurationSuffix*
    | rest restBase+
    ;
tuplet
    : note (TupletConnector note)+
    | rest (TupletConnector rest)+
    // | tuplet noteListBase+ // unreachable
    ;

triplets
    : note (ChordConnector note)+
    ;

glissando
    : note (GlissandoConnector note)+
    // | glissando noteListBase+ // unreachable
    ;
appoggiatura
    : note AppoggiaturaConnector note Ttail?
    // | appoggiatura noteListBase+ // unreachable
    ;
// todo 三连音 q 表示前一个和弦

restBase: Clone (RepeatSuffix | DurationSuffix)+;
noteBase: (PitchPrefix)* (Clone | ModifyPitchBase) (MoveOctaveSuffix | OctaveSuffix | RepeatSuffix | DurationSuffix | VelocitySuffix | PitchSuffix)*;
chordTailBase: (PitchPrefix)* (Clone | ModifyPitchBase) (MoveOctaveSuffix | OctaveSuffix | DurationSuffix | VelocitySuffix | PitchSuffix)*;
// noteListBase: CloneActionOperator (RepeatSuffix | DurationSuffix | VelocitySuffix | OctaveSuffix)*; // unreachable

comment: Comment;

// lyric
lyric: LyricStart LyricContent LyricEnd;

// region track
trackHeader: TrackStart sigleTrackConfig (TrackConfigSeperator sigleTrackConfig)*? TrackEnd;
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

programStatement
    : LetKeyWord SymbolID AssignEqual expression                          # defineStatement
    | SymbolID AssignEqual expression                                     # assignEqualStatement
    | LoopKeyWord expression? BracesLeft programBody? BracesRight         # loopStatement
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