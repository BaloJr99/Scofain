package ventanas;

import cl.model.dao.PrenominaDao;
import cl.model.db.Prenomina;
import java.util.ArrayList;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblcatalogocuentas;
import jpa.Tblempleado;
import misExcepciones.MisExcepciones;

public class Prenominas extends javax.swing.JFrame {

    String usuario;
    
    Cuentas cuenta = new Cuentas();
    
    Tblempleado tblempleado;
    Tblcatalogocuentas tblcatalogo;
    
    Prenomina prenomina;
    PrenominaDao prenominadao = new PrenominaDao();
    
    
    public Prenominas() {
        super("Prenominas");
        initComponents();
        setLocationRelativeTo(null);
        txtTotal.setEditable(false);
    }
    
    public Prenominas(String user) {
        super("Prenominas");
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = user;
        txtTotal.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPercepciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDeducciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbOtros = new javax.swing.JTable();
        lblGravado = new javax.swing.JLabel();
        txtGravado = new javax.swing.JTextField();
        lblExento = new javax.swing.JLabel();
        txtExento = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblPercepciones = new javax.swing.JLabel();
        lblDeducciones = new javax.swing.JLabel();
        btnExtenderPercepciones = new javax.swing.JButton();
        lblOtros = new javax.swing.JLabel();
        btnExtenderDeducciones = new javax.swing.JButton();
        btnExpandirOtros = new javax.swing.JButton();
        lblCódigo = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        btnCuentas = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        cbTipoImporte = new javax.swing.JComboBox<>();
        txtEmpleado = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        btnNueva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 204, 102));
        lblTitulo.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("PRENOMINAS EMPLEADOS");

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tbPercepciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cuenta", "Descripcion", "Gravado", "Exento"
            }
        ));
        tbPercepciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPercepciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbPercepcionesMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tbPercepciones);

        jScrollPane2.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        tbDeducciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cuenta", "Descripcion", "Gravado", "Exento"
            }
        ));
        tbDeducciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDeducciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbDeduccionesMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tbDeducciones);

        jScrollPane3.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 0));

        tbOtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cuenta", "Descripcion", "Importe"
            }
        ));
        tbOtros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbOtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbOtrosMouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(tbOtros);

        lblGravado.setBackground(new java.awt.Color(255, 204, 102));
        lblGravado.setForeground(new java.awt.Color(0, 0, 0));
        lblGravado.setText("Gravado");

        txtGravado.setBackground(new java.awt.Color(255, 204, 0));
        txtGravado.setForeground(new java.awt.Color(0, 0, 0));
        txtGravado.setText("0.00");
        txtGravado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGravadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGravadoFocusLost(evt);
            }
        });
        txtGravado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGravadoKeyTyped(evt);
            }
        });

        lblExento.setBackground(new java.awt.Color(255, 204, 102));
        lblExento.setForeground(new java.awt.Color(0, 0, 0));
        lblExento.setText("Exento");

        txtExento.setBackground(new java.awt.Color(255, 204, 0));
        txtExento.setForeground(new java.awt.Color(0, 0, 0));
        txtExento.setText("0.00");
        txtExento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtExentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExentoFocusLost(evt);
            }
        });
        txtExento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExentoKeyTyped(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(255, 204, 102));
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("Total");

        txtTotal.setBackground(new java.awt.Color(255, 204, 0));
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(255, 204, 0));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 0));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 204, 0));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblPercepciones.setBackground(new java.awt.Color(255, 204, 102));
        lblPercepciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPercepciones.setForeground(new java.awt.Color(0, 0, 0));
        lblPercepciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPercepciones.setText("       PERCEPCIONES");

        lblDeducciones.setBackground(new java.awt.Color(255, 204, 102));
        lblDeducciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDeducciones.setForeground(new java.awt.Color(0, 0, 0));
        lblDeducciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeducciones.setText("           DEDUCCIONES");

        btnExtenderPercepciones.setBackground(new java.awt.Color(255, 204, 102));
        btnExtenderPercepciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExtenderPercepciones.setForeground(new java.awt.Color(0, 0, 0));
        btnExtenderPercepciones.setText("+");

        lblOtros.setBackground(new java.awt.Color(255, 204, 102));
        lblOtros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblOtros.setForeground(new java.awt.Color(0, 0, 0));
        lblOtros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOtros.setText("                OTROS");

        btnExtenderDeducciones.setBackground(new java.awt.Color(255, 204, 102));
        btnExtenderDeducciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExtenderDeducciones.setForeground(new java.awt.Color(0, 0, 0));
        btnExtenderDeducciones.setText("+");

        btnExpandirOtros.setBackground(new java.awt.Color(255, 204, 102));
        btnExpandirOtros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExpandirOtros.setForeground(new java.awt.Color(0, 0, 0));
        btnExpandirOtros.setText("+");

        lblCódigo.setBackground(new java.awt.Color(255, 204, 102));
        lblCódigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCódigo.setText("Código");

        txtIdEmpleado.setBackground(new java.awt.Color(255, 204, 0));
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

        btnCuentas.setBackground(new java.awt.Color(255, 204, 0));
        btnCuentas.setForeground(new java.awt.Color(0, 0, 0));
        btnCuentas.setText("CUENTAS");
        btnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasActionPerformed(evt);
            }
        });

        lblDescripcion.setBackground(new java.awt.Color(255, 204, 102));
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));

        cbTipoImporte.setBackground(new java.awt.Color(255, 204, 0));
        cbTipoImporte.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoImporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Percepción", "Deducción", "Otros" }));

        txtEmpleado.setBackground(new java.awt.Color(255, 204, 0));
        txtEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        txtCodigo.setBackground(new java.awt.Color(255, 204, 0));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        btnNueva.setBackground(new java.awt.Color(255, 204, 51));
        btnNueva.setForeground(new java.awt.Color(0, 0, 0));
        btnNueva.setText("NUEVA PRENOMINA");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCódigo))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(lblTitulo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(500, 500, 500)
                                        .addComponent(btnExtenderPercepciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPercepciones, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGravado)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtGravado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblExento)
                                        .addGap(41, 41, 41)
                                        .addComponent(txtExento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(lblTotal)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnExtenderDeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnExpandirOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTitulo)
                        .addGap(51, 51, 51)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExtenderPercepciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPercepciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblGravado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbTipoImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExtenderDeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExpandirOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNueva))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnCuentas))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuario);
        menu.setVisible(true);
        limpiarNomina();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasActionPerformed
        if(cuenta.isVisible()){
            cuenta.requestFocusInWindow();
        }else{
            cuenta.setVisible(true);
        }
    }//GEN-LAST:event_btnCuentasActionPerformed

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
            tblempleado = (Tblempleado)qf.getSingleResult();
            txtEmpleado.setText(tblempleado.getNombre() + " " + tblempleado.getApellidoP() + " " + tblempleado.getApellidoM());
            llenarTablas();
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se localizo empleado");
            txtEmpleado.setText("");
            txtIdEmpleado.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtIdEmpleadoFocusLost

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        try {
            Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
            qf.setParameter("codigo", txtCodigo.getText());
            tblcatalogo = (Tblcatalogocuentas)qf.getSingleResult();
            lblDescripcion.setText(tblcatalogo.getDescripcion());
        } catch (NoResultException e) {
            txtCodigo.setText("");
            lblDescripcion.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(!camposVacios()){
                prenomina = new Prenomina(codificarDetalle(), cbTipoImporte.getSelectedItem().toString(),
                txtCodigo.getText(), Integer.valueOf(txtIdEmpleado.getText()), Float.valueOf(txtGravado.getText()),
                Float.valueOf(txtExento.getText()));
                prenominadao.insertarPrenomina(prenomina);
                llenarTablas();
                limpiarCampos();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void limpiarCampos(){
        txtCodigo.setText("");
        lblDescripcion.setText("");
        cbTipoImporte.setSelectedIndex(0);
        txtGravado.setText("0.00");
        txtExento.setText("0.00");
        tbPercepciones.clearSelection();
        tbDeducciones.clearSelection();
        tbOtros.clearSelection();
    }
    
    private void llenarTablas(){
        float total = 0;
        try {
            Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
            ArrayList<Prenomina> listaP = prenominadao.listaPrenomina(Integer.valueOf(txtIdEmpleado.getText()));
            DefaultTableModel modeloP = (DefaultTableModel)tbPercepciones.getModel();
            DefaultTableModel modeloD = (DefaultTableModel)tbDeducciones.getModel();
            DefaultTableModel modeloO = (DefaultTableModel)tbOtros.getModel();
            
            Object datosllenado[] = new Object[5];
            modeloP.setRowCount(0);
            modeloD.setRowCount(0);
            modeloO.setRowCount(0);
            
            for(Prenomina pre: listaP){
                datosllenado[0] = pre.getIdDetalleP().substring(txtIdEmpleado.getText().length() + 3, pre.getIdDetalleP().length());
                datosllenado[1] = pre.getTblCatalogoCuentas_codigo();
                qf.setParameter("codigo", pre.getTblCatalogoCuentas_codigo());
                tblcatalogo = (Tblcatalogocuentas)qf.getSingleResult();
                datosllenado[2] = tblcatalogo.getDescripcion();
                datosllenado[3] = pre.getGravado();
                datosllenado[4] = pre.getExento();
                switch(pre.getTipo()){
                    case "Percepción":
                        modeloP.addRow(datosllenado);
                        total += pre.getGravado()+pre.getExento();
                        break;
                    case "Deducción":
                        modeloD.addRow(datosllenado);
                        total -= pre.getGravado()+pre.getExento();
                        break;
                    case "Otros":
                        modeloO.addRow(datosllenado);
                        total -= pre.getGravado()+pre.getExento();
                        break;
                }
            }
            
            tbPercepciones.setModel(modeloP);
            tbDeducciones.setModel(modeloD);
            tbOtros.setModel(modeloO);
            
            txtTotal.setText(String.valueOf(total));
        } catch (Exception e) {
        }
    }
    
    private void txtGravadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGravadoFocusGained
        if(Float.valueOf(txtGravado.getText()) == 0f){
            txtGravado.setText("");
        }
    }//GEN-LAST:event_txtGravadoFocusGained

    private void txtGravadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGravadoFocusLost
        try {
            if(Float.valueOf(txtGravado.getText()) == 0f){
                txtGravado.setText("0.00");
            }
        } catch (NumberFormatException e) {
            txtGravado.setText("0.00");
        }
    }//GEN-LAST:event_txtGravadoFocusLost

    private void txtGravadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGravadoKeyTyped
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtGravadoKeyTyped

    private void txtExentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExentoKeyTyped
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtExentoKeyTyped

    private void txtExentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExentoFocusGained
        if(Float.valueOf(txtExento.getText()) == 0f){
            txtExento.setText("");
        }
    }//GEN-LAST:event_txtExentoFocusGained

    private void txtExentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExentoFocusLost
        try {
            if(Float.valueOf(txtExento.getText()) == 0f){
                txtExento.setText("0.00");
            }
        } catch (NumberFormatException e) {
            txtExento.setText("0.00");
        }
    }//GEN-LAST:event_txtExentoFocusLost

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String tipo = "";
            if(tbPercepciones.getSelectedRow() != -1){
                prenominadao.eliminar(txtIdEmpleado.getText() + ".P." + String.valueOf(tbPercepciones.getSelectedRow() + 1));
                tipo = "Percepción";
            }else if (tbDeducciones.getSelectedRow() != -1){
                prenominadao.eliminar(txtIdEmpleado.getText() + ".D." + String.valueOf(tbDeducciones.getSelectedRow() + 1));
                tipo = "Deducción";                
            }else if(tbOtros.getSelectedRow() != -1){
                prenominadao.eliminar(txtIdEmpleado.getText() + ".O." + String.valueOf(tbOtros.getSelectedRow() + 1));
                tipo = "Otros";    
            }else{
                JOptionPane.showMessageDialog(this, "Favor de seleccionar la fila en la tabla");
            }
            prenominadao.reajustar(Integer.valueOf(txtIdEmpleado.getText()), tipo);
            llenarTablas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        limpiarNomina();
    }//GEN-LAST:event_btnNuevaActionPerformed

    public void limpiarNomina(){
        limpiarCampos();
        txtEmpleado.setText("");
        txtIdEmpleado.setText("");
        
        DefaultTableModel modeloP = (DefaultTableModel)tbPercepciones.getModel();
        DefaultTableModel modeloD = (DefaultTableModel)tbDeducciones.getModel();
        DefaultTableModel modeloO = (DefaultTableModel)tbOtros.getModel();
        
        modeloP.setRowCount(0);
        modeloD.setRowCount(0);
        modeloO.setRowCount(0);
        
        tbPercepciones.setModel(modeloP);
        tbDeducciones.setModel(modeloD);
        tbOtros.setModel(modeloO);
        txtTotal.setText("");
    }
    
    private void tbPercepcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPercepcionesMouseExited
        if(tbPercepciones.getSelectedRow() != -1){
            tbDeducciones.clearSelection();
            tbOtros.clearSelection();
        }
    }//GEN-LAST:event_tbPercepcionesMouseExited

    private void tbDeduccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDeduccionesMouseExited
        if(tbDeducciones.getSelectedRow() != -1){
            tbPercepciones.clearSelection();
            tbOtros.clearSelection();
        }
    }//GEN-LAST:event_tbDeduccionesMouseExited

    private void tbOtrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOtrosMouseExited
        if(tbOtros.getSelectedRow() != -1){
            tbPercepciones.clearSelection();
            tbDeducciones.clearSelection();
        }
    }//GEN-LAST:event_tbOtrosMouseExited

    public String codificarDetalle(){
        String detalle = "";
        
        switch (cbTipoImporte.getSelectedIndex()) {
            case 1:
                detalle = txtIdEmpleado.getText() + ".P." + (tbPercepciones.getRowCount() + 1);
                break;
            case 2:
                detalle = txtIdEmpleado.getText() + ".D." + (tbDeducciones.getRowCount() + 1);
                break;
            case 3:
                detalle = txtIdEmpleado.getText() + ".O." + (tbOtros.getRowCount() + 1);
                break;
            default:
                break;
        }
        
        return detalle;
    }
    
    public boolean camposVacios(){
        boolean flag = false;
        
        try {
            if(txtIdEmpleado.getText().isEmpty()){
                flag = true;
                throw new MisExcepciones(62);
            }else if(cbTipoImporte.getSelectedIndex() == 0){
                flag = true;
                throw new MisExcepciones(64);
            }else if(txtCodigo.getText().equals("   -  -   ")){
                flag = true;
                throw new MisExcepciones(31);
            }else if(txtGravado.getText().equals("0.00") && txtExento.getText().equals("0.00")){
                flag = true;
                throw new MisExcepciones(63);
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        return flag;
    }
    
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
            java.util.logging.Logger.getLogger(Prenominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prenominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prenominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prenominas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prenominas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCuentas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExpandirOtros;
    private javax.swing.JButton btnExtenderDeducciones;
    private javax.swing.JButton btnExtenderPercepciones;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbTipoImporte;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCódigo;
    private javax.swing.JLabel lblDeducciones;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExento;
    private javax.swing.JLabel lblGravado;
    private javax.swing.JLabel lblOtros;
    private javax.swing.JLabel lblPercepciones;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tbDeducciones;
    private javax.swing.JTable tbOtros;
    private javax.swing.JTable tbPercepciones;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JTextField txtExento;
    private javax.swing.JTextField txtGravado;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
