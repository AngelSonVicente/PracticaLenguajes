/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloLexico;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Alfabeto {
    
    private static ArrayList<Character> alfabeto = new ArrayList<>();
    private static ArrayList<Character> alfabetoID = new ArrayList<>();
    
    
    
    static {
        
        alfabetoID.add('_');
          for (char c = 'a'; c <= 'z'; c++) {
            alfabeto.add(c);
            alfabetoID.add(c);
            
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alfabeto.add(c);
            alfabetoID.add(c);
        }
          for (char c = '0'; c <= '9'; c++) {
            alfabeto.add(c);
        }
             char[] specialCharacters = {'_', '.', '=', '+', '-', '*', '/', '<', '>', '!', '(', ')', '{', '}', '[', ']', ';', ',', '%','#'};
        for (char c : specialCharacters) {
            alfabeto.add(c);
        }
        
     
        
        
        
       }
    
       
       
          public boolean EsSimboloAlfabeto(char caracter){ 
            return alfabeto.contains(caracter);
        }
          
          public boolean EsIdentificador(char caracter){
          
          return alfabetoID.contains(caracter);
          }
       
       
}
