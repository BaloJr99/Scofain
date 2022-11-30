package ventanas;

import cl.model.dao.CiudadDao;
import cl.model.dao.ClienteDao;
import cl.model.dao.ColoniaDao;
import cl.model.dao.DomicilioDao;
import cl.model.dao.ReceptorDao;
import cl.model.dao.TelefonoDao;
import cl.model.db.Ciudad;
import cl.model.db.Cliente;
import cl.model.db.Colonia;
import cl.model.db.Domicilio;
import cl.model.db.Estado;
import cl.model.db.Receptor;
import cl.model.db.Telefono;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import jpa.Tblciudad;
import jpa.Tblcliente;
import jpa.Tblcolonia;
import jpa.Tbldomicilio;
import jpa.Tblestado;
import jpa.Tblreceptor;
import jpa.Tbltelefono;
import misExcepciones.MisExcepciones;

public class Clientes extends javax.swing.JFrame {

    Cliente cliente;
    Receptor receptor;
    Estado estado;
    Ciudad ciudad;
    Colonia colonia;
    Domicilio domicilio;
    Telefono telefono;
    
    ClienteDao clienteDao = new ClienteDao();
    ReceptorDao receptorDao = new ReceptorDao();
    CiudadDao ciudadDao = new CiudadDao();
    ColoniaDao coloniaDao = new ColoniaDao();
    DomicilioDao domicilioDao = new DomicilioDao();
    TelefonoDao telefonoDao = new TelefonoDao();
    
    Tblcliente tblcliente;
    Tblreceptor tblreceptor;
    Tblestado tblestado;
    Tblciudad tblciudad;
    Tblcolonia tblcolonia;
    Tbldomicilio tbldomicilio;
    Tbltelefono tbltelefono;
    
    private int idCiudad = 0;
    private int idDomicilio = 0;
    private int idTelefono = 0;
    private String codigoPostal = "";
    
