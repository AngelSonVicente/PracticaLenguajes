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
public class FuncionMetodo {
      
    private ArrayList<Token> tokens;
    private int index;
    private boolean BMetodo=false;
    private boolean ErrorRETURN=false;

    public FuncionMetodo(ArrayList<Token> tokens) {
        this.tokens = tokens;
        this.index = 0;
    }

    public void analizar() {
        while (index < tokens.size()) {
            if (Estructura()) {
                System.out.println("Funcion Valido");
            } else {
                
                System.out.println("Error de sintaxis en la posición: " + index);
                break;
            }
        }
    }
    
    
    private boolean Estructura(){
      if(!FuncionMetodo()){
          return false;
      }else{
       RETURN();
        if( ErrorRETURN){
            return false;
        }else{
        return true;
        }
      }
            }
    
    
        private boolean FuncionMetodo() {
        if (match("def") && matchTT(TipoToken.Identificador)&&( ExpresionParaetros() || ExpresionNOParaetros())&& matchTT(TipoToken.DosPuntos)) {
           BMetodo=true;
            return true;
        }
        return false;
    }
        
        
        
             private boolean RETURN() {

        if(BMetodo){
            if (match("return")) {
                
                if( expresion() ){
                return true;
                }else{
                 ErrorRETURN=true;
                }
                return true;
            }
        }
        return false;
    }
    
       private boolean expresion() {
        return  cadena() || arreglo() || multiplicacion() || matchTT(TipoToken.Constante )||matchTT(TipoToken.Boolean) || matchTT(TipoToken.Identificador);
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
            }else{
            if(matchTT(TipoToken.CorchetesC)){
            }
            }
        }
        return false;
    }
        private boolean ExpresionNOParaetros() {
            
        if ( matchTT(TipoToken.ParentesisC)) {
            if(tokens.get(index-2).getTipotoken() == TipoToken.Coma){
                return false;
            }else{
          return true;
            }
        }
        return false;
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
            if (lexema.equals("def")&&tokens.get(index).getColumna() == 1) {
                index++;
              
                return true;
                

            }
            
            if(lexema.equals("return") && tokens.get(index).getColumna() != 1){
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
}
