package ventanas;

import dialogos.AcercaDe;
import dialogos.ReporteEmpleado;
import dialogos.ReporteFacturas;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import jpa.Tbliniciosesion;
import jpa.Tblusuarios;


public class MenuPrincipal extends javax.swing.JFrame {
    
    Tblusuarios user;
    String usuario;
    
    Cuentas cuenta = new Cuentas();
    CatalogoSat producto = new CatalogoSat();
    Clientes cliente= new Clientes();
    Empleados empleado = new Empleados();
    Inventario inv = new Inventario();
    
    public MenuPrincipal() {
        super("Menu");
        initComponents();
        setLocationRelativeTo(null);
    }    

    public MenuPrincipal(String user) {
        super("Menu");
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = user;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ScofainPU").createEntityManager();
        panelFondo = new javax.swing.JPanel();
        btnContabilidad = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        panelFacturacion = new javax.swing.JPanel();
        btnComprobantes = new javax.swing.JButton();
        btnNomina = new javax.swing.JButton();
        lblFacturacion = new javax.swing.JLabel();
        menuOpciones = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnCambiar = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenu();
        btnCatalogos = new javax.swing.JMenu();
        btnCuentas = new javax.swing.JMenu();
        btnProductos = new javax.swing.JMenu();
        btnAltas = new javax.swing.JMenu();
        btnEmpleados = new javax.swing.JMenu();
        btnClientes = new javax.swing.JMenu();
        btnReportes = new javax.swing.JMenu();
        btnREmpleados = new javax.swing.JMenu();
        btnRFacturas = new javax.swing.JMenu();
        btnAyuda = new javax.swing.JMenu();
        btnInfo = new javax.swing.JMenu();
        btnAcercade = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(204, 255, 204));

