package cl.model.dao;

import cl.model.db.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FacturaDao {
    
    public void insertarFactura(Factura factura) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblFactura (folio, fechaEmision, "
                + "tblFormaPago_idFormaPago, tblMetodoPago_idMetodoPago, tblEmisor_rfcEmisor, tblReceptor_rfcReceptor, "
                + "tbltipoComprobante_clave, tblusoCFDI_clave, estadoFactura) values (?,?,?,?,?,?,?,?,?)");
        pe.setInt(1, factura.getFolio());
        pe.setDate(2, factura.getFechaEmision());
        pe.setString(3, factura.getTblFormaPago_idFormaPago());
        pe.setString(4, factura.getTblMetodoPago_idMetodoPago());
        pe.setString(5, factura.getTblEmisor_rfcEmisor());
        pe.setString(6, factura.getTblReceptor_rfcReceptor());
        pe.setString(7, factura.getTbltipoComprobante_clave());
        pe.setString(8, factura.getTblusoCFDI_clave());
        pe.setString(9, factura.getEstado());
        pe.executeUpdate();
        pe.close();
        con.close();
    }
    
    public ArrayList<Factura> listaFacturas() throws SQLException{
        
        ArrayList<Factura> lista = new ArrayList<>();
        Factura factura = null;
        
        try {
            boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT * FROM tblFactura");
            ResultSet re = pe.executeQuery();
            
            while(re.next()){
                factura = new Factura(re.getInt(1), re.getString(6), re.getDate(2), re.getString(7), re.getString(9));
                lista.add(factura);
            }
            
            pe.close();
            con.close();    
            flag = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());            
        }
        return lista;
    }
}
