package ventanas;

import cl.model.dao.ClienteDao;
import cl.model.dao.DetalleFacturaDao;
import cl.model.dao.FacturaDao;
import cl.model.dao.FormaPagoDao;
import cl.model.dao.ImpuestosDao;
import cl.model.dao.ImpuestosRetenidosDao;
import cl.model.dao.ImpuestosTrasladadosDao;
import cl.model.dao.MetodoPagoDao;
import cl.model.dao.UsoCfdiDao;
import cl.model.db.Cliente;
import cl.model.db.DetalleFactura;
import cl.model.db.Factura;
import cl.model.db.FormaPago;
import cl.model.db.Impuestos;
import cl.model.db.ImpuestosRetenidos;
import cl.model.db.ImpuestosTrasladados;
import cl.model.db.UsoCFDI;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblclaveunidad;
import jpa.Tblfactura;
import jpa.Tblformapago;
import jpa.Tblmetodopago;
import jpa.Tblproductos;
import jpa.Tblreceptor;
import jpa.Tbltipocomprobante;
import jpa.Tblusocfdi;
import misExcepciones.MisExcepciones;

public class Facturacion extends javax.swing.JFrame {
    
    String usuario;
    
    ClienteDao clienteDao = new ClienteDao();
    FormaPagoDao formaDao = new FormaPagoDao();
    MetodoPagoDao metodoDao = new MetodoPagoDao();
    ImpuestosDao impuestoDao = new ImpuestosDao();
    ImpuestosRetenidosDao impuestosRDao = new ImpuestosRetenidosDao();
    ImpuestosTrasladadosDao impuestosTDao = new ImpuestosTrasladadosDao();
    UsoCfdiDao usoDao = new UsoCfdiDao();
    FacturaDao facturaDao = new FacturaDao();
    DetalleFacturaDao detalleDao = new DetalleFacturaDao();
    
    Tblproductos tblproducto;
    Tblfactura tblFactura;
    Tblclaveunidad tblclave;
    Tbltipocomprobante tbltipocomprobante;
    Tblformapago tblformapago;
    Tblmetodopago tblmetodopago;
    Tblreceptor tblreceptor;
    Tblusocfdi tbluso;
    
    Factura factura;
    DetalleFactura detalle;
    
    Impuestos impuesto;
    Impuestos impuesto1;
    Impuestos impuesto2;
    Impuestos impuesto3;
    
    ImpuestosRetenidos impuestoR;
    ImpuestosRetenidos impuestoR1;
    ImpuestosRetenidos impuestoR2;
    ImpuestosRetenidos impuestoR3;
    
    ImpuestosTrasladados impuestoT;
    ImpuestosTrasladados impuestoT1;
    ImpuestosTrasladados impuestoT2;
    
    ImpuestosT GUIimpuestoT = new ImpuestosT();
    ImpuestosR GUIimpuestoR = new ImpuestosR();
    
    public Facturacion() {
        super("Facturacion");
        initComponents();
        setLocationRelativeTo(null);
        llenarComboPrimario();
        llenarCombosSecundarios();
        llenarlistaR();
        llenarlistaT();
        deshabilitarCampos();
        dcFechaEmision.setEnabled(false);
    }
    