        btnContabilidad.setBackground(new java.awt.Color(204, 255, 204));
        btnContabilidad.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnContabilidad.setForeground(new java.awt.Color(0, 0, 0));
        btnContabilidad.setText("CONTABILIDAD");
        btnContabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContabilidadActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(204, 255, 204));
        btnInventario.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(0, 0, 0));
        btnInventario.setText("INVENTARIO");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        panelFacturacion.setBackground(new java.awt.Color(153, 255, 153));
        panelFacturacion.setForeground(new java.awt.Color(0, 0, 0));

        btnComprobantes.setBackground(new java.awt.Color(204, 255, 204));
        btnComprobantes.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnComprobantes.setForeground(new java.awt.Color(0, 0, 0));
        btnComprobantes.setText("COMPROBANTES");
        btnComprobantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobantesActionPerformed(evt);
            }
        });

        btnNomina.setBackground(new java.awt.Color(204, 255, 204));
        btnNomina.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnNomina.setForeground(new java.awt.Color(0, 0, 0));
        btnNomina.setText("NOMINA");
        btnNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNominaActionPerformed(evt);
            }
        });

        lblFacturacion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblFacturacion.setForeground(new java.awt.Color(0, 0, 0));
        lblFacturacion.setText("FACTURACION");

        javax.swing.GroupLayout panelFacturacionLayout = new javax.swing.GroupLayout(panelFacturacion);
        panelFacturacion.setLayout(panelFacturacionLayout);
        panelFacturacionLayout.setHorizontalGroup(
            panelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprobantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNomina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelFacturacionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblFacturacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFacturacionLayout.setVerticalGroup(
            panelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFacturacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprobantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNomina)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnContabilidad)
                .addGap(15, 15, 15)
                .addComponent(panelFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario)
                .addGap(44, 44, 44))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 320));

        menuOpciones.setBackground(new java.awt.Color(204, 255, 204));

        btnArchivo.setBackground(new java.awt.Color(153, 153, 255));
        btnArchivo.setForeground(new java.awt.Color(0, 0, 0));
        btnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        btnArchivo.setText("Archivo");
        btnArchivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnCambiar.setBackground(new java.awt.Color(204, 204, 255));
        btnCambiar.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnCambiar.setText("Cambiar de Usuario");
        btnCambiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarMouseClicked(evt);
            }
        });
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        btnArchivo.add(btnCambiar);

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnSalir);

        menuOpciones.add(btnArchivo);

        btnCatalogos.setBackground(new java.awt.Color(153, 153, 255));
        btnCatalogos.setForeground(new java.awt.Color(0, 0, 0));
        btnCatalogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/catalogo.png"))); // NOI18N
        btnCatalogos.setText("Catalogos");
        btnCatalogos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnCuentas.setBackground(new java.awt.Color(204, 204, 255));
        btnCuentas.setForeground(new java.awt.Color(0, 0, 0));
        btnCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        btnCuentas.setText("Cuentas");
        btnCuentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuentasMouseClicked(evt);
            }
        });
        btnCatalogos.add(btnCuentas);

        btnProductos.setBackground(new java.awt.Color(204, 204, 255));
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.jpg"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        btnCatalogos.add(btnProductos);

        menuOpciones.add(btnCatalogos);

        btnAltas.setBackground(new java.awt.Color(153, 153, 255));
        btnAltas.setForeground(new java.awt.Color(0, 0, 0));
        btnAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        btnAltas.setText("Altas");
        btnAltas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnEmpleados.setBackground(new java.awt.Color(204, 204, 255));
        btnEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
        });
        btnAltas.add(btnEmpleados);

        btnClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });
        btnAltas.add(btnClientes);

        menuOpciones.add(btnAltas);

        btnReportes.setBackground(new java.awt.Color(153, 153, 255));
        btnReportes.setForeground(new java.awt.Color(0, 0, 0));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnREmpleados.setBackground(new java.awt.Color(204, 204, 255));
        btnREmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnREmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        btnREmpleados.setText("Empleados");
        btnREmpleados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnREmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnREmpleadosMouseClicked(evt);
            }
        });
        btnReportes.add(btnREmpleados);

        btnRFacturas.setBackground(new java.awt.Color(204, 204, 255));
        btnRFacturas.setForeground(new java.awt.Color(0, 0, 0));
        btnRFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btnRFacturas.setText("Facturas");
        btnRFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRFacturasMouseClicked(evt);
            }
        });
        btnReportes.add(btnRFacturas);

        menuOpciones.add(btnReportes);

        btnAyuda.setBackground(new java.awt.Color(153, 153, 255));
        btnAyuda.setForeground(new java.awt.Color(0, 0, 0));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnInfo.setBackground(new java.awt.Color(204, 204, 255));
        btnInfo.setForeground(new java.awt.Color(0, 0, 0));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        btnInfo.setText("Info");
        btnInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAyuda.add(btnInfo);

        btnAcercade.setBackground(new java.awt.Color(204, 204, 255));
        btnAcercade.setForeground(new java.awt.Color(0, 0, 0));
        btnAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        btnAcercade.setText("Acerca de nosotros");
        btnAcercade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAcercade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcercadeMouseClicked(evt);
            }
        });
        btnAyuda.add(btnAcercade);

        menuOpciones.add(btnAyuda);

        setJMenuBar(menuOpciones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actividad(String act){
        Query qf = entma.createNamedQuery("Tblusuarios.findByUsuario");
        qf.setParameter("usuario", usuario);
        user = (Tblusuarios)qf.getSingleResult();
        entma.getTransaction().begin();
        Tbliniciosesion inicio = new Tbliniciosesion();
        inicio.setFecha(new Date(Calendar.getInstance().getTimeInMillis()));
        inicio.setTblUsuariosusuario(user);
        inicio.setArea(act);
        entma.persist(inicio);
        entma.getTransaction().commit();
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarMouseClicked
       Login log = new Login();
       log.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCambiarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnContabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContabilidadActionPerformed
        actividad("Contabilidad");
        Contabilidad conta = new Contabilidad(usuario);
        conta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContabilidadActionPerformed

    private void btnCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuentasMouseClicked
        if(cuenta.isVisible()){
            cuenta.repaint();
            cuenta.requestFocus();
        }else{
            cuenta.repaint();
            cuenta.setVisible(true);
        }
    }//GEN-LAST:event_btnCuentasMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        if(producto.isVisible()){
            producto.repaint();
            producto.requestFocus();
        }else{
            producto.repaint();
            producto.setVisible(true);
        }
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked
        if(empleado.isVisible()){
            empleado.repaint();
            empleado.requestFocus();
        }else{
            empleado.repaint();
            empleado.setVisible(true);
        }
    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        if(cliente.isVisible()){
            cliente.repaint();
            cliente.requestFocus();
        }else{
            cliente.repaint();
            cliente.setVisible(true);
        }
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnComprobantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobantesActionPerformed
        actividad("Facturacion");
        Facturacion facturas = new Facturacion(usuario);
        facturas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprobantesActionPerformed

    private void btnNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominaActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar una prenómina");
        
        if(respuesta == JOptionPane.YES_OPTION){
            actividad("Prenomina");
            Prenominas prenomina = new Prenominas(usuario);
            prenomina.setVisible(true);
            this.dispose();
        }else if(respuesta == JOptionPane.NO_OPTION){
            actividad("Nomina");
            Nominas nomina = new Nominas(usuario);
            nomina.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnNominaActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        actividad("Inventario");
        if(inv.isVisible()){
            inv.repaint();
            inv.requestFocus();
        }else{
            inv.repaint();
            inv.setVisible(true);
        }
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnREmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnREmpleadosMouseClicked
        ReporteEmpleado rempleado = new ReporteEmpleado(this, true);
        rempleado.setVisible(true);
    }//GEN-LAST:event_btnREmpleadosMouseClicked

    private void btnRFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRFacturasMouseClicked
        ReporteFacturas rfacturas = new ReporteFacturas(this, true);
        rfacturas.setVisible(true);
    }//GEN-LAST:event_btnRFacturasMouseClicked

    private void btnAcercadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercadeMouseClicked
        AcercaDe acerca = new AcercaDe(this, true);
        acerca.setVisible(true);
        acerca.setEnabled(false);
    }//GEN-LAST:event_btnAcercadeMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnAcercade;
    private javax.swing.JMenu btnAltas;
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnAyuda;
    private javax.swing.JMenu btnCambiar;
    private javax.swing.JMenu btnCatalogos;
    private javax.swing.JMenu btnClientes;
    private javax.swing.JButton btnComprobantes;
    private javax.swing.JButton btnContabilidad;
    private javax.swing.JMenu btnCuentas;
    private javax.swing.JMenu btnEmpleados;
    private javax.swing.JMenu btnInfo;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNomina;
    private javax.swing.JMenu btnProductos;
    private javax.swing.JMenu btnREmpleados;
    private javax.swing.JMenu btnRFacturas;
    private javax.swing.JMenu btnReportes;
    private javax.swing.JMenu btnSalir;
    private javax.persistence.EntityManager entma;
    private javax.swing.JLabel lblFacturacion;
    private javax.swing.JMenuBar menuOpciones;
    private javax.swing.JPanel panelFacturacion;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
