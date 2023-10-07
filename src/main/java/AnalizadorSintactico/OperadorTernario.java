/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalizadorSintactico;

import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class OperadorTernario {

    private ArrayList<Token> tokens;
    private int index;

    public OperadorTernario(ArrayList<Token> tokens) {
        this.tokens = tokens;
        this.index = 0;
    }

    public void analizar() {
        while (index < tokens.size()) {
            if (Opternario()) {
                System.out.println("Operador ternario válido");
            } else {
                System.out.println("Error de sintaxis en la posición: " + index);
                break;
            }
        }
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

        System.out.println("Expresion obtenida: " + tokens.get(index).getLexeman() + " Expresion Esperada: " + lexema);
        return false;
    }

    private boolean matchTT(TipoToken token) {
        if (index < tokens.size() && tokens.get(index).getTipotoken() == token) {
            index++;
            return true;
        }
        System.out.println("Expresion obtenida: " + tokens.get(index).getTipotoken() + " Expresion Esperada: " + token);

        return false;
    }

}