    public Facturacion(String user) {
        super("Facturacion");
        initComponents();
        setLocationRelativeTo(null);
        llenarComboPrimario();
        llenarCombosSecundarios();
        llenarlistaR();
        llenarlistaT();
        deshabilitarCampos();
        dcFechaEmision.setEnabled(false);
        this.usuario = user;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        ScofainPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        tblcatalogocuentasQuery = java.beans.Beans.isDesignTime() ? null : ScofainPUEntityManager.createQuery("SELECT t FROM Tblcatalogocuentas t");
        tblcatalogocuentasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblcatalogocuentasQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbImportes = new javax.swing.JTable();
        lblUnitario = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        btnCuentas = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        rbRetención = new javax.swing.JRadioButton();
        rbTraslado = new javax.swing.JRadioButton();
        rbExento = new javax.swing.JRadioButton();
        lblSubtotal = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtEstado = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblRetIva = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        txtRetIva = new javax.swing.JTextField();
        txtRetIsr = new javax.swing.JTextField();
        lblRetIsr = new javax.swing.JLabel();
        lblFormaPago = new javax.swing.JLabel();
        cbFormaPago = new javax.swing.JComboBox<>();
        lblUsoCfdi = new javax.swing.JLabel();
        cbUso = new javax.swing.JComboBox<>();
        btnNuevaFactura = new javax.swing.JButton();
        dcFechaEmision = new com.toedter.calendar.JDateChooser();
        lblCve = new javax.swing.JLabel();
        txtCveUnidad = new javax.swing.JTextField();
        lblCveDescripcion = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        cbComprobante = new javax.swing.JComboBox<>();
        btnRefreshR = new javax.swing.JButton();
        btnRefreshT = new javax.swing.JButton();
        lblISR = new javax.swing.JLabel();
        txtRetIeps = new javax.swing.JTextField();
        lblIeps = new javax.swing.JLabel();
        txtIeps = new javax.swing.JTextField();
        cbRetIVA = new javax.swing.JComboBox<>();
        cbRetISR = new javax.swing.JComboBox<>();
        cbRetIEPS = new javax.swing.JComboBox<>();
        cbIva = new javax.swing.JComboBox<>();
        cbIEPS = new javax.swing.JComboBox<>();
        btnAgregarRetencion = new javax.swing.JButton();
        btnAgregarTraslado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("FACTURACIÓN");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 17, -1, -1));

        cbClientes.setBackground(new java.awt.Color(255, 255, 255));
        cbClientes.setForeground(new java.awt.Color(0, 0, 0));
        cbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });
        jPanel1.add(cbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 94, 300, -1));

        tbImportes.setBackground(new java.awt.Color(255, 255, 255));
        tbImportes.setForeground(new java.awt.Color(0, 0, 0));
        tbImportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripcion", "Valor U", "Cantidad", "Importe"
            }
        ));
        tbImportes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbImportes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 53, 460, 280));

        lblUnitario.setBackground(new java.awt.Color(255, 255, 255));
        lblUnitario.setForeground(new java.awt.Color(0, 0, 0));
        lblUnitario.setText("VALOR UNITARIO");
        jPanel1.add(lblUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 175, -1, 30));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("TOTAL");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 449, 63, 30));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0.00");
        txtTotal.setEnabled(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 452, 129, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 509, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 509, 100, -1));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.setToolTipText("Solo modifica factura no productos agregados");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 509, 100, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 509, 100, -1));

        lblCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("CÓDIGO");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 129, -1, 40));

        txtFolio.setBackground(new java.awt.Color(255, 255, 255));
        txtFolio.setForeground(new java.awt.Color(51, 51, 51));
        txtFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFolioFocusLost(evt);
            }
        });
        jPanel1.add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 94, 40, -1));

        btnCuentas.setBackground(new java.awt.Color(255, 255, 255));
        btnCuentas.setForeground(new java.awt.Color(0, 0, 0));
        btnCuentas.setText("CUENTAS");
        btnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 509, 100, -1));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 139, 80, -1));

        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 143, 320, 20));

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubtotal.setText("0.00");
        txtSubtotal.setEnabled(false);
        jPanel1.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 130, -1));

        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("CANTIDAD");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 175, -1, 30));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 175, 140, -1));

        rbRetención.setBackground(new java.awt.Color(255, 255, 255));
        rbRetención.setForeground(new java.awt.Color(0, 0, 0));
        rbRetención.setText("RETENCIÓN");
        rbRetención.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRetenciónActionPerformed(evt);
            }
        });
        jPanel1.add(rbRetención, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 292, 150, -1));

        rbTraslado.setBackground(new java.awt.Color(255, 255, 255));
        rbTraslado.setForeground(new java.awt.Color(0, 0, 0));
        rbTraslado.setText("TRASLADO");
        rbTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrasladoActionPerformed(evt);
            }
        });
        jPanel1.add(rbTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 290, 100, -1));

        rbExento.setBackground(new java.awt.Color(255, 255, 255));
        rbExento.setForeground(new java.awt.Color(0, 0, 0));
        rbExento.setText("EXENTO");
        rbExento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExentoActionPerformed(evt);
            }
        });
        jPanel1.add(rbExento, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 256, 80, -1));

        lblSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtotal.setText("SUBTOTAL");
        jPanel1.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 339, -1, 26));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 509, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 509, -1, -1));

        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 58, 110, 30));

        lblIva.setBackground(new java.awt.Color(255, 255, 255));
        lblIva.setForeground(new java.awt.Color(0, 0, 0));
        lblIva.setText("IVA");
        jPanel1.add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 378, 70, 23));

        lblRetIva.setBackground(new java.awt.Color(255, 255, 255));
        lblRetIva.setForeground(new java.awt.Color(0, 0, 0));
        lblRetIva.setText("RET IVA");
        jPanel1.add(lblRetIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 379, 63, 20));

        txtIva.setEditable(false);
        txtIva.setBackground(new java.awt.Color(255, 255, 255));
        txtIva.setForeground(new java.awt.Color(0, 0, 0));
        txtIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIva.setText("0.00");
        txtIva.setEnabled(false);
        jPanel1.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 377, 130, -1));

        txtRetIva.setEditable(false);
        txtRetIva.setBackground(new java.awt.Color(255, 255, 255));
        txtRetIva.setForeground(new java.awt.Color(0, 0, 0));
        txtRetIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRetIva.setText("0.00");
        txtRetIva.setEnabled(false);
        jPanel1.add(txtRetIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 377, 150, -1));

        txtRetIsr.setEditable(false);
        txtRetIsr.setBackground(new java.awt.Color(255, 255, 255));
        txtRetIsr.setForeground(new java.awt.Color(0, 0, 0));
        txtRetIsr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRetIsr.setText("0.00");
        txtRetIsr.setEnabled(false);
        jPanel1.add(txtRetIsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 340, 150, -1));

        lblRetIsr.setBackground(new java.awt.Color(255, 255, 255));
        lblRetIsr.setForeground(new java.awt.Color(0, 0, 0));
        lblRetIsr.setText("RET ISR");
        jPanel1.add(lblRetIsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 341, 63, 22));

        lblFormaPago.setForeground(new java.awt.Color(0, 0, 0));
        lblFormaPago.setText("FORMA  DE PAGO");
        jPanel1.add(lblFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 437, -1, 20));

        cbFormaPago.setBackground(new java.awt.Color(255, 255, 255));
        cbFormaPago.setForeground(new java.awt.Color(0, 0, 0));
        cbFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jPanel1.add(cbFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 434, 370, -1));

        lblUsoCfdi.setForeground(new java.awt.Color(0, 0, 0));
        lblUsoCfdi.setText("USO CFDI");
        jPanel1.add(lblUsoCfdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 467, -1, 30));

        cbUso.setBackground(new java.awt.Color(255, 255, 255));
        cbUso.setForeground(new java.awt.Color(0, 0, 0));
        cbUso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jPanel1.add(cbUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 469, 370, -1));

        btnNuevaFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaFactura.setText("NUEVA FACTURA");
        btnNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 509, 130, -1));

        dcFechaEmision.setBackground(new java.awt.Color(255, 255, 255));
        dcFechaEmision.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaEmision.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(dcFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 94, 120, -1));

        lblCve.setForeground(new java.awt.Color(0, 0, 0));
        lblCve.setText("CVE UNIDAD");
        jPanel1.add(lblCve, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 228, -1, -1));

        txtCveUnidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCveUnidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCveUnidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCveUnidadFocusLost(evt);
            }
        });
        jPanel1.add(txtCveUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 224, 60, -1));
        jPanel1.add(lblCveDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 224, 184, 26));
        jPanel1.add(lblValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 175, 125, 26));

        cbComprobante.setBackground(new java.awt.Color(255, 255, 255));
        cbComprobante.setForeground(new java.awt.Color(0, 0, 0));
        cbComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione....", "Ingreso", "Egreso" }));
        jPanel1.add(cbComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 154, -1));

        btnRefreshR.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefreshR.setBorder(null);
        btnRefreshR.setBorderPainted(false);
        btnRefreshR.setOpaque(false);
        btnRefreshR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshRActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefreshR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 292, 28, 28));

        btnRefreshT.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefreshT.setBorder(null);
        btnRefreshT.setBorderPainted(false);
        btnRefreshT.setOpaque(false);
        btnRefreshT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefreshT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 28, 30));

        lblISR.setBackground(new java.awt.Color(255, 255, 255));
        lblISR.setForeground(new java.awt.Color(0, 0, 0));
        lblISR.setText("RET IEPS");
        jPanel1.add(lblISR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 415, 63, 20));

        txtRetIeps.setEditable(false);
        txtRetIeps.setBackground(new java.awt.Color(255, 255, 255));
        txtRetIeps.setForeground(new java.awt.Color(0, 0, 0));
        txtRetIeps.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRetIeps.setText("0.00");
        txtRetIeps.setEnabled(false);
        jPanel1.add(txtRetIeps, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 413, 150, -1));

        lblIeps.setBackground(new java.awt.Color(255, 255, 255));
        lblIeps.setForeground(new java.awt.Color(0, 0, 0));
        lblIeps.setText("IEPS");
        jPanel1.add(lblIeps, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 415, 63, 20));

        txtIeps.setEditable(false);
        txtIeps.setBackground(new java.awt.Color(255, 255, 255));
        txtIeps.setForeground(new java.awt.Color(0, 0, 0));
        txtIeps.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIeps.setText("0.00");
        txtIeps.setEnabled(false);
        jPanel1.add(txtIeps, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 413, 129, -1));

        cbRetIVA.setBackground(new java.awt.Color(255, 255, 255));
        cbRetIVA.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cbRetIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 332, 220, -1));

        cbRetISR.setBackground(new java.awt.Color(255, 255, 255));
        cbRetISR.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cbRetISR, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 396, 220, -1));

        cbRetIEPS.setBackground(new java.awt.Color(255, 255, 255));
        cbRetIEPS.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cbRetIEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 364, 220, -1));

        cbIva.setBackground(new java.awt.Color(255, 255, 255));
        cbIva.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cbIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 332, 220, -1));

        cbIEPS.setBackground(new java.awt.Color(255, 255, 255));
        cbIEPS.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cbIEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 364, 220, -1));

        btnAgregarRetencion.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarRetencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregarRetencion.setBorder(null);
        btnAgregarRetencion.setBorderPainted(false);
        btnAgregarRetencion.setOpaque(false);
        btnAgregarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRetencionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 292, 28, 28));

        btnAgregarTraslado.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarTraslado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregarTraslado.setBorder(null);
        btnAgregarTraslado.setBorderPainted(false);
        btnAgregarTraslado.setOpaque(false);
        btnAgregarTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTrasladoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 292, 28, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbExentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExentoActionPerformed
        if(rbExento.isSelected()){
            rbRetención.setEnabled(false);
            rbTraslado.setEnabled(false);
            cbRetIEPS.setEnabled(false);
            cbRetIVA.setEnabled(false);
            cbRetISR.setEnabled(false);
            cbIva.setEnabled(false);
            cbIEPS.setEnabled(false);
        }else{
            rbRetención.setEnabled(true);
            rbTraslado.setEnabled(true);
        }
    }//GEN-LAST:event_rbExentoActionPerformed

    private void txtFolioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFolioFocusLost
        try {
            Query qf = entma.createNamedQuery("Tblfactura.findByFolio");
            qf.setParameter("folio", Integer.valueOf(txtFolio.getText()));
            tblFactura = (Tblfactura)qf.getSingleResult();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel)cbClientes.getModel();
            for(int i = 0; i < modelo.getSize(); i++){
                if(tblFactura.getTblReceptorrfcReceptor().getRfcReceptor().equals(cbClientes.getItemAt(i).substring(0, 13))){
                    cbClientes.setSelectedIndex(i);
                }
            }
            dcFechaEmision.setDate(tblFactura.getFechaEmision());
            cbFormaPago.setSelectedItem(tblFactura.getTblFormaPagoidFormaPago().getIdFormaPago() + "-" + tblFactura.getTblFormaPagoidFormaPago().getTipoPago());
            cbUso.setSelectedItem(tblFactura.getTblusoCFDIclave().getClave() + "-" + tblFactura.getTblusoCFDIclave().getDescripcion());
            for(int i = 0; i < cbComprobante.getItemCount(); i++){
                if(cbComprobante.getItemAt(i).substring(0,1).equals(tblFactura.getTbltipoComprobanteclave().getClave())){
                    cbComprobante.setSelectedIndex(i);
                }
            }
            txtEstado.setText(tblFactura.getEstadoFactura());
            llenarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NoResultException e) {
            if(tbImportes.getRowCount() != 0){
                limpiarFactura();
            }
        } catch (Exception e) {
            
        } finally{
            entma.clear();
        }
    }//GEN-LAST:event_txtFolioFocusLost

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuario);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbRetenciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRetenciónActionPerformed
        if(rbRetención.isSelected()){
            cbRetIEPS.setEnabled(true);
            cbRetIVA.setEnabled(true);
            cbRetISR.setEnabled(true);
            rbExento.setEnabled(false);
        }else{
            cbRetIEPS.setEnabled(false);
            cbRetIVA.setEnabled(false);
            cbRetISR.setEnabled(false);
            if(!rbTraslado.isSelected()){
                rbExento.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rbRetenciónActionPerformed

    private void rbTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrasladoActionPerformed
        if(rbTraslado.isSelected()){
            cbIva.setEnabled(true);
            cbIEPS.setEnabled(true);
            rbExento.setEnabled(false);
        }else{
            cbIva.setEnabled(false);
            cbIEPS.setEnabled(false);
            if(!rbRetención.isSelected()){
                rbExento.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rbTrasladoActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        try {
            Query qf = entma.createNamedQuery("Tblproductos.findByClaveProducto");
            qf.setParameter("claveProducto", txtCodigo.getText());
            tblproducto = (Tblproductos)qf.getSingleResult();
            lblDescripcion.setText(tblproducto.getDescripcion());
            lblValorUnitario.setText(String.valueOf(tblproducto.getPrecio() * 1.5));
        } catch (NoResultException e) {
            txtCodigo.setText("");
        } catch (Exception e) {
            
        } finally{
            entma.clear();
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusGained
        if(txtCantidad.getText().equals("0.00")){
            txtCantidad.setText("");
        }
    }//GEN-LAST:event_txtCantidadFocusGained

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
        try{
            if(Float.valueOf(txtCantidad.getText()) <= 0f){
                txtCantidad.setText("0.00");
            }
        }catch(NumberFormatException e){
            txtCantidad.setText("0.00");
        } catch (Exception e) {
         
        }
    }//GEN-LAST:event_txtCantidadFocusLost

    private void txtCveUnidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCveUnidadFocusLost
        try {
            Query qf = entma.createNamedQuery("Tblclaveunidad.findByClave");
            qf.setParameter("clave", txtCveUnidad.getText());
            tblclave = (Tblclaveunidad)qf.getSingleResult();
            
            lblCveDescripcion.setText(tblclave.getDescripcion());
        } catch (Exception e) {
            txtCveUnidad.setText("");
        } finally{
            entma.clear();
        }
    }//GEN-LAST:event_txtCveUnidadFocusLost
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String metodo;
        try {
            if (!"Pendiente".equals(txtEstado.getText()) && !txtEstado.getText().isEmpty()){
                throw new MisExcepciones(57);
            } else if(!comprobarExistencias()){
                throw new MisExcepciones(73);
            }else if(!camposVacios()){
                if(cbFormaPago.getSelectedIndex() == 20){
                    metodo = "PPD";
                }else{
                    metodo = "PUE";
                }
                if(!buscarFactura()){
                    factura = new Factura(Integer.valueOf(txtFolio.getText()), new Date(new java.util.Date().getTime()), 
                    cbFormaPago.getSelectedItem().toString().substring(0, 2), metodo,"CAMB991005DE5",
                    cbClientes.getSelectedItem().toString().substring(0, 13),
                    cbUso.getSelectedItem().toString().substring(0, 3), 
                    cbComprobante.getSelectedItem().toString().substring(0, 1), "Pendiente");
                    facturaDao.insertarFactura(factura);
                }
                llenarImpuestos();
                llenarTabla();
                JOptionPane.showMessageDialog(this, "Agregado");
                limpiarCampos();
           }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        if(cbClientes.getSelectedIndex() == 0){
            deshabilitarCampos();
        }else{
            habilitarCampos();
        }
    }//GEN-LAST:event_cbClientesActionPerformed

    private void btnRefreshRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshRActionPerformed
        llenarlistaR();
    }//GEN-LAST:event_btnRefreshRActionPerformed

    private void btnRefreshTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTActionPerformed
        llenarlistaT();
    }//GEN-LAST:event_btnRefreshTActionPerformed

    private void btnAgregarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRetencionActionPerformed
        if(GUIimpuestoR.isVisible()){
            GUIimpuestoR.requestFocus();
        }else{
            GUIimpuestoR.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarRetencionActionPerformed

    private void btnAgregarTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTrasladoActionPerformed
        if(GUIimpuestoT.isVisible()){
            GUIimpuestoT.requestFocus();
        }else{
            GUIimpuestoT.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarTrasladoActionPerformed

    private void btnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasActionPerformed
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
    }//GEN-LAST:event_btnCuentasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(txtFolio.getText().isEmpty()){
                throw new MisExcepciones(40);
            }else if(cbComprobante.getSelectedIndex() == 0){
                throw new MisExcepciones(39);
            }else if(cbClientes.getSelectedIndex() == 0){
                throw new MisExcepciones(35);
            }else if(cbFormaPago.getSelectedIndex() == 0){
                throw new MisExcepciones(41);
            }else if(cbUso.getSelectedIndex() == 0){
                throw new MisExcepciones(42);
            }else if(!"Pendiente".equals(txtEstado.getText())){
                throw new MisExcepciones(57);
            }else {
                Query qf = entma.createNamedQuery("Tblfactura.findByFolio");
                qf.setParameter("folio", Integer.valueOf(txtFolio.getText()));
                tblFactura = (Tblfactura)qf.getSingleResult();
                buscarModificaciones();
                entma.getTransaction().begin();
                tblFactura.setTbltipoComprobanteclave(tbltipocomprobante);
                tblFactura.setTblFormaPagoidFormaPago(tblformapago);
                tblFactura.setTblMetodoPagoidMetodoPago(tblmetodopago);
                tblFactura.setTblReceptorrfcReceptor(tblreceptor);
                tblFactura.setTblusoCFDIclave(tbluso);
                entma.getTransaction().commit(); 
                JOptionPane.showMessageDialog(this, "Se modificaron datos de la factura");
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NoResultException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally{
            entma.clear();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaFacturaActionPerformed
        limpiarFactura();
        llenarComboPrimario();
    }//GEN-LAST:event_btnNuevaFacturaActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            if(txtFolio.getText().isEmpty()){
                throw new MisExcepciones(40);
            }else if(cbComprobante.getSelectedIndex() == 0){
                throw new MisExcepciones(39);
            }else if(cbClientes.getSelectedIndex() == 0){
                throw new MisExcepciones(35);
            }else if(cbFormaPago.getSelectedIndex() == 0){
                throw new MisExcepciones(41);
            }else if(cbUso.getSelectedIndex() == 0){
                throw new MisExcepciones(42);
            }else if(Float.valueOf(txtTotal.getText()) == 0){
                throw new MisExcepciones(51);
            }else if("Pendiente".equals(txtEstado.getText())){
                Query qf = entma.createNamedQuery("Tblfactura.findByFolio");
                qf.setParameter("folio", Integer.valueOf(txtFolio.getText()));
                tblFactura = (Tblfactura)qf.getSingleResult();
                entma.getTransaction().begin();
                tblFactura.setEstadoFactura("Vigente");
                tblFactura.setFechaEmision(Calendar.getInstance().getTime());
                entma.getTransaction().commit(); 
                JOptionPane.showMessageDialog(this, "TIMBRADA CON EXITO");
                limpiarFactura();
            }else{
                JOptionPane.showMessageDialog(this, "No se puede generar una factura generada/cancelada");
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NoResultException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally{
            entma.clear();
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            if(txtFolio.getText().isEmpty()){
                throw new MisExcepciones(40);
            }else if(cbComprobante.getSelectedIndex() == 0){
                throw new MisExcepciones(39);
            }else if(cbClientes.getSelectedIndex() == 0){
                throw new MisExcepciones(35);
            }else if(cbFormaPago.getSelectedIndex() == 0){
                throw new MisExcepciones(41);
            }else if(cbUso.getSelectedIndex() == 0){
                throw new MisExcepciones(42);
            }else if(Float.valueOf(txtTotal.getText()) == 0){
                throw new MisExcepciones(51);
            }else if("Vigente".equals(txtEstado.getText())){
                Query qf = entma.createNamedQuery("Tblfactura.findByFolio");
                qf.setParameter("folio", Integer.valueOf(txtFolio.getText()));
                tblFactura = (Tblfactura)qf.getSingleResult();
                entma.getTransaction().begin();
                tblFactura.setEstadoFactura("Cancelada");
                entma.getTransaction().commit(); 
                JOptionPane.showMessageDialog(this, "CANCELADA CON EXITO");
                limpiarFactura();
            }else if("Cancelada".equals(txtEstado.getText())){
                JOptionPane.showMessageDialog(this, "Factura ya cancelada");
            }else{
                JOptionPane.showMessageDialog(this, "No se puede cancelar una factura pendiente");
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NoResultException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally{
            entma.clear();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaseleccionada = tbImportes.getSelectedRow();
        try {
            if(txtFolio.getText().isEmpty()){
                throw new MisExcepciones(40);
            }else if(tbImportes.getRowCount() == 0){
                throw new MisExcepciones(55);
            }else if(filaseleccionada == -1){
                throw new MisExcepciones(56);
            }else if (!"Pendiente".equals(txtEstado.getText()) && txtEstado.equals("")){
                throw new MisExcepciones(57);
            }else if((filaseleccionada + 1) == tbImportes.getRowCount()){
                detalleDao.eliminarDetalle(Integer.valueOf(txtFolio.getText()), tbImportes.getSelectedRow() + 1);
                sumarExistencia();
            }else{
                detalleDao.eliminarDetalle(Integer.valueOf(txtFolio.getText()), tbImportes.getSelectedRow() + 1);
                detalleDao.reajustar(Integer.valueOf(txtFolio.getText()), tbImportes.getSelectedRow() + 1);
                sumarExistencia();
            }
            llenarTabla();
        } catch (NumberFormatException | SQLException | MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void sumarExistencia(){
        try {
            Query qf = entma.createNamedQuery("Tblproductos.findByClaveProducto");
            qf.setParameter("claveProducto", tbImportes.getValueAt(tbImportes.getSelectedRow(), 0).toString());
            tblproducto = (Tblproductos)qf.getSingleResult();
            entma.getTransaction().begin();
            tblproducto.setCantidad(tblproducto.getCantidad() + Float.valueOf(tbImportes.getValueAt(tbImportes.getSelectedRow(), 3).toString()));
            entma.getTransaction().commit();
        } catch (Exception e) {
            
        }finally{
            entma.clear();
        }
    }
    
    public boolean comprobarExistencias(){
        boolean flag = true;
        
        try {
            Query qf = entma.createNamedQuery("Tblproductos.findByClaveProducto");
            qf.setParameter("claveProducto", txtCodigo.getText());
            tblproducto = (Tblproductos)qf.getSingleResult();
            if(Integer.valueOf(txtCantidad.getText()) > tblproducto.getCantidad()){
                flag = false;
            }
        } catch (Exception e) {
            
        }finally{
            entma.clear();
        }
        
        return flag;
    }
    
    public void limpiarFactura(){
        txtFolio.setText("");
        limpiarCampos();
        DefaultTableModel modelo = (DefaultTableModel)tbImportes.getModel();
        modelo.setRowCount(0);
        tbImportes.setModel(modelo);
        cbClientes.setSelectedIndex(0);
        cbFormaPago.setSelectedIndex(0);
        cbUso.setSelectedIndex(0);
        deshabilitarCampos();
        txtEstado.setText("");
        dcFechaEmision.setDate(null);
    }
    
    public void buscarModificaciones(){
        String metodo;
        if(cbFormaPago.getSelectedIndex() == 20){
            metodo = "PPD";
        }else{
            metodo = "PUE";
        }
        Query qf1 = entma.createNamedQuery("Tbltipocomprobante.findByClave");
        qf1.setParameter("clave", cbComprobante.getSelectedItem().toString().substring(0, 1));
        tbltipocomprobante = (Tbltipocomprobante)qf1.getSingleResult();
        Query qf2 = entma.createNamedQuery("Tblformapago.findByIdFormaPago");
        qf2.setParameter("idFormaPago", cbFormaPago.getSelectedItem().toString().substring(0, 2));
        tblformapago = (Tblformapago)qf2.getSingleResult();
        Query qf3 = entma.createNamedQuery("Tblmetodopago.findByIdMetodoPago");
        qf3.setParameter("idMetodoPago", metodo);
        tblmetodopago = (Tblmetodopago)qf3.getSingleResult();
        Query qf4 = entma.createNamedQuery("Tblreceptor.findByRfcReceptor");
        qf4.setParameter("rfcReceptor", cbClientes.getSelectedItem().toString().substring(0, 13));
        tblreceptor = (Tblreceptor)qf4.getSingleResult();
        Query qf5 = entma.createNamedQuery("Tblusocfdi.findByClave");
        qf5.setParameter("clave", cbUso.getSelectedItem().toString().substring(0, 3));
        tbluso = (Tblusocfdi)qf5.getSingleResult();
    }
    
    public void limpiarCampos(){
        txtCodigo.setText("");
        lblDescripcion.setText("");
        txtCantidad.setText("");
        lblValorUnitario.setText("");
        txtCveUnidad.setText("");
        lblCveDescripcion.setText("");
        rbExento.setSelected(false);
        rbRetención.setSelected(false);
        rbTraslado.setSelected(false);
        rbExento.setEnabled(true);
        rbRetención.setEnabled(true);
        rbTraslado.setEnabled(true);
        cbRetIEPS.setEnabled(false);
        cbRetIEPS.setSelectedIndex(0);
        cbRetIVA.setEnabled(false);
        cbRetIVA.setSelectedIndex(0);
        cbRetISR.setEnabled(false);
        cbRetISR.setSelectedIndex(0);
        cbIva.setEnabled(false);
        cbIva.setSelectedIndex(0);
        cbIEPS.setEnabled(false); 
        cbIEPS.setSelectedIndex(0);
    }
    
    public void llenarImpuestos() throws SQLException, MisExcepciones{
        int idImpuesto;
        if(rbExento.isSelected()){
            impuesto = new Impuestos(1, 1, true);
            idImpuesto = impuestoDao.buscarImpuestoRep(impuesto);
            if(idImpuesto == 0){
                idImpuesto = impuestoDao.insertarImpuesto(impuesto);
                detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                detalleDao.insertarDetalle(detalle);
            }else{
                detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                detalleDao.insertarDetalle(detalle);
            }
            restarExistencia();
        }else if(rbTraslado.isSelected() || rbRetención.isSelected()){
            //Caso 1: Todos seleccionados
            if(cbRetIVA.getSelectedIndex() > 0 && cbIva.getSelectedIndex() > 0 && cbRetIEPS.getSelectedIndex() > 0 && cbIEPS.getSelectedIndex() > 0 && cbRetISR.getSelectedIndex() > 0){
                //Comprobando que del IVA la retencion sea mayor que el traslado
                if(Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1))){
                    //Comprobando que del IEPS la retencion sea mayor que el traslado
                    if(Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1))){
                
                        //Creamos objetos de los 3 casos de impuestos retenidos
                        impuestoR1 = new ImpuestosRetenidos("IVA", Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)));
                        impuestoR2 = new ImpuestosRetenidos("ISR", Float.valueOf(cbRetISR.getSelectedItem().toString().substring(4, cbRetISR.getSelectedItem().toString().length() - 1)));
                        impuestoR3 = new ImpuestosRetenidos("IEPS", Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)));
                        
                        //Creamos objetos de los 2 casos de impuestos trasladados
                        impuestoT1 = new ImpuestosTrasladados("IVA", Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1)));
                        impuestoT2 = new ImpuestosTrasladados("IEPS", Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1)));
                        
                        //Cremos los 3 objetos de los impuestos anteriores
                        impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), impuestosRDao.buscarId(impuestoR1), false);
                        impuesto2 = new Impuestos(impuestosTDao.buscarId(impuestoT2), impuestosRDao.buscarId(impuestoR2), false);
                        impuesto3 = new Impuestos(1,impuestosRDao.buscarId(impuestoR3), false);
                        
                        //Comprobamos si alguno del primer caso esta duplicado
                        if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                            idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }else{
                            idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }
                        //Comprobamos si alguno del segundo caso esta duplicado
                        if(impuestoDao.buscarImpuestoRep(impuesto2) == 0){
                            idImpuesto = impuestoDao.insertarImpuesto(impuesto2);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }else{
                            idImpuesto = impuestoDao.buscarImpuestoRep(impuesto2);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }
                        
                        //Comprobamos si alguno del tercer caso esta duplicado
                        if(impuestoDao.buscarImpuestoRep(impuesto3) == 0){
                            idImpuesto = impuestoDao.insertarImpuesto(impuesto3);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }else{
                            idImpuesto = impuestoDao.buscarImpuestoRep(impuesto3);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }
                        restarExistencia();
                    }else{
                        throw new MisExcepciones(52);
                    }
                }else {
                    throw new MisExcepciones(53);
                }
            //Caso 2: IEPS RET E IVA RET
            }else if(cbRetIVA.getSelectedIndex() > 0 && cbIva.getSelectedIndex() > 0 && cbRetIEPS.getSelectedIndex() > 0 && cbIEPS.getSelectedIndex() > 0){
                //Comprobando que del IVA la retencion sea mayor que el traslado
                if(Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1))){
                    //Comprobando que del IEPS la retencion sea mayor que el traslado
                    if(Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1))){
                        //Creamos objetos de los 2 casos de impuestos retenidos
                        impuestoR1 = new ImpuestosRetenidos("IVA", Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)));                        
                        impuestoR2 = new ImpuestosRetenidos("IEPS", Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)));
                        
                        //Creamos objetos de los 2 casos de impuestos trasladados
                        impuestoT1 = new ImpuestosTrasladados("IVA", Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1)));
                        impuestoT2 = new ImpuestosTrasladados("IEPS", Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1)));
                        
                        //Cremos los 3 objetos de los impuestos anteriores
                        impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), impuestosRDao.buscarId(impuestoR1), false);
                        impuesto2 = new Impuestos(impuestosTDao.buscarId(impuestoT2), impuestosRDao.buscarId(impuestoR2), false);
                        
                        //Comprobamos si alguno del primer caso esta duplicado
                        if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                            idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }else{
                            idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }
                        
                        //Comprobamos si alguno del segundo caso esta duplicado
                        if(impuestoDao.buscarImpuestoRep(impuesto2) == 0){
                            idImpuesto = impuestoDao.insertarImpuesto(impuesto2);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }else{
                            idImpuesto = impuestoDao.buscarImpuestoRep(impuesto2);
                            detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                            detalleDao.insertarDetalle(detalle);
                        }
                        restarExistencia();
                    }else{
                        throw new MisExcepciones(52);
                    }
                }else {
                    throw new MisExcepciones(53);
                }
            //Caso 3: IVA RET E ISR
            }else if(cbRetIVA.getSelectedIndex() > 0 && cbIva.getSelectedIndex() > 0 && cbRetISR.getSelectedIndex() > 0){
                //Comprobando que del IVA la retencion sea mayor que el traslado
                if(Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1))){
                    
                    //Creamos objetos de los 2 casos de impuestos retenidos
                    impuestoR1 = new ImpuestosRetenidos("IVA", Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)));
                    impuestoR2 = new ImpuestosRetenidos("ISR", Float.valueOf(cbRetISR.getSelectedItem().toString().substring(4, cbRetISR.getSelectedItem().toString().length() - 1)));

                    //Creamos objetos del caso de impuesto trasladado
                    impuestoT1 = new ImpuestosTrasladados("IVA", Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1)));

                    //Cremos los 2 objetos de los impuestos anteriores
                    impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), impuestosRDao.buscarId(impuestoR1), false);
                    impuesto2 = new Impuestos(1, impuestosRDao.buscarId(impuestoR2), false);

                    //Comprobamos si alguno del primer caso esta duplicado
                    if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                        idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }else{
                        idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }

                    //Comprobamos si alguno del segundo caso esta duplicado
                    if(impuestoDao.buscarImpuestoRep(impuesto2) == 0){
                        idImpuesto = impuestoDao.insertarImpuesto(impuesto2);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }else{
                        idImpuesto = impuestoDao.buscarImpuestoRep(impuesto2);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }
                    restarExistencia();
                    
                }else {
                    throw new MisExcepciones(53);
                }
            //Caso 4: IEPS RET E ISR
            }else if(cbRetIEPS.getSelectedIndex() > 0 && cbIEPS.getSelectedIndex() > 0 && cbRetISR.getSelectedIndex() > 0){
                //Comprobando que del IEPS la retencion sea mayor que el traslado
                if(Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1))){
                    //Creamos objetos de los 3 casos de impuestos retenidos
                    impuestoR1 = new ImpuestosRetenidos("IEPS", Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)));
                    impuestoR2 = new ImpuestosRetenidos("ISR", Float.valueOf(cbRetISR.getSelectedItem().toString().substring(4, cbRetISR.getSelectedItem().toString().length() - 1)));                    

                    //Creamos objetos de los 2 casos de impuestos trasladados
                    impuestoT1 = new ImpuestosTrasladados("IEPS", Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1)));

                    //Cremos los 2 objetos de los impuestos anteriores
                    impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), impuestosRDao.buscarId(impuestoR1), false);
                    impuesto2 = new Impuestos(1, impuestosRDao.buscarId(impuestoR2), false);

                    //Comprobamos si alguno del primer caso esta duplicado
                    if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                        idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }else{
                        idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }

                    //Comprobamos si alguno del segundo caso esta duplicado
                    if(impuestoDao.buscarImpuestoRep(impuesto2) == 0){
                        idImpuesto = impuestoDao.insertarImpuesto(impuesto2);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }else{
                        idImpuesto = impuestoDao.buscarImpuestoRep(impuesto2);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }
                    restarExistencia();
                }else{
                    throw new MisExcepciones(52);
                }
            //Caso 5: IVA RET
            }else if(cbRetIVA.getSelectedIndex() > 0 && cbIva.getSelectedIndex() > 0 ){
                //Comprobando que del IVA la retencion sea mayor que el traslado
                if(Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1))){
                    
                    //Creamos el objeto del caso de impuestos retenidos
                    impuestoR1 = new ImpuestosRetenidos("IVA", Float.valueOf(cbRetIVA.getSelectedItem().toString().substring(4, cbRetIVA.getSelectedItem().toString().length() - 1)));                    

                    //Creamos el objeto del caso de impuestos trasladados
                    impuestoT1 = new ImpuestosTrasladados("IVA", Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1)));

                    //Creamos el objeto de los impuestos anteriores
                    impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), impuestosRDao.buscarId(impuestoR1), false);

                    //Comprobamos si alguno del primer caso esta duplicado
                    if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                        idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }else{
                        idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }
                    restarExistencia();
                }else {
                    throw new MisExcepciones(53);
                }
            //Caso 6: IEPS RET
            }else if(cbRetIEPS.getSelectedIndex() > 0 && cbIEPS.getSelectedIndex() > 0){
                //Comprobando que del IEPS la retencion sea mayor que el traslado
                if(Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)) < Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1))){
                    //Creamos el objeto del caso de impuesto retenido
                    impuestoR1 = new ImpuestosRetenidos("IEPS", Float.valueOf(cbRetIEPS.getSelectedItem().toString().substring(5, cbRetIEPS.getSelectedItem().toString().length() - 1)));
                    
                    //Creamos el objeto del caso de impuesto trasladado
                    impuestoT1 = new ImpuestosTrasladados("IEPS", Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1)));
                    
                    //Creamos el objeto de los impuestos anteriores
                    impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), impuestosRDao.buscarId(impuestoR1), false);
                    
                    //Comprobamos si alguno del primer caso esta duplicado
                    if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                        
                        idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                        
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        
                        detalleDao.insertarDetalle(detalle);
                    }else{
                        idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                        detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                        detalleDao.insertarDetalle(detalle);
                    }
                    restarExistencia();
                }else{
                    throw new MisExcepciones(52);
                }
            //Caso 7: IVA && IEPS
            }else if(cbIva.getSelectedIndex() > 0 && cbIEPS.getSelectedIndex() > 0){
                //Creamos objetos de los 2 casos de impuestos trasladados
                impuestoT1 = new ImpuestosTrasladados("IVA", Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1)));
                impuestoT2 = new ImpuestosTrasladados("IEPS", Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1)));

                //Cremos los 2 objetos de los impuestos anteriores
                impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), 1, false);
                impuesto2 = new Impuestos(impuestosTDao.buscarId(impuestoT2), 1, false);

                //Comprobamos si alguno del primer caso esta duplicado
                if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                    idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }else{
                    idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }

                //Comprobamos si alguno del segundo caso esta duplicado
                if(impuestoDao.buscarImpuestoRep(impuesto2) == 0){
                    idImpuesto = impuestoDao.insertarImpuesto(impuesto2);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }else{
                    idImpuesto = impuestoDao.buscarImpuestoRep(impuesto2);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }
                restarExistencia();
            //Caso 8: IVA
            }else if(cbIva.getSelectedIndex() > 0){
                //Creamos el objeto deL caso de impuesto trasladado
                impuestoT1 = new ImpuestosTrasladados("IVA", Float.valueOf(cbIva.getSelectedItem().toString().substring(4, cbIva.getSelectedItem().toString().length() - 1)));

                //Creamos el objeto de los impuestos anteriores
                impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1) ,1, false);

                //Comprobamos si alguno del primer caso esta duplicado
                if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                    idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }else{
                    idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }
                restarExistencia();
            //Caso 9: IEPS
            }else if(cbIEPS.getSelectedIndex() > 0){
                //Creamos el objeto deL caso de impuesto trasladado
                impuestoT1 = new ImpuestosTrasladados("IEPS", Float.valueOf(cbIEPS.getSelectedItem().toString().substring(5, cbIEPS.getSelectedItem().toString().length() - 1)));

                //Cremos los 3 objetos de los impuestos anteriores
                impuesto1 = new Impuestos(impuestosTDao.buscarId(impuestoT1), 1, false);

                //Comprobamos si alguno del primer caso esta duplicado
                if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                    idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }else{
                    idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }
                restarExistencia();
            //Caso 10: ISR
            }else if(cbRetISR.getSelectedIndex() > 0){
                //Creamos el objeto del caso de impuestos retenidos
                impuestoR1 = new ImpuestosRetenidos("ISR", Float.valueOf(cbRetISR.getSelectedItem().toString().substring(4, cbRetISR.getSelectedItem().toString().length() - 1)));

                //Creamos el objeto de los impuestos anteriores
                impuesto1 = new Impuestos(1, impuestosRDao.buscarId(impuestoR1), false);

                //Comprobamos si alguno del primer caso esta duplicado
                if(impuestoDao.buscarImpuestoRep(impuesto1) == 0){
                    idImpuesto = impuestoDao.insertarImpuesto(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }else{
                    idImpuesto = impuestoDao.buscarImpuestoRep(impuesto1);
                    detalle = new DetalleFactura(idImpuesto, Integer.valueOf(txtFolio.getText()), Float.valueOf(lblValorUnitario.getText()) * Float.valueOf(txtCantidad.getText()), Float.valueOf(txtCantidad.getText()), codificarDetalle(idImpuesto), txtCodigo.getText(), txtCveUnidad.getText());
                    detalleDao.insertarDetalle(detalle);
                }
                restarExistencia();
            }else{
                throw new MisExcepciones(54);
            }
        }else{
            throw new MisExcepciones(58);
        }
        
    }
    
    public void restarExistencia(){
        try {
            Query qf = entma.createNamedQuery("Tblproductos.findByClaveProducto");
            qf.setParameter("claveProducto", txtCodigo.getText());
            tblproducto = (Tblproductos)qf.getSingleResult();
            entma.getTransaction().begin();
            tblproducto.setCantidad(tblproducto.getCantidad() - Float.valueOf(txtCantidad.getText()));
            entma.getTransaction().commit();
        } catch (Exception e) {
            
        }finally{
            entma.clear();
        }
    }
    
    public String codificarDetalle(int idImpuesto){
        String idDetalle = "";
        
        idDetalle = txtFolio.getText() + "." + (tbImportes.getRowCount() + 1) + "." + idImpuesto;
        
        return idDetalle;
    }
    
    public boolean buscarFactura(){
        boolean flag;
        
        try {
            Query qf = entma.createNamedQuery("Tblfactura.findByFolio");
            qf.setParameter("folio", Integer.valueOf(txtFolio.getText()));
            tblFactura = (Tblfactura)qf.getSingleResult();
            txtEstado.setText(tblFactura.getEstadoFactura());
            flag = true;
        } catch (NoResultException e) {
            flag = false;
        } finally{
            entma.clear();
        }
        
        return flag;
    }
    
    public void llenarTabla(){
        String idDetalle = "";
        float subtotal = 0;
        boolean flag = false;
        int contador = 0;
        
        Query qf = entma.createNamedQuery("Tblproductos.findByClaveProducto");
        try {
            ArrayList<DetalleFactura> listaDetalles = detalleDao.listaDetalles(Integer.valueOf(txtFolio.getText()));
            DefaultTableModel tabla = (DefaultTableModel)tbImportes.getModel();
            tabla.setRowCount(0);
            Object datosllenado[] = new Object[5];
            
            detalle = listaDetalles.get(listaDetalles.size() - 1);
            
            for(int i = 0; i < detalle.getIdDetalle().length(); i++){
                if(detalle.getIdDetalle().charAt(i) == '.'){
                    contador++;
                    flag = true;
                }
                
                if(flag == true && contador == 1 && detalle.getIdDetalle().charAt(i) != '.'){
                    idDetalle = idDetalle + detalle.getIdDetalle().charAt(i);
                }
            }
            
            contador = 0;
            
            for(DetalleFactura detalles: listaDetalles){
                datosllenado[0] = detalles.getTblproductos_claveProducto();
                qf.setParameter("claveProducto", detalles.getTblproductos_claveProducto());
                tblproducto = (Tblproductos)qf.getSingleResult();
                datosllenado[1] = tblproducto.getDescripcion();
                datosllenado[2] = tblproducto.getPrecio() * 1.5;
                datosllenado[3] = detalles.getCantidad();
                datosllenado[4] = detalles.getImporte();
                if(contador != Integer.valueOf(decodificarDetalle(detalles.getIdDetalle()))){
                    subtotal = subtotal + detalles.getImporte();
                    contador++;
                    tabla.addRow(datosllenado);
                }
            }
            txtRetIeps.setText(String.valueOf(detalleDao.totalRetIeps(Integer.valueOf(txtFolio.getText()))));
            txtRetIva.setText(String.valueOf(detalleDao.totalRetIva(Integer.valueOf(txtFolio.getText()))));
            txtRetIsr.setText(String.valueOf(detalleDao.totalISR(Integer.valueOf(txtFolio.getText()))));
            txtIva.setText(String.valueOf(detalleDao.totalIva(Integer.valueOf(txtFolio.getText()))));
            txtIeps.setText(String.valueOf(detalleDao.totalIeps(Integer.valueOf(txtFolio.getText()))));
            txtSubtotal.setText(String.valueOf(subtotal));
            txtTotal.setText(String.valueOf(Float.valueOf(txtSubtotal.getText()) + Float.valueOf(txtIva.getText()) +
                    Float.valueOf(txtIeps.getText()) - Float.valueOf(txtRetIsr.getText()) - Float.valueOf(txtRetIeps.getText()) -
                    Float.valueOf(txtRetIva.getText())));
            tbImportes.setModel(tabla);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception e){
            
        } finally{
            entma.clear();
        }
        
    }
    
    public String decodificarDetalle(String cod){
        
        String codigo = "";
        int contador = 0;
        boolean flag = false;
        
        for(int i = 0; i < cod.length(); i++){
            if(cod.charAt(i) == '.'){
                contador++;
                flag = true;
            }
                
            if(flag == true && contador == 1 && cod.charAt(i) != '.'){
                codigo = codigo + cod.charAt(i);
            }
        }
        return codigo;
    }
    
    public boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        
        if(txtFolio.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(40);
        }else if(cbComprobante.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(39);
        }else if(cbClientes.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(35);
        }else if(txtCodigo.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(31);
        }else if(txtCantidad.getText().equals("0.00")){
            flag = true;
            throw new MisExcepciones(36);
        }else if(txtCveUnidad.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(37);
        }else if(!rbExento.isSelected() && !rbRetención.isSelected() && !rbTraslado.isSelected()){
            flag = true;
            throw new MisExcepciones(38);
        }else if(cbFormaPago.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(41);
        }else if(cbUso.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(42);
        }
        
        return flag;
    }
    
    public void habilitarCampos(){
        cbComprobante.setEnabled(true);
        txtCodigo.setEditable(true);
        txtCantidad.setEditable(true);
        txtCveUnidad.setEditable(true);
        rbRetención.setEnabled(true);
        rbTraslado.setEnabled(true);
        rbExento.setEnabled(true);
        cbFormaPago.setEnabled(true);
        cbUso.setEnabled(true);
        btnRefreshT.setEnabled(true);
        btnRefreshR.setEnabled(true);
        btnAgregarRetencion.setEnabled(true);
        btnAgregarTraslado.setEnabled(true);
    }
    
    public void deshabilitarCampos(){
        cbComprobante.setEnabled(false);
        txtCodigo.setEditable(false);
        txtCantidad.setEditable(false);
        txtCveUnidad.setEditable(false);
        rbRetención.setEnabled(false);
        rbTraslado.setEnabled(false);
        rbExento.setEnabled(false);
        cbFormaPago.setEnabled(false);
        cbUso.setEnabled(false);
        btnRefreshT.setEnabled(false);
        btnRefreshR.setEnabled(false);
        btnAgregarRetencion.setEnabled(false);
        btnAgregarTraslado.setEnabled(false);
        cbRetIEPS.setEnabled(false);
        cbRetIVA.setEnabled(false);
        cbRetISR.setEnabled(false);
        cbIva.setEnabled(false);
        cbIEPS.setEnabled(false);
    }
    
    public void llenarComboPrimario(){
        try {
            ArrayList<Cliente> lista = clienteDao.buscarClientes();
            DefaultComboBoxModel combo = (DefaultComboBoxModel)cbClientes.getModel();
            combo.removeAllElements();
            combo.addElement("Seleccione...");
            for(Cliente clientes: lista){
                combo.addElement(clientes.getTblReceptor_rfcReceptor() + " - " + clientes.getRazonSocial());
            }
        } catch (SQLException ex) {
            
        } catch (Exception e) {
            
        }
    }
    
    public void llenarCombosSecundarios(){
        try {
            ArrayList<FormaPago> listaF = formaDao.listaFormas();
            DefaultComboBoxModel combo = (DefaultComboBoxModel)cbFormaPago.getModel();
            combo.removeAllElements();
            combo.addElement("Seleccione...");
            for(FormaPago forma: listaF){
                combo.addElement(forma.getIdFormaPago() + "-" + forma.getTipoPago());
            }
            ArrayList<UsoCFDI> listaU = usoDao.listaUso();
            combo = (DefaultComboBoxModel)cbUso.getModel();
            combo.removeAllElements();
            combo.addElement("Seleccione...");
            for(UsoCFDI uso: listaU){
                combo.addElement(uso.getClave() + "-" + uso.getDescripcion());
            }        
        } catch (SQLException e) {
            
        } catch (Exception e) {
            
        }
    }
    
    private void llenarlistaR(){
        DefaultComboBoxModel comboRIva = new DefaultComboBoxModel();
        DefaultComboBoxModel comboRIsr = new DefaultComboBoxModel();
        DefaultComboBoxModel comboRIeps = new DefaultComboBoxModel();
        
        comboRIva.removeAllElements();
        comboRIsr.removeAllElements();
        comboRIeps.removeAllElements();
        
        comboRIva.addElement("Seleccione");
        comboRIsr.addElement("Seleccione");
        comboRIeps.addElement("Seleccione");
                
        try {
            ArrayList<ImpuestosRetenidos> listaR = impuestosRDao.listaImpuestos();
            
            for(ImpuestosRetenidos impuestosR: listaR){
                if(impuestosR.getTipo().equals("IVA")){
                    comboRIva.addElement(impuestosR.getTipo() + " " + impuestosR.getProcentaje() + " %");
                }else if(impuestosR.getTipo().equals("ISR")){
                    comboRIsr.addElement(impuestosR.getTipo() + " " + impuestosR.getProcentaje() + " %");
                }else if(impuestosR.getTipo().equals("IEPS")){
                    comboRIeps.addElement(impuestosR.getTipo() + " " + impuestosR.getProcentaje() + " %");
                }
            }
            cbRetIVA.setModel(comboRIva);
            cbRetISR.setModel(comboRIsr);
            cbRetIEPS.setModel(comboRIeps);
        } catch (SQLException ex) {
            
        } catch (Exception e){
            
        }
    }

    private void llenarlistaT(){
        DefaultComboBoxModel comboTIva = new DefaultComboBoxModel();
        DefaultComboBoxModel comboTIeps = new DefaultComboBoxModel();
        comboTIva.removeAllElements();
        comboTIeps.removeAllElements();
        comboTIva.addElement("Seleccione");
        comboTIeps.addElement("Seleccione");
        try {
            ArrayList<ImpuestosTrasladados> listaR = impuestosTDao.listaImpuestos();
            
            for(ImpuestosTrasladados impuestosT: listaR){
                if(impuestosT.getTipo().equals("IVA")){
                    comboTIva.addElement(impuestosT.getTipo() + " " + impuestosT.getProcentaje() + " %");
                }else if(impuestosT.getTipo().equals("IEPS")){
                    comboTIeps.addElement(impuestosT.getTipo() + " " + impuestosT.getProcentaje() + " %");
                }
            }
            
            cbIva.setModel(comboTIva);
            cbIEPS.setModel(comboTIeps);
        } catch (SQLException ex) {
            
        } catch (Exception e) {
         
        }
    } 
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ScofainPUEntityManager;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarRetencion;
    private javax.swing.JButton btnAgregarTraslado;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCuentas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaFactura;
    private javax.swing.JButton btnRefreshR;
    private javax.swing.JButton btnRefreshT;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbComprobante;
    private javax.swing.JComboBox<String> cbFormaPago;
    private javax.swing.JComboBox<String> cbIEPS;
    private javax.swing.JComboBox<String> cbIva;
    private javax.swing.JComboBox<String> cbRetIEPS;
    private javax.swing.JComboBox<String> cbRetISR;
    private javax.swing.JComboBox<String> cbRetIVA;
    private javax.swing.JComboBox<String> cbUso;
    private com.toedter.calendar.JDateChooser dcFechaEmision;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCve;
    private javax.swing.JLabel lblCveDescripcion;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFormaPago;
    private javax.swing.JLabel lblISR;
    private javax.swing.JLabel lblIeps;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblRetIsr;
    private javax.swing.JLabel lblRetIva;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUnitario;
    private javax.swing.JLabel lblUsoCfdi;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JRadioButton rbExento;
    private javax.swing.JRadioButton rbRetención;
    private javax.swing.JRadioButton rbTraslado;
    private javax.swing.JTable tbImportes;
    private java.util.List<jpa.Tblcatalogocuentas> tblcatalogocuentasList;
    private javax.persistence.Query tblcatalogocuentasQuery;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCveUnidad;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtIeps;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtRetIeps;
    private javax.swing.JTextField txtRetIsr;
    private javax.swing.JTextField txtRetIva;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
