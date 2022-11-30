package ventanas;

import dialogos.ReporteBalanza;
import javax.swing.JOptionPane;

public class Contabilidad extends javax.swing.JFrame {
    
    String usuario;

    private int periodo = 0;
    private int mes = 0;
    
    Polizas poliza = new Polizas();
    Cuentas cuenta = new Cuentas();
    Auxiliar aux = new Auxiliar();
    
    public Contabilidad() {
        super("Contabilidad");
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Contabilidad(String user) {
        super("Contabilidad");
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnPolizaNueva = new javax.swing.JMenu();
        btnReportes = new javax.swing.JMenu();
        btnAuxiliar = new javax.swing.JMenu();
        btnBalanza = new javax.swing.JMenu();
        btnPeriodo = new javax.swing.JMenu();
        btnCuentas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBackground(new java.awt.Color(204, 204, 255));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        jMenuBar1.setBackground(new java.awt.Color(177, 184, 206));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnPolizaNueva.setForeground(new java.awt.Color(0, 0, 0));
        btnPolizaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnPolizaNueva.setText("Póliza");
        btnPolizaNueva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPolizaNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPolizaNuevaMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnPolizaNueva);

        btnReportes.setForeground(new java.awt.Color(0, 0, 0));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnAuxiliar.setText("Auxiliar de cuentas");
        btnAuxiliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuxiliarMouseClicked(evt);
            }
        });
        btnReportes.add(btnAuxiliar);

        btnBalanza.setText("Balanza");
        btnBalanza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBalanzaMouseClicked(evt);
            }
        });
        btnReportes.add(btnBalanza);

        jMenuBar1.add(btnReportes);

        btnPeriodo.setForeground(new java.awt.Color(0, 0, 0));
        btnPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        btnPeriodo.setText("Periodo ");
        btnPeriodo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPeriodoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnPeriodo);

        btnCuentas.setForeground(new java.awt.Color(0, 0, 0));
        btnCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        btnCuentas.setText("Cuentas");
        btnCuentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCuentas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPeriodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeriodoMouseClicked
        try {
            this.periodo = Integer.valueOf(JOptionPane.showInputDialog("AÑO"));
            if(String.valueOf(periodo).length() > 4 || this.periodo < 0){
                throw new Exception();
            }
        } catch (Exception e) {
            this.periodo = 0;
            JOptionPane.showMessageDialog(this, "El periodo es el año contable");
        }
        
    }//GEN-LAST:event_btnPeriodoMouseClicked

    private void btnPolizaNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPolizaNuevaMouseClicked
        if(poliza.isVisible()){
            poliza.requestFocus();
        }else{
            poliza.setVisible(true);
        }
    }//GEN-LAST:event_btnPolizaNuevaMouseClicked

    private void btnAuxiliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAuxiliarMouseClicked
        if(aux.isVisible()){
            aux.requestFocus();
        }else{
            aux.setVisible(true);
        }
    }//GEN-LAST:event_btnAuxiliarMouseClicked

    private void btnBalanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalanzaMouseClicked
        try {
            if(this.periodo != 0){
                this.mes = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el mes del año en formato de numero"));
                if(this.mes < 1 || this.mes > 12){
                    throw new NumberFormatException();
                }else{
                    ReporteBalanza reporte = new ReporteBalanza(this, false, mes, periodo);
                    reporte.setVisible(true);
                }
            }else{
                throw new Exception();
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El mes ingresado debe ser su correspondiente al numero");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar el periodo");
        }
    }//GEN-LAST:event_btnBalanzaMouseClicked

    private void btnCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuentasMouseClicked
        if(cuenta.isVisible()){
            cuenta.requestFocus();
        }else{
            cuenta.setVisible(true);
        }
    }//GEN-LAST:event_btnCuentasMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuario);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnAuxiliar;
    private javax.swing.JMenu btnBalanza;
    private javax.swing.JMenu btnCuentas;
    private javax.swing.JMenu btnPeriodo;
    private javax.swing.JMenu btnPolizaNueva;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenu btnReportes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
