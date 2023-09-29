
package AnalizadorLexico;

import jflex.exceptions.SilentExit;

/**
 *
 * @author MSI
 */
public class ExecuteJflex {
    
   public static void main(String omega[]) throws SilentExit{
       String lexico= System.getProperty("user.dir")+"/src/main/java/AnalizadorLexico/Lexico.flex";
       
       try {
      
   jflex.Main.generate(new String[]{lexico});
} catch (SilentExit ex) {
            System.out.println("Error al compilar/generar el archivo flex: " + ex);
        }
   
   } 
   
   
    
   
    
}
