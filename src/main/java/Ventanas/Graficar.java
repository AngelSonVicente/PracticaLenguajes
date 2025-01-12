/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import ModeloLexico.GenerarGrafica;
import ModeloLexico.TipoToken;
import ModeloLexico.Token;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author MSI
 */
public class Graficar extends javax.swing.JFrame {

    /**
     * Creates new form Graficar
     */
    ArrayList<Token> ListaToken;
    GenerarGrafica grafica = new GenerarGrafica();

    public Graficar(ArrayList<Token> Datos) {

        ListaToken = Datos;
        initComponents();
        CargarSelect();

        ImageIcon imageIcon = new ImageIcon("src/main/java/Imagenes/automata.png"); // Reemplaza con la ruta de tu imagen
        grafiquita.setIcon(imageIcon);
    }

    public Graficar() {

        initComponents();

    }
    int cont = 0;

    private void CargarSelect() {
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

        for (Token tokens : ListaToken) {

            if (tokens.getTipotoken() == TipoToken.Identificador) {

                Indentificadores.addItem(tokens.getLexeman());
                Indentificadores.setSelectedIndex(-1); // Desactiva la selección del título

            }
            if (tokens.getTipotoken() == TipoToken.Operador_Comparacion) {

                Comparacion.addItem(tokens.getLexeman());
                Comparacion.setSelectedIndex(-1); // Desactiva la selección del título

            }
            if (tokens.getTipotoken() == TipoToken.Operador_Logico) {

                Logicos.addItem(tokens.getLexeman());
                Logicos.setSelectedIndex(-1); // Desactiva la selección del título

            }
            if (tokens.getTipotoken() == TipoToken.Asignacion) {

                Asignacion.addItem(tokens.getLexeman());
                Asignacion.setSelectedIndex(-1); // Desactiva la selección del título

            }
            if (tokens.getTipotoken() == TipoToken.Palabra_Reservada) {

                PalabraReservada.addItem(tokens.getLexeman());
                PalabraReservada.setSelectedIndex(-1); // Desactiva la selección del título

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        grafiquita = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        jLabel2.setText("Indentificadores");

        jLabel3.setText("Comparacion");

        jLabel4.setText("Logicos");

        jLabel5.setText("Asignacion");

        jLabel6.setText("Palabras Reservadas");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(Indentificadores, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PalabraReservada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Asignacion, javax.swing.GroupLayout.Alignment.LEADING, 0, 98, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logicos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                        .addComponent(grafiquita)
                        .addGap(1350, 1350, 1350))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Indentificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grafiquita))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PalabraReservada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IndentificadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndentificadoresActionPerformed
        Object selectedItem = Indentificadores.getSelectedItem();
        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();
            // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.

            grafica.GenerarGrafico(selectedValue);

            //refrescarGrafica();/prueba.setText(selectedValue);
        } else {
            // Manejar el caso en el que no se ha seleccionado ningún elemento.
        }

    }//GEN-LAST:event_IndentificadoresActionPerformed

    private void LogicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogicosActionPerformed
        Object selectedItem = Logicos.getSelectedItem();

        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();
            // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.

            grafica.GenerarGrafico(selectedValue);
            // refrescarGrafica();

            // prueba.setText(selectedValue);
        } else {
            // Manejar el caso en el que no se ha seleccionado ningún elemento.
        }


    }//GEN-LAST:event_LogicosActionPerformed

    private void PalabraReservadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraReservadaActionPerformed

        Object selectedItem = PalabraReservada.getSelectedItem();

        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();
            // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.

            if (cont != 1) {

                grafica.GenerarGrafico(selectedValue);

                // refrescarGrafica();
            }
            //prueba.setText(selectedValue);

        } else {
            // Manejar el caso en el que no se ha seleccionado ningún elemento.
        }


    }//GEN-LAST:event_PalabraReservadaActionPerformed


    private void ComparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComparacionActionPerformed
        cont++;
        Object selectedItem = Comparacion.getSelectedItem();

        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();
            // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.

            if (cont != 1) {

                grafica.GenerarGrafico(selectedValue);

                // refrescarGrafica();
            }

        } else {
            // Manejar el caso en el que no se ha seleccionado ningún elemento.
        }


    }//GEN-LAST:event_ComparacionActionPerformed

    private void AsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionActionPerformed

        Object selectedItem = Asignacion.getSelectedItem();

        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();
            // Ahora puedes utilizar selectedValue, que contiene el valor seleccionado en el JComboBox.

            grafica.GenerarGrafico(selectedValue);

            // refrescarGrafica();
        } else {
            // Manejar el caso en el que no se ha seleccionado ningún elemento.
        }

    }//GEN-LAST:event_AsignacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

                new Graficar().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Asignacion;
    private javax.swing.JComboBox<String> Comparacion;
    private javax.swing.JComboBox<String> Indentificadores;
    private javax.swing.JComboBox<String> Logicos;
    private javax.swing.JComboBox<String> PalabraReservada;
    private javax.swing.JLabel grafiquita;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
