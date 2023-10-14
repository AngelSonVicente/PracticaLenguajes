/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalizadorSintactico;

import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import ModeloSintactico.ErrorSintactico;
import ModeloSintactico.FuncionConParametros;
import ModeloSintactico.Funciones;
import ModeloSintactico.Instruccion;
import ModeloSintactico.ResultadoAnalisis;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Sintactico {

    private ArrayList<Token> tokens;
    private ArrayList<ResultadoAnalisis> errores;
    private ArrayList<Funciones> funciones= new ArrayList<Funciones>();
    private ArrayList<FuncionConParametros> funcionyParametros= new ArrayList<FuncionConParametros>();
    
    private int index;
    private int columna;
    private boolean bloque;

    public Sintactico(ArrayList<Token> tokens, int columna, int index, boolean bloque) {
        errores = new ArrayList<ResultadoAnalisis>();
        this.tokens = tokens;
        this.index = index;
        this.columna = columna;
        this.bloque = bloque;

    }

    public ArrayList<ResultadoAnalisis> analizar() {
        
        
        boolean terminar = false;
        if (tokens.get(index).getColumna() != columna) {
            SiguienteLinea(true);
        }

//        System.out.println("tamaño array: " + tokens.size());
//        System.out.println(tokens.get(index).getLexeman());
//        System.out.println("index: " + index);
//        System.out.println("Columna:  " + columna);
        while (index < tokens.size()) {
            if (tokens.get(index).getColumna() == columna) {

                if (tokens.get(index).getLexeman().equals("if")) {
                    // System.out.println("Entro en el if del if ");

                    CondicionIF CondicionIF = new CondicionIF(tokens, index, columna);
                    ArrayList<ResultadoAnalisis> analisis = new ArrayList<ResultadoAnalisis>();
                    index = CondicionIF.analizar();

                    analisis = CondicionIF.getAnalisis();

                    AgregarArray(analisis);

                    SiguienteLinea(CondicionIF.getError());

                    //llamar condicion if 
                } else {

                    if (tokens.get(index).getLexeman().equals("for")) {

                        CicloFor ciclofor = new CicloFor(tokens, index, columna);
                        ArrayList<ResultadoAnalisis> analisis = new ArrayList<ResultadoAnalisis>();
                        index = ciclofor.analizar();

                        analisis = ciclofor.getAnalisis();
                        AgregarArray(analisis);

                        SiguienteLinea(ciclofor.getError());

                    } else {
                        if (tokens.get(index).getLexeman().equals("while")) {

                            CicloWhile ciclowhile = new CicloWhile(tokens, index, columna);
                            ArrayList<ResultadoAnalisis> analisis = new ArrayList<ResultadoAnalisis>();
                            index = ciclowhile.analizar();

                            analisis = ciclowhile.getAnalisis();
                            AgregarArray(analisis);

                            SiguienteLinea(ciclowhile.getError());

                        } else {
                            if (tokens.get(index).getLexeman().equals("def")) {
                                if(bloque){
                                    SiguienteLinea(true);
                                }else{
                                FuncionMetodo funcion = new FuncionMetodo(tokens, index, columna);
                                ArrayList<ResultadoAnalisis> analisis = new ArrayList<ResultadoAnalisis>();
                                index = funcion.analizar();

                                analisis = funcion.getAnalisis();
                                AgregarArray(analisis);
                                boolean errorfuncion =funcion.getError();
                                if(!errorfuncion){
                                    Funciones funcioncita =funcion.getfuncion(); 
                                    FuncionConParametros  Parametros = new FuncionConParametros(funcioncita.getNombre(), funcion.getParametrosFuncion());
                                    funcionyParametros.add(Parametros);
                                funciones.add(funcioncita);
                                
                               
                                
                                }
                                System.out.println("Cantidad de funciones: "+ funciones.size());
                                System.out.println("Parametros Funcion: : "+ funcionyParametros.toString());
                                
                                
                                SiguienteLinea(errorfuncion);
                                
                                
                                
                                
                                }

                                

                            } else {
                                if (tokens.get(index).getTipotoken() == TipoToken.Identificador) {
                                    AsignacionDeclaracion asignacion = new AsignacionDeclaracion(tokens, index, columna);
                                    ArrayList<ResultadoAnalisis> analisis = new ArrayList<ResultadoAnalisis>();
                                   int indexprovicional = asignacion.analizar();
                                    
                                    analisis = asignacion.getAnalisis();
                                    AgregarArray(analisis);

                                    boolean error =asignacion.getError();
                                    if(error){
                                        OperadorTernario ternario = new OperadorTernario(tokens,index,columna);
                                  int indextemporal = ternario.analizar();
                                  boolean errorternario=ternario.getError();
                               
                                  if(errorternario){
                                    SiguienteLinea(error);
                                  }else{
                                  
                                  index=indextemporal;
                                  }
                                    
                                    }else{
                                    index=indexprovicional;
                                    }

                                } else {

                                    if (tokens.get(index).getLexeman().equals("print")) {
                                        Print print = new Print(tokens, index, columna);
                                        ArrayList<ResultadoAnalisis> analisis = new ArrayList<ResultadoAnalisis>();
                                        index = print.analizar();

                                        analisis = print.getAnalisis();
                                        AgregarArray(analisis);

                                        SiguienteLinea(print.getError());
                                    } else {
                                        SiguienteLinea(true);

                                        //saltarse a la siguiente linea y marcarlo como error   
                                    }

                                }

                            }

                        }

                    }

                }

            } else {

                if (bloque) {
                    break;
                } else {

                    SiguienteLinea(true);
                }

            }

        }


        return errores;
    }

    private void SiguienteLinea(boolean error) {
        int linea = tokens.get(index).getLinea();
        if (error) {

            ErrorSintactico errorsintactico = new ErrorSintactico("Error Sintactico", tokens.get(index).getLinea(), tokens.get(index).getColumna());
            ResultadoAnalisis resultadoanalisis = new ResultadoAnalisis(index, errorsintactico);
            errores.add(resultadoanalisis);
            while (index < tokens.size()) {

                index++;
                if (tokens.get(index).getLinea() > linea) {
                    break;

                }

            }

        }

    }

    public int getIndex() {
        return index;
    }

    public ArrayList<ResultadoAnalisis> getErroresSintacticos() {
        return errores;
    }
    public ArrayList<Funciones> getFunciones(){
    return funciones;
    }

    public void AgregarArray(ArrayList<ResultadoAnalisis> resultado) {
        try {
            errores.addAll(resultado);

                    for (ResultadoAnalisis resultadoo : resultado) {

                System.out.println(resultadoo.toString());

            }

        } catch (Exception e) {

        }

        
    }

}
