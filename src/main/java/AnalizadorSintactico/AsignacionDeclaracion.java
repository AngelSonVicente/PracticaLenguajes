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
import java.util.List;

/**
 *
 * @author MSI
 */
public class AsignacionDeclaracion {

    private ArrayList<Token> tokens;
       ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

    private int index;
    private int columna;
    private boolean error=false;

    public AsignacionDeclaracion(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.tokens = tokens;
        this.index = index;
        this.columna = tokens.get(index).getColumna();

    }

    public int analizar() {
      
        while (index < tokens.size()) {
            if (asignacionMultiple() || declaracion()) {
        //        System.out.println("Asignación o declaración válida");
                break;
            } else {
        //          System.out.println("Error de sintaxis en la posición: " + index);
                ErrorSintactico errorsintactico = new ErrorSintactico("Error de sintaxis", tokens.get(index).getLinea(), tokens.get(index).getColumna());
                ResultadoAnalisis analisis = new ResultadoAnalisis(index, errorsintactico);
                errores.add(analisis);
                error=true;

              
                break;
            }
        }
        return index;
    }

    private boolean declaracion() {
        if (match(TipoToken.Identificador) && match(TipoToken.Asignacion) && expresion()) {
            return true;
        }
        return false;
    }

    private boolean asignacionMultiple() {
        if (match(TipoToken.Identificador)) {
            while (match(TipoToken.Coma)) {

                if (!match(TipoToken.Identificador)) {
                    return false;
                }
            }

            if (match(TipoToken.Asignacion)) {
                if (expresion()) {
                    while (match(TipoToken.Coma)) {

                        if (!expresion()) {
                            return false;
                        }
                    }
                    return true;

                }
            }
        }

        return false;
    }

    private boolean cadena() {
        if (match(TipoToken.Cadena)) {
            return true;
        }
        return false;
    }

    private boolean arreglo() {
        if (match(TipoToken.CorchetesA)) {
            if (elementos_arreglo()) {
                return match(TipoToken.CorchetesC);
            }
        }
        return false;
    }

    private boolean elementos_arreglo() {
        if (expresion()) {
            while (match(TipoToken.Coma)) {
                if (!expresion()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean multiplicacion() {
        if (match(TipoToken.Operador_Aritmetico) && match(TipoToken.Constante)) {
            return true;
        }
        return false;
    }

    private boolean expresion() {
        return cadena() || arreglo() || multiplicacion() || match(TipoToken.Constante) || match(TipoToken.Boolean);
    }

    private boolean match(TipoToken tipoEsperado) {
        if (index < tokens.size() && tokens.get(index).getTipotoken() == tipoEsperado) {
            index++;
            return true;
        }
        return false;
    }
    
    public ArrayList<ResultadoAnalisis> getAnalisis() {
        return errores;
    }
    public boolean getError(){
    return error;
    }


}
