package ventanas;

import cl.model.dao.UsuarioDao;
import cl.model.db.Usuario;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import jpa.Tblempleado;
import misExcepciones.MisExcepciones;

public class Registrar extends javax.swing.JFrame {

    Usuario user;
    UsuarioDao dao = new UsuarioDao();
    
    Login log;
    
    Tblempleado tblEmpleado;
    
    public Registrar() {
        super("Registro de Usuarios");
        initComponents();
        setLocationRelativeTo(null);
        cbGenero.setEnabled(false);
        txtUsuario.setEditable(false);
        txtContraseña.setEditable(false);
        txtVerifContraseña.setEditable(false);
        dcFechaNacimiento.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApeliidoP = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblVerifContraseña = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtVerifContraseña = new javax.swing.JPasswordField();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblGenero = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        lblIdEmpleado = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Lucida Calligraphy", 1, 29)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("REGISTRO");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 190, -1));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 30));

        lblApeliidoP.setForeground(new java.awt.Color(0, 0, 0));
        lblApeliidoP.setText("APELLIDO PATERNO");
        jPanel1.add(lblApeliidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 30));

        lblApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoM.setText("APELLIDO MATERNO");
        jPanel1.add(lblApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));

        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("USUARIO");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 20));

        lblVerifContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblVerifContraseña.setText("VERIFICAR CONTRASEÑA");
        jPanel1.add(lblVerifContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 20));

        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("CONTRASEÑA");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 20));

        lblFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaNacimiento.setText("FECHA DE NACIMIENTO");
        jPanel1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 30));

        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 120, -1));

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, -1));

        txtApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 180, -1));

        txtApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, -1));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setToolTipText("Contraseña de 8 caracteres");
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, -1));

        txtVerifContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtVerifContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtVerifContraseña.setToolTipText("Contraseña de 8 caracteres");
        txtVerifContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerifContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtVerifContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 180, -1));
        jPanel1.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 180, 30));

        lblGenero.setBackground(new java.awt.Color(255, 255, 255));
        lblGenero.setForeground(new java.awt.Color(0, 0, 0));
        lblGenero.setText("GENERO");
        jPanel1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 30));

        cbGenero.setBackground(new java.awt.Color(255, 255, 255));
        cbGenero.setForeground(new java.awt.Color(0, 0, 0));
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Hombre", "Mujer" }));
        jPanel1.add(cbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));

        lblIdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        lblIdEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        lblIdEmpleado.setText("ID EMPLEADO");
        jPanel1.add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        txtIdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtIdEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtIdEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdEmpleadoFocusLost(evt);
            }
        });
        txtIdEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 50, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registro.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void habilitar(){
        cbGenero.setEnabled(true);
        txtUsuario.setEditable(true);
        txtContraseña.setEditable(true);
        txtVerifContraseña.setEditable(true);
        dcFechaNacimiento.setEnabled(true);
        txtIdEmpleado.setEditable(false);
        txtNombre.setEditable(false);
        txtApellidoP.setEditable(false);
        txtApellidoM.setEditable(false);
    }
    
    public boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        if(txtIdEmpleado.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(1);
        }else if(txtNombre.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(1);
        }else if(txtApellidoP.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(2);
        }else if(txtApellidoM.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(3);
        }else if(cbGenero.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(4);
        }else if(txtUsuario.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(5);
        }else if(txtContraseña.getPassword().length == 0){
            flag = true;
            throw new MisExcepciones(6);
        }else if(txtVerifContraseña.getPassword().length == 0){
            flag = true;
            throw new MisExcepciones(7);
        }else if(!Arrays.equals(txtContraseña.getPassword(), txtVerifContraseña.getPassword())){
            flag = true;
            throw new MisExcepciones(8);
        }else if(dcFechaNacimiento.getDate() == null){
            flag = true;
            throw new MisExcepciones(9);
        }
        return flag;
    }
    
    public void limpiarCampos(){
        
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        log = new Login();
        log.setVisible(true);
        limpiarCampos();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String contra;
        Date fecha;

        try {
            if(!camposVacios()){
                contra = new String(txtContraseña.getPassword());
                fecha = new java.sql.Date(dcFechaNacimiento.getDate().getTime());
                user = new Usuario(txtUsuario.getText(), contra, cbGenero.getSelectedItem().toString(), Integer.valueOf(txtIdEmpleado.getText()), fecha);
                if(dao.insertarUsuario(user)){
                    log = new Login(txtUsuario.getText());
                    this.dispose();
                    log.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Usuario registrado");
                    limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario ya registrado");
                }
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (HeadlessException | SQLException  e){
            JOptionPane.showMessageDialog(this, "USUARIO YA REGISTRADO");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isLetter(c) && c != ' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isLetter(c) && c != ' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isLetter(c) && c != ' '){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        if(txtContraseña.getPassword().length > 7){
            evt.consume();
        }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtVerifContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerifContraseñaKeyTyped
        if(txtVerifContraseña.getPassword().length > 7){
            evt.consume();
        }
    }//GEN-LAST:event_txtVerifContraseñaKeyTyped

    private void txtIdEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEmpleadoKeyTyped
        char c = evt.getKeyChar();
        
        if(c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdEmpleadoKeyTyped

    private void txtIdEmpleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdEmpleadoFocusLost
        try {
            Query qf = entma.createNamedQuery("Tblempleado.findByIdEmpleado");
            qf.setParameter("idEmpleado", Integer.valueOf(txtIdEmpleado.getText()));
            tblEmpleado = (Tblempleado)qf.getSingleResult();
            txtNombre.setText(tblEmpleado.getNombre());
            txtApellidoP.setText(tblEmpleado.getApellidoP());
            txtApellidoM.setText(tblEmpleado.getApellidoM());
            habilitar();
            
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "Para registrarte necesitas ser empleado");
        } catch (NumberFormatException e) {
            
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_txtIdEmpleadoFocusLost

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if(txtUsuario.getText().length() > 9){
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbGenero;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApeliidoP;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVerifContraseña;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtVerifContraseña;
    // End of variables declaration//GEN-END:variables
}
