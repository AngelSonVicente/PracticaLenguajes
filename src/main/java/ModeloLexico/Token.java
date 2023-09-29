/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloLexico;

/**
 *
 * @author MSI
 */
public class Token {
    
    private TipoToken tipotoken;
    
    private int linea;
    private int columna;
    private String Lexema;

    public Token() {
    }

    public Token(TipoToken tipotoken, int linea, int columna, String Lexema) {
        this.tipotoken = tipotoken;
        this.linea = linea;
        this.columna = columna;
        this.Lexema = Lexema;
    }


    public TipoToken getTipotoken() {
        return tipotoken;
    }

    public void setTipotoken(TipoToken tipotoken) {
        this.tipotoken = tipotoken;
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

    public String getLexeman() {
        return Lexema;
    }

    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }

    @Override
    public String toString() {
        return "Token{" + "tipotoken=" + tipotoken + ", linea=" + linea + ", columna=" + columna + ", Lexema=" + Lexema + '}';
    }

    
    
    
    
    
    
    
    
    



    
}


