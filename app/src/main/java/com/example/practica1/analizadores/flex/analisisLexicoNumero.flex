/* codigo de usuario */
package com.example.practica1.analizadores.flex;
import java_cup.runtime.*;
import com.example.practica1.analizadores.cup.OperacionParserSym;
import java.util.Date;

%% //separador de area


 /* opciones y declaraciones de jflex */

 /* opciones y declaraciones de jflex */

%class LexicoNumero
%public
%cup
%cupdebug
%line
%column

NUMERO = [0-9]
 NUMERO1 = [1-9]
 ENTERO = (({NUMERO1})({NUMERO})*|"0")
 NUMBER = ({ENTERO}) ((".")({NUMERO})*)?

 /* Operadores */
 MINUS = "-"
 PLUS = "+"
 TIMES = "*"
 DIVIDE = "/"

 /*Agrupacion*/
 LPAREN = "("
 RPAREN = ")"

 %{
    StringBuilder string = new StringBuilder();
    private Symbol symbol(int type) { //este es un metodo para los simbolos
      return new Symbol(type, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int type, double value) {  // este es un arreglo para los simbolos con otro tipo de instancias
      System.out.println("numero "+value);
      return new Symbol(type, yyline+1, yycolumn+1, value);
    }


    private void error(String message) { //este es de tipo
      System.out.println("Error en linea: "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
    }
%}

%% /* separador de areas*/

/* reglas lexicas */
{MINUS} {return symbol(OperacionParserSym.MINUS);}
{PLUS} {return symbol(OperacionParserSym.PLUS);}
{TIMES} {return symbol(OperacionParserSym.TIMES);}
{DIVIDE} {return symbol(OperacionParserSym.DIVIDE);}
{LPAREN} {return symbol(OperacionParserSym.LPAREN);}
{RPAREN} {return symbol(OperacionParserSym.RPAREN);}
{NUMBER} {return symbol(OperacionParserSym.NUMBER, Double.parseDouble(yytext()));}

/* error fallback */
[^]                     {error("Simbolo invalido <"+ yytext()+">");}
<<EOF>>                 { return symbol(OperacionParserSym.EOF); }