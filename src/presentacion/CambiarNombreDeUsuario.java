/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.*;
import javax.swing.*;
import datos.*;
import entidades.*;

/**
 *
 * @author lguim
 */
public class CambiarNombreDeUsuario extends javax.swing.JFrame {

    //DALUsuario UsuarioLogica=new DALUsuario();
    Usuario usuario=new Usuario();
    int numUsuario;
    
    /**
     * Creates new form CrearCuenta
     */
    public CambiarNombreDeUsuario() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        bg.requestFocus();
    }
    
    public CambiarNombreDeUsuario(JFrame parent) {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        bg.requestFocus();
    }
    
    public CambiarNombreDeUsuario(Usuario user, int numUser) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/EconomizerIcon.png")).getImage());
        setExtendedState(MAXIMIZED_BOTH);
        usuario=user;
        numUsuario=numUser;
        lblAcceder.setText(usuario.getNUsuario()+", cambia tu nombre");
        bg.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblAcceder = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblAcceder1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Economizer");
        setMinimumSize(new java.awt.Dimension(910, 550));

        bg.setBackground(new java.awt.Color(32, 32, 32));
        bg.setMinimumSize(new java.awt.Dimension(910, 550));
        bg.setPreferredSize(new java.awt.Dimension(910, 550));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setText("Nuevo Usuario:");

        btnLogin.setFont(new java.awt.Font("Google Sans", 0, 12)); // NOI18N
        btnLogin.setText("Cambiar Nombre");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblAcceder.setFont(new java.awt.Font("Google Sans", 0, 24)); // NOI18N
        lblAcceder.setText(", cambia tu nombre");

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });

        lblAcceder1.setFont(new java.awt.Font("Google Sans", 0, 24)); // NOI18N
        lblAcceder1.setText("de usuario aquí");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lblAcceder1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAcceder)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(157, 157, 157))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAcceder1)
                .addGap(42, 42, 42)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 450, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String usuarioNom = txtUsuario.getText();

        if (usuarioNom.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algún campo está vacío");
            return;
        }
        if(usuarioNom.equals(usuario.getNUsuario())) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario es el mismo");
            txtUsuario.setText("");
            txtUsuario.requestFocus();
            return;
        }
        Usuario user = new Usuario(usuarioNom, "Cambio");
        if (DALUsuario.getUsuarios().buscar(usuarioNom)) {
            JOptionPane.showMessageDialog(null, "Usuario ya existe, elija otro nombre");
            txtUsuario.setText("");
            txtUsuario.requestFocus();
            return;
        }
        usuario.setNUsuario(usuarioNom);
        DALUsuario.setUsuario(numUsuario, usuario);

        JOptionPane.showMessageDialog(null, "Cambio de nombre realizado exitosamente");
        FrmPrincipal aplicacion = new FrmPrincipal(usuario);
        aplicacion.setVisible(true);
        //cerrando esta ventana de login
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseExited
        // TODO add your handling code here:
        if (txtUsuario.getText().equals("")) {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
            bg.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        FrmPrincipal aplicacion = new FrmPrincipal(usuario);
        aplicacion.setVisible(true);
        //cerrando esta ventana de login
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarNombreDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarNombreDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarNombreDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarNombreDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarNombreDeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcceder;
    private javax.swing.JLabel lblAcceder1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
