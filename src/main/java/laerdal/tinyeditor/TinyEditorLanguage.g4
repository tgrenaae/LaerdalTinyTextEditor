grammar TinyEditorLanguage;

prog:(keystroke)*;

keystroke:  letter
            | whitespace
            | arrowkey
            | backspace
            | undo;
letter: lowercaseletter
        |uppercaseletter;

lowercaseletter: LOWERCASELETTER;

uppercaseletter: UPPERCASELETTER;

whitespace:   SPACE  #SPACE
            | NEWLINE  #NEWLINE;

arrowkey:     ARROWRIGHT #ARROWRIGHT
            | ARROWLEFT #ARROWLEFT
            | ARROWUP #ARROWUP
            | ARROWDOWN #ARROWDOWN;

backspace: BACKSPACE;

undo: UNDO;


//tokens
SPACE: 'SPACE';
NEWLINE: 'NEWLINE';
ARROWRIGHT: 'RIGHT';
ARROWLEFT: 'LEFT';
ARROWUP: 'UP';
ARROWDOWN: 'DOWN';
BACKSPACE: 'BACKSPACE';
UNDO: 'UNDO';
LOWERCASELETTER: [a-z];
UPPERCASELETTER: [A-Z];
COMMA: ',' -> skip;
WS: [ \n\t\f\r]+ -> skip;
