/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrmVistas;

import Modelo.ControlData;
import Modelo.Usuario;
import handlersImg.JEPGImageHandlerBN;
import handlersImg.JEPGImageHandlerBmp;
import handlersImg.JEPGImageHandlerCopia;
import handlersImg.JEPGImageHandlerJPEG;
import handlersImg.JEPGImageHandlerModificar;
import handlersImg.JEPGImagenHandlerColores;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class FrmEditor extends javax.swing.JFrame {

//    String imagen;
//    ImageIcon imagenU;
//    Usuario user = new Usuario();
    ControlData data;
    String urlImagen = "";

    /**
     * Creates new form FrmEditor
     */
    public FrmEditor(ControlData data) {

        initComponents();
        this.data = data;
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSeleccionImagen = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JimagenIcono = new javax.swing.JLabel();
        jRadioButtonJpgABmp = new javax.swing.JRadioButton();
        jRadioButtonCopia = new javax.swing.JRadioButton();
        jRadioButtonColores = new javax.swing.JRadioButton();
        jRadioButtonModifca = new javax.swing.JRadioButton();
        jRadioButtonBlancoYNegro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSeleccionImagen.setBackground(new java.awt.Color(0, 102, 153));
        btnSeleccionImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionImagen.setText("Seleccion Imagen");
        btnSeleccionImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionImagenActionPerformed(evt);
            }
        });

        btnEjecutar.setBackground(new java.awt.Color(0, 102, 153));
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JimagenIcono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonGroup1.add(jRadioButtonJpgABmp);
        jRadioButtonJpgABmp.setText("JPG a Bmp y viceversa");

        buttonGroup1.add(jRadioButtonCopia);
        jRadioButtonCopia.setText("copia JPG");

        buttonGroup1.add(jRadioButtonColores);
        jRadioButtonColores.setText("Rojo verde Azul sepia");
        jRadioButtonColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonColoresActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonModifca);
        jRadioButtonModifca.setText("Modificar Imagen");
        jRadioButtonModifca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonModifcaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonBlancoYNegro);
        jRadioButtonBlancoYNegro.setText("Blanco y negro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonCopia)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButtonJpgABmp)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRadioButtonBlancoYNegro)
                            .addGap(33, 33, 33)))
                    .addComponent(jRadioButtonColores)
                    .addComponent(jRadioButtonModifca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JimagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeleccionImagen)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeleccionImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JimagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jRadioButtonJpgABmp)
                .addGap(32, 32, 32)
                .addComponent(jRadioButtonCopia)
                .addGap(42, 42, 42)
                .addComponent(jRadioButtonColores)
                .addGap(41, 41, 41)
                .addComponent(jRadioButtonModifca)
                .addGap(43, 43, 43)
                .addComponent(jRadioButtonBlancoYNegro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionImagenActionPerformed
        // TODO add your handling code here:

        JFileChooser jfileChooser = new JFileChooser();
        FileNameExtensionFilter extensionImagen = new FileNameExtensionFilter("JPG", "jpg");
        jfileChooser.setFileFilter(extensionImagen);

        int accionPorEjecutar = jfileChooser.showOpenDialog(this);

        if (accionPorEjecutar == jfileChooser.APPROVE_OPTION) {
            urlImagen = jfileChooser.getSelectedFile().getPath();
            Image imagenNueva = new ImageIcon(urlImagen).getImage();
            ImageIcon iconoNuevo = new ImageIcon(imagenNueva.getScaledInstance(JimagenIcono.getWidth(), JimagenIcono.getHeight(), Image.SCALE_SMOOTH));
            JimagenIcono.setIcon(iconoNuevo);

        }
    }//GEN-LAST:event_btnSeleccionImagenActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:

        if (JimagenIcono.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "debes de seleccionar una imagen");
            return;
        }

        if (jRadioButtonBlancoYNegro.isSelected() == false && jRadioButtonColores.isSelected() == false && jRadioButtonCopia.isSelected() == false
                && jRadioButtonModifca.isSelected() == false && jRadioButtonJpgABmp.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Debes de seleccionar un opción");
            return;
        } else {
            if (jRadioButtonBlancoYNegro.isSelected()) {
                JEPGImageHandlerBN handlerBn = new JEPGImageHandlerBN(urlImagen);
                JOptionPane.showMessageDialog(this, "Ejecucion terminada  de blanco y negro");
                try {
                    JPEGHandler.runHandler(handlerBn);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (jRadioButtonColores.isSelected()) {
                JEPGImagenHandlerColores handlerColores = new JEPGImagenHandlerColores(urlImagen);
                 JOptionPane.showMessageDialog(this, "Ejecucion terminada  de colores");
                try {
                    JPEGHandler.runHandler(handlerColores);
                } catch (Exception o) {
                    o.printStackTrace();
                }
            } else if (jRadioButtonCopia.isSelected()) {
                JEPGImageHandlerCopia handlerCopia = new JEPGImageHandlerCopia(urlImagen);
                  JOptionPane.showMessageDialog(this, "Ejecucion terminada  de realizar una copia");
                try {
                    JPEGHandler.runHandler(handlerCopia);
                  
                } catch (Exception k) {
                    k.printStackTrace();
                }
            } else if (jRadioButtonModifca.isSelected()) {
                JEPGImageHandlerModificar handlersModificar = new JEPGImageHandlerModificar(urlImagen);
                 JOptionPane.showMessageDialog(this, "Ejecucion terminada  de modificar");
                try {
                    JPEGHandler.runHandler(handlersModificar);
                } catch (Exception k) {
                    k.printStackTrace();
                }

            } else if (jRadioButtonJpgABmp.isSelected()) {
                if (urlImagen.toLowerCase().endsWith(".jpg")) {
                    JEPGImageHandlerBmp handlresBmp = new JEPGImageHandlerBmp(urlImagen);
                      JOptionPane.showMessageDialog(this, "Ejecucion terminada  de convertir a jpg");
                    try {
                        JPEGHandler.runHandler(handlresBmp);
                    } catch (Exception p) {
                        p.printStackTrace();
                    }

                } else if (urlImagen.toLowerCase().endsWith(".bmp")) {
                    JEPGImageHandlerJPEG handlresJEPG = new JEPGImageHandlerJPEG(urlImagen);
                    JOptionPane.showMessageDialog(this, "Ejecucion terminada  de convertir a bmp");
                    try {
                        JPEGHandler.runHandler(handlresJEPG);

                    } catch (Exception j) {
                        j.printStackTrace();
                    }
                }
            }

        }


    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmMenuPrinciapal vista = new FrmMenuPrinciapal(data);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonColoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonColoresActionPerformed

    private void jRadioButtonModifcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonModifcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonModifcaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmEditor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JimagenIcono;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnSeleccionImagen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBlancoYNegro;
    private javax.swing.JRadioButton jRadioButtonColores;
    private javax.swing.JRadioButton jRadioButtonCopia;
    private javax.swing.JRadioButton jRadioButtonJpgABmp;
    private javax.swing.JRadioButton jRadioButtonModifca;
    // End of variables declaration//GEN-END:variables
}
