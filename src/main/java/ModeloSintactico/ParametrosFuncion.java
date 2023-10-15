/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloSintactico;

/**
 *
 * @author MSI
 */
public class ParametrosFuncion {
    private int posicion;
    private String nombre;

    public ParametrosFuncion() {
    }

    public ParametrosFuncion(int posicion, String nombre) {
        this.posicion = posicion;
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" + "posicion=" + posicion + ", nombre=" + nombre + '}';
    }
     
    
}
