/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizador;

import ModeloLexico.Alfabeto;
import ModeloLexico.Coolor;
import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class ParserPy {
    Alfabeto alfabeto = new Alfabeto();
   IdentSimbolo IdenSim = new IdentSimbolo();
   
   ListaOperadores ListOperador = new ListaOperadores();
   
   private static  ArrayList<Operadores> ListaOperador = ListaOperadores.getLista();

  
  
   private static ArrayList<Coolor> ListaContenido = new ArrayList<>();
   
   
   private static ArrayList<Token> ListaToken = new ArrayList<>();
   private static ArrayList<Token> ListaErrores = new ArrayList<>();
  
    
       StringBuilder temporal = new StringBuilder();
       StringBuilder temporal2 = new StringBuilder();
    private  int linea;
    private  int columna;
    private  int Posicioncontenido;
    private String Path;
    private String contenido;
    int cont=0;
    int cont2=0;
    boolean comentario=false;
    boolean cadena=false;
    
    
        public boolean LeerArchivo(String contenido){
        this.contenido=contenido+"\nif";
    linea=0;
    columna=0;
    Posicioncontenido=0;
    return true;
    }
    
    
 
    
    public boolean FinalArchio(){
    if(Posicioncontenido>=contenido.length()){
        return true;
    }  
return false;
    }
    
    
    
        public ArrayList<Token>  getToken(){
            
            
            
                        
     
            
            
            
            
  
  //    IgnorarEspacios();  
        //ignorar espacio en blanco 
    temporal = new StringBuilder();
    //temporal2 = new StringBuilder();
    char CharActual = contenido.charAt(Posicioncontenido);
     // Alfabeto alfabeto=null;
  
  
    
   
         
        do{
          
            IgnorarEspacios();
            
            
            
        CharActual=contenido.charAt(Posicioncontenido);
     
             
    columna++;
    Posicioncontenido++;
    
    temporal.append(CharActual);
      // temporal2.append(CharActual);
    
    
    

            System.out.println(temporal+"\n\n");
            
//            System.out.println("temporal 2");
//            System.out.println(temporal2+"\n\n");
//            

            
             System.out.println(cont);
        
             
             
             
             if(CharActual=='#'){
                 
             comentario=true;
                 System.out.println("comentario: " + comentario+ "   linea: "+ linea+"  columna: "+columna );
             
             
             
             
             
             }else{
             
             
             
             if(CharActual == '"'|| CharActual == '\''){
                 cont++;
                 cont2=linea;
                 cadena=true;
                 
                 if(cont==2){
                     cadena=false;
                         // System.out.println("ya cerrooooooooo");
            Token tokencito = new Token(TipoToken.Cadena, linea,columna-temporal.length(),temporal.toString());
            ListaToken.add(tokencito);
//            Coolor color= new Coolor(temporal2.toString(),"anaranjado");
//            ListaContenido.add(color);
//            
            temporal.setLength(0);
           // temporal2.setLength(0);
            
             cont=0;
                  
                 
                 }
                 
            
                 
                 
                 
             
                 
                 
                 
                 
                 
             }else{
                 
               
                   for(Operadores operador : ListaOperador){
                                           
            String op=operador.getSimbolo();
           
            if(op.equals(temporal.toString())){
                
                Token tokencito = new Token(operador.getTipo(), linea,columna-temporal.length(),operador.getSimbolo());
            ListaToken.add(tokencito);
            temporal.setLength(0);
              
            
            }
            
           
                
            
            
     
            
            
            
        }
                 
             }
                          }

    
                }while(Posicioncontenido+1 <contenido.length());
        
    
       // }while(Posicioncontenido <contenido.length());

    return ListaToken;
    }
        
        
        public ArrayList<Token> getErrores(){
        
            
            
            return ListaErrores;
        }
        
        public ArrayList<Coolor> getColor(){
        
            
            
            return ListaContenido;
        }
    
    
    
        public void VerificarID(){
           if(!comentario){
               if(!temporal.isEmpty()){
                     
                   
                   if(alfabeto.EsIdentificador(temporal.toString().charAt(0))){
                           Token tokencito = new Token(TipoToken.Identificador, linea,columna,temporal.toString());
            ListaToken.add(tokencito);
            temporal.setLength(0);
            
            
//              Coolor colorcito= new Coolor(temporal2.toString(),"negro");
//             ListaContenido.add(colorcito);
//        
//            temporal2.setLength(0);
//            
                   
                   }else{
                      Token tokencito = new Token(TipoToken.Error, linea,columna-temporal.length(),temporal.toString());
            ListaErrores.add(tokencito);
            temporal.setLength(0);
            
//            Coolor colorcito= new Coolor(temporal2.toString(),"rojo");
//             ListaContenido.add(colorcito);
//        
//            temporal2.setLength(0);
//            
                   }
                   
                       
                
                 }
        }
        
        }
        
    public void IgnorarEspacios(){
    
        
        while(Posicioncontenido<contenido.length()){
        if(IdenSim.NuevaLinea(contenido.charAt(Posicioncontenido))){
          //  temporal2.append(contenido.charAt(Posicioncontenido));
           
        linea++;
        Posicioncontenido++;
        columna=0;
        
        
        
                 if(cont==1 && cont2!=linea){
           
                      Token tokencito = new Token(TipoToken.Error, linea,columna-temporal.length(),temporal.toString());
            ListaErrores.add(tokencito);
            temporal.setLength(0);
        
            
            cont=0;
            cont2=0;
            
            
                     
                 }
                 
                 
                 VerificarID();
                 if(comentario){
                     
                      Token tokencito = new Token(TipoToken.Comentario, linea,columna,temporal.toString());
            ListaToken.add(tokencito);
            temporal.setLength(0);
            
//              Coolor colorcito= new Coolor(temporal2.toString(),"gris");
//             ListaContenido.add(colorcito);
//        
//            temporal2.setLength(0);
//            
            
                 
                 }
                 //meter en metodo
          
                 
                 
                 
                 else{
                 if(!temporal.isEmpty()){
                     
                      
                          Token tokencito = new Token(TipoToken.Error, linea,columna-temporal.length(),temporal.toString());
            ListaErrores.add(tokencito);
            temporal.setLength(0);
//            
//                      Coolor colorcito= new Coolor(temporal2.toString(),"rojo");
//             ListaContenido.add(colorcito);
//        
//            temporal2.setLength(0);
//                
                 }
                 }
                 
           continue; 
        }
        
        if(IdenSim.EsEspacio(contenido.charAt(Posicioncontenido))){
               //temporal2.append(contenido.charAt(Posicioncontenido));
         
                if(comentario || cadena){
            temporal.append(contenido.charAt(Posicioncontenido));
            }
               
        Posicioncontenido++;
        columna++;
        
        if(!cadena){
             
         ClasificaEntDec(temporal.toString());
    VerificarID();
    
    
        }
        
        
        
        continue;
        
        }
        break;
        }
            
            
            
    }
    
    public void ClasificaEntDec(String numero){
        if(IdenSim.esNumeroEntero(numero)){
            
               Token tokencito = new Token(TipoToken.Entero, linea,columna,temporal.toString());
            ListaToken.add(tokencito);
            temporal.setLength(0);
            
//          Coolor colorcito= new Coolor(temporal2.toString(),"anaranjado");
//             ListaContenido.add(colorcito);
//        
//            temporal2.setLength(0);
//            
            //System.out.println("Es Entero");
        
        }
        
        if(IdenSim.esNumeroDecimal(numero)){
        
               Token tokencito = new Token(TipoToken.Decimal, linea,columna,temporal.toString());
            ListaToken.add(tokencito);
            temporal.setLength(0);
//            
//              Coolor colorcito= new Coolor(temporal2.toString(),"anaranjado");
//             ListaContenido.add(colorcito);
//        
//            temporal2.setLength(0);
//            
         //   System.out.println("Es Decimal");
            
     
            
            
        }
    
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


