/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrmVistas;

import Modelo.Categoria;
import Modelo.CategoriaDao;
import Modelo.Data;

import Modelo.Usuario;
import Nodos.ListaImagen;
import Nodos.ListaUser;
import Nodos.NodoImagen;
import Nodos.NodoUser;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class FrmBiblioteca extends javax.swing.JFrame {

    //CategoriaDao cate1 = new CategoriaDao();
    //clases
    Usuario user = new Usuario();
    ListaUser categoira = new ListaUser();
    ListaImagen listarImagen = new ListaImagen();
    Data data;
    //modelos
    DefaultListModel model;

    //variables 
    private ListaUser listaUsuarios;
    private ListaImagen listaImagenes;
    NodoImagen ImgActual;
    NodoUser usuarioActual;
    String imagen;
    ImageIcon imagenU;

    /**
     * Creates new form FrmBiblioteca
     */
    public FrmBiblioteca(Data data, String nombre) {

        initComponents();
        this.data = data;
        model = new DefaultListModel();
        txtUsuario.setText(nombre);

        listaUsuarios = data.getListaUsuarios();
        usuarioActual = listaUsuarios.getUsuario(nombre);
        this.setLocationRelativeTo(null);
        //categorias();

        imagen = user.getFoto();
        cargarImage(user.getFoto());

        jList1.setModel(model);
        cargarCategorias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresarBiblio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        btnEliminarImagen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAgregarCategoria = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        btnEliminacionCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtUsuario = new javax.swing.JTextField();
        btnAnteriro = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLMostrarImage = new javax.swing.JLabel();
        btnMimagen = new javax.swing.JButton();

        btnIngresarBiblio.setBackground(new java.awt.Color(0, 0, 51));
        btnIngresarBiblio.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarBiblio.setText("Ingresar a biblioteca");
        btnIngresarBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarBiblioActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categoria");

        btnAgregarImagen.setBackground(new java.awt.Color(0, 102, 153));
        btnAgregarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarImagen.setText("Agregar Imagen");
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });

        btnEliminarImagen.setBackground(new java.awt.Color(0, 102, 153));
        btnEliminarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarImagen.setText("Eliminar Imagen");
        btnEliminarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarImagenActionPerformed(evt);
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

        btnAgregarCategoria.setBackground(new java.awt.Color(0, 102, 153));
        btnAgregarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCategoria.setText("Agregar Categorio");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        txtCategoria.setBackground(new java.awt.Color(255, 255, 255));
        txtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        btnEliminacionCategoria.setBackground(new java.awt.Color(0, 102, 153));
        btnEliminacionCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminacionCategoria.setText("Eliminar Categoria");
        btnEliminacionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminacionCategoriaActionPerformed(evt);
            }
        });

        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        txtUsuario.setEditable(false);

        btnAnteriro.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriro.setForeground(new java.awt.Color(255, 255, 255));
        btnAnteriro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flechas-izquierda.png"))); // NOI18N
        btnAnteriro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriroActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flechas-a-la-derecha.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnMimagen.setBackground(new java.awt.Color(0, 102, 153));
        btnMimagen.setForeground(new java.awt.Color(255, 255, 255));
        btnMimagen.setText("Mostrar Imagen ");
        btnMimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMimagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnAgregarImagen)
                .addGap(41, 41, 41)
                .addComponent(btnEliminarImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnteriro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLMostrarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminacionCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMimagen)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(btnAnteriro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLMostrarImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCategoria)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminacionCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(btnMimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void btnIngresarBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarBiblioActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnIngresarBiblioActionPerformed

    public void cargarImage(String foto) {
        imagenU = new ImageIcon(foto);
        Icon fotos = new ImageIcon(imagenU.getImage().getScaledInstance(jLMostrarImage.getWidth(), jLMostrarImage.getHeight(), Image.SCALE_DEFAULT));
        jLMostrarImage.setIcon(fotos);
    }

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        // TODO add your handling code here:

        if (jList1.getSelectedValue() != null) {
            //aqui almaceno en un string el objeto seleccionado de la list 
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setDialogTitle("buscar foto o imagen");

            if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

                imagen = (jFileChooser.getSelectedFile().toString());

                JOptionPane.showMessageDialog(this, "imagen agregada", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
                cargarImage(imagen);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debes de selecciona una categoria, para agregar imagen");
        }


    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    private void btnEliminarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarImagenActionPerformed
        // TODO add your handling code here:
        if (jList1.getSelectedValue() != null) {
            //aqui almaceno en un string el objeto seleccionado de la list 

        } else {
            JOptionPane.showMessageDialog(this, "Debes de selecciona una categoria, para eliminar dicha imagen");
        }


    }//GEN-LAST:event_btnEliminarImagenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmMenuPrinciapal vista = new FrmMenuPrinciapal(data);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        // TODO add your handling code here:

        if (!txtCategoria.getText().isEmpty()) {
            String categoriaNueva = txtCategoria.getText();

            if (usuarioActual.agregarCategoria(categoriaNueva)) {

                //NodoUser nodo = new NodoUser(new Usuario(txtUsuario.getText()));
                //nodo.agregarCategoria(new Categoria(txtCategoria.getText()));
                txtCategoria.setText("");

                JOptionPane.showMessageDialog(this, "se agregado categoria nueva");
                cargarCategorias();
            } else {
                txtCategoria.setText("");
                JOptionPane.showMessageDialog(this, "Categoria ya existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Dbe de llenar los campos necesarios", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnEliminacionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminacionCategoriaActionPerformed
        // TODO add your handling code here:

        if (jList1.getSelectedValue() != null) {
            //aqui almaceno en un string el objeto seleccionado de la list 
            String mensaje = jList1.getSelectedValue().toString();

            usuarioActual.eliminarCategoria(mensaje);
            JOptionPane.showMessageDialog(this, "La categoria: " + mensaje + " ha sido eliminada");
            cargarCategorias();
        } else {
            JOptionPane.showMessageDialog(this, "Debes de selecciona la categoria a eliminar");
        }


    }//GEN-LAST:event_btnEliminacionCategoriaActionPerformed

    private void btnMimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMimagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMimagenActionPerformed

    private void btnAnteriroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriroActionPerformed
        // TODO add your handling code here:

//        String categoriaSelec = jList1.getSelectedValue();
//
//        if (ImgActual != null) {
//            if (categoriaSelec.equals(ImgActual.getCategoria())) {
//                
//                imagenU = new ImageIcon(foto);
//        Icon fotos = new ImageIcon(imagenU.getImage().getScaledInstance(jLMostrarImage.getWidth(), jLMostrarImage.getHeight(), Image.SCALE_DEFAULT));
//        jLMostrarImage.setIcon(fotos);
//                imagenU = ImgActual.getImagePath();
//                Image imagenNueva = new ImageIcon(rutaTemporal).getImage();
//                ImageIcon iconoNuevo = new ImageIcon(imagenNueva.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
//                lblImagen.setIcon(iconoNuevo);
//            }
//            ImgActual = ImgActual.getNodoAnterior();
//
//        }
//
//        if (ImgActual == null) {
//            ImgActual = usuarioActual.getListaImagenes().getFinListaImagenes();
//        }

    }//GEN-LAST:event_btnAnteriroActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void cargarCategorias() {
        ArrayList<String> listaCategorias = usuarioActual.getCategoria();

        model.removeAllElements();
        for (int i = 0; i < listaCategorias.size(); i++) {
            //jListCategorias.add(listaCategorias.get(i), i);

            model.addElement(listaCategorias.get(i));
        }
    }
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
//            java.util.logging.Logger.getLogger(FrmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
//////            public void run() {
//////                new FrmBiblioteca().setVisible(true);
//////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnAnteriro;
    private javax.swing.JButton btnEliminacionCategoria;
    private javax.swing.JButton btnEliminarImagen;
    private javax.swing.JButton btnIngresarBiblio;
    private javax.swing.JButton btnMimagen;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLMostrarImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
