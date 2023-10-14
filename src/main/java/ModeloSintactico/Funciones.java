/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloSintactico;

/**
 *
 * @author MSI
 */
public class Funciones {
    private String nombre;
    private int linea;
    private int columna;

    public Funciones() {
    }

    public Funciones(String nombre, int linea, int columna) {
        this.nombre = nombre;
        this.linea = linea;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
}
