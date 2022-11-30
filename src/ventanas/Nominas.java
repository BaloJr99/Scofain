package ventanas;

import cl.model.dao.NominaDao;
import cl.model.dao.PrenominaDao;
import cl.model.db.Empleado;
import cl.model.db.Nomina;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblempleado;
import misExcepciones.MisExcepciones;

public class Nominas extends javax.swing.JFrame {

    String usuario;
    
    Nomina nomina;
    NominaDao nominaDao = new NominaDao();
    PrenominaDao prenominadao = new PrenominaDao();
    
    Tblempleado tblempleado;
    
    public Nominas() {
        super("Nomina");
        initComponents();
        setLocationRelativeTo(null);
        llenarLista();
    }
    
    public Nominas(String user) {
        super("Nomina");
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = user;
        llenarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        lblNominas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNominas = new javax.swing.JTable();
        lblNumNomina = new javax.swing.JLabel();
        txtNumNomina = new javax.swing.JTextField();
        lblFechaP = new javax.swing.JLabel();
        lblFechaI = new javax.swing.JLabel();
        lblFechaF = new javax.swing.JLabel();
        dcFechaP = new com.toedter.calendar.JDateChooser();
        dcFechaI = new com.toedter.calendar.JDateChooser();
        dcFechaF = new com.toedter.calendar.JDateChooser();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnNuevaNomina = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList<>();
        spinDias = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lblNominas.setBackground(new java.awt.Color(153, 255, 51));
        lblNominas.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        lblNominas.setForeground(new java.awt.Color(0, 0, 0));
        lblNominas.setText(":NOMINAS:");

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 51));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tbNominas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "Percepciones", "Deducciones", "Otros", "Total"
            }
        ));
        tbNominas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbNominas);

        lblNumNomina.setBackground(new java.awt.Color(153, 255, 51));
        lblNumNomina.setForeground(new java.awt.Color(0, 0, 0));
        lblNumNomina.setText("NOMINA #");

        txtNumNomina.setBackground(new java.awt.Color(153, 255, 51));
        txtNumNomina.setForeground(new java.awt.Color(0, 0, 0));
        txtNumNomina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumNominaFocusLost(evt);
            }
        });
        txtNumNomina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumNominaKeyTyped(evt);
            }
        });

        lblFechaP.setBackground(new java.awt.Color(153, 255, 51));
        lblFechaP.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaP.setText("FECHA PAGO");

        lblFechaI.setBackground(new java.awt.Color(153, 255, 51));
        lblFechaI.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaI.setText("FECHA INICIAL");

        lblFechaF.setBackground(new java.awt.Color(153, 255, 51));
        lblFechaF.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaF.setText("FECHA FINAL");

        dcFechaP.setBackground(new java.awt.Color(153, 255, 51));
        dcFechaP.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaP.setDateFormatString("yyyy-MM-dd");

        dcFechaI.setBackground(new java.awt.Color(153, 255, 51));
        dcFechaI.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaI.setDateFormatString("yyyy-MM-dd");

        dcFechaF.setBackground(new java.awt.Color(153, 255, 51));
        dcFechaF.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaF.setDateFormatString("yyyy-MM-dd");

        btnGenerar.setBackground(new java.awt.Color(153, 255, 51));
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 255, 51));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(153, 255, 51));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtTotal.setBackground(new java.awt.Color(153, 255, 51));
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));

        txtEstado.setBackground(new java.awt.Color(153, 255, 51));
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtEstado.setToolTipText("");
        txtEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblEmpleados.setBackground(new java.awt.Color(153, 255, 51));
        lblEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        lblEmpleados.setText("EMPLEADOS");

        btnAgregar.setBackground(new java.awt.Color(153, 255, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 255, 51));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(153, 255, 51));
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("Total Nomina:");

        btnNuevaNomina.setBackground(new java.awt.Color(153, 255, 51));
        btnNuevaNomina.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaNomina.setText("NUEVA NOMINA");
        btnNuevaNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaNominaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaEmpleados);

        spinDias.setModel(new javax.swing.SpinnerNumberModel(7, 7, 31, 1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DÍAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lblNominas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevaNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNumNomina)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtNumNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(spinDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFechaI)
                                        .addGap(10, 10, 10)
                                        .addComponent(dcFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFechaF)
                                        .addGap(18, 18, 18)
                                        .addComponent(dcFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFechaP)
                                        .addGap(17, 17, 17)
                                        .addComponent(dcFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleados)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNominas)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtNumNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(dcFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(8, 8, 8)
                        .addComponent(btnGenerar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevaNomina)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(btnRegresar))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuario);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNumNominaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumNominaKeyTyped
        char c = evt.getKeyChar();
        
        if(c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumNominaKeyTyped

    private void txtNumNominaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumNominaFocusLost
        llenarTabla();
        comprobarLista();
    }//GEN-LAST:event_txtNumNominaFocusLost

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            DefaultListModel modelo = (DefaultListModel)listaEmpleados.getModel();
            int idsEmpleado[] = listaEmpleados.getSelectedIndices();
            int idEmpleado;
            if(!camposVacios() && !listaEmpleados.getSelectedValuesList().isEmpty()){
                int dias = (int)((dcFechaF.getDate().getTime() - dcFechaI.getDate().getTime())/86400000);
                if(Integer.valueOf(spinDias.getValue().toString()) - 1 ==  dias){
                    for(int i = 0; i < listaEmpleados.getSelectedValuesList().size(); i++){
                        idEmpleado = decodificarId(modelo.get(idsEmpleado[i]).toString());
                        Date fechaP = new Date(dcFechaP.getDate().getTime());
                        Date fechaI = new Date(dcFechaI.getDate().getTime());
                        Date fechaF = new Date(dcFechaF.getDate().getTime());                    

                        nomina = new Nomina(txtNumNomina.getText() + "." +  idEmpleado, "Pendiente", fechaP, fechaI, fechaF, idEmpleado, prenominadao.percepciones(idEmpleado), prenominadao.deducciones(idEmpleado), prenominadao.otros(idEmpleado));
                        nominaDao.insertarNomina(nomina);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Los dias a pagar no cuadran con la fecha inicial - fecha final");
                }
                llenarTabla();
                comprobarLista();
            }else{
                throw new MisExcepciones(65);
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevaNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaNominaActionPerformed
        limpiarNomina();
    }//GEN-LAST:event_btnNuevaNominaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            if(txtEstado.getText().equals("Cancelado") || txtEstado.getText().equals("Pendiente")){
                throw new MisExcepciones(70);
            }else if(!camposVacios()){
                nominaDao.cancelarNomina(Integer.valueOf(txtNumNomina.getText()));
                JOptionPane.showMessageDialog(this, "CANCELADA");
                limpiarNomina();
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            if(txtEstado.getText().equals("Cancelado") || txtEstado.getText().equals("Vigente")){
                throw new MisExcepciones(71);
            }else if(!camposVacios()){
                nominaDao.generarNomina(Integer.valueOf(txtNumNomina.getText()));
                JOptionPane.showMessageDialog(this, "GENERADA");
                limpiarNomina();
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if(txtEstado.getText().equals("Vigente") || txtEstado.getText().equals("Cancelado")){
                throw new MisExcepciones(57);
            }else if(!txtNumNomina.getText().isEmpty() && tbNominas.getSelectedRow() != -1){
                nominaDao.eliminarNomina(Integer.valueOf(txtNumNomina.getText()), decodificarId(tbNominas.getValueAt(tbNominas.getSelectedRow(), 0).toString()));
                llenarTabla();
                llenarLista();
                comprobarLista();
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar una fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void limpiarNomina(){
        txtNumNomina.setText("");
        txtEstado.setText("");
        llenarLista();
        DefaultTableModel modelo = (DefaultTableModel)tbNominas.getModel();
        modelo.setRowCount(0);
        tbNominas.setModel(modelo);
        dcFechaI.setDate(null);
        dcFechaP.setDate(null);
        dcFechaF.setDate(null);
    }
    
    public int decodificarId(String empleado){
        String id = "";
        
        boolean flag = false;
        
        for(int i = 0; i < empleado.length(); i++){
            if(empleado.charAt(i) == '.'){
                flag = true;
            }
            
            if(!flag){
                id += empleado.charAt(i);
            }
        }
        
        return Integer.valueOf(id);
    }
    
    public void comprobarLista(){
        DefaultListModel modelo = (DefaultListModel)listaEmpleados.getModel();
        boolean flag = false;
        for(int i = modelo.getSize() - 1; i >= 0; i--){
            for(int j = 0; j < tbNominas.getRowCount(); j++){
                if(modelo.getElementAt(i).toString().equals(tbNominas.getValueAt(j, 0))){
                    flag = true;
                }
            }
            if(flag){
                modelo.remove(i);
                flag = false;
            }
        }
        listaEmpleados.setModel(modelo);
    }
    
    public boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        if(txtNumNomina.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(69);
        }else if(dcFechaP.getDate() == null){
            flag = true;
            throw new MisExcepciones(66);
        }else if(dcFechaI.getDate() == null){
            flag = true;
            throw new MisExcepciones(67);
        }else if(dcFechaF.getDate() == null){
            flag = true;
            throw new MisExcepciones(68);
        }
        return flag;
    }
    
    public void llenarTabla(){
        try {
            float totalnomina = 0f;
            Query qf = entma.createNamedQuery("Tblempleado.findByIdEmpleado");
            ArrayList<Nomina> listaN = nominaDao.listaNomina(Integer.valueOf(txtNumNomina.getText()));
            DefaultTableModel modeloTabla = (DefaultTableModel)tbNominas.getModel();
            modeloTabla.setRowCount(0);
            Object datosllenado[] = new Object[5];

            for(Nomina nom: listaN){
                dcFechaP.setDate(nom.getFechaPago());
                dcFechaI.setDate(nom.getFechaInicial());
                dcFechaF.setDate(nom.getFechaFinal());
                txtEstado.setText(nom.getEstado());
                qf.setParameter("idEmpleado", nom.getTblEmpleado_idEmpleado());
                tblempleado = (Tblempleado)qf.getSingleResult();
                datosllenado[0] = tblempleado.getIdEmpleado() + "." + tblempleado.getNombre() + " " + tblempleado.getApellidoP() + " " + tblempleado.getApellidoM();
                datosllenado[1] = nom.getPercepciones();
                datosllenado[2] = nom.getDeducciones();
                datosllenado[3] = nom.getOtros();
                datosllenado[4] = nom.getPercepciones() - nom.getDeducciones() - nom.getOtros();
                modeloTabla.addRow(datosllenado);
                totalnomina += nom.getPercepciones() - nom.getDeducciones() - nom.getOtros();
            }
            txtTotal.setText(String.valueOf(totalnomina));
            tbNominas.setModel(modeloTabla);
            
        } catch (Exception e) {
            
        }
    }
    
    public void llenarLista(){
        try {
            ArrayList<Empleado> listaE = prenominadao.listaEmpleados();
            DefaultListModel modelo = new DefaultListModel();
            modelo.setSize(0);
            
            for(Empleado s: listaE){
                modelo.addElement(s.getIdEmpleado() + "." + s.getNombre() + " " + s.getApellidoP() + " " + s.getApellidoM());
            }
            listaEmpleados.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nominas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnNuevaNomina;
    private javax.swing.JButton btnRegresar;
    private com.toedter.calendar.JDateChooser dcFechaF;
    private com.toedter.calendar.JDateChooser dcFechaI;
    private com.toedter.calendar.JDateChooser dcFechaP;
    private javax.persistence.EntityManager entma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblFechaF;
    private javax.swing.JLabel lblFechaI;
    private javax.swing.JLabel lblFechaP;
    private javax.swing.JLabel lblNominas;
    private javax.swing.JLabel lblNumNomina;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> listaEmpleados;
    private javax.swing.JSpinner spinDias;
    private javax.swing.JTable tbNominas;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtNumNomina;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
