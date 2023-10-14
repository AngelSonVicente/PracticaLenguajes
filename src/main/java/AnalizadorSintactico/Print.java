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
public class Print {
    

    private ArrayList<Token> tokens;
    ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

    private int index;
    private int columna;
    private boolean error = false;
    private boolean BMetodo = false;
    private boolean ErrorRETURN = false;

    public Print(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.tokens = tokens;
        this.index = index;
            this.columna = tokens.get(index).getColumna();

    }

    public int analizar() {
    
        while (index < tokens.size()) {
            if (print()) {
              //  System.out.println("Print Valido");
                break;
            } else {

         //     System.out.println("Error de sintaxis en la posición: " + index);
                ErrorSintactico errorsintactico = new ErrorSintactico("Error de sintaxis", tokens.get(index).getLinea(), tokens.get(index).getColumna());
                ResultadoAnalisis analisis = new ResultadoAnalisis(index, errorsintactico);
                errores.add(analisis);
                error=true;

                break;
            }
        }
        return index;
    }

    

    private boolean print() {
        if (match("print") && matchTT(TipoToken.ParentesisA) && expresion() && matchTT(TipoToken.ParentesisC)) {
            BMetodo = true;
            return true;
        }
        return false;
    }


    private boolean expresion() {
        return matchTT(TipoToken.Cadena) || matchTT(TipoToken.Boolean) || matchTT(TipoToken.Identificador) || matchTT(TipoToken.Constante) ;
    }

  

    private boolean Parametros() {

        if (matchTT(TipoToken.Identificador)) {
            while (matchTT(TipoToken.Coma)) {
                if (!matchTT(TipoToken.Identificador)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private boolean match(String lexema) {
        if (index < tokens.size() && tokens.get(index).getLexeman().equals(lexema)) {
            if (lexema.equals("def") && tokens.get(index).getColumna() == 1) {
                index++;

                return true;

            }

            if (lexema.equals("return") && tokens.get(index).getColumna() != 1) {
                index++;

                return true;
            }

            return false;
        }
        //  System.out.println("Expresion obtenida: " + tokens.get(index).getLexeman() + " Expresion Esperada: " + lexema);

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
    
}
