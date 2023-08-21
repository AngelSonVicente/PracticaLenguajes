/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizador;

import ModeloLexico.TipoToken;

/**
 *
 * @author MSI
 */
public class Operadores {


    private String simbolo; 
    private String Nombre;
    private TipoToken tipo;

    public Operadores() {
    }

    public  Operadores(String simbolo, String Nombre, TipoToken tipo) {
        this.simbolo = simbolo;
        this.Nombre = Nombre;
        this.tipo = tipo;
    }
    
    
    

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public TipoToken getTipo() {
        return tipo;
    }

    public void setTipo(TipoToken tipo) {
        this.tipo = tipo;
    }

  

    
    

    
    
}
