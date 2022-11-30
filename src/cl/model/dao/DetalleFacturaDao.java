package cl.model.dao;

import cl.model.db.DetalleFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DetalleFacturaDao {
    int ultimo;
    DetalleFactura detalle;
    
    public void insertarDetalle(DetalleFactura detalles) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblDetalleFactura (idDetalle, importe, "
                + "tblproductos_claveProducto, tblImpuestos_idImpuesto, tblFactura_folio, cantidad, tblclaveUnidad_clave) VALUES "
                + "(?,?,?,?,?,?,?)");
        pe.setString(1, detalles.getIdDetalle());
        pe.setFloat(2, detalles.getImporte());
        pe.setString(3, detalles.getTblproductos_claveProducto());
        pe.setInt(4, detalles.getTblImpuestos_idImpuesto());
        pe.setInt(5, detalles.getTblFactura_folio());
        pe.setFloat(6, detalles.getCantidad());
        pe.setString(7, detalles.getTblclaveUnidad_clave());
        
        pe.executeUpdate();
        
        pe.close();
        con.close();
    }
    
    public ArrayList<DetalleFactura> listaDetalles(int num) throws SQLException{
        ArrayList<DetalleFactura> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblDetalleFactura WHERE tblFactura_folio = '" + num + "'");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            detalle = new DetalleFactura(re.getInt("tblImpuestos_idImpuesto"), re.getInt("tblFactura_folio"), re.getFloat("importe"), re.getFloat("cantidad"), re.getString("idDetalle"), re.getString("tblproductos_claveProducto"), re.getString("tblclaveUnidad_clave"));
            lista.add(detalle);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
    public float totalISR(int folio) throws SQLException{
        float totalISR = 0;
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT (SUM(importe) * (SUM(tblimpuestosretenidos.porcentaje)) / 100) FROM tbldetallefactura "
                + "INNER JOIN tblimpuestos ON tbldetallefactura.tblImpuestos_idImpuesto = tblimpuestos.idImpuesto "
                + "INNER JOIN tblimpuestosretenidos ON tblimpuestos.tblImpuestosRetenidos_idRetenidos = tblimpuestosretenidos.idRetenidos "
                + "WHERE tblFactura_folio = " + folio + " && tblimpuestosretenidos.tipo = 'ISR'");
        
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            totalISR = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return totalISR;
    }
    
    public float totalRetIva(int folio) throws SQLException{
        float RetIva = 0;
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT (SUM(importe) * (SUM(tblimpuestosretenidos.porcentaje)) / 100) FROM tbldetallefactura "
                + "INNER JOIN tblimpuestos ON tbldetallefactura.tblImpuestos_idImpuesto = tblimpuestos.idImpuesto "
                + "INNER JOIN tblimpuestosretenidos ON tblimpuestos.tblImpuestosRetenidos_idRetenidos = tblimpuestosretenidos.idRetenidos "
                + "where tblFactura_folio = " + folio + " && tblimpuestosretenidos.tipo = 'IVA'");
        
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            RetIva = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return RetIva;
    }
    
    public float totalRetIeps(int folio) throws SQLException{
        float RetIeps = 0;
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT (SUM(importe) * (SUM(tblimpuestosretenidos.porcentaje)) / 100) FROM tbldetallefactura "
                + "INNER JOIN tblimpuestos ON tbldetallefactura.tblImpuestos_idImpuesto = tblimpuestos.idImpuesto "
                + "INNER JOIN tblimpuestosretenidos ON tblimpuestos.tblImpuestosRetenidos_idRetenidos = tblimpuestosretenidos.idRetenidos "
                + "WHERE tblFactura_folio = " + folio + " && tblimpuestosretenidos.tipo = 'IEPS'");
        
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            RetIeps = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return RetIeps;
    }
    
    public float totalIva(int folio) throws SQLException{
        float iva = 0;
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT (SUM(importe) * (SUM(tblimpuestostrasladados.porcentaje)) / 100) FROM tbldetallefactura "
                + "INNER JOIN tblimpuestos ON tbldetallefactura.tblImpuestos_idImpuesto = tblimpuestos.idImpuesto "
                + "INNER JOIN tblimpuestostrasladados ON tblimpuestos.tblImpuestosTrasladados_idTrasladados = tblimpuestostrasladados.idTrasladados "
                + "WHERE tblFactura_folio = " + folio + " && tblimpuestostrasladados.tipo = 'IVA'");
        
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            iva = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return iva;
    }
    
    public float totalIeps(int folio) throws SQLException{
        float ieps = 0;
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT (SUM(importe) * (SUM(tblimpuestostrasladados.porcentaje)) / 100) FROM tbldetallefactura "
                + "INNER JOIN tblimpuestos ON tbldetallefactura.tblImpuestos_idImpuesto = tblimpuestos.idImpuesto "
                + "INNER JOIN tblimpuestostrasladados ON tblimpuestos.tblImpuestosTrasladados_idTrasladados = tblimpuestostrasladados.idTrasladados "
                + "WHERE tblFactura_folio = " + folio + " && tblimpuestostrasladados.tipo = 'IEPS'");
        
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            ieps = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return ieps;
    }
    
    public void eliminarDetalle(int folio, int numDetalle) throws SQLException{
        String idDetalle = "%." + String.valueOf(numDetalle) + ".%";
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("DELETE FROM tbldetallefactura "
                + "WHERE tblFactura_folio = " + folio + " && idDetalle LIKE ?");
        pe.setString(1, idDetalle);
        pe.executeUpdate();
        pe.close();
        con.close();        
    }
    
    public void reajustar(int folio, int numDetalle) throws SQLException{
        int cont = numDetalle;
        boolean flag = false;
        
        PreparedStatement pe1;
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tbldetallefactura "
                + "WHERE tblFactura_folio = " + folio + "");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            if(re.getString("idDetalle").contains("." + (numDetalle + 1) + ".")){
                flag = true;
            }
            
            if(flag == true && !re.getString("idDetalle").contains("." + (numDetalle + 1) + ".")){
                cont++;
                numDetalle++;
            }
            
            if(flag == true){
                pe1 = con.prepareStatement("UPDATE tbldetallefactura SET idDetalle = '" + codificarNuevo(re.getString("idDetalle"), cont) + "' "
                + "WHERE tblFactura_folio = " + folio + " AND idDetalle = '" + re.getString("idDetalle") + "'");
                pe1.executeUpdate();
            }
        }
        
        pe.close();
        con.close();     
    }
    
    public String codificarNuevo(String d, int n){
        String datoN = "";
        
        datoN = d.replace("." + (n + 1) + ".", "." + n + ".");
        
        return datoN;
    }
}
