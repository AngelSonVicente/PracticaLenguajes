package ModeloSintactico;

/**
 *
 * @author MSI
 */
public class ErrorSintactico {

    private String descripcion;
    private int linea;
    private int columna;

    public ErrorSintactico(String descripcion, int linea, int columna) {
        this.descripcion = descripcion;
        this.linea = linea;
        this.columna = columna;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "ErrorSintactico{" + "descripcion=" + descripcion + ", linea=" + linea + ", columna=" + columna + '}';
    }
    
    
    
    

}
