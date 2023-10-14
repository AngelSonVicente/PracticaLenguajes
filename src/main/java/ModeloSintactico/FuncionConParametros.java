/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloSintactico;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class FuncionConParametros {
    private String nombre;
    private ArrayList<ParametrosFuncion> parametros;

    public FuncionConParametros() {
    }

    public FuncionConParametros(String nombre, ArrayList<ParametrosFuncion> parametros) {
        this.nombre = nombre;
        this.parametros = parametros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ParametrosFuncion> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<ParametrosFuncion> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "FuncionConParametros{" + "nombre=" + nombre + ", parametros=" + parametros.toString() + '}';
    }
    
    
}