    public Clientes() {
        super("Clientes");
        initComponents();
        setLocationRelativeTo(null);
        txtID.setEditable(false);
        txtNumExt.setEditable(false);
        txtRFC.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel2 = new javax.swing.JPanel();
        txtRFC = new javax.swing.JFormattedTextField();
        lblImagen = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        lblRazonSocial = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNumInt = new javax.swing.JTextField();
        cbNum = new javax.swing.JComboBox<>();
        txtNumExt = new javax.swing.JTextField();
        lblColonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblCodigoPostal = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnNueva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        btnRegresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtRFC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUUA#####AAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 300, -1));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Clientes.png"))); // NOI18N
        jPanel2.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 0, -1, -1));

        lblTitulo1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setText("REGISTRO DE");
        jPanel2.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 30, -1, -1));

        lblTitulo2.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("CLIENTES");
        lblTitulo2.setFocusable(false);
        jPanel2.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 79, 260, -1));

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");
        jPanel2.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 154, -1, -1));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 150, 38, -1));

        txtRazonSocial.setBackground(new java.awt.Color(255, 255, 255));
        txtRazonSocial.setForeground(new java.awt.Color(0, 0, 0));
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });
        jPanel2.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 299, -1));

        lblRazonSocial.setForeground(new java.awt.Color(0, 0, 0));
        lblRazonSocial.setText("RAZÓN SOCIAL");
        jPanel2.add(lblRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblRFC.setForeground(new java.awt.Color(0, 0, 0));
        lblRFC.setText("RFC");
        jPanel2.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("ESTADO");
        jPanel2.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 60, 30));

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setForeground(new java.awt.Color(0, 0, 0));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Aguascalientes", "Baja California Norte", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila de Zaragoza", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        jPanel2.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 297, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 255, 204));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, -1, -1));

        btnAlta.setBackground(new java.awt.Color(204, 255, 204));
        btnAlta.setForeground(new java.awt.Color(0, 0, 0));
        btnAlta.setText("DAR ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 110, -1));

        btnModificar.setBackground(new java.awt.Color(204, 255, 204));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 110, -1));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 100, -1));

        lblCalle.setBackground(new java.awt.Color(102, 255, 255));
        lblCalle.setForeground(new java.awt.Color(0, 0, 0));
        lblCalle.setText("CALLE");
        jPanel2.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 40, 30));

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        jPanel2.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 300, -1));

        txtNumInt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumInt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumIntKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, -1));

        cbNum.setBackground(new java.awt.Color(255, 153, 153));
        cbNum.setForeground(new java.awt.Color(0, 0, 0));
        cbNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NUM INT", "NUM INT/EXT" }));
        cbNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumActionPerformed(evt);
            }
        });
        jPanel2.add(cbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, -1));

        txtNumExt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumExt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumExtKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 130, -1));

        lblColonia.setBackground(new java.awt.Color(102, 255, 255));
        lblColonia.setForeground(new java.awt.Color(0, 0, 0));
        lblColonia.setText("COLONIA");
        jPanel2.add(lblColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 40));

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });
        jPanel2.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 300, -1));

        lblCodigoPostal.setBackground(new java.awt.Color(51, 255, 204));
        lblCodigoPostal.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoPostal.setText("CODIGO POSTAL");
        jPanel2.add(lblCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        txtCodigoPostal.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoPostal.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 60, -1));

        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("TELEFONO");
        jPanel2.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, 30));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 140, -1));

        lblCiudad.setBackground(new java.awt.Color(51, 255, 204));
        lblCiudad.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudad.setText("CIUDAD");
        jPanel2.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 300, -1));

        btnNueva.setBackground(new java.awt.Color(204, 255, 204));
        btnNueva.setForeground(new java.awt.Color(0, 0, 0));
        btnNueva.setText("NUEVA CONSULTA");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 150, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TIPO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        cbTipo.setBackground(new java.awt.Color(255, 255, 255));
        cbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..", "Persona Fisica", "Persona Moral" }));
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
        jPanel2.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 300, -1));

        btnRegresar1.setBackground(new java.awt.Color(204, 255, 204));
        btnRegresar1.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar1.setText("REGRESAR");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        if(txtRazonSocial.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(18);
        }else if(txtRFC.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(12);
        }else if(cbEstado.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(17);
        }else if(txtCalle.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(19);
        }else if(txtNumInt.getText().isEmpty()){
                flag = true;
            throw new MisExcepciones(20);
        }else if(cbNum.getSelectedIndex() == 1){
            if(txtNumExt.getText().isEmpty()){
                flag = true;
                throw new MisExcepciones(21);
            }
        }else if(txtColonia.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(22);
        }else if(txtCodigoPostal.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(23);
        }else if(txtTelefono.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(24);
        }else if(txtCiudad.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(25);
        }
        return flag;
    }
    
    private void limpiarCampos(){
        txtID.setText("");
        txtRazonSocial.setText("");
        txtCalle.setText("");
        txtCiudad.setText("");
        txtCodigoPostal.setText("");
        txtColonia.setText("");
        txtNumExt.setText("");
        txtNumInt.setText("");
        txtRFC.setText("");
        txtTelefono.setText("");
        txtNumExt.setEditable(false);
        cbEstado.setSelectedIndex(0);
        cbNum.setSelectedIndex(0);
        txtRFC.setEnabled(false);
        txtRFC.setText("");
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try {
            if(!camposVacios()){
                receptor = new Receptor(txtRFC.getText());
                ciudad = new Ciudad(cbEstado.getSelectedIndex(), txtCiudad.getText());
                colonia = new Colonia(txtCodigoPostal.getText(), txtColonia.getText(), ciudadDao.buscarCiudad(ciudad));
                try {
                    Query qf = entma.createNamedQuery("Tblreceptor.findByRfcReceptor");
                    qf.setParameter("rfcReceptor", txtRFC.getText());
                    tblreceptor = (Tblreceptor)qf.getSingleResult();
                } catch (NoResultException e) {
                    receptorDao.insertarReceptor(receptor);
                }
                try {
                    Query qf = entma.createNamedQuery("Tblciudad.findByCiudad");
                    qf.setParameter("ciudad", txtCiudad.getText());
                    tblciudad = (Tblciudad)qf.getSingleResult();
                } catch (NoResultException e) {
                    ciudadDao.insertarCiudad(ciudad);
                }try {
                    Query qf = entma.createNamedQuery("Tblcolonia.findByCodigoPostal");
                    qf.setParameter("codigoPostal", txtCodigoPostal.getText());
                    tblcolonia = (Tblcolonia)qf.getSingleResult();
                } catch (NoResultException e) {
                    coloniaDao.insertarColonia(colonia);
                }
                if(txtNumExt.getText().isEmpty()){
                    domicilio = new Domicilio(txtCalle.getText(), txtNumInt.getText(), "0", coloniaDao.buscarColonia(colonia));
                }else{
                    domicilio = new Domicilio(txtCalle.getText(), txtNumInt.getText(), txtNumExt.getText(), coloniaDao.buscarColonia(colonia));
                }
                domicilioDao.insertarDomicilio(domicilio);
                telefono = new Telefono(txtTelefono.getText());
                telefonoDao.insertarTelefono(telefono);
                cliente = new Cliente(txtRazonSocial.getText(), txtRFC.getText(), domicilioDao.buscarDomicilio(domicilio), telefonoDao.buscarTelefono(telefono));
                clienteDao.insertarCliente(cliente);
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Registrado Exitosamente");
            }
        } catch (HeadlessException | SQLException | MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        limpiarCampos();
        txtID.setEditable(true);
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void cbNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumActionPerformed
        if(cbNum.getSelectedIndex() == 0){
            txtNumExt.setEditable(false);
            txtNumExt.setText("");
        }else{
            txtNumExt.setEditable(true);
        }
    }//GEN-LAST:event_cbNumActionPerformed

    public void datosViejos(){
        idCiudad = tblcliente.getTblDomicilioidDomicilio().getTblColoniacodigoPostal().getTblCiudadidCiudad().getIdCiudad();
        idDomicilio = tblcliente.getTblDomicilioidDomicilio().getIdDomicilio();
        idTelefono = tblcliente.getTblTelefonoidTelefono().getIdTelefono();
        codigoPostal = tblcliente.getTblDomicilioidDomicilio().getTblColoniacodigoPostal().getCodigoPostal();
        //Buscar Ciudad
        Query qf = entma.createNamedQuery("Tblciudad.findByIdCiudad");
        qf.setParameter("idCiudad", idCiudad);
        tblciudad = (Tblciudad)qf.getSingleResult();
        //Buscar Colonia
        Query qf1 = entma.createNamedQuery("Tblcolonia.findByCodigoPostal");
        qf1.setParameter("codigoPostal", codigoPostal);
        tblcolonia = (Tblcolonia)qf1.getSingleResult();
        //Buscar Domicilio
        Query qf2 = entma.createNamedQuery("Tbldomicilio.findByIdDomicilio");
        qf2.setParameter("idDomicilio", idDomicilio);
        tbldomicilio = (Tbldomicilio)qf2.getSingleResult();
        //Buscar telefono
        Query qf3 = entma.createNamedQuery("Tbltelefono.findByIdTelefono");
        qf3.setParameter("idTelefono", idTelefono);
        tbltelefono = (Tbltelefono)qf3.getSingleResult();
        
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if(txtID.getText().isEmpty()){
                throw new MisExcepciones(1);
            }else{
                Query qf = entma.createNamedQuery("Tblcliente.findByIdCliente");
                qf.setParameter("idCliente", Integer.valueOf(txtID.getText()));
                tblcliente = (Tblcliente)qf.getSingleResult();
                txtRazonSocial.setText(tblcliente.getRazonSocial());
                txtRFC.setText(tblcliente.getTblReceptorrfcReceptor().getRfcReceptor());
                txtNumInt.setText(tblcliente.getTblDomicilioidDomicilio().getNumeroInterior());
                if(!tblcliente.getTblDomicilioidDomicilio().getNumeroExterior().equals("")){
                    cbNum.setEditable(true);
                    txtNumExt.setText(tblcliente.getTblDomicilioidDomicilio().getNumeroExterior());
                }
                txtCalle.setText(tblcliente.getTblDomicilioidDomicilio().getCalle());
                txtCodigoPostal.setText(tblcliente.getTblDomicilioidDomicilio().getTblColoniacodigoPostal().getCodigoPostal());
                txtColonia.setText(tblcliente.getTblDomicilioidDomicilio().getTblColoniacodigoPostal().getColonia());
                txtCiudad.setText(tblcliente.getTblDomicilioidDomicilio().getTblColoniacodigoPostal().getTblCiudadidCiudad().getCiudad());
                cbEstado.setSelectedIndex(tblcliente.getTblDomicilioidDomicilio().getTblColoniacodigoPostal().getTblCiudadidCiudad().getTblEstadoidEstado().getIdEstado());
                txtTelefono.setText(tblcliente.getTblTelefonoidTelefono().getTelefono());
                datosViejos();
                txtID.setEditable(false);
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(txtID.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Favor de buscar cliente");
            }else{
                if(!camposVacios()){
                    entma.getTransaction().begin();
                    tblcliente.setRazonSocial(txtRazonSocial.getText());
                    tblciudad.setCiudad(txtCiudad.getText());
                    tblestado = new Tblestado(cbEstado.getSelectedIndex());
                    tblciudad.setTblEstadoidEstado(tblestado);
                    tblciudad.setCiudad(txtCiudad.getText());
                    tblcolonia.setColonia(txtColonia.getText());
                    tblcolonia.setCodigoPostal(txtCodigoPostal.getText());
                    tblcolonia.setTblCiudadidCiudad(tblciudad);
                    tbldomicilio.setCalle(txtCalle.getText());
                    tbldomicilio.setNumeroExterior(txtNumExt.getText());
                    tbldomicilio.setNumeroInterior(txtNumInt.getText());
                    tbldomicilio.setTblColoniacodigoPostal(tblcolonia);
                    tbltelefono.setTelefono(txtTelefono.getText());
                    entma.getTransaction().commit();
                    limpiarCampos();
                    JOptionPane.showMessageDialog(this, "Modificado exitosamente");
                }
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && c != ' ') || txtRazonSocial.getText().length() > 49){
            evt.consume();
        }
    }//GEN-LAST:event_txtRazonSocialKeyTyped

    private void txtNumIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumIntKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isDigit(c)  && c == ' ')|| txtNumInt.getText().length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumIntKeyTyped

    private void txtNumExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumExtKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') || txtNumExt.getText().length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumExtKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') || txtColonia.getText().length() > 14){
            evt.consume();
        }
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) || txtTelefono.getText().length() > 9){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') || txtCiudad.getText().length() > 29){
            evt.consume();
        }
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        char c = evt.getKeyChar();
        
        if((!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') || txtCalle.getText().length() > 19){
            evt.consume();
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        try {
            if(cbTipo.getSelectedIndex() == 0){
                txtRFC.setEnabled(false);
                txtRFC.setText("");
            }else{
                txtRFC.setEnabled(true);
                if(cbTipo.getSelectedIndex() == 1){
                    txtRFC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("UUUU######AAA")));
                    txtRFC.setText("             ");
                }else{
                    txtRFC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("UUU######AAA")));
                    txtRFC.setText("            ");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cbTipoItemStateChanged

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        limpiarCampos();
        this.dispose();
    }//GEN-LAST:event_btnRegresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbNum;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.persistence.EntityManager entma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JFormattedTextField txtRFC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
