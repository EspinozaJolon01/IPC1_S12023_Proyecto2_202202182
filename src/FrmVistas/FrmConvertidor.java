/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrmVistas;

import Hilos.HiloBN;
import Hilos.HiloBmp;
import Hilos.HiloColor;
import Hilos.HiloCopia;
import Hilos.HiloJPG;
import Hilos.HiloModificar;
import Hilos.HiloPorgreso;
import Modelo.Data;
import Nodos.ListaImagen;
import Nodos.ListaUser;
import Nodos.NodoImagen;
import Nodos.NodoUser;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmConvertidor extends javax.swing.JFrame {

    Data data;
    NodoImagen imagenCategorias;
    ListaUser listaUser;
    NodoUser temporal;
    ListaImagen listasImagen;
    DefaultListModel model;
    ArrayList<String> listaImagenes;
    HiloPorgreso hPorceso;

    /**
     * Creates new form FrmConvertidor
     */
    public FrmConvertidor(Data data) {
        initComponents();
        this.data = data;
        listaUser = data.getListaUsuarios();
        this.setLocationRelativeTo(null);
        model = new DefaultListModel();
        listaImagenes = new ArrayList<>();

        cargarUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JCusuarios = new javax.swing.JComboBox<>();
        btnMosta = new javax.swing.JButton();
        btnParalelo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListarImagenes = new javax.swing.JList<>();
        BarProgreso = new javax.swing.JProgressBar();
        jRadioButtonJpgABmp = new javax.swing.JRadioButton();
        jRadioButtonCopiaImg = new javax.swing.JRadioButton();
        jRadioButtonColores = new javax.swing.JRadioButton();
        jRadioButtonModificar = new javax.swing.JRadioButton();
        jRadioButtonBlancoYNegro = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMensajes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");

        jComboBox1.setBackground(new java.awt.Color(0, 102, 153));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Categoria");

        JCusuarios.setBackground(new java.awt.Color(0, 102, 153));
        JCusuarios.setForeground(new java.awt.Color(255, 255, 255));
        JCusuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuarios" }));
        JCusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCusuariosActionPerformed(evt);
            }
        });

        btnMosta.setBackground(new java.awt.Color(0, 102, 153));
        btnMosta.setForeground(new java.awt.Color(255, 255, 255));
        btnMosta.setText("Cargar");
        btnMosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostaActionPerformed(evt);
            }
        });

        btnParalelo.setBackground(new java.awt.Color(0, 102, 153));
        btnParalelo.setForeground(new java.awt.Color(255, 255, 255));
        btnParalelo.setText("Ejecutar en paralelo");
        btnParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaleloActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Consola de ejecucion");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad Procesada");

        jScrollPane1.setViewportView(jlListarImagenes);

        BarProgreso.setForeground(new java.awt.Color(0, 0, 51));

        jRadioButtonJpgABmp.setText("JPG a Bmp y viceversa");

        jRadioButtonCopiaImg.setText("copia JPG");

        jRadioButtonColores.setText("Rojo verde Azul sepia");
        jRadioButtonColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonColoresActionPerformed(evt);
            }
        });

        jRadioButtonModificar.setText("Modificar Imagen");
        jRadioButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonModificarActionPerformed(evt);
            }
        });

        jRadioButtonBlancoYNegro.setText("Blanco y negro");

        txtAreaMensajes.setColumns(20);
        txtAreaMensajes.setRows(5);
        jScrollPane2.setViewportView(txtAreaMensajes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 596, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BarProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonCopiaImg)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jRadioButtonJpgABmp)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jRadioButtonBlancoYNegro)
                                                    .addGap(33, 33, 33)))
                                            .addComponent(jRadioButtonColores)
                                            .addComponent(jRadioButtonModificar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                        .addComponent(btnMosta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(JCusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMosta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonJpgABmp)
                        .addGap(32, 32, 32)
                        .addComponent(jRadioButtonCopiaImg)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonColores)
                            .addComponent(btnParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jRadioButtonModificar)
                        .addGap(43, 43, 43)
                        .addComponent(jRadioButtonBlancoYNegro)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BarProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostaActionPerformed
        // TODO add your handling code here:

        if (JCusuarios.getSelectedItem().equals("Usuarios")) {
            JOptionPane.showMessageDialog(this, "no has seleccionado el usuario");
            return;
        }

        cargarImagenesCategorias();


    }//GEN-LAST:event_btnMostaActionPerformed

    private void btnParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaleloActionPerformed
        // TODO add your handling code here:

      //  jListToArrayList(jlListarImagenes);

        hPorceso = new HiloPorgreso(BarProgreso, listaImagenes);
        hPorceso.start();

        if (jRadioButtonBlancoYNegro.isSelected()) {
            HiloBN hilo1 = new HiloBN(listaImagenes, txtAreaMensajes);
            hilo1.start();
        }
        if (jRadioButtonColores.isSelected()) {
            HiloColor hilo2 = new HiloColor(listaImagenes, txtAreaMensajes);
            hilo2.start();
        }
        if (jRadioButtonModificar.isSelected()) {
            HiloModificar hilo3 = new HiloModificar(listaImagenes, txtAreaMensajes);
            hilo3.start();
        }
        if (jRadioButtonCopiaImg.isSelected()) {
            HiloCopia hilo4 = new HiloCopia(listaImagenes, txtAreaMensajes);
            hilo4.start();
        }
        if (jRadioButtonJpgABmp.isSelected()) {
            if (imagenCategorias.getRutaPath().toLowerCase().endsWith(".jpg")) {
                HiloJPG hilo5 = new HiloJPG(listaImagenes, txtAreaMensajes);
                hilo5.start();
            } else if (imagenCategorias.getRutaPath().toLowerCase().endsWith(".bmp")) {
                HiloBmp hilo6 = new HiloBmp(listaImagenes, txtAreaMensajes);
                hilo6.start();
            }
        }
        
        txtAreaMensajes.setText("");

    }//GEN-LAST:event_btnParaleloActionPerformed

    public ArrayList<String> jListToArrayList(JList<String> jListImagenes) {
        //  listaImagenes = new ArrayList<>();
        for (int i = 0; i < jListImagenes.getModel().getSize(); i++) {
            String img = jListImagenes.getModel().getElementAt(i);
            listaImagenes.add(img);

        }
        return listaImagenes;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmMenuPrinciapal vista = new FrmMenuPrinciapal(data);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JCusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCusuariosActionPerformed
        // TODO add your handling code here:

        jComboBox1.removeAllItems();
        String usuarioSelecciondo = JCusuarios.getSelectedItem().toString();

        temporal = listaUser.getUsuario(usuarioSelecciondo);

        if (JCusuarios.getSelectedItem().equals("Usuarios")) {
            JOptionPane.showMessageDialog(this, "Debes de seleccionar un usuario");
            return;
        }

        for (int i = 0; i < temporal.categoria.size(); i++) {
            jComboBox1.addItem(temporal.categoria.get(i));
        }


    }//GEN-LAST:event_JCusuariosActionPerformed

    private void jRadioButtonColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonColoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonColoresActionPerformed

    private void jRadioButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonModificarActionPerformed

    public void cargarUser() {

        NodoUser temporal2 = listaUser.getCabeza();

        while (temporal2 != null) {
            JCusuarios.addItem(temporal2.getUsuario());
            temporal2 = temporal2.siguiente;
        }
    }

    public void cargarImagenesCategorias() {
        // model.removeAllElements();

        String path = "";
        String fileName = "";
        // modelo.removeAllElements();
       
        String usuarioActual = JCusuarios.getSelectedItem().toString();
        String categoriaActual = jComboBox1.getSelectedItem().toString();

        System.out.println("Usuario: " + usuarioActual + " categoria: " + categoriaActual);

        listasImagen = temporal.getListarImagenes();  // la lista doble del usuario actual
        imagenCategorias = listasImagen.getInicio(); //nodo de la lista doble de la usario actual

        while (imagenCategorias != null) {

            if (imagenCategorias.getCategoria().equals(categoriaActual)) {

                path=imagenCategorias.getRutaPath();
                fileName=path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf('.'));
                jlListarImagenes.setModel(model);
                model.addElement(fileName);
                listaImagenes.add(path);

            }

            if (imagenCategorias.getSiguiente() != null) {

                imagenCategorias = imagenCategorias.getSiguiente();

            } else {
                break;
            }

        }
    }
    /**
     * @param args the command line arguments //
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
//            java.util.logging.Logger.getLogger(FrmConvertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmConvertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmConvertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmConvertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmConvertidor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarProgreso;
    private javax.swing.JComboBox<String> JCusuarios;
    private javax.swing.JButton btnMosta;
    private javax.swing.JButton btnParalelo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBlancoYNegro;
    private javax.swing.JRadioButton jRadioButtonColores;
    private javax.swing.JRadioButton jRadioButtonCopiaImg;
    private javax.swing.JRadioButton jRadioButtonJpgABmp;
    private javax.swing.JRadioButton jRadioButtonModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlListarImagenes;
    private javax.swing.JTextArea txtAreaMensajes;
    // End of variables declaration//GEN-END:variables
}
