package ventanas;

import cl.model.dao.ProductosDao;
import cl.model.db.Productos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblcatalogoproductosservicios;
import jpa.Tblproductos;
import misExcepciones.MisExcepciones;

public class Inventario extends javax.swing.JFrame {

    String usuario;
    
    ProductosDao productoDao = new ProductosDao();
    Productos producto;
    
    Tblcatalogoproductosservicios tblcatalogo;
    Tblproductos tblproductos;
    
    public Inventario() {
        super("Inventario");
        initComponents();
        setLocationRelativeTo(null);
        llenarTabla();
    }
    
    public Inventario(String user) {
        super("Inventario");
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = user;
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCuentas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblCodigoSat = new javax.swing.JLabel();
        txtCodigoSat = new javax.swing.JFormattedTextField();
        lblDescripcionSAT = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        lblTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INVENTARIO");

        lblCodigo.setBackground(new java.awt.Color(204, 204, 204));
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("CÓDIGO");

        lblDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("DESCRIPCION");

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        lblCantidad.setBackground(new java.awt.Color(204, 204, 204));
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("CANTIDAD");

        txtCantidad.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setText("0.00");
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        tbCuentas.setAutoCreateRowSorter(true);
        tbCuentas.setBackground(new java.awt.Color(204, 204, 204));
        tbCuentas.setForeground(new java.awt.Color(0, 0, 0));
        tbCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripcion", "Existentes"
            }
        ));
        tbCuentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCuentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCuentas);

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 204, 204));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblCodigoSat.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoSat.setText("CÓDIGO SAT");

        txtCodigoSat.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoSat.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCodigoSat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCodigoSat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoSatFocusLost(evt);
            }
        });

        lblDescripcionSAT.setForeground(new java.awt.Color(0, 0, 0));

        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("PRECIO");

        txtPrecio.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setText("0.00");
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblCodigoSat)
                            .addComponent(lblDescripcion))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDescripcion)
                                    .addComponent(txtCodigoSat, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcionSAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPrecio)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCantidad)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txtCantidad)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(29, 29, 29)
                                .addComponent(btnModificar)
                                .addGap(28, 28, 28)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCantidad)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigoSat)
                        .addComponent(txtCodigoSat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDescripcionSAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegresar)
                        .addComponent(btnBuscar)
                        .addComponent(btnModificar))
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && !Character.isDigit(c) && c == ' ') || txtCodigo.getText().length() > 19){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        
        if(((c < '0' || c > '9') || c == ' ') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        if(txtCodigo.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(31);
        }else if(txtCantidad.getText().equals("0.00")){
            flag = true;
            throw new MisExcepciones(32);
        }else if(txtDescripcion.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(11);
        }else if(txtPrecio.getText().equals("0.00")){
            flag = true;
            throw new MisExcepciones(34);
        }else if(txtCodigoSat.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(33);
        }
        return flag;
    }
    
    private void llenarTabla(){
        try {
            ArrayList<Productos> listaP = productoDao.listaProductos();
            DefaultTableModel modelo = (DefaultTableModel)tbCuentas.getModel();
            modelo.setRowCount(0);
            Object datosllenado[] = new Object[3];

            for(Productos product: listaP){
                datosllenado[0] = product.getClaveProducto();
                datosllenado[1] = product.getDescripcion();
                datosllenado[2] = product.getCantidad();
                modelo.addRow(datosllenado);
            }

            tbCuentas.setModel(modelo);
        } catch (SQLException e) {
            
        } catch (Exception e) {
            
        }
    }
    
    private void limpiarCampos(){
        txtCodigo.setText("");
        txtCantidad.setText("");
        txtCodigoSat.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
        lblDescripcionSAT.setText("");
        llenarTabla();
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(!camposVacios()){
                producto = new cl.model.db.Productos(txtCodigo.getText(), txtDescripcion.getText(), txtCodigoSat.getText(), Float.valueOf(txtPrecio.getText()), Float.valueOf(txtCantidad.getText()));
                productoDao.insertarProducto(producto);
                limpiarCampos();
                llenarTabla();
            }
        } catch (MisExcepciones ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCodigoSatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoSatFocusLost
        try {
            Query qf = entma.createNamedQuery("Tblcatalogoproductosservicios.findByCodigo");
            qf.setParameter("codigo", txtCodigoSat.getText());
            tblcatalogo = (Tblcatalogoproductosservicios)qf.getSingleResult();
            
            lblDescripcionSAT.setText(tblcatalogo.getDescripcion());
        } catch (Exception e) {
            txtCodigoSat.setText("");
        }
    }//GEN-LAST:event_txtCodigoSatFocusLost

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        
        if(((c < '0' || c > '9') || c == ' ') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped
    
    private void buscar(){
        int filaseleccionada = tbCuentas.getSelectedRow();
        String codigo = "";
        try {
            
            if(filaseleccionada == -1){
                if(txtCodigo.getText().isEmpty()){
                    throw new MisExcepciones(31);
                }else{
                    codigo = txtCodigo.getText();
                }
            } else{
                codigo = tbCuentas.getValueAt(filaseleccionada, 0).toString();
                txtCodigo.setText(codigo);
            }
            
            Query qf = entma.createNamedQuery("Tblproductos.findByClaveProducto");
            qf.setParameter("claveProducto", codigo);
            tblproductos = (Tblproductos)qf.getSingleResult();
            txtCantidad.setText(String.valueOf(tblproductos.getCantidad()));
            txtDescripcion.setText(tblproductos.getDescripcion());
            txtPrecio.setText(String.valueOf(tblproductos.getPrecio()));
            txtCodigoSat.setText(tblproductos.getTblCatalogoProductosServicioscodigo().getCodigo().trim());
            lblDescripcionSAT.setText(tblproductos.getTblCatalogoProductosServicioscodigo().getDescripcion());
            
    } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(!camposVacios()){
                entma.getTransaction().begin();
                tblproductos.setCantidad(Float.valueOf(txtCantidad.getText()));
                tblproductos.setDescripcion(txtDescripcion.getText());
                tblproductos.setPrecio(Float.valueOf(txtPrecio.getText()));
                tblcatalogo = new Tblcatalogoproductosservicios(txtCodigoSat.getText());
                tblproductos.setTblCatalogoProductosServicioscodigo(tblcatalogo);
                entma.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Modificado");
                llenarTabla();
                limpiarCampos();
            }
        } catch (NumberFormatException | MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tbCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCuentasMouseClicked
        buscar();
    }//GEN-LAST:event_tbCuentasMouseClicked

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
        try {
            if(txtCantidad.getText().equals("0.00") || Float.valueOf(txtCantidad.getText()) == 0f){
                txtCantidad.setText("0.00");
            }
        } catch (NumberFormatException e) {
            txtCantidad.setText("0.00");
        }
    }//GEN-LAST:event_txtCantidadFocusLost

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
        try {
            if(txtPrecio.getText().equals("0.00") || Float.valueOf(txtPrecio.getText()) == 0f){
                txtPrecio.setText("0.00");
            }
        } catch (NumberFormatException e) {
            txtPrecio.setText("0.00");
        }
    }//GEN-LAST:event_txtPrecioFocusLost

    private void txtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusGained
        if(txtCantidad.getText().equals("0.00")){
            txtCantidad.setText("");
        }
    }//GEN-LAST:event_txtCantidadFocusGained

    private void txtPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusGained
        if(txtPrecio.getText().equals("0.00")){
            txtPrecio.setText("");
        }
    }//GEN-LAST:event_txtPrecioFocusGained

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if(txtDescripcion.getText().length() > 39){
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoSat;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcionSAT;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbCuentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCodigoSat;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
