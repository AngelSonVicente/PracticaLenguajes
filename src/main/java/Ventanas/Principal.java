/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Analizador.ParserPy;
import ModeloLexico.Token;
import ModeloLexico.Coolor;
import ModeloLexico.TipoToken;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/*
import AnalizadorLexico.IdentSimbolo;
import AnalizadorLexico.ParserPy;
import ModeloLexico.Token;
import java.util.ArrayList;
*/
/**
 *
 * @author MSI
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        model=(DefaultTableModel)this.TablaReporte.getModel();
              
        
    }
    
  
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        Correr = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        errores = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        contenido2 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane1.setViewportView(contenido);

        Correr.setText("Correr");
        Correr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrerActionPerformed(evt);
            }
        });

        errores.setEditable(false);
        errores.setColumns(20);
        errores.setRows(5);
        jScrollPane2.setViewportView(errores);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Errores");

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setInheritsPopupMenu(true);
        jFileChooser1.setPreferredSize(new java.awt.Dimension(340, 347));

        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Patron", "Lexema", "Linea", "Columna"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaReporte);

        jScrollPane4.setViewportView(contenido2);

        jMenu6.setText("Graficas");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Graficar Tokens");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Correr))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Correr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    DefaultTableModel model;
    
    ArrayList<Token> ListaToken ;
    ArrayList<Token> ListaGeneral ;
   
    
    private void CorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrerActionPerformed

        int linea=0;

        String Contenido=contenido.getText();

        System.out.println(Contenido);

  

        ParserPy analizador = new ParserPy();
        
        analizador.LeerArchivo(Contenido);
        
        String imprimir ="";
       ListaToken = analizador.getToken();
       ListaGeneral = analizador.getTokensGenerales();
   
   ArrayList<Coolor> ListaColor = analizador.getColor();
   
   
   
   
   ArrayList<Token> ListaErrores = analizador.getErrores();
                 StyledDocument doc = contenido2.getStyledDocument();
        Style estilo = doc.addStyle("ColorStyle", null);
   
        for(Token tokens: ListaToken){
            if(tokens.getLexeman().equals("")){
            
            }else{
             
            model.addRow(new Object[]{tokens.getTipotoken(),tokens.getLexeman(),tokens.getLexeman(),tokens.getLinea(),tokens.getColumna()});
            
                        
        
//        if(tokens.getTipotoken()==TipoToken.Identificador){
//        
//        StyleConstants.setForeground(estilo, Color.BLACK);
//        }
//        if(tokens.getTipotoken()==TipoToken.Palabra_Reservada){
//        StyleConstants.setForeground(estilo, Color.MAGENTA);
//      
//        
//        }
//        if(tokens.getTipotoken()==TipoToken.Operador_Aritmetico||tokens.getTipotoken()==TipoToken.Operador_Comparacion || 
//                tokens.getTipotoken()==TipoToken.Operador_Logico || tokens.getTipotoken()==TipoToken.Operador_Comparacion ){
//        
//        StyleConstants.setForeground(estilo, Color.BLUE);
//        }
//        if(tokens.getTipotoken()==TipoToken.Cadena||tokens.getTipotoken()==TipoToken.Entero|| 
//                tokens.getTipotoken()==TipoToken.Decimal ){
//        
//        StyleConstants.setForeground(estilo, Color.ORANGE);
//        }
//        if( tokens.getTipotoken()==TipoToken.Coma||
//                     tokens.getTipotoken()==TipoToken.PuntoComa || tokens.getTipotoken()==TipoToken.DosPuntos||
//                     tokens.getTipotoken()==TipoToken.Llaves || tokens.getTipotoken()==TipoToken.Parentesis
//                || tokens.getTipotoken()==TipoToken.Corchetes){
//        
//        StyleConstants.setForeground(estilo, Color.GREEN);
//        }
//        if( tokens.getTipotoken()==TipoToken.Comentario){
//        
//        StyleConstants.setForeground(estilo, Color.GRAY);
//        }
//        String Espacio=" ";
//        if(linea!=tokens.getLinea()){
//        Espacio="\n";
//        }
//                 try {
//            doc.insertString(doc.getLength(), Espacio+tokens.getLexeman()+" ", estilo);
//            
//            
//            
//        } catch (BadLocationException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                 
//                 linea=tokens.getLinea();

 
            
            
            
            
            }
     
        
        
        }
   
        for(Token tokens: ListaGeneral){
            if(tokens.getLexeman().equals("")){
            
            }else{
             
            //model.addRow(new Object[]{tokens.getTipotoken(),tokens.getLexeman(),tokens.getLexeman(),tokens.getLinea(),tokens.getColumna()});
            
                        
        
        if(tokens.getTipotoken()==TipoToken.Identificador){
        
        StyleConstants.setForeground(estilo, Color.BLACK);
        }
        if(tokens.getTipotoken()==TipoToken.Palabra_Reservada){
        StyleConstants.setForeground(estilo, Color.MAGENTA);
      
        
        }
        if(tokens.getTipotoken()==TipoToken.Operador_Aritmetico||tokens.getTipotoken()==TipoToken.Operador_Comparacion || 
                tokens.getTipotoken()==TipoToken.Operador_Logico || tokens.getTipotoken()==TipoToken.Operador_Comparacion ){
        
        StyleConstants.setForeground(estilo, Color.BLUE);
        }
        if(tokens.getTipotoken()==TipoToken.Cadena||tokens.getTipotoken()==TipoToken.Entero|| 
                tokens.getTipotoken()==TipoToken.Decimal ){
        
        StyleConstants.setForeground(estilo, Color.ORANGE);
        }
        if( tokens.getTipotoken()==TipoToken.Coma||
                     tokens.getTipotoken()==TipoToken.PuntoComa || tokens.getTipotoken()==TipoToken.DosPuntos||
                     tokens.getTipotoken()==TipoToken.Llaves || tokens.getTipotoken()==TipoToken.Parentesis
                || tokens.getTipotoken()==TipoToken.Corchetes){
        
        StyleConstants.setForeground(estilo, Color.GREEN);
        }
        if( tokens.getTipotoken()==TipoToken.Comentario){
        
        StyleConstants.setForeground(estilo, Color.GRAY);
        }
        if( tokens.getTipotoken()==TipoToken.Error){
        
        StyleConstants.setForeground(estilo, Color.RED);
        }
    
                 try {
            doc.insertString(doc.getLength(), tokens.getLexeman(), estilo);
            
            
            
        } catch (BadLocationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
                 linea=tokens.getLinea();

 
            
            
            
            
            }
     
        
        
        }
        
        for(Token tokenerror: ListaErrores){
            
            
            
        
            imprimir=imprimir+"\n "+ tokenerror.toString(); 
            
            System.out.println(tokenerror.toString());
        }
        
            errores.setText(imprimir);
        
        
              
    
        
       
    }//GEN-LAST:event_CorrerActionPerformed

         
         
    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
        
         Graficar graficar = new Graficar(ListaToken);
        graficar.setVisible(true);
       
        
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Graficar graficar = new Graficar(ListaToken);
        graficar.setVisible(true);
     
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Correr;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JTextArea contenido;
    private javax.swing.JTextPane contenido2;
    private javax.swing.JTextArea errores;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    private void appendColoredText(JTextArea contenido, String este_es_un_texto_, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
