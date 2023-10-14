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
public class CicloFor {

    ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

    private ArrayList<Token> tokens;
    private int index;
    private int columna;

    private boolean error = false;
    private boolean BFOR = false;
    private boolean ErrorELSE = false;

    public CicloFor(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.columna = tokens.get(index).getColumna();
        this.tokens = tokens;
        this.index = index;
    }

    public int analizar() {
        ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

        while (index < tokens.size()) {
            if (Estructura()) {
         //       System.out.println("For Valido");
                break;
            } else {

//                System.out.println("Error de sintaxis en la posición: " + index);
                ErrorSintactico errorsintactico = new ErrorSintactico("Error de sintaxis", tokens.get(index).getLinea(), tokens.get(index).getColumna());
                ResultadoAnalisis analisis = new ResultadoAnalisis(index, errorsintactico);
                errores.add(analisis);
                error = true;

                break;
            }
        }
        return index;
    }

    private boolean FOR() {
        if (match("for") && Expresion()) {
            BFOR = true;
            return true;
        }
        return false;
    }

    private boolean Estructura() {
        if (!FOR()) {
            return false;
        } else {

            BloqueCodigo();

            if (ELSE()) {
                BloqueCodigo();
            }
            if (ErrorELSE) {
                return false;
            } else {
                return true;
            }
        }
    }

    private boolean ELSE() {

        if (BFOR) {
            if (match("else")) {

                if (matchTT(TipoToken.DosPuntos)) {
                    return true;
                } else {
                    ErrorELSE = true;
                }
                return true;
            }
        }
        return false;
    }

    private boolean Expresion() {
        if (matchTT(TipoToken.Identificador) && match("in") && (ExpresionFuncionOIDent())) {
            return true;
        }
        return false;
    }

    private boolean ExpresionFuncionOIDent() {
        if ((matchTT(TipoToken.Identificador) && (matchTT(TipoToken.DosPuntos)) || ExpresionFuncion()) || ExpresionRango()) {
            return true;
        }
        return false;
    }

    private boolean ExpresionFuncion() {
        if (matchTT(TipoToken.ParentesisA) && matchTT(TipoToken.ParentesisC) && matchTT(TipoToken.DosPuntos)) {
            return true;
        }
        return false;
    }

    private boolean ExpresionRango() {
        if (match("range") && matchTT(TipoToken.ParentesisA) && (matchTT(TipoToken.Constante) || matchTT(TipoToken.Identificador)) && matchTT(TipoToken.Coma) && (matchTT(TipoToken.Constante) || matchTT(TipoToken.Identificador)) && matchTT(TipoToken.ParentesisC) && matchTT(TipoToken.DosPuntos)) {
            return true;
        }
        return false;
    }

    private boolean match(String lexema) {
        if (index < tokens.size() && tokens.get(index).getLexeman().equals(lexema)) {
            if ((lexema.equals("for") || lexema.equals("else")) && tokens.get(index).getColumna() == 1) {
                index++;
                return true;

            }
            if (lexema.equals("in") || lexema.equals("range")) {
                index++;
                return true;

            }
            return false;
        }
//        System.out.println("Expresion obtenida: " + tokens.get(index).getLexeman() + " Expresion Esperada: " + lexema);

        return false;
    }

    private boolean matchTT(TipoToken token) {
        if (index < tokens.size() && tokens.get(index).getTipotoken() == token) {
            index++;
            return true;
        }
        // System.out.println("Expresion obtenida: " + tokens.get(index).getTipotoken()+ " Expresion Esperada: " + token);

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
                int lastIndex = errores.size() - 1;
                if (lastIndex >= 0) {
                    index = errores.get(lastIndex).getNuevoIndex();
                }

            }
        }

    }

}
