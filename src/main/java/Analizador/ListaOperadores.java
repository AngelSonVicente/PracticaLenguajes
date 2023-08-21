/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizador;

import ModeloLexico.TipoToken;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class ListaOperadores {
    
    private static ArrayList<Operadores> Lista = new ArrayList<>();
   
    static{
   
        AsignarOperadores("+","Suma",TipoToken.Operador_Aritmetico);
        AsignarOperadores("-","Resta",TipoToken.Operador_Aritmetico);
        AsignarOperadores("**","Exponente",TipoToken.Operador_Aritmetico);
        AsignarOperadores("/","Division",TipoToken.Operador_Aritmetico);
        AsignarOperadores("//","Division",TipoToken.Operador_Aritmetico);
        AsignarOperadores("%","Modulo",TipoToken.Operador_Aritmetico);
        AsignarOperadores("*","Multiplicacion",TipoToken.Operador_Aritmetico);
        
        AsignarOperadores("==","Igual",TipoToken.Operador_Comparacion);
        AsignarOperadores("!=","Diferente",TipoToken.Operador_Comparacion);
        AsignarOperadores(">","Mayor que",TipoToken.Operador_Comparacion);
        AsignarOperadores("<","Menor que",TipoToken.Operador_Comparacion);
        AsignarOperadores(">=","Mayor o igual que",TipoToken.Operador_Comparacion);
        AsignarOperadores("<=","Menor o Igual que",TipoToken.Operador_Comparacion);
        
        AsignarOperadores("=","Asignacion",TipoToken.Asignacion);
        
        AsignarOperadores("and","and",TipoToken.Palabra_Reservada);
        AsignarOperadores("as","as",TipoToken.Palabra_Reservada);
        AsignarOperadores("assert","assert",TipoToken.Palabra_Reservada);
        AsignarOperadores("break","break",TipoToken.Palabra_Reservada);
        AsignarOperadores("class","class",TipoToken.Palabra_Reservada);
        AsignarOperadores("continue","continue",TipoToken.Palabra_Reservada);
        AsignarOperadores("def","def",TipoToken.Palabra_Reservada);
        AsignarOperadores("del","del",TipoToken.Palabra_Reservada);
        AsignarOperadores("elif","elif",TipoToken.Palabra_Reservada);
        AsignarOperadores("else","else",TipoToken.Palabra_Reservada);
        AsignarOperadores("except","except",TipoToken.Palabra_Reservada);
        AsignarOperadores("False","False",TipoToken.Palabra_Reservada);
        AsignarOperadores("finally","finally",TipoToken.Palabra_Reservada);
        AsignarOperadores("for","for",TipoToken.Palabra_Reservada);
        AsignarOperadores("from","from",TipoToken.Palabra_Reservada);
        AsignarOperadores("global","global",TipoToken.Palabra_Reservada);
        AsignarOperadores("if","if",TipoToken.Palabra_Reservada);
        AsignarOperadores("import","import",TipoToken.Palabra_Reservada);
        AsignarOperadores("in","in",TipoToken.Palabra_Reservada);
        AsignarOperadores("lambda","lambda",TipoToken.Palabra_Reservada);
        AsignarOperadores("is","is",TipoToken.Palabra_Reservada);
        AsignarOperadores("None","None",TipoToken.Palabra_Reservada);
        AsignarOperadores("nonlocal","nonlocal",TipoToken.Palabra_Reservada);
        AsignarOperadores("not","not",TipoToken.Palabra_Reservada);
        AsignarOperadores("or","or",TipoToken.Palabra_Reservada);
        AsignarOperadores("pass","pass",TipoToken.Palabra_Reservada);
        AsignarOperadores("raise","raise",TipoToken.Palabra_Reservada);
        AsignarOperadores("return","return",TipoToken.Palabra_Reservada);
        AsignarOperadores("True","True",TipoToken.Palabra_Reservada);
        AsignarOperadores("try","try",TipoToken.Palabra_Reservada);
        AsignarOperadores("while","while",TipoToken.Palabra_Reservada);
        AsignarOperadores("with","with",TipoToken.Palabra_Reservada);
        AsignarOperadores("yield","yield",TipoToken.Palabra_Reservada);
        
        
        AsignarOperadores("True","True",TipoToken.Boolean);
        AsignarOperadores("False","False",TipoToken.Palabra_Reservada);
        
        AsignarOperadores("#","Comentario",TipoToken.Comentario );
        
        AsignarOperadores("(","Parentesis Abierto",TipoToken.Parentesis);
        AsignarOperadores(")","Parentesis Cerrado",TipoToken.Parentesis);
        
        
        AsignarOperadores("{","Llave Abierta",TipoToken.Llaves);
        AsignarOperadores("}","Llave cerrada",TipoToken.Llaves);
        
        
        AsignarOperadores("[","Corchete Abierto",TipoToken.Llaves);
        AsignarOperadores("]","Corchete cerrado",TipoToken.Llaves);
        
        
        AsignarOperadores(",","Coma",TipoToken.Coma);
        AsignarOperadores(";","Punto y Coma",TipoToken.PuntoComa);
        AsignarOperadores(":","Dos puntos",TipoToken.DosPuntos);
        
        
        
        
        
    }
    
    private static void AsignarOperadores(String Simbolo, String Nombre, TipoToken token){
        Operadores operador = new Operadores(Simbolo,Nombre,token);
        Lista.add(operador);
       
    }
    
       public static ArrayList<Operadores> getLista(){   
        return Lista;
    }
    
    
    
    
    
    
}
