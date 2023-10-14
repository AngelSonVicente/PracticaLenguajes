/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalizadorSintactico;

import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import ModeloSintactico.ErrorSintactico;
import ModeloSintactico.ResultadoAnalisis;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class CondicionIF {

    private ArrayList<Token> tokens;
    ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

    private int index;
    private int columna;
    private boolean error = false;
    private boolean BIF = false;
    private boolean ErrorELIF = false;
    private boolean ErrorELSE = false;

    public CondicionIF(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.tokens = tokens;
        this.index = index;
        this.columna = tokens.get(index).getColumna();

//        System.out.println("Columna " + columna);
//        System.out.println("Columna Token " + tokens.get(index).getColumna());
    }

    public int analizar() {
        // System.out.println("entro al analizar del if ");
        while (index < tokens.size()) {
            if (Estructura()) {
        //        System.out.println("IF Valido");
                //ResultadoAnalisis analisis = new ResultadoAnalisis(index, new ErrorSintactico("no hay",  tokens.get(index).getLinea(), tokens.get(index).getColumna()));

                //      errores.add(analisis);
                break;
            } else {

         //       System.out.println("Error de sintaxis en la posición: " + index);
                ErrorSintactico errorsintactico = new ErrorSintactico("Error de sintaxis", tokens.get(index).getLinea(), tokens.get(index).getColumna());
                ResultadoAnalisis analisis = new ResultadoAnalisis(index, errorsintactico);
                errores.add(analisis);
                error=true;

                break;
            }
        }

    //    System.out.println("Index Retornado: "+ index);
        return index;
    }

    private boolean Estructura() {
        if (!IF()) {
            return false;
        } else {

            //bloque de codigo
            BloqueCodigo();

            if (ELIF()) {

                BloqueCodigo();
            }
            if (ELSE()) {
                BloqueCodigo();
            }

            if (ErrorELIF || ErrorELSE) {
                return false;
            } else {
                return true;
            }
        }

    }

    private boolean IF() {

        //   System.out.println("Esta entrando a la evaluacion del if ");
        if (match("if") && Expresion() && matchTT(TipoToken.DosPuntos)) {
            BIF = true;
            return true;
        }
        return false;
    }

    private boolean ELIF() {

        if (BIF) {

            if (match("elif")) {

                if (Expresion() && matchTT(TipoToken.DosPuntos)) {
                    return true;
                } else {

                    ErrorELIF = true;
                }
            } else {
                ErrorELIF = false;
                return true;
            }
        }

        return false;
    }

    private boolean ELSE() {

        if (BIF) {
            if (match("else")) {
                if (matchTT(TipoToken.DosPuntos)) {
                    return true;
                } else {
                    ErrorELSE = true;
                }
                return true;
            } else {
                ErrorELSE = false;
                return true;

            }
        }
        return false;
    }

    private boolean Expresion() {
        if ((ExpresionComparacion() || ExpresionBoolean())) {
            return true;
        }
        return false;
    }

    private boolean ExpresionBoolean() {
        if ((matchTT(TipoToken.Boolean))) {
            return true;
        }
        return false;
    }

    private boolean ExpresionComparacion() {
        //  System.out.println("token con pedo:  "+ tokens.get(index).getLexeman());

        if ((matchTT(TipoToken.Identificador) || matchTT(TipoToken.Constante)) && Condicional() && (matchTT(TipoToken.Identificador) || matchTT(TipoToken.Constante))) {
            return true;
        }
        return false;
    }

    private boolean Condicional() {
        if (matchTT(TipoToken.Operador_Comparacion) || matchTT(TipoToken.Operador_Logico)) {
            return true;
        }
        return false;
    }

    private boolean match(String lexema) {
        if (index < tokens.size() && tokens.get(index).getLexeman().equals(lexema)) {
            if (tokens.get(index).getColumna() == columna) {
                index++;
                return true;

            }
            return false;
        }
           // System.out.println("Expresion obtenida: " + tokens.get(index).getLexeman() + " Expresion Esperada: " + lexema);
        return false;
    }

    private boolean matchTT(TipoToken token) {
        if (index < tokens.size() && tokens.get(index).getTipotoken() == token) {
            index++;
            return true;
        }
        return false;
    }

    public ArrayList<ResultadoAnalisis> getAnalisis() {
        return errores;
    }
    
    public boolean getError() {
        return error;
    }

    private void BloqueCodigo() {
      
            if (tokens.get(index).getColumna() > columna) {

            //    System.out.println("esta entrando a un bloque interno");

                Sintactico sintactico = new Sintactico(tokens, tokens.get(index).getColumna(), index,true);
                try {
                    errores.addAll(sintactico.analizar());
//                      for (ResultadoAnalisis resultado : errores) {
//
//                                        System.out.println(resultado.toString());
//
//                                    }

                } catch (Exception e) {
                }
                index=sintactico.getIndex();

            }
        

    }

}
