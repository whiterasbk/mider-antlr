lexer grammar MiderCodeLexer;

// sign
fragment Tilde: '~'; // CloneActionOperator
fragment AngleBracketLeft: '<';
fragment AngleBracketRight: '>';
fragment Apostrophe: '\'';
fragment MiderAnd: '&'; // TupletConnector
fragment MiderUnderscore: '_'; // tripletsConnector
fragment Semicolon: ';'; // Appoggiatura Connector
fragment Comma: ',';
fragment Colon: ':'; // ChordConnector
fragment Equal: '='; // ArpeggioConnector
fragment ApproximatelyEqual: '≈'; // ArpeggioConnector
fragment Hash: '#'; // PitchModifier
fragment Dot: '.'; // DurationModifier
fragment Slash: '/'; // DurationModifier
fragment Plus: '+'; // DurationModifier
fragment Minus: '-'; // DurationModifier
fragment Star: '*'; // RepeatModifier
fragment Doller: '$'; // PitchModifier
fragment At: '@'; // PitchModifier
fragment Percent: '%';
fragment MiderOr: '|';

// letter
fragment Tl: 't';
fragment Tu: 'T';
fragment Xl: 'x';
fragment Xu: 'X';
fragment Hl: 'h';
fragment Hu: 'H';
fragment Ll: 'l';
fragment Lu: 'L';
fragment Ol: 'o';
fragment Ou: 'O';
fragment Il: 'i';
fragment Iu: 'I';
fragment Gl: 'g';
fragment Gu: 'G';
fragment Fl: 'f';
fragment Fu: 'F';
fragment Cl: 'c';
fragment Cu: 'C';

// scope
EnterScope: '{';
ExitScope: '}';

// connector
GlissandoConnector: Equal | ApproximatelyEqual;
ChordConnector: Colon;
AppoggiaturaConnector: Semicolon;
TupletConnector: MiderAnd;
TripletsConnector: MiderUnderscore;

// tail
Ttail: Tl | Tu;

// prefix and suffix
PitchPrefix
    : Hash | '♯'
    | Doller | '♭'
    | At | '♮'
    ;
OctaveSuffix: SingleDigital;
MoveOctaveSuffix
    : '↓' | Ll | Lu
    | '↑' | Hl | Hu
    ;
DurationSuffix
    : Plus +
    | Minus +
    | Dot +
    | (Slash SingleDigital) +
    | ((Xl | Xu) SingleDigital) +
    ;
VelocitySuffix: Percent SingleDigital+;
RepeatSuffix: Star SingleDigital;
ArpeggioSuffix: '↟' | '↡' | '︴';

// ignore
fragment NewLine: '\t\r' | '\n';
fragment Space: ' ';
Comment: '/*'  .*?  '*/'  -> skip;
Blank: (Space | NewLine)+ -> skip;
SectionLine: MiderOr -> skip;

// notatioin
NoteName: [a-gA-G];
RestNote: Ol | Ou;

// clone
ModifyPitchBase: [^vmw];
Clone: Tilde;

// symbol
fragment SingleDigital: [0-9];

// mode

InlineTrackStart: '&>' -> pushMode(Track); // &track
TrackStart: AngleBracketRight -> pushMode(Track);

LyricStart: '[' -> pushMode(LyricMode);
ProgramStart: '(=' -> pushMode(Program);
HexStart: '`' -> pushMode(Hex);
ChordModeStart: '<|' -> pushMode(Chord);
GlobalConfigStrat: '<%' -> pushMode(GlobalConfig);

mode LyricMode;
    LyricContent: ~('[' | ']')+;
    LyricEnd: ']' -> popMode;

mode GlobalConfig;
GlobalConfigEnd: '%>' -> popMode;

mode Chord;
ChordModeEnd: '|>' -> popMode;

mode Track;
TrackTreble: Gl;
TrackBass: Fl;
TrackAlto: Cl;
TrackConfigSeperator: Semicolon;
TrackBPMInteger: SingleDigital+;
TrackOcatve: OctaveSuffix | MoveOctaveSuffix;
TrackDuration: DurationSuffix;
TrackSpeed: SingleDigital+ (Xu | Xl);
TrackSpace: Space -> skip;
TrackTonality: ('b' | '#')? [A-G] (('m' | 'maj' | 'major') | ('min' | 'minor'))?;
TrackVelocity: SingleDigital+ Percent;
TrackTimesignature: SingleDigital Slash SingleDigital;
TrackUseInstrumnt: 'use' Colon [a-zA-Z]([a-zA-Z0-9_])*;
TrackPair: [a-zA-Z][a-zA-Z_0-9]* Equal [a-zA-Z_0-9]+ (Comma [a-zA-Z_0-9]+)*?;
TrackEnd: AngleBracketRight -> popMode;

mode Program;
LetKeyWord: 'let';
LoopKeyWord: 'loop';
InKeyWord: 'in';
IsKeyWord: 'is';
IfKeyWord: 'if';
ElseKeyWord: 'else';
ForKeyWord: 'for';
WhileKeyWord: 'while';
ReturnKeyWord: 'return';
BreakKeyWord: 'break';
ContinueKeyWord: 'continue';
ImportKeyWord: 'import';
ClassKeyWord: 'class';
//NewKeyWord: 'new';
ThisKeyWord: 'this';
StaticKeyWord: 'static';
SuperKeyWord: 'super';
NullKeyWord: 'null';
TrueKeyWord: 'true';
FalseKeyWord: 'false';
FunctionDefKeyWord: 'fun';


AdressEqual: '===';
Xor: '^^' | '⊕';
And: '&&';
Or: '||';
JugdeNotEqual: '!=';
JugdeEqual: '==';
ShiftLeft: '<<';
ShiftRight: '>>';
GreaterEqual: '>=';
LesserEqual: '<=';
AssignPlusEqual: '+=';
AssignMinusEqual: '-=';
AssignMulEqual: '*=';
AssignDivEqual: '/=';
AssignModEqual: '%=';
BracesLeft: '{';
BracesRight: '}';
SqualBracesLeft: '[';
SqualBracesRight: ']';
ParenthesesLeft: '(';
ParenthesesRight: ')';
ProgramComma: ';';
ProgramColon: ':';
ProgramSemicolon: ',';
ProgramDot: '.';
Greater: '>';
Lesser: '<';
Mul: '*';
Div: '/';
Add: '+';
Sub: '-';
Mod: '%';
Not: '!';
LogicAnd: '&';
LogicOr: '|';
Caret: '^';
AssignEqual: '=';

//MidercodeInsideProgramStart -> pushMode(Track);

Integer: [0-9]+;
Float: [0-9]+ '.' [0-9]+;
SymbolID: [A-Za-z_][A-Za-z_0-9]*;
String: '"' (~["\\\r\n] | StringEscapeSequence)*? '"';

ProgramBlank: (Space | NewLine)+ -> skip;
ProgramEnd: '=)' -> popMode;

fragment StringEscapeSequence
    : '\\' 'u005c'? [btnfr"'\\]
    | '\\' 'u005c'? ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

mode Hex;

PureHexContent
    : MIDIHexDigit (Blank* MIDIHexDigit)*
    ;

HexNewLine: NewLine+ -> skip;

MIDIHexDigit: HexDigit HexDigit;

HexEnd: '`' -> popMode;