
grammar Expr;
prog:   (expr Newline)*
;

expr:   expr '*' expr
    |   expr '+' expr
    |   Int
    |   '(' expr ')'
    ;

Space   : [\t ]+ -> skip;
Newline : [\r\n]+ ;
Int     : [0-9]+ ;