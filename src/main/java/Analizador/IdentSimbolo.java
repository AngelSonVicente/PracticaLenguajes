/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizador;

/**
 *
 * @author MSI
 */
class IdentSimbolo {
    
    
       
     public  boolean EsEspacio(char caracter) {
        return Character.isWhitespace(caracter) || NuevaLinea(caracter);
    }
     
     public static boolean NuevaLinea(char caracter) {
        return caracter == '\n' || caracter == '\r';
    }
     
     public static boolean esNumeroEntero(String numero) {
    try {
        Integer.parseInt(numero);
        
       // System.out.println("Es entero");
        return true;
    } catch (NumberFormatException e) {
       // System.out.println("NO entero");
        return false;
    }
    
    
    
    
}
     
     
     public static boolean esNumeroDecimal(String numero) {
    try {
        Double.parseDouble(numero);
        
      //  System.out.println("es decimal");
        return true;
    } catch (NumberFormatException e) {
      //  System.out.println("No es decimal");
        return false;
    }
}
    
}
