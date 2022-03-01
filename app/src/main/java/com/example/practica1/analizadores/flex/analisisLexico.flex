
/* codigo de usuario */
package com.example.practica1.analizadores.flex;

import java_cup.runtime.*;
import com.example.practica1.analizadores.cup.sym;
import  com.example.practica1.domain.*;
import java.util.ArrayList;
import java.util.Date;

%% //separador de area

 /* opciones y declaraciones de jflex */

 /* opciones y declaraciones de jflex */

%class AnalizadorLexico
%public
%cup
%cupdebug
%line
%column



 /*declaracion de regex para los tokens */

 W = [\r|\n|\r\n] | [ \t\f] | " "
 LETRA = [a-zA-Z]
 NUMERO = [0-9]
 NUMERO1 = [1-9]
 ENTERO = (({NUMERO1})({NUMERO})*|"0")
 DECIMAL = ({ENTERO}) ((".")({NUMERO})*)?

 /* Operadores */
 MINUS = "-"
 PLUS = "+"
 TIMES = "*"
 DIVIDE = "/"

 /*Agrupacion*/
 LPAREN = "("
 RPAREN = ")"
 /*Signos de agrupacion*/
 LLAVES_INICIO = "{"
 LLAVES_FIN = "}"
 CORCHETE_INICIO = "["
 CORCHETE_FIN = "]"
 COMILLA_INICIO = "“"
 COMILLA_FIN = "”"
 COMA = ","
 FIN = ";"

 TEXT = ({COMILLA_INICIO})({LETRA} | {NUMERO}| (" "))*({COMILLA_FIN})

 /*Expreciones regulares del enunciado*/
 DEF =  ("D"|"d")("ef")
 BARRAS = "Barras"
 PIE = "Pie"
 TITULO = ("titulo")({W})*(":")
 EJEX = ("ejex")({W})*(":")
 EJEY = ("ejey")({W})*(":")
 ETIQUETAS = ("etiquetas")({W})*(":")
 VALORES = ("valores")({W})*(":")
 UNIR = ("unir")({W})*(":")
 TIPO = ("tipo")({W})*(":")
 CANTIDAD = "Cantidad"
 PORCENTAJE = "Porcentaje"
 TOTAL = ("total")({W})*(":")
 EXTRA = ("extra")({W})*(":")
 EJECUTAR = ("Ejecutar")({W})*(":")
/* se puede poner el comodin %{   %} para poner codigo java*/

%{/* Este es el codigo java para compilar*/

    StringBuilder string = new StringBuilder();
    ArrayList<Lexema> graficos = new ArrayList<>();
    Separador texto = new Separador();

  public ArrayList<Lexema> getGrafico(){
    return graficos;
  }

  public void setGrafico(Lexema grafico){
    graficos.add(grafico);
  }

    private Symbol symbol(int type) { //este es un metodo para los simbolos
      //System.out.println("Se envio un tipo"+type);
      return new Symbol(type, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int type, String value) {  // este es un arreglo para los simbolos con otro tipo de instancias
      //System.out.println("Se esta envio un objeto"+type);
      return new Symbol(type, yyline+1, yycolumn+1, value);
    }

    private Symbol symbol(int type, double value) {  // este es un arreglo para los simbolos con otro tipo de instancias
      //System.out.println("Se esta envio un objeto"+type);
      return new Symbol(type, yyline+1, yycolumn+1, value);
    }

    private void error(String message) { //este es de tipo
      System.out.println("Error en linea: "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
    }
    public String separador(String texto,String separador1,String separador2){
            //System.out.println(texto);
            String[] text1 = texto.split(separador1);
            String[] text2 = text1[1].split(separador2);
            return text2[0];
    }

%}


%% /* separador de areas*/

/* reglas lexicas */

{W}               {System.out.println("tipo "+"“"+yytext()+"“");}
{DEF}             {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.DEF);}
{BARRAS}          {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.BARRAS);}
{PIE}             {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.PIE);}
{LLAVES_FIN}      {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.LLF);}
{LLAVES_INICIO}   {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.LLI);}
{MINUS}           {symbol(sym.MINUS);}
{DIVIDE}          {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.DIVIDE);}
{PLUS}            {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.PLUS);}
{TIMES}           {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.TIMES);}
{RPAREN}          {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.RPAREN);}
{LPAREN}          {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.LPAREN);}
{FIN}             {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.FIN);}

{EJEY}      {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.EJEY);}
{EJEX}      {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.EJEX);}
{TITULO}    {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.TITULO);}
{ETIQUETAS} {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.ETIQUETAS);}
{VALORES}   {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.VALORES);}
{UNIR}      {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.UNIR);}
{TIPO}      {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.TIPO);}
{CANTIDAD}  {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.CANTIDAD);}
{PORCENTAJE} {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.PORCENTAJE);}
{TOTAL}     {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.TOTAL);}
{EXTRA}     {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.EXTRA);}
{EJECUTAR}  {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.EJECUTAR);}
{CORCHETE_FIN} {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.CRF);}
{CORCHETE_INICIO} { System.out.println("tipo "+"“"+yytext()+"“");  symbol(sym.CRI);}
{COMA} {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.COMA);}

{DECIMAL}   {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.NUMBER, Double.parseDouble(yytext()));}
{TEXT}      {System.out.println("tipo "+"“"+yytext()+"“"); symbol(sym.TEXT, separador(yytext(),"“","”"));}


/* error fallback */
[^]                     { error("Simbolo invalido <"+ yytext()+">"); }
<<EOF>>                 {System.out.println("tipo de error:"+"“"+yytext()+"“"); return symbol(sym.EOF);}