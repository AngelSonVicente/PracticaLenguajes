/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalizadorSintactico;

import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import ModeloSintactico.ErrorSintactico;
import ModeloSintactico.Funciones;
import ModeloSintactico.ParametrosFuncion;
import ModeloSintactico.ResultadoAnalisis;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class FuncionMetodo {

    private ArrayList<Token> tokens;
    ArrayList<ResultadoAnalisis> errores = new ArrayList<ResultadoAnalisis>();

    private int cantidadParametros = 0;
    private int index;
    private int lineainical;
    private int columnainicial;
    private String nombre;
    private int columna;
    private boolean error = false;
    private boolean BMetodo = false;
    private boolean ErrorRETURN = false;
    private Funciones funcion;
    private ArrayList<ParametrosFuncion> ParametrosFuncion = new ArrayList<ParametrosFuncion>();

    public FuncionMetodo(ArrayList<Token> tokens, int index, int ColumnaAnterior) {
        this.tokens = tokens;
        this.index = index;
        this.columna = tokens.get(index).getColumna();
        this.lineainical = tokens.get(index).getLinea();
        this.columnainicial = tokens.get(index).getColumna();

    }

    public int analizar() {

        while (index < tokens.size()) {
            if (Estructura()) {
                //      System.out.println("Funcion Valido");
                funcion = new Funciones(nombre, lineainical, columnainicial);
                break;
            } else {

//              System.out.println("Error de sintaxis en la posición: " + index);
                ErrorSintactico errorsintactico = new ErrorSintactico("Error de sintaxis", tokens.get(index).getLinea(), tokens.get(index).getColumna());
                ResultadoAnalisis analisis = new ResultadoAnalisis(index, errorsintactico);
                errores.add(analisis);

                break;
            }
        }
        return index;
    }

    private boolean Estructura() {
        if (!FuncionMetodo()) {
            return false;
        } else {
            BloqueCodigo();

            RETURN();
            if (ErrorRETURN) {
                return false;
            } else {
                return true;
            }
        }
    }

    private boolean FuncionMetodo() {
        if (match("def") && Identificador() && (ExpresionParaetros() || ExpresionNOParaetros()) && matchTT(TipoToken.DosPuntos)) {
            BMetodo = true;
            return true;
        }
        return false;
    }

    private boolean Identificador() {
        if (matchTT(TipoToken.Identificador)) {
            nombre = tokens.get(index - 1).getLexeman();
            return true;
        }
        return false;
    }

    private boolean RETURN() {

        if (BMetodo) {
            if (match("return")) {

                if (expresion()) {
                    return true;
                } else {
                    ErrorRETURN = true;
                }
                return true;
            }
        }
        return false;
    }

    private boolean expresion() {
        return cadena() || arreglo() || multiplicacion() || matchTT(TipoToken.Constante) || matchTT(TipoToken.Boolean) || matchTT(TipoToken.Identificador);
    }

    private boolean cadena() {
        if (matchTT(TipoToken.Cadena)) {
            return true;
        }
        return false;
    }

    private boolean arreglo() {
        if (matchTT(TipoToken.CorchetesA)) {
            if (elementos_arreglo()) {
                return matchTT(TipoToken.CorchetesC);
            }
        }
        return false;
    }

    private boolean multiplicacion() {
        if (matchTT(TipoToken.Operador_Aritmetico) && matchTT(TipoToken.Constante)) {
            return true;
        }
        return false;
    }

    private boolean elementos_arreglo() {
        if (expresion()) {
            while (matchTT(TipoToken.Coma)) {
                if (!expresion()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean ExpresionParaetros() {
        if (matchTT(TipoToken.ParentesisA)) {
            if (Parametros()) {
                return matchTT(TipoToken.ParentesisC);
            } else {
                if (matchTT(TipoToken.CorchetesC)) {
                }
            }
        }
        return false;
    }

    private boolean ExpresionNOParaetros() {

        if (matchTT(TipoToken.ParentesisC)) {
            if (tokens.get(index - 2).getTipotoken() == TipoToken.Coma) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean Parametros() {

        if (matchTT(TipoToken.Identificador)) {
            cantidadParametros++;
            ParametrosFuncion parametro = new ParametrosFuncion(cantidadParametros, tokens.get(index-1).getLexeman());
            ParametrosFuncion.add(parametro);

            while (matchTT(TipoToken.Coma)) {
                if (!matchTT(TipoToken.Identificador)) {

                    return false;
                }
                cantidadParametros++;
                ParametrosFuncion parametroo = new ParametrosFuncion(cantidadParametros, tokens.get(index-1).getLexeman());
                ParametrosFuncion.add(parametroo);

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

    public Funciones getfuncion() {
        return funcion;
    }
    public ArrayList<ParametrosFuncion> getParametrosFuncion(){
    return ParametrosFuncion;
    }

    private void BloqueCodigo() {
        if (index < tokens.size()) {

            if (tokens.get(index).getColumna() > columna) {

                //     System.out.println("esta entrando a un bloque interno");
                Sintactico sintactico = new Sintactico(tokens, tokens.get(index).getColumna(), index, true);
                try {
                    errores.addAll(sintactico.analizar());

                } catch (Exception e) {
                }
                index = sintactico.getIndex();

            }
        }

    }

}
