package cl.model.dao;

import cl.model.db.ImpuestosTrasladados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImpuestosTrasladadosDao {
    ImpuestosTrasladados impuesto;
    
    public void insertarImpuestos(ImpuestosTrasladados impuestos) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblImpuestosTrasladados (tipo, porcentaje) VALUES (?,?)");
        pe.setString(1, impuestos.getTipo());
        pe.setFloat(2, impuestos.getProcentaje());
        pe.executeUpdate();
        
        pe.close();
        con.close();
    }
    
    public ArrayList<ImpuestosTrasladados> listaImpuestos() throws SQLException{
        ArrayList<ImpuestosTrasladados> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestosTrasladados");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            impuesto = new ImpuestosTrasladados(re.getString("tipo"), re.getFloat("porcentaje"));
            lista.add(impuesto);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
    public boolean repetido(ImpuestosTrasladados impuestoT) throws SQLException{
        boolean flag = false;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestosTrasladados WHERE "
                + "tipo = '" + impuestoT.getTipo() + "' && porcentaje = '" + impuestoT.getProcentaje() + "'");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            flag = true;
        }
        
        re.close();
        pe.close();
        con.close();
        
        return flag;
    }
    
    public int buscarId(ImpuestosTrasladados impuestoT) throws SQLException{
        int id = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestosTrasladados WHERE "
                + "tipo = '" + impuestoT.getTipo() + "' && porcentaje = " + impuestoT.getProcentaje() + "");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            id = re.getInt("idTrasladados");
        }
        
        re.close();
        pe.close();
        con.close();
        
        return id;
    }
}
