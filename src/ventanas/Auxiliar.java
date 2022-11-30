package ventanas;

import dialogos.ReporteAuxiliar;
import java.sql.Date;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import jpa.Tblcatalogocuentas;
import misExcepciones.MisExcepciones;

public class Auxiliar extends javax.swing.JFrame {

    ReporteAuxiliar reporte;
    
    Tblcatalogocuentas catalogo;
    
    public Auxiliar() {
        super("Movimientos auxiliares");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        dcFechaInicial = new com.toedter.calendar.JDateChooser();
        dcFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 134, 113));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcFechaInicial.setBackground(new java.awt.Color(255, 255, 255));
        dcFechaInicial.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaInicial.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dcFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, -1));

        dcFechaFinal.setBackground(new java.awt.Color(255, 255, 255));
        dcFechaFinal.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaFinal.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dcFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, -1));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FECHA INICIAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FECHA FINAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 30));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CUENTA ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 20));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MOVIMIENTOS AUXILIARES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtCuenta.setBackground(new java.awt.Color(255, 255, 255));
        txtCuenta.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dcFechaInicial.setDate(null);
        dcFechaFinal.setDate(null);
        txtCuenta.setText("");
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            if(dcFechaInicial.getDate() == null){
                throw new MisExcepciones(59);
            }else if(dcFechaFinal.getDate() == null){
                throw new MisExcepciones(60);
            }else if(dcFechaInicial.getDate().after(dcFechaFinal.getDate())){
                throw new MisExcepciones(61);
            }else if(txtCuenta.getText().equals("   -  -   ")) {
                throw new MisExcepciones(31);
            }else{
                Query qf = entma.createNamedQuery("Tblcatalogocuentas.findByCodigo");
                qf.setParameter("codigo", txtCuenta.getText());
                catalogo = (Tblcatalogocuentas)qf.getSingleResult();
                Date fechaInicial = new Date(dcFechaInicial.getDate().getTime());
                Date fechaFinal = new Date(dcFechaFinal.getDate().getTime());
                reporte = new ReporteAuxiliar(this, false, fechaInicial, fechaFinal, txtCuenta.getText());
                reporte.setVisible(true);
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NoResultException e){
            JOptionPane.showMessageDialog(this, "No se encontro esa cuenta");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auxiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRegresar;
    private com.toedter.calendar.JDateChooser dcFechaFinal;
    private com.toedter.calendar.JDateChooser dcFechaInicial;
    private javax.persistence.EntityManager entma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
