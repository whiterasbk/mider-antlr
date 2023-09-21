lexer grammar MiderCodeLexer;

// sign
fragment Tilde: '~'; // CloneActionOperator
fragment Greater: '>';
fragment Lesser: '<';
fragment Apostrophe: '\'';
fragment MiderAnd: '&'; // TupletConnector
fragment Comma: ';'; // Appoggiatura Connector
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

// connector
GlissandoConnector: Equal | ApproximatelyEqual;
ChordConnector: Colon;
AppoggiaturaConnector: Comma;
TupletConnector: MiderAnd;

// tail
Ttail: Tl | Tu;

// prefix and suffix
PitchPrefix
    : Hash | '♯'
    | Doller | '♭'
    | At | '♮'
    ;
PitchSuffix: Apostrophe;
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
VelocitySuffix: Percent SingleDigital;
RepeatSuffix: Star SingleDigital;
ArpeggioSuffix: '↟' | '↡' | '︴';

// ignore
fragment NewLine: '\t\r' | '\n';
fragment Space: ' ';
Comment: '/*'  .*?  '*/'  {skip();};
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
TrackStart: Greater -> pushMode(Track);
LyricStart: '[' -> pushMode(LyricMode);
ProgramStart: '(:' -> pushMode(Program);

mode LyricMode;
    LyricContent: ~('[' | ']')+;
    LyricEnd: ']' -> popMode;

mode Track;
TrackTreble: Gl;
TrackBass: Fl;
TrackConfigSeperator: Comma;
TrackBPMInteger: SingleDigital+;
TrackOcatve: OctaveSuffix | MoveOctaveSuffix;
TrackDuration: DurationSuffix;
TrackSpeed: SingleDigital+ (Xu | Xl);
TrackSpace: Space -> skip;
TrackTonality: ('b' | '#')? [A-G] (('m' | 'maj' | 'major') | ('min' | 'minor'))?;
TrackVelocity: SingleDigital+ Percent;
TrackUseInstrumnt: 'use' Colon [a-zA-Z]([a-zA-Z0-9_])*;
TrackPair: [a-zA-Z][a-zA-Z_0-9]* Equal [a-zA-Z_0-9]+ (Comma [a-zA-Z_0-9]+)*?;
TrackEnd: Greater -> popMode;

mode Program;
LetKeyWord: 'let';
LoopKeyWord: 'loop';
InKeyWord: 'in';
IfKeyWord: 'if';
ElseKeyWord: 'else';
ForKeyWord: 'for';
WhileKeyWord: 'while';
ReturnKeyWord: 'return';
BreakKeyWord: 'break';
ContinueKeyWord: 'continue';
//ClassKeyWord: 'class';
//NewKeyWord: 'new';//
//ThisKeyWord: 'this';
//SuperKeyWord: 'super';
NullKeyWord: 'null';
TrueKeyWord: 'true';
FalseKeyWord: 'false';
FunctionDefKeyWord: 'fun';

ProgramComma: ',';
AssignEqual: '=';
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
Mul: '*';
Div: '/';
Add: '+';
Sub: '-';
Mod: '%';
Not: '!';
And: '&';
Or: '|';
Xor: '^';
JugdeEqual: '==';
JugdeNotEqual: '!=';

Integer: [0-9]+;
Float: (Plus | Minus) [0-9]+ '.' [0-9]+;
SymbolID: [A-Za-z_][A-Za-z_0-9]*;

ProgramBlank: (Space | NewLine)+ -> skip;
ProgramEnd: ':)' -> popMode;
