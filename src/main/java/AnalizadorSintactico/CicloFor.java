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
public class CicloFor {
    
     private ArrayList<Token> tokens;
    private int index;

    private boolean BFOR=false;
    private boolean ErrorELSE=false;
    public CicloFor(ArrayList<Token> tokens ) {
        this.tokens = tokens;
        this.index = 0;
    }
    
    
      public void analizar() {
        while (index < tokens.size()) {
            if (Estructura()) {
                System.out.println("For Valido");
            } else {
                
                System.out.println("Error de sintaxis en la posición: " + index);
                break;
            }
        }
    }
    
        private boolean FOR() {
        if (match("for") && Expresion()) {
            BFOR=true;
            return true;
        }
        return false;
    }
        
        
            private boolean Estructura(){
      if(!FOR()){
          return false;
      }else{
       ELSE();
        if( ErrorELSE){
            return false;
        }else{
        return true;
        }
      }
            }
        
        
          private boolean ELSE() {

        if(BFOR){
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
        if (matchTT(TipoToken.Identificador)&& match("in")&&(ExpresionFuncionOIDent())) {
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
        if ( matchTT(TipoToken.ParentesisA) && matchTT(TipoToken.ParentesisC )&&matchTT(TipoToken.DosPuntos)) {
            return true;
        }
        return false;
    }
    
    private boolean ExpresionRango() {
        if ( match("range") && matchTT(TipoToken.ParentesisA) && (matchTT(TipoToken.Constante) || matchTT(TipoToken.Identificador)) && matchTT(TipoToken.Coma)&& (matchTT(TipoToken.Constante) || matchTT(TipoToken.Identificador))&& matchTT(TipoToken.ParentesisC) && matchTT(TipoToken.DosPuntos)) {
            return true;
        }
        return false;
    }
    
    
  

 
    
    
    
    private boolean match(String lexema) {
        if (index < tokens.size() && tokens.get(index).getLexeman().equals(lexema)) {
            if ((lexema.equals("for") || lexema.equals("else")) &&tokens.get(index).getColumna() == 1) {
                index++;
                return true;

            }
            if(lexema.equals("in")|| lexema.equals("range")){
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
  

    
}
