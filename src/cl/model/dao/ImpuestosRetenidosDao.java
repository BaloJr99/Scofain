package cl.model.dao;

import cl.model.db.ImpuestosRetenidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ImpuestosRetenidosDao {
    ImpuestosRetenidos impuesto;
    
    public void insertarImpuestos(ImpuestosRetenidos impuestos) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblImpuestosRetenidos (tipo, porcentaje) VALUES (?,?)");
        pe.setString(1, impuestos.getTipo());
        pe.setFloat(2, impuestos.getProcentaje());
        pe.executeUpdate();
        
        pe.close();
        con.close();
    }
    
    public ArrayList<ImpuestosRetenidos> listaImpuestos() throws SQLException{
        ArrayList<ImpuestosRetenidos> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestosRetenidos");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            impuesto = new ImpuestosRetenidos(re.getString("tipo"), re.getFloat("porcentaje"));
            lista.add(impuesto);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
    public boolean repetido(ImpuestosRetenidos impuestoR) throws SQLException{
        boolean flag = false;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestosRetenidos WHERE "
                + "tipo = '" + impuestoR.getTipo() + "' && porcentaje = '" + impuestoR.getProcentaje() + "'");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            flag = true;
        }
        
        re.close();
        pe.close();
        con.close();
        
        return flag;
    }
    
    public int buscarId(ImpuestosRetenidos impuestoR) throws SQLException{
        int id = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestosRetenidos WHERE "
                + "tipo = '" + impuestoR.getTipo() + "' && porcentaje = '" + impuestoR.getProcentaje() + "'");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            id = re.getInt("idRetenidos");
        }
        
        re.close();
        pe.close();
        con.close();
        
        return id;
    }
}
