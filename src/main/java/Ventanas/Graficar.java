/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Graficar extends javax.swing.JFrame {

    /**
     * Creates new form Graficar
     */
    ArrayList<Token> ListaToken ;
    
    public Graficar(ArrayList<Token>Datos) {
        
        ListaToken =Datos;
        initComponents();
        CargarSelect();
    }

    private void  CargarSelect(){
//                Indentificadores.addItem("Identificadores");
//        
//               
//         Comparacion.addItem("Comparacion");
//        Logicos.addItem("Logicos");
//       
//          Asignacion.addItem("Asignacion");
//      
//          PalabraReservada.addItem("palabras Reservadas");
//      
        
        
    for(Token tokens : ListaToken){
        
        

        if(tokens.getTipotoken()==TipoToken.Identificador){
        
        Indentificadores.addItem(tokens.getLexeman());
           Indentificadores .setSelectedIndex(-1); // Desactiva la selección del título

        
        }
        if(tokens.getTipotoken()==TipoToken.Operador_Comparacion){
        
        Comparacion.addItem(tokens.getLexeman());
         Comparacion .setSelectedIndex(-1); // Desactiva la selección del título

        
        }
        if(tokens.getTipotoken()==TipoToken.Operador_Logico){
        
        Logicos.addItem(tokens.getLexeman());
         Logicos .setSelectedIndex(-1); // Desactiva la selección del título

        }
        if(tokens.getTipotoken()==TipoToken.Asignacion){
        
        Asignacion.addItem(tokens.getLexeman());
         Asignacion .setSelectedIndex(-1); // Desactiva la selección del título

        }
        if(tokens.getTipotoken()==TipoToken.Palabra_Reservada){
        
        PalabraReservada.addItem(tokens.getLexeman());
         PalabraReservada .setSelectedIndex(-1); // Desactiva la selección del título

        }
        
        
        
        
    
    }
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Indentificadores = new javax.swing.JComboBox<>();
        Comparacion = new javax.swing.JComboBox<>();
        Logicos = new javax.swing.JComboBox<>();
        Asignacion = new javax.swing.JComboBox<>();
        PalabraReservada = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        prueba = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Graficas");

        Indentificadores.setToolTipText("Identificadores");
        Indentificadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndentificadoresActionPerformed(evt);
            }
        });

        Comparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComparacionActionPerformed(evt);
            }
        });

        Logicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogicosActionPerformed(evt);
            }
        });

        Asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionActionPerformed(evt);
            }
        });

        PalabraReservada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabraReservadaActionPerformed(evt);
            }
        });

        prueba.setColumns(20);
        prueba.setRows(5);
        jScrollPane1.setViewportView(prueba);

        jLabel2.setText("Indentificadores");

        jLabel3.setText("Comparacion");

        jLabel4.setText("Logicos");

        jLabel5.setText("Asignacion");

        jLabel6.setText("Palabras Reservadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Comparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Indentificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(Logicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PalabraReservada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 448, Short.MAX_VALUE)))))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Indentificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Comparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PalabraReservada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IndentificadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndentificadoresActionPerformed
   Object selectedItem = Indentificadores.getSelectedItem();
        if (selectedItem != null) {
    String selectedValue = selectedItem.toString();
    // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.
    
    prueba.setText(selectedValue);
    
} else {
    // Manejar el caso en el que no se ha seleccionado ningún elemento.
}
        
    }//GEN-LAST:event_IndentificadoresActionPerformed

    private void LogicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogicosActionPerformed
 Object selectedItem = Logicos.getSelectedItem();
  
                if (selectedItem != null) {
    String selectedValue = selectedItem.toString();
    // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.
    
    prueba.setText(selectedValue);
    
} else {
    // Manejar el caso en el que no se ha seleccionado ningún elemento.
}



    }//GEN-LAST:event_LogicosActionPerformed

    private void PalabraReservadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraReservadaActionPerformed

 Object selectedItem = PalabraReservada.getSelectedItem();
  
                if (selectedItem != null) {
    String selectedValue = selectedItem.toString();
    // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.
    
    prueba.setText(selectedValue);
    
} else {
    // Manejar el caso en el que no se ha seleccionado ningún elemento.
}


    }//GEN-LAST:event_PalabraReservadaActionPerformed

    private void ComparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComparacionActionPerformed

 Object selectedItem = Comparacion.getSelectedItem();
  
                if (selectedItem != null) {
    String selectedValue = selectedItem.toString();
    // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.
    
    prueba.setText(selectedValue);
    
} else {
    // Manejar el caso en el que no se ha seleccionado ningún elemento.
}
        
        
    }//GEN-LAST:event_ComparacionActionPerformed

    private void AsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionActionPerformed


         Object selectedItem = Asignacion.getSelectedItem();
  
                if (selectedItem != null) {
    String selectedValue = selectedItem.toString();
    // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.
    
    prueba.setText(selectedValue);
    
} else {
    // Manejar el caso en el que no se ha seleccionado ningún elemento.
}

    }//GEN-LAST:event_AsignacionActionPerformed

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
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
             
               // new Graficar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Asignacion;
    private javax.swing.JComboBox<String> Comparacion;
    private javax.swing.JComboBox<String> Indentificadores;
    private javax.swing.JComboBox<String> Logicos;
    private javax.swing.JComboBox<String> PalabraReservada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea prueba;
    // End of variables declaration//GEN-END:variables
}
