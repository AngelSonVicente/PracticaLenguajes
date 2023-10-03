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
public class CicloWhile {
    
    private ArrayList<Token> tokens;
    private int index;

    public CicloWhile(ArrayList<Token> tokens) {
        this.tokens = tokens;
        this.index =0;
    }
    
    
    
    
    
    public void analizar() {
        while (index < tokens.size()) {
            if (WHILE()) {
                System.out.println("While Valido");
            } else {
                
                System.out.println("Error de sintaxis en la posición: " + index);
                break;
            }
        }
    }
    
        private boolean WHILE() {
        if (match("while") && Expresion() && matchTT(TipoToken.DosPuntos)) {
            return true;
        }
        return false;
    }
        
        
    private boolean Expresion() {
        if ((ExpresionComparacion()||ExpresionBoolean())) {
            return true;
        }
        return false;
    }
    
    private boolean ExpresionBoolean() {
        if ((matchTT(TipoToken.Boolean) )) {
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
    
    
}
