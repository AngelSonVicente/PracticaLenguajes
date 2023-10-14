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
public class OperadorTernario {

    private ArrayList<Token> tokens;
      ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();
    private int index;
    private int columna;
    private boolean error=false;


    public OperadorTernario(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.tokens = tokens;
        this.index = index;
           this.columna = tokens.get(index).getColumna();

    }

    public int analizar() {
        ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

        while (index < tokens.size()) {
            if (Opternario()) {
                System.out.println("Operador ternario válido");
                
                
                break;
            } else {
                    System.out.println("Error de sintaxis en la posición: " + index);
                ErrorSintactico errorsintactico = new ErrorSintactico("Error de sintaxis", tokens.get(index).getLinea(), tokens.get(index).getColumna());
                ResultadoAnalisis analisis = new ResultadoAnalisis(index, errorsintactico);
                errores.add(analisis);
                error=true;

                break;
            }
        }
        return index;
    }

    private boolean Opternario() {
        if (declaracion() && (IF() || IFNOT()) && ELSE()) {
            return true;
        }
        return false;
    }

    private boolean ELSE() {
        if (match("else") && expresion()) {
            return true;
        }
        return false;
    }

    private boolean IFNOT() {
        if (match("not") && (matchTT(TipoToken.Identificador) || matchTT(TipoToken.Boolean))) {
            return true;
        }
        return false;
    }

    private boolean IF() {
        if (match("if") && (matchTT(TipoToken.Identificador) || matchTT(TipoToken.Boolean))) {
            return true;
        }
        return false;
    }

    private boolean declaracion() {
        if (matchTT(TipoToken.Identificador) && matchTT(TipoToken.Asignacion) && expresion()) {
            return true;
        }
        return false;
    }

    private boolean expresion() {
        return matchTT(TipoToken.Cadena) || matchTT(TipoToken.Constante) || matchTT(TipoToken.Boolean);
    }

    private boolean match(String lexema) {
        if (index < tokens.size() && tokens.get(index).getLexeman().equals(lexema)) {
            index++;

            return true;

        }

       // System.out.println("Expresion obtenida: " + tokens.get(index).getLexeman() + " Expresion Esperada: " + lexema);
        return false;
    }

    private boolean matchTT(TipoToken token) {
        if (index < tokens.size() && tokens.get(index).getTipotoken() == token) {
            index++;
            return true;
        }
      //  System.out.println("Expresion obtenida: " + tokens.get(index).getTipotoken() + " Expresion Esperada: " + token);

        return false;
    }
    
    
    public ArrayList<ResultadoAnalisis> getAnalisis() {
        return errores;
    }
    
    public boolean getError() {
        return error;
    }


}
