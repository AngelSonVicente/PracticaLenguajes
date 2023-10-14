/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import AnalizadorLexico.ParserPy;
import AnalizadorSintactico.*;
import ModeloLexico.Token;
import ModeloLexico.TipoToken;
import ModeloSintactico.Funciones;
import ModeloSintactico.ResultadoAnalisis;
import Ventanas.Reportes.ErroresLexicos;
import Ventanas.Reportes.ReporteFunciones;
import java.awt.Color;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

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
        model = (DefaultTableModel) this.TablaReporte.getModel();

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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        ErrorLexico = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jMenu2.setText("Archivo");

        jMenuItem5.setText("Importar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

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

        Reportes.setText("Reportes");

        ErrorLexico.setText("Errores Lexicos");
        ErrorLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorLexicoActionPerformed(evt);
            }
        });
        Reportes.add(ErrorLexico);

        jMenuItem6.setText("Cantidad de Funciones");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Reportes.add(jMenuItem6);

        jMenuBar1.add(Reportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(394, 394, 394)
                .addComponent(Correr)
                .addGap(547, 547, 547))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Correr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel model;

    ArrayList<Token> ListaToken;
    ArrayList<Token> ListaErrores;
    ArrayList<Token> ListaGeneral;
    ArrayList<Funciones> funciones;
    ArrayList<ResultadoAnalisis> ErrorSintactico;


    private void CorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrerActionPerformed

        if (ListaToken != null) {
            ListaToken.clear();
        }

        if (ListaGeneral != null) {
            ListaGeneral.clear();
        }
        if (ListaErrores != null) {
            ListaErrores.clear();
        }
        if (funciones != null) {
            funciones.clear();
        }

        String Contenido = contenido2.getText();

        ParserPy analizador = new ParserPy(Contenido);

        ListaToken = analizador.getTokens();
        ListaGeneral = analizador.getTokensGeneral();
        ListaErrores = analizador.getErrores();

        String imprimir = "";

        ArrayList<Token> ListaErrores = analizador.getErrores();
        StyledDocument doc = contenido2.getStyledDocument();
        Style estilo = doc.addStyle("ColorStyle", null);

        for (Token tokens : ListaToken) {
            if (tokens.getLexeman().equals("")) {

            } else {

                if (tokens.getTipotoken() == TipoToken.Cadena) {

                    model.addRow(new Object[]{tokens.getTipotoken(), "[\"]([A-Z]|[a-z])*[\"]", tokens.getLexeman(), tokens.getLinea(), tokens.getColumna()});
                } else {
                    if (tokens.getTipotoken() == TipoToken.Comentario) {

                        model.addRow(new Object[]{tokens.getTipotoken(), "[#]([A-Z][a-z])*", tokens.getLexeman(), tokens.getLinea(), tokens.getColumna()});

                    } else {
                        model.addRow(new Object[]{tokens.getTipotoken(), tokens.getLexeman(), tokens.getLexeman(), tokens.getLinea(), tokens.getColumna()});
                    }
                }

//
            }

        }
        // AsignacionDeclaracion sintactico = new AsignacionDeclaracion(ListaToken);
        //   CondicionIF sintactico = new CondicionIF(ListaGeneral);
        // CicloWhile sintactico = new CicloWhile(ListaGeneral); 
        // CicloFor sintactico = new CicloFor(ListaGeneral);
        Sintactico sintactico = new Sintactico(ListaGeneral, 1, 0, false);
        try {

            ErrorSintactico = sintactico.analizar();
            funciones = sintactico.getFunciones();
            if(ErrorSintactico!=null){
                
            }

            for (ResultadoAnalisis tokenerror : ErrorSintactico) {

                imprimir = imprimir + "\n " + tokenerror.toString();

                System.out.println(tokenerror.toString());
            }
        } catch (Exception e) {
        }

//        for(Token tokenerror: ListaGeneral){
//            
//            
//            
//        
//            imprimir=imprimir+"\n "+ tokenerror.toString(); 
//            
//            System.out.println(tokenerror.toString());
//        }
//        
//        for(Token general : ListaGeneral){
//            
//            
//              
//            System.out.println(general.toString());
//        }
//        
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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                FileReader fileReader = new FileReader(selectedFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                contenido2.setText(content.toString());
                bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void ErrorLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorLexicoActionPerformed
        ErroresLexicos ventana = new ErroresLexicos(ListaErrores);
        ventana.setVisible(true);


    }//GEN-LAST:event_ErrorLexicoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        ReporteFunciones ventana = new ReporteFunciones(funciones);
        ventana.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
    private javax.swing.JMenuItem ErrorLexico;
    private javax.swing.JMenu Reportes;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JTextPane contenido2;
    private javax.swing.JTextArea errores;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    private void appendColoredText(JTextArea contenido, String este_es_un_texto_, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
