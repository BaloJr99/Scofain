package cl.model.dao;

import cl.model.db.Impuestos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImpuestosDao {
    
    public int insertarImpuesto(Impuestos impuesto) throws SQLException{
        int id = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblImpuestos(tblImpuestosTrasladados_idTrasladados,"
                + "tblImpuestosRetenidos_idRetenidos, exento) VALUES (?,?,?)");
        pe.setFloat(1, impuesto.getTblImpuestosTrasladados_idTrasladados());
        pe.setFloat(2, impuesto.getTblImpuestosRetenidos_idRetenidos());
        pe.setBoolean(3, impuesto.isExento());
        pe.executeUpdate();
        
        pe.close();
        pe = con.prepareStatement("SELECT * FROM tblImpuestos "
                + "WHERE tblImpuestosTrasladados_idTrasladados = ? && tblImpuestosRetenidos_idRetenidos = ? && exento = ?");
        pe.setFloat(1, impuesto.getTblImpuestosTrasladados_idTrasladados());
        pe.setFloat(2, impuesto.getTblImpuestosRetenidos_idRetenidos());
        pe.setBoolean(3, impuesto.isExento());
        
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            id = re.getInt("idImpuesto");
        }
        
        re.close();
        pe.close();
        con.close();
        
        return id;
    }
    
    public int buscarImpuestoRep(Impuestos impuesto) throws SQLException{
        int numRep = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblImpuestos WHERE tblImpuestosTrasladados_idTrasladados = ? AND tblImpuestosRetenidos_idRetenidos = ? AND exento = ?");
        pe.setFloat(1, impuesto.getTblImpuestosTrasladados_idTrasladados());
        pe.setFloat(2, impuesto.getTblImpuestosRetenidos_idRetenidos());
        pe.setBoolean(3, impuesto.isExento());
        
        ResultSet re = pe.executeQuery();
        if(re.next()){
            numRep = re.getInt("idImpuesto");
        }
        
        pe.close();
        re.close();
        con.close();
        
        return numRep;
    }
}
