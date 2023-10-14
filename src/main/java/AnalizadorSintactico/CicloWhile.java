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
public class CicloWhile {

    ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

    private ArrayList<Token> tokens;
    private int index;
    private int columna;
    private boolean error=false;

    
    public CicloWhile(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.tokens = tokens;
        this.index = index;
          this.columna = tokens.get(index).getColumna();

    }

    public int analizar() {
     
        while (index < tokens.size()) {
            if (WHILE()) {
         //       System.out.println("While Valido");
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
        return index;
    }

    private boolean Estructura() {
        if (!WHILE()) {

            return false;
            }else{
            BloqueCodigo();
            
            
        return true;
        }
    }
    private boolean WHILE() {
        if (match("while") && Expresion() && matchTT(TipoToken.DosPuntos)) {
            return true;
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
            if (tokens.get(index).getColumna() == 1) {
                index++;
                return true;

            }
            return false;
        }
        //   System.out.println("Expresion obtenida: " + tokens.get(index).getLexeman() + " Expresion Esperada: " + lexema);
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
        if (index < tokens.size()) {

            if (tokens.get(index).getColumna() > columna) {

           //     System.out.println("esta entrando a un bloque interno");

                Sintactico sintactico = new Sintactico(tokens, tokens.get(index).getColumna(), index,true);
                try {
                    errores.addAll(sintactico.analizar());

                } catch (Exception e) {
                }
                           index=sintactico.getIndex();


            }
        }

    }

}
