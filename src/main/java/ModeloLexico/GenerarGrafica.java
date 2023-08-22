
package ModeloLexico;



import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.io.GraphMLWriter;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import org.apache.commons.collections15.Transformer;
import org.apache.commons.collections15.functors.ConstantTransformer;
import org.apache.commons.collections15.map.LazyMap;
import org.apache.commons.collections15.map.LazyMap.Factory;
import org.apache.commons.collections15.map.LazyMap.MapFactory;


/**
 *
 * @author MSI
 */
public class GenerarGrafica {
    private String Lexema;
    
    
    
    
    
    
    
    
    
    
    

    public GenerarGrafica() {
    }

    public GenerarGrafica(String Lexema) {
        this.Lexema = Lexema;
    }

    
    
    
    
    public String getLexema() {
        return Lexema;
    }

    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }
    
    
    
    
    
}
