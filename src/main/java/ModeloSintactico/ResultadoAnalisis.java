package ModeloSintactico;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class ResultadoAnalisis {

    private int nuevoIndex; // Nuevo índice en el ArrayList de tokens
    private ErrorSintactico error; // Lista de errores sintácticos

    public ResultadoAnalisis() {
    }

    public ResultadoAnalisis(int nuevoIndex, ErrorSintactico error) {
        this.nuevoIndex = nuevoIndex;
        this.error = error;
    }

    public int getNuevoIndex() {
        return nuevoIndex;
    }

    public void setNuevoIndex(int nuevoIndex) {
        this.nuevoIndex = nuevoIndex;
    }

    public ErrorSintactico getError() {
        return error;
    }

    public void setError(ErrorSintactico error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return  error.toString();
    }
     
   




}
