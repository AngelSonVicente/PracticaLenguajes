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
public class CondicionIF {

    private ArrayList<Token> tokens;
    private int index;
    private boolean BIF=false;
    private boolean ErrorELIF=false;
    private boolean ErrorELSE=false;

    public CondicionIF(ArrayList<Token> tokens) {
        this.tokens = tokens;
        this.index = 0;
    }

    public void analizar() {
        while (index < tokens.size()) {
            if (Estructura()) {
                System.out.println("IF Valido");
            } else {
                
                System.out.println("Error de sintaxis en la posición: " + index);
                break;
            }
        }
    }
    
    private boolean Estructura(){
      if(!IF()){
          return false;
      }else{
          ELIF();
          ELSE();
        if( ErrorELIF || ErrorELSE){
            return false;
        }else{
        return true;
        }
      }
        
       
       
        
    
    }

    private boolean IF() {
        if (match("if") && Expresion() && matchTT(TipoToken.DosPuntos)) {
            BIF=true;
            return true;
        }
        return false;
    }

    private boolean ELIF() {
        

        if(BIF){
        
        
            if (match("elif")) {
                
                if(Expresion() && matchTT(TipoToken.DosPuntos)){
                return true;
                }else{
                
                ErrorELIF=true;
                }
            }
        }
        
        return false;
    }

    private boolean ELSE() {
      

        if(BIF){
            if (match("else")) {
                if( matchTT(TipoToken.DosPuntos)){
                return true;
                }else{
                 ErrorELSE=true;
                }
                return true;
            }
        }
        return false;
    }
    

    private boolean Expresion() {
        if ((ExpresionComparacion())) {
            return true;
        }
        return false;
    }

    private boolean ExpresionComparacion() {
        if ((matchTT(TipoToken.Identificador) || matchTT(TipoToken.Constante)) && matchTT(TipoToken.Operador_Comparacion) && (matchTT(TipoToken.Identificador) || matchTT(TipoToken.Constante))) {
            return true;
        }
        return false;
    }
    
    

    private boolean ExpresionIgualdad() {
        if ((matchTT(TipoToken.Constante) || matchTT(TipoToken.Identificador) || matchTT(TipoToken.Cadena) || matchTT(TipoToken.Boolean)) && matchTT(TipoToken.Operador_Comparacion) && (matchTT(TipoToken.Constante) || matchTT(TipoToken.Identificador) || matchTT(TipoToken.Cadena) || matchTT(TipoToken.Boolean))) {
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
