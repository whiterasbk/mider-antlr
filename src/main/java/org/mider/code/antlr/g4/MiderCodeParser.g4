
parser grammar MiderCodeParser;

options { tokenVocab = MiderCodeLexer; }

track: TrackHead? midercode;

midercode: expr+;

expr
    : note                     # note_expr
    | chord                    # chord_expr
    | rest                     # rest_expr
    | tuplet                   # tuplet_expr
    | glissando                # glissando_expr
    | appoggiatura             # appoggiatura_expr
    | clone_action_suffix      # clone_action_exper
    | with_lyric               # lyric_exper
    | comment                  # a_comment
    ;

note: (PitchPrefix)* NoteName (MoveOctaveSuffix | OctaveSuffix | DurationSuffix | VelocitySuffix | RepeatSuffix | PitchSuffix)* ;
chord: note (ChordConnector note ) + (ArpeggioSuffix)?;
rest: (RestNote) DurationSuffix* ;
tuplet
    : note (TupletConnector note) +
    | rest (TupletConnector rest) +
    ;
glissando: note (GlissandoConnector note ) + ;
appoggiatura: note (AppoggiaturaConnector note ) + AppoggiaturaTail? ;

midercode_has_duration: (note | chord | rest | tuplet | glissando | appoggiatura);
midercode_has_pitch: (note | chord | tuplet | glissando | appoggiatura);
clone_action_suffix
    : midercode_has_duration CloneActionOperator +
    | midercode_has_pitch (CloneActionOperator | CloneAndModifyPitchOperator) +
    ;

with_lyric: (note | chord) Lyric ;
comment: Comment;