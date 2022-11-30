package ventanas;

import cl.model.dao.ImpuestosRetenidosDao;
import cl.model.db.ImpuestosRetenidos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.Tblimpuestosretenidos;
import misExcepciones.MisExcepciones;

public class ImpuestosR extends javax.swing.JFrame {

    ImpuestosRetenidos impuestoR;
    
    ImpuestosRetenidosDao dao = new ImpuestosRetenidosDao();
    
    Tblimpuestosretenidos tblimpuestosR;
    
    public ImpuestosR() {
        super("Impuestos Retenidos");
        initComponents();
        setLocationRelativeTo(null);
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel2 = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbImpuestos = new javax.swing.JTable();
        txtPorcentaje = new javax.swing.JFormattedTextField();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("TIPO");

        lblTitulo.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(":IMPUESTOS RETENIDOS:");

        lblPorcentaje.setForeground(new java.awt.Color(0, 0, 0));
        lblPorcentaje.setText("PORCENTAJE");

        btnAgregar.setBackground(new java.awt.Color(204, 204, 255));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        tbImpuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Porcentaje"
            }
        ));
        tbImpuestos.setColumnSelectionAllowed(true);
        tbImpuestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbImpuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbImpuestosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbImpuestos);
        tbImpuestos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtPorcentaje.setBackground(new java.awt.Color(204, 204, 255));
        txtPorcentaje.setForeground(new java.awt.Color(0, 0, 0));
        txtPorcentaje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        cbTipo.setBackground(new java.awt.Color(204, 204, 255));
        cbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "IVA", "ISR", "IEPS" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPorcentaje)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitulo)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnRegresar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(!camposVacios()){
                impuestoR = new ImpuestosRetenidos(cbTipo.getSelectedItem().toString(), Float.valueOf(txtPorcentaje.getText()));
                if(!dao.repetido(impuestoR)){
                    dao.insertarImpuestos(impuestoR);
                    JOptionPane.showMessageDialog(this, "Impuesto Registrado!!!");
                    actualizarTabla();
                    limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(this, "Ya registrado");
                }
            }
            
        } catch (MisExcepciones ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception e){
            limpiarCampos();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void actualizarTabla(){
        try {
            ArrayList<ImpuestosRetenidos> lista = dao.listaImpuestos();
            Object datos[] = new  Object[2];
            DefaultTableModel modelo = (DefaultTableModel)tbImpuestos.getModel();
            modelo.setRowCount(0);

            for(ImpuestosRetenidos tax: lista){
                datos[0] = tax.getTipo();
                datos[1] = tax.getProcentaje();
                modelo.addRow(datos);
            }

            tbImpuestos.setModel(modelo);
        } catch (SQLException e) {
            
        }
    }
    
    private void limpiarCampos(){
        cbTipo.setSelectedIndex(0);
        txtPorcentaje.setText("");
    }
    
    private boolean camposVacios() throws MisExcepciones{
        boolean flag = false;
        
        if(cbTipo.getSelectedIndex() == 0){
            flag = true;
            throw new MisExcepciones(43);
        }else if(txtPorcentaje.getText().isEmpty()){
            flag = true;
            throw new MisExcepciones(44);
        }else if(cbTipo.getSelectedIndex() == 1){
            //IVA   
            if(Float.valueOf(txtPorcentaje.getText()) < 0 || Float.valueOf(txtPorcentaje.getText()) > 16){
                flag = true;
                throw new MisExcepciones(46);
            }
        }else if(cbTipo.getSelectedIndex() == 2){
            //ISR   
            if(Float.valueOf(txtPorcentaje.getText()) < 0 || Float.valueOf(txtPorcentaje.getText()) > 35){
                flag = true;
                throw new MisExcepciones(47);
            }
        }else if(cbTipo.getSelectedIndex() == 3){
            //IEPS   
            if(Float.valueOf(txtPorcentaje.getText()) != 26.50 && Float.valueOf(txtPorcentaje.getText()) != 30.00 &&
                    Float.valueOf(txtPorcentaje.getText()) != 53.00 && Float.valueOf(txtPorcentaje.getText()) != 50.00 &&
                    Float.valueOf(txtPorcentaje.getText()) != 16.00 && Float.valueOf(txtPorcentaje.getText()) != 30.4 &&
                    Float.valueOf(txtPorcentaje.getText()) != 25.00 && Float.valueOf(txtPorcentaje.getText()) != 9.00 && 
                    Float.valueOf(txtPorcentaje.getText()) != 8.00  && Float.valueOf(txtPorcentaje.getText()) != 7.00 &&
                    Float.valueOf(txtPorcentaje.getText()) != 6.00){
                flag = true;
                throw new MisExcepciones(48);
            }
        }
        
        return flag;
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tbImpuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbImpuestosMouseClicked
        int filaseleccionada = tbImpuestos.getSelectedRow();
        cbTipo.setSelectedItem(tbImpuestos.getValueAt(filaseleccionada, 0).toString());
        txtPorcentaje.setText(tbImpuestos.getValueAt(filaseleccionada, 1).toString());
    }//GEN-LAST:event_tbImpuestosMouseClicked

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
            java.util.logging.Logger.getLogger(ImpuestosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpuestosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpuestosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpuestosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpuestosR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.persistence.EntityManager entma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbImpuestos;
    private javax.swing.JFormattedTextField txtPorcentaje;
    // End of variables declaration//GEN-END:variables
}
