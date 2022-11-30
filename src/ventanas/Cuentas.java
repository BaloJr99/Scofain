package ventanas;

import cl.model.dao.CuentaDao;
import cl.model.db.Cuenta;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblcatalogocuentas;
import misExcepciones.MisExcepciones;

public class Cuentas extends javax.swing.JFrame {

    Cuenta cuenta;
    CuentaDao dao = new CuentaDao();
    Tblcatalogocuentas catalogo;
    
    public Cuentas(){
        super("Catalogo cuentas");
        initComponents();
        setLocationRelativeTo(null);
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel2 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JFormattedTextField();
        lblCodigo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCuentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("CÓDIGO");

        lblTitulo.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(":CATáLOGO de CUENTAS:");

        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("DESCRIPCION");

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 255));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(204, 204, 255));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 204, 255));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(204, 204, 255));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 204, 255));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción"
            }
        ));
        tbCuentas.setColumnSelectionAllowed(true);
        tbCuentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCuentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCuentas);
        tbCuentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 34, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(lblTitulo))
                        .addComponent(lblDescripcion)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnAgregar)
                            .addGap(35, 35, 35)
                            .addComponent(btnModificar)
                            .addGap(25, 25, 25)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(btnRegresar)))
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(lblTitulo)
                    .addGap(61, 61, 61)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(220, 220, 220)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregar)
                        .addComponent(btnModificar)
                        .addComponent(btnBuscar)
                        .addComponent(btnRegresar))
                    .addGap(0, 19, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCuentasMouseClicked
        int filaseleccionada = tbCuentas.getSelectedRow();
        txtCodigo.setText(tbCuentas.getValueAt(filaseleccionada, 0).toString());
        txtDescripcion.setText(tbCuentas.getValueAt(filaseleccionada, 1).toString());
    }//GEN-LAST:event_tbCuentasMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if(txtCodigo.getText().equals("   -  -   ")){
                throw new MisExcepciones(10);
            }else{
                Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
                qf.setParameter("codigo", txtCodigo.getText());
                catalogo = (Tblcatalogocuentas)qf.getSingleResult();
                txtDescripcion.setText(catalogo.getDescripcion());
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "No se encontro");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(!camposVacios()){
                Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
                qf.setParameter("codigo", txtCodigo.getText());
                catalogo = (Tblcatalogocuentas)qf.getSingleResult();
                entma.getTransaction().begin();
                catalogo.setDescripcion(txtDescripcion.getText());
                entma.getTransaction().commit();
                actualizarTabla();
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Cuenta modificada");
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "No se encontro esa cuenta");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            agregarCuenta();
        } catch (MisExcepciones ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception e){
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Error: Cuenta ya registrada");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void agregarCuenta() throws MisExcepciones, SQLException{
        if(!camposVacios()){
            cuenta = new Cuenta(txtCodigo.getText(), txtDescripcion.getText());
            if(dao.insertarCuenta(cuenta)){
                JOptionPane.showMessageDialog(this, "Cuenta Registrada!!!");
                actualizarTabla();
                limpiarCampos();
                txtCodigo.requestFocus();
            }
        }
    }
    
    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if(txtDescripcion.getText().length() > 39){
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                agregarCuenta();
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ya registrada");
            limpiarCampos();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void limpiarCampos(){
        txtCodigo.setText("");
        txtDescripcion.setText("");
    }
    
    public boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        
        if(txtCodigo.getText().equals("   -  -   ")){
            flag = true;
            throw new MisExcepciones(10);
        }else if (txtDescripcion.getText().isEmpty()){
            flag = true; 
            throw new MisExcepciones(11);
        }
        return flag;
    }    
    
    private void actualizarTabla(){
        try {
            ArrayList<Cuenta> listaCuentas = dao.obtenerCuentas();
            DefaultTableModel model = (DefaultTableModel)tbCuentas.getModel();
            model.setNumRows(0);
            Object[] datosllenado = new Object[2];
            for(Cuenta lista: listaCuentas){
                datosllenado[0] = lista.getCodigo();
                datosllenado[1] = lista.getDescripcion();
                model.addRow(datosllenado);
            }        
            tbCuentas.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbCuentas;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
