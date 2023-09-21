
parser grammar MiderCodeParser;

options { tokenVocab = MiderCodeLexer; }

// track: trackHeader? (midercode | program)+ EOF;
track: (trackHeader | midercode | program)+ EOF;

midercode
    : note lyric?              # noteExperssion
    | chord lyric?             # chordExperssion
    | rest                     # restExperssion
    | tuplet                   # tupletExperssion
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
glissando
    : note (GlissandoConnector note)+
    // | glissando noteListBase+ // unreachable
    ;
appoggiatura
    : note AppoggiaturaConnector note Ttail?
    // | appoggiatura noteListBase+ // unreachable
    ;

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
    | trackSpeedConfig
    | trackTonalityConfig
    | trackVelocityConfig
    | trackInstrumentConfig
    | trackCustomConfig
    ;

trackBpmConfig: TrackBPMInteger;
trackOctaveAndDurationConfig: (TrackTreble | TrackBass) (TrackOcatve | TrackDuration)*?;
trackSpeedConfig: TrackSpeed;
trackTonalityConfig: TrackTonality;
trackVelocityConfig: TrackVelocity;
trackInstrumentConfig: TrackUseInstrumnt;
trackCustomConfig: TrackPair;
// endregion

// region program
program: ProgramStart programBody* ProgramEnd;

programBody
    : programStatement
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
    : SymbolID (ProgramComma SymbolID)*
    ;

functionCall
    : SymbolID ParenthesesLeft (expression (ProgramComma expression)*)?  ParenthesesRight
    ;

functionBody
    : programBody+
    ;

expression
    : Integer
    | SymbolID
    | TrueKeyWord
    | FalseKeyWord
    | NullKeyWord
    | Float
    | Not expression
    | expression (Mul | Div | Mod) expression
    | expression (Add | Sub) expression
    | expression (And | Or | Xor) expression
    | ParenthesesLeft expression ParenthesesRight
    | functionCall
    ;

// endregion