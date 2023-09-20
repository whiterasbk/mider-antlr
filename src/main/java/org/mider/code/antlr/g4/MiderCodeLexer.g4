lexer grammar MiderCodeLexer;

// track
TrackScopeSymbol: '>';
fragment TrackTreble: 'g';
fragment TrackBass: 'f';
fragment TrackConfigSeperator: ';';

// track config
fragment TrackBPMConfig: SingleDigital+;
fragment TrackOctaveConfig: (TrackTreble | TrackBass) OctaveSuffix?;
fragment TrackSpeedConfig: SingleDigital+ ('x' | 'X');
fragment TrackInstrumentConfig: 'i' Whitespace* '=' Whitespace* [a-zA-Z]([a-zA-Z0-9_])*;

fragment TrackSingleConfig
    : TrackBPMConfig
    | TrackOctaveConfig
    | TrackSpeedConfig
    | TrackInstrumentConfig
    ;

TrackHead
    : TrackScopeSymbol TrackSingleConfig (TrackConfigSeperator TrackSingleConfig )* TrackScopeSymbol
    ;

// connector
ChordConnector: ':';
TupletConnector: '&';
GlissandoConnector: '=' | '≈';
AppoggiaturaConnector: ';';

// suffix
AppoggiaturaTail: 't';

// prefix
PitchPrefix
    : '#' | '♯'
    | '$' | '♭'
    | '@' | '♮'
    ;
PitchSuffix: '\'';
OctaveSuffix: SingleDigital;
MoveOctaveSuffix
    : '↓' | 'l'
    | '↑' | 'h'
    ;
DurationSuffix
    : '+' +
    | '-' +
    | '.' +
    | ('/' SingleDigital) +
    | ('x' SingleDigital) +
    ;
VelocitySuffix: '%' SingleDigital;
RepeatSuffix: '*' SingleDigital;
ArpeggioSuffix: '↟' | '↡' | '︴';

Comment: '/*'  .*  '*/'  {skip();} ;

// note
NoteName: [a-gA-G] ;
RestNote: 'O' | 'o';

// clone
CloneActionOperator: '~' ;
CloneAndModifyPitchOperator: [^vmw] ;

// symbol
SingleDigital: [0-9] ;
//Whitespace : [| \t\r\n]+ -> skip ;
Whitespace : ('|' | ' ' | NewLine)+ -> skip ;
NewLine: '\t\r' | '\n';

// lyric
fragment HexDigit
    : [0-9a-fA-F]
    ;

fragment LyricEscapeSequence
    : '\\' 'u005c'? 'btnfr'
    | '\\' 'u005c'? ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
Lyric: '[' (~('[' | ']') | LyricEscapeSequence)* ']';

