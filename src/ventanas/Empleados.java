package ventanas;

import cl.model.dao.EmpleadoDao;
import cl.model.db.Empleado;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import jpa.Tblestado;
import misExcepciones.MisExcepciones;

public class Empleados extends javax.swing.JFrame {

    EmpleadoDao dao = new EmpleadoDao();
    Empleado empleadoDao;
    jpa.Tblempleado empleadoJpa;
    Tblestado estado;
    
    public Empleados() {
        super("Empleados");
        initComponents();
        setLocationRelativeTo(null);
        txtId.setEnabled(false);
        dcFechaBaja.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        lblApellidoM = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        lblCURP = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lblFechaAlta = new javax.swing.JLabel();
        dcFechaAlta = new com.toedter.calendar.JDateChooser();
        lblFechaBaja = new javax.swing.JLabel();
        dcFechaBaja = new com.toedter.calendar.JDateChooser();
        btnRegresar = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblNumSeguro = new javax.swing.JLabel();
        btnBaja = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        lblPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        txtNumSeguro = new javax.swing.JFormattedTextField();
        txtRFC = new javax.swing.JFormattedTextField();
        txtCURP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/401156.png"))); // NOI18N

        lblTitulo1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setText("REGISTRO DE");

        lblTitulo2.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo2.setText("EMPLEADOS");
        lblTitulo2.setFocusable(false);

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");

        lblApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoP.setText("APELLIDO PATERNO");

        txtApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });

        lblApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoM.setText("APELLIDO MATERNO");

        txtApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });

        lblRFC.setForeground(new java.awt.Color(0, 0, 0));
        lblRFC.setText("RFC");

        lblCURP.setForeground(new java.awt.Color(0, 0, 0));
        lblCURP.setText("CURP");

        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("ESTADO");

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setForeground(new java.awt.Color(0, 0, 0));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Aguascalientes", "Baja California Norte", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila de Zaragoza", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        lblFechaAlta.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaAlta.setText("FECHA DE ALTA");

        dcFechaAlta.setBackground(new java.awt.Color(255, 255, 255));
        dcFechaAlta.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaAlta.setDateFormatString("yyyy/MM/dd");

        lblFechaBaja.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaBaja.setText("FECHA DE BAJA");

        dcFechaBaja.setBackground(new java.awt.Color(255, 255, 255));
        dcFechaBaja.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaBaja.setDateFormatString("yyyy/MM/dd");

        btnRegresar.setBackground(new java.awt.Color(204, 255, 204));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAlta.setBackground(new java.awt.Color(204, 255, 204));
        btnAlta.setForeground(new java.awt.Color(0, 0, 0));
        btnAlta.setText("DAR ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNumSeguro.setForeground(new java.awt.Color(0, 0, 0));
        lblNumSeguro.setText("  NUMERO DE SEGURO");

        btnBaja.setBackground(new java.awt.Color(204, 255, 204));
        btnBaja.setForeground(new java.awt.Color(0, 0, 0));
        btnBaja.setText("DAR BAJA");
        btnBaja.setFocusable(false);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 255, 204));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblPuesto.setForeground(new java.awt.Color(0, 0, 0));
        lblPuesto.setText("PUESTO");

        txtPuesto.setBackground(new java.awt.Color(255, 255, 255));
        txtPuesto.setForeground(new java.awt.Color(0, 0, 0));
        txtPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuestoKeyTyped(evt);
            }
        });

        txtNumSeguro.setBackground(new java.awt.Color(255, 255, 255));
        txtNumSeguro.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtNumSeguro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtRFC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUUU######AAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCURP.setBackground(new java.awt.Color(255, 255, 255));
        txtCURP.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCURP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUUU######UUUUUUAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblApellidoP)
                        .addGap(29, 29, 29)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaBaja)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFechaBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(txtNumSeguro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidoM)
                            .addComponent(lblRFC)
                            .addComponent(lblCURP))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(txtRFC)
                            .addComponent(txtCURP))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo1)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImagen)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(94, 94, 94)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstado)
                            .addComponent(lblFechaAlta))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dcFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTitulo1)
                        .addGap(6, 6, 6)
                        .addComponent(lblTitulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuesto))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblApellidoP))
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblApellidoM))
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCURP)
                    .addComponent(txtCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dcFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja)
                    .addComponent(btnModificar))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        if(txtPuesto.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(30);
        }else if(txtNombre.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(1);
        }else if(txtApellidoP.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(2);
        }else if(txtApellidoM.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(3);
        }else if(txtRFC.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(12);
        }else if(txtCURP.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(13);
        }else if(cbEstado.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(17);
        }else if(dcFechaAlta.getDate() == null){
            flag = true;
            throw new MisExcepciones(14);
        }else  if(txtNumSeguro.getText().trim().isEmpty()){
            flag = true;
            throw new MisExcepciones(16);
        }
        return flag;
    }
    
    private void limpiarCampos(){
        txtId.setText("");
        txtId.setEnabled(false);
        txtPuesto.setText("");
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        txtRFC.setText("");
        txtCURP.setText("");
        cbEstado.setSelectedIndex(0);
        dcFechaAlta.setDate(null);
        dcFechaBaja.setDate(null);
        dcFechaBaja.setEnabled(false);
        txtNumSeguro.setText("");
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        limpiarCampos();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try {
            if(!camposVacios()){
            Date fechaAlta = new Date(dcFechaAlta.getDate().getTime());
                empleadoDao = new Empleado(txtPuesto.getText(), txtNombre.getText(), txtApellidoP.getText(),
                txtApellidoM.getText(), txtRFC.getText(), txtCURP.getText(), cbEstado.getSelectedIndex(),
                fechaAlta, null, txtNumSeguro.getText());
                dao.insertarEmpleado(empleadoDao);
                JOptionPane.showMessageDialog(this, "Registrado Exitosamente");
                limpiarCampos();
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Empleado ya registrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al dar de alta");
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private boolean buscar(){
        boolean flag = false;
        try {
            Query qf = entma.createNamedQuery("Tblempleado.findByIdEmpleado");
            qf.setParameter("idEmpleado", Integer.valueOf(txtId.getText()));
            empleadoJpa = (jpa.Tblempleado)qf.getSingleResult();
            txtPuesto.setText(empleadoJpa.getPuesto());
            txtNombre.setText(empleadoJpa.getNombre());
            txtApellidoP.setText(empleadoJpa.getApellidoP());
            txtApellidoM.setText(empleadoJpa.getApellidoM());
            txtRFC.setText(empleadoJpa.getRfc());
            txtCURP.setText(empleadoJpa.getCurp());
            cbEstado.setSelectedIndex(empleadoJpa.getTblEstadoidEstado().getIdEstado());
            txtNumSeguro.setText(empleadoJpa.getNumSeguro());
            dcFechaAlta.setDate(empleadoJpa.getFechaAlta());
            if(empleadoJpa.getFechaBaja() != null){
                dcFechaBaja.setDate(empleadoJpa.getFechaBaja());
            }
            flag = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay empleado con el id # " + txtId.getText());
        }
        return flag;
    }
    
    private void habilitar(){
        txtPuesto.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellidoP.setEnabled(true);
        txtApellidoM.setEnabled(true);
        txtRFC.setEnabled(true);
        txtCURP.setEnabled(true);
        cbEstado.setEnabled(true);
        dcFechaAlta.setEnabled(true);
        txtNumSeguro.setEnabled(true);
    }
    
    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        try {
            if(btnBaja.isSelected()){
                btnBaja.setBackground(Color.RED);
                txtId.setEnabled(true);  
                if(btnModificar.isSelected()){
                    btnModificar.setSelected(false);
                    btnModificar.setBackground(new Color(204,255,204));
                    limpiarCampos();
                }
            }else{
                if(!txtId.getText().isEmpty()){
                    if(txtNombre.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Favor de buscar el empleado");
                    }else{
                        switch (JOptionPane.showConfirmDialog(this, "Desea dar de baja a # " + txtId.getText())) {
                            case JOptionPane.YES_OPTION:
                                entma.getTransaction().begin();
                                Date fechaBaja = new Date(dcFechaBaja.getDate().getTime());
                                empleadoJpa.setFechaBaja(fechaBaja);
                                entma.getTransaction().commit();
                                JOptionPane.showMessageDialog(this, "EMPLEADO # " + txtId.getText() + " DADO DE BAJA");
                                habilitar();
                                limpiarCampos();
                                btnBaja.setSelected(false);
                                btnBaja.setBackground(new Color(204,255,204));
                                break;
                            case JOptionPane.NO_OPTION:
                                btnBaja.setSelected(true);
                                break;
                            default:
                                limpiarCampos();
                                habilitar();
                                btnBaja.setSelected(false);
                                btnBaja.setBackground(new Color(204,255,204));
                                break;
                        }
                    }
                }else{
                   btnBaja.setBackground(new Color(204,255,204));
                   txtId.setEnabled(false);
                   dcFechaBaja.setEnabled(false);   
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(btnModificar.isSelected()){
                btnModificar.setBackground(Color.ORANGE);
                txtId.setEnabled(true);
                if(btnBaja.isSelected()){
                    habilitar();
                    btnBaja.setSelected(false);
                    btnBaja.setBackground(new Color(204,255,204));
                    limpiarCampos();
                }
            }else{
                if(!txtId.getText().isEmpty()){
                    if(txtNombre.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Favor de buscar el empleado");
                    }else{
                        if(!camposVacios()){
                            switch (JOptionPane.showConfirmDialog(this, "Desea modificar a # " + txtId.getText())) {
                                case JOptionPane.YES_OPTION:
                                    entma.getTransaction().begin();
                                    empleadoJpa.setPuesto(txtPuesto.getText());
                                    empleadoJpa.setNombre(txtNombre.getText());
                                    empleadoJpa.setApellidoP(txtApellidoP.getText());
                                    empleadoJpa.setApellidoM(txtApellidoM.getText());
                                    empleadoJpa.setRfc(txtRFC.getText());
                                    empleadoJpa.setCurp(txtCURP.getText());
                                    estado = new Tblestado(cbEstado.getSelectedIndex());
                                    empleadoJpa.setTblEstadoidEstado(estado);
                                    Date fechaAlta = new Date(dcFechaAlta.getDate().getTime());
                                    empleadoJpa.setFechaAlta(fechaAlta);
                                    empleadoJpa.setNumSeguro(txtNumSeguro.getText());
                                    entma.getTransaction().commit();
                                    JOptionPane.showMessageDialog(this, "EMPLEADO # " + txtId.getText() + " MODIFICADO");
                                    habilitar();
                                    limpiarCampos();
                                    btnModificar.setSelected(false);
                                    btnModificar.setBackground(new Color(204,255,204));
                                    break;
                                case JOptionPane.NO_OPTION:
                                    btnModificar.setSelected(true);
                                    break;
                                default:
                                    limpiarCampos();
                                    habilitar();
                                    btnModificar.setSelected(false);
                                    btnModificar.setBackground(new Color(204,255,204));
                                break;
                            }
                        }
                    }
                }else{
                    btnModificar.setBackground(new Color(204,255,204));
                    txtId.setEnabled(false);  
                }
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if(txtId.getText().isEmpty()){
                throw new MisExcepciones(72);
            }else{
                if(btnBaja.isSelected()){
                    if(buscar()){
                        txtId.setEnabled(false);
                        txtPuesto.setEnabled(false);
                        txtNombre.setEnabled(false);
                        txtApellidoP.setEnabled(false);
                        txtApellidoM.setEnabled(false);
                        txtRFC.setEnabled(false);
                        txtCURP.setEnabled(false);
                        cbEstado.setEnabled(false);
                        dcFechaBaja.setEnabled(true); 
                        dcFechaAlta.setEnabled(false);
                        txtNumSeguro.setEnabled(false);
                    }
                }else if(btnModificar.isSelected()){
                    buscar();
                }
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuestoKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && c != ' ') || txtPuesto.getText().length() > 19){
            evt.consume();
        }
    }//GEN-LAST:event_txtPuestoKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && c != ' ') || txtNombre.getText().length() > 19){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && c != ' ')  || txtApellidoP.getText().length() > 19){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && c != ' ')  || txtApellidoP.getText().length() > 19){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JToggleButton btnBaja;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbEstado;
    private com.toedter.calendar.JDateChooser dcFechaAlta;
    private com.toedter.calendar.JDateChooser dcFechaBaja;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaAlta;
    private javax.swing.JLabel lblFechaBaja;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumSeguro;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JFormattedTextField txtCURP;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumSeguro;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JFormattedTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
