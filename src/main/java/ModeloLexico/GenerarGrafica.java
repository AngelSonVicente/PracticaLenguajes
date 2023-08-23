
package ModeloLexico;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Rank;
import guru.nidi.graphviz.attribute.Rank.RankDir;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.Node;
import guru.nidi.graphviz.model.Factory;
import guru.nidi.graphviz.parse.Parser;
import java.io.File;



public class GenerarGrafica {
    private String Lexema="try";
    
    
    
    
    
    
    
    
    
    
    

    public GenerarGrafica() {
    }

    public GenerarGrafica(String Lexema) {
        this.Lexema = Lexema;
    }

    
    public void GenerarGrafico(String Lex){
     
         String input = Lex; 

        String dotFileName = "automata.dot";

        try {
            StringBuilder dotContent = new StringBuilder("digraph G {  \n 	rankdir=LR;\n");
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(i==input.length()-1){
                dotContent.append("  ").append(i).append(" [label=\"").append(c).append("\", shape=doublecircle,width=0.15];\n");
                    
                }else{
                dotContent.append("  ").append(i).append(" [label=\"").append(c).append("\", shape=circle, width=0.15];\n");
                }
            }
            // dotContent.append("  ").append(lastIndex).append(" [label=\"\", shape=doublecircle, width=0.15];\n");
            for (int i = 0; i < input.length()-1; i++) {
                dotContent.append("  ").append(i).append(" -> ").append(i + 1).append(";\n");
            }
            dotContent.append("}\n");

            File dotFile = new File(dotFileName);
            java.nio.file.Files.write(dotFile.toPath(), dotContent.toString().getBytes());

            System.out.println("Archivo DOT generado con éxito: " + dotFileName);

            MutableGraph g = new Parser().read(dotFile);
            Graphviz.fromGraph(g).height(150).width(500).render(Format.PNG).toFile(new File("src/main/java/Imagenes/automata.png"));
            System.out.println("Imagen generada con éxito: automata.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
       
   
       
        
        
        
        
    }
    public String getLexema(){
        return Lexema;
    }

    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }
    
    
    
    
    
}
