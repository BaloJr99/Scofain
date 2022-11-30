package ventanas;

import cl.model.dao.DatoPolizaDao;
import cl.model.dao.PolizaDao;
import cl.model.db.DatoPoliza;
import cl.model.db.Poliza;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblcatalogocuentas;
import jpa.Tbldatopoliza;
import jpa.Tblpoliza;
import misExcepciones.MisExcepciones;

public class Polizas extends javax.swing.JFrame {

    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    
    private int encontrado = 0;
    
    private Tblpoliza tblpoliza;
    private Tbldatopoliza tbldatoPoliza;
    private Tblcatalogocuentas tblcatalogocuentas;
    
    private Poliza poliza;
    private DatoPoliza dato;
    
    private PolizaDao polizaDao = new PolizaDao();
    private DatoPolizaDao datoPolizaDao = new DatoPolizaDao();
    
    public Polizas() {
        super("Polizas");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        txtNumPoliza = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConta = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblDebe = new javax.swing.JLabel();
        lblHaber = new javax.swing.JLabel();
        txtDebe = new javax.swing.JTextField();
        txtHaber = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblNombreCuenta = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        txtTotalHaber = new javax.swing.JTextField();
        txtTotalDebe = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        dcFecha = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        txtNumPoliza.setBackground(new java.awt.Color(204, 204, 255));
        txtNumPoliza.setForeground(new java.awt.Color(0, 0, 0));
        txtNumPoliza.setToolTipText("# póliza");
        txtNumPoliza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumPolizaFocusLost(evt);
            }
        });
        txtNumPoliza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumPolizaKeyTyped(evt);
            }
        });

        tbConta.setBackground(new java.awt.Color(204, 204, 255));
        tbConta.setForeground(new java.awt.Color(0, 0, 0));
        tbConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cuenta", "Descripcion", "Debe", "Haber"
            }
        ));
        tbConta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbConta);

        lblTitulo.setBackground(new java.awt.Color(204, 204, 255));
        lblTitulo.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("PÓLIZAS");

        lblCuenta.setBackground(new java.awt.Color(204, 204, 255));
        lblCuenta.setForeground(new java.awt.Color(0, 0, 0));
        lblCuenta.setText("Cuenta");

        lblDebe.setBackground(new java.awt.Color(204, 204, 255));
        lblDebe.setForeground(new java.awt.Color(0, 0, 0));
        lblDebe.setText("Debe ");

        lblHaber.setBackground(new java.awt.Color(204, 204, 255));
        lblHaber.setForeground(new java.awt.Color(0, 0, 0));
        lblHaber.setText("Haber");

        txtDebe.setBackground(new java.awt.Color(204, 204, 255));
        txtDebe.setForeground(new java.awt.Color(0, 0, 0));
        txtDebe.setText("0.00");
        txtDebe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDebeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDebeFocusLost(evt);
            }
        });
        txtDebe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDebeKeyTyped(evt);
            }
        });

        txtHaber.setBackground(new java.awt.Color(204, 204, 255));
        txtHaber.setForeground(new java.awt.Color(0, 0, 0));
        txtHaber.setText("0.00");
        txtHaber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHaberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHaberFocusLost(evt);
            }
        });
        txtHaber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHaberKeyTyped(evt);
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

        btnEliminar.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        lblNombreCuenta.setBackground(new java.awt.Color(204, 204, 255));
        lblNombreCuenta.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setText("POLIZA NUEVA");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtTotalHaber.setBackground(new java.awt.Color(204, 204, 255));
        txtTotalHaber.setForeground(new java.awt.Color(0, 0, 0));

        txtTotalDebe.setBackground(new java.awt.Color(204, 204, 255));
        txtTotalDebe.setForeground(new java.awt.Color(0, 0, 0));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCodigo.setText("000-00-000");
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        dcFecha.setBackground(new java.awt.Color(204, 204, 255));
        dcFecha.setForeground(new java.awt.Color(0, 0, 0));
        try {
            dcFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(lblTitulo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCuenta)
                        .addGap(20, 20, 20)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDebe)
                        .addGap(28, 28, 28)
                        .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblHaber)
                        .addGap(42, 42, 42)
                        .addComponent(txtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(12, 12, 12)
                        .addComponent(btnNuevo)
                        .addGap(6, 6, 6)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(619, 619, 619)
                .addComponent(txtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitulo)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumPoliza)
                            .addComponent(dcFecha))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblCuenta))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblDebe))
                            .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblHaber))
                            .addComponent(txtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(btnNuevo)
                            .addComponent(btnEliminar))
                        .addGap(12, 12, 12)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        try {
            if(!txtTotalDebe.getText().equals(txtTotalHaber.getText())){
                if(JOptionPane.showConfirmDialog(this, "Desea agregar una cuenta de ajuste??") == JOptionPane.YES_OPTION){
                    agregar();
                    limpiarCampos();
                    this.dispose();
                }
            }else{
                limpiarCampos();
                this.dispose();
            }
        } catch (HeadlessException | SQLException | MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto");
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    public boolean camposPólizaVacios() throws MisExcepciones, ParseException{
        boolean flag = false;
        Date fecha = formato.parse(dcFecha.getText());
        if(fecha == null){
            flag = true;
            throw new MisExcepciones(26);
        }else if(txtNumPoliza.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(27);
        }else if(txtDescripcion.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(11);
        }
        return flag;
    }
    
    public void limpiarCampos(){
        dcFecha.setText("");
        txtNumPoliza.setText("");
        txtDescripcion.setText("");
        txtCodigo.setText("00000000");
        lblNombreCuenta.setText("");
        txtDebe.setText("0.00");
        txtHaber.setText("0.00");
        DefaultTableModel modelo = (DefaultTableModel)tbConta.getModel();
        modelo.setRowCount(0);
        tbConta.setModel(modelo);
    }
    
    public String decodificarNumDatoPoliza(String aux){
        boolean flag = false;
        String num = "";
        
        for(int i = 0; i < aux.length(); i++){
            if(flag == true){
                num = num + aux.charAt(i) ;
            }
            
            if(aux.charAt(i) == '.'){
                flag = true;
            }
        }
        
        num = String.valueOf(Integer.valueOf(num) + 1);
        return num;
    }
    
    public void llenarTabla() throws SQLException, ParseException{
        float totaldebe = 0f, totalhaber = 0f;
        
        ArrayList<DatoPoliza> datos = datoPolizaDao.buscarDatosPoliza(codificarNumPoliza());
        Object datosllenado[] = new Object[5];
        DefaultTableModel modelo = (DefaultTableModel)tbConta.getModel();
        modelo.setRowCount(0);
        Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
        
        for(DatoPoliza listadato: datos){
            datosllenado[0] = decodificarNumDatoPoliza(listadato.getIdDatoPoliza());
            datosllenado[1] = listadato.getTblCatalogoCuentas_codigo();
            qf.setParameter("codigo", listadato.getTblCatalogoCuentas_codigo());
            tblcatalogocuentas = (Tblcatalogocuentas)qf.getSingleResult();
            datosllenado[2] = tblcatalogocuentas.getDescripcion();
            datosllenado[3] = listadato.getDebe();
            datosllenado[4] = listadato.getHaber();
            modelo.addRow(datosllenado);
            totaldebe = totaldebe + listadato.getDebe();
            totalhaber = totalhaber + listadato.getHaber();
        }
        txtTotalDebe.setText(String.valueOf(totaldebe));
        txtTotalHaber.setText(String.valueOf(totalhaber));
        tbConta.setModel(modelo);
        entma.clear();
    }
    
    public void agregar() throws MisExcepciones, SQLException, ParseException{
        if(!camposPólizaVacios()){
            if(txtDebe.getText().equals("0.00") && txtHaber.getText().equals("0.00")){
                float cuadre = Float.valueOf(txtTotalDebe.getText()) - Float.valueOf(txtTotalHaber.getText());
                if(cuadre < 0){
                    txtDebe.setText(String.valueOf(cuadre * -1));
                }else{
                    txtHaber.setText(String.valueOf(cuadre));
                }
                
                dato = new DatoPoliza(codificarNumPoliza() + "." + tbConta.getRowCount(), "000-00-000", codificarNumPoliza(), Float.valueOf(txtDebe.getText()), Float.valueOf(txtHaber.getText()));
                datoPolizaDao.insertarDatoPoliza(dato);
                llenarTabla();
                txtDebe.setText("0.00");
                txtHaber.setText("0.00");
                txtCodigo.setText("00000000");
            }else{
                dato = new DatoPoliza(codificarNumPoliza() + "." + tbConta.getRowCount(), txtCodigo.getText(), codificarNumPoliza(), Float.valueOf(txtDebe.getText()), Float.valueOf(txtHaber.getText()));
                datoPolizaDao.insertarDatoPoliza(dato);
                llenarTabla();
                txtDebe.setText("0.00");
                txtHaber.setText("0.00");
                txtCodigo.setText("00000000");
            }
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            agregar();
        } catch (MisExcepciones ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            if(!txtTotalDebe.getText().equals(txtTotalHaber.getText())){
                if(JOptionPane.showConfirmDialog(this, "Desea agregar una cuenta de ajuste??") == JOptionPane.YES_OPTION){
                    agregar();
                    limpiarCampos();
                }
            }else{
                limpiarCampos();
            }
        } catch (HeadlessException | SQLException | MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private String codificarNumPoliza() throws ParseException{
        String numPoliza = "";
        
        Date fecha = formato.parse(dcFecha.getText());
        String aux = formato.format(fecha);
        
        for(int i = 0; i < aux.length() - 2; i++){
            if(aux.charAt(i) != '-'){
                numPoliza = numPoliza + aux.charAt(i);
            }
        }
        numPoliza = txtNumPoliza.getText()+numPoliza;
        
        return numPoliza;
    }
    
    private void buscarPoliza() throws SQLException, ParseException{
        try {
            ArrayList<Poliza> listaP;
            polizaDao = new PolizaDao();
            listaP = polizaDao.listaPolizas(codificarNumPoliza());
            
            if(!listaP.isEmpty()){
                for(Poliza pol: listaP){
                    dcFecha.setText(pol.getFecha());
                    txtDescripcion.setText(pol.getConcepto());
                }
                llenarTabla();
                encontrado = 1;
            }else{
                throw new NoResultException();
            }
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "Ja");
            encontrado = 0;
            txtDescripcion.setText("");
            txtCodigo.setText("00000000");
            lblNombreCuenta.setText("");
            txtDebe.setText("0.00");
            txtHaber.setText("0.00");
            DefaultTableModel modelo = (DefaultTableModel)tbConta.getModel();
            modelo.setRowCount(0);
            tbConta.setModel(modelo);
        }
    }
    
    private void txtNumPolizaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumPolizaFocusLost
        try {
            buscarPoliza();
        } catch (SQLException e) {
            
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_txtNumPolizaFocusLost
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if(tbConta.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "Favor de seleccionar una fila");
            }else{
                int filaseleccionada = tbConta.getSelectedRow();
                Query qf = entma.createNamedQuery("Tbldatopoliza.findByIdDatoPoliza");
                qf.setParameter("idDatoPoliza", codificarNumPoliza() + "." + filaseleccionada);
                tbldatoPoliza = (Tbldatopoliza)qf.getSingleResult();
                entma.getTransaction().begin();
                entma.remove(tbldatoPoliza);
                entma.getTransaction().commit();
                llenarTabla();
                reajuste(filaseleccionada);
                JOptionPane.showMessageDialog(this, "Eliminado");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{   
            entma.clear();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void reajuste(int filaseleccionada) throws SQLException, ParseException{
        ArrayList<String> idDatoPoliza = new ArrayList<>();
        
        for(int i = 0; i < tbConta.getRowCount(); i++){
            idDatoPoliza.add(codificarNumPoliza() + "." + (Integer.valueOf(tbConta.getValueAt(i, 0).toString()) - 1));
        }
        
        datoPolizaDao.reajuste(codificarNumPoliza(), idDatoPoliza);
        llenarTabla();
    }
    
    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        try {
            if(!txtCodigo.getText().equals("   -  -   ")){
                Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
                qf.setParameter("codigo", txtCodigo.getText());
                tblcatalogocuentas = (Tblcatalogocuentas)qf.getSingleResult();
                lblNombreCuenta.setText(tblcatalogocuentas.getDescripcion());
            }else{
                txtCodigo.setText("00000000");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se encontro cuenta");
            txtCodigo.setText("");
            txtCodigo.requestFocus();
        }finally{   
            entma.clear();
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtDebeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDebeFocusGained
        if(txtDebe.getText().equals("0.00")){
            txtDebe.setText("");
        }
    }//GEN-LAST:event_txtDebeFocusGained

    private void txtDebeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDebeFocusLost
        try {
            if(txtDebe.getText().isEmpty()||Float.valueOf(txtDebe.getText()) == 0){
                txtDebe.setText("0.00");
            }else{
                txtHaber.setText("0.00");
            }
        } catch (NumberFormatException e) {
            txtDebe.setText("0.00");
        }
    }//GEN-LAST:event_txtDebeFocusLost

    private void txtHaberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHaberFocusGained
        if(txtHaber.getText().equals("0.00")){
            txtHaber.setText("");
        }
    }//GEN-LAST:event_txtHaberFocusGained

    private void txtHaberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHaberFocusLost
        try{
            if(txtHaber.getText().isEmpty()||Float.valueOf(txtHaber.getText()) == 0){
                txtHaber.setText("0.00");
            }else{
                txtDebe.setText("0.00");
            }
        } catch (NumberFormatException e) {
            txtDebe.setText("0.00");
        }
    }//GEN-LAST:event_txtHaberFocusLost

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            txtDebe.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        if(txtCodigo.getText().equals("000-00-000")){
            txtCodigo.setText("");
        }
    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtNumPolizaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPolizaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumPolizaKeyTyped

    private void txtDebeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebeKeyTyped
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtDebeKeyTyped

    private void txtHaberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHaberKeyTyped
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtHaberKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if(txtDescripcion.getText().length() > 199){
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost
        try {
            if(!camposPólizaVacios()){
                if(encontrado == 0){
                    poliza = new Poliza(codificarNumPoliza(), txtNumPoliza.getText(), 
                    formato.format(formato.parse(dcFecha.getText())), txtDescripcion.getText());
                    polizaDao.insertarPoliza(poliza);
                }
            }   
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_txtDescripcionFocusLost

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
            java.util.logging.Logger.getLogger(Polizas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polizas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polizas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polizas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polizas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JFormattedTextField dcFecha;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDebe;
    private javax.swing.JLabel lblHaber;
    private javax.swing.JLabel lblNombreCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbConta;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtDebe;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtHaber;
    private javax.swing.JTextField txtNumPoliza;
    private javax.swing.JTextField txtTotalDebe;
    private javax.swing.JTextField txtTotalHaber;
    // End of variables declaration//GEN-END:variables
}
