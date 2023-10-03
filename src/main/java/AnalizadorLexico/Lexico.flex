package AnalizadorLexico;
import ModeloLexico.*;

%%
%class Lexico
%type Token
%line
%column


L=[a-zA-Z_]+
D=[0-9]+
espacio=[ | \t | \r | \n]

%{
    public String lexeme;
%}
%%

as |
assert |
break |
class |
continue |
def |
del |
elif |
else |
except |
finally |
for |
from |
global |
if |
import |
in |
lambda |
is |
None |
nonlocal |
pass |
raise |
return |
try |
while |
with |
yield {lexeme=yytext(); return new Token(TipoToken.Palabra_Reservada, yyline+1, yycolumn+1, lexeme);}


and | or | not {return new Token(TipoToken.Operador_Logico, yyline+1, yycolumn+1, yytext());}
True | False {return new Token(TipoToken.Boolean, yyline+1, yycolumn+1, yytext());}




{espacio} {/*Ignore*/}


"=" {return new Token(TipoToken.Asignacion, yyline+1, yycolumn+1, yytext());}

"(" {return new Token(TipoToken.ParentesisA, yyline+1, yycolumn+1, yytext());}
")" {return new Token(TipoToken.ParentesisC, yyline+1, yycolumn+1, yytext());}

"{" {return new Token(TipoToken.LlavesA, yyline+1, yycolumn+1, yytext());}
"}" {return new Token(TipoToken.LlavesC, yyline+1, yycolumn+1, yytext());}

"[" {return new Token(TipoToken.CorchetesA, yyline+1, yycolumn+1, yytext());}
"]" {return new Token(TipoToken.CorchetesC, yyline+1, yycolumn+1, yytext());}

"," {return new Token(TipoToken.Coma, yyline+1, yycolumn+1, yytext());}
":" {return new Token(TipoToken.DosPuntos, yyline+1, yycolumn+1, yytext());}
";" {return new Token(TipoToken.PuntoComa, yyline+1, yycolumn+1, yytext());}




"==" | "!=" | "<" | ">" | ">=" | "<=" {return new Token(TipoToken.Operador_Comparacion, yyline+1, yycolumn+1, yytext());}

"+" | "-" | "*" | "**" | "/" | "//" | "%" {return new Token(TipoToken.Operador_Aritmetico, yyline+1, yycolumn+1, yytext());}

{L}({L}|{D})* {
    lexeme = yytext();
    return new Token(TipoToken.Identificador, yyline + 1, yycolumn + 1, lexeme);
}

{D}{L}+ {   
    lexeme = yytext();
    return new Token(TipoToken.Error, yyline + 1, yycolumn + 1,  lexeme);
}



("(-"{D}+")")|{D}+ {lexeme=yytext(); return new Token(TipoToken.Constante, yyline+1, yycolumn+1, lexeme);}

("-"?{D}+"."{D}+) | {D}+ {lexeme=yytext(); return new Token(TipoToken.Constante, yyline+1, yycolumn+1, lexeme);}

("\""([^\"\\\\]|\\\\.)*"\"") | ('([^'\\\\]|\\\\.)*') {lexeme=yytext(); return new Token(TipoToken.Cadena, yyline+1, yycolumn+1, lexeme);}
("\""([^\"\\\\]|\\\\.)*"\n")|('[^'\\\\]*"\n") {lexeme=yytext(); return new Token(TipoToken.Error, yyline+1, yycolumn+1, lexeme);}


("#"[^\n]*) {lexeme=yytext(); return new Token(TipoToken.Comentario, yyline+1, yycolumn+1, lexeme);}



. {return new Token(TipoToken.Error, yyline+1, yycolumn+1, yytext());}
