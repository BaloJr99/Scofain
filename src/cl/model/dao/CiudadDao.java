package cl.model.dao;

import cl.model.db.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CiudadDao {
    public boolean insertarCiudad(Ciudad ciudad) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblCiudad(ciudad, tblEstado_idEstado) VALUES (?,?)");
            pe.setString(1, ciudad.getCiudad());
            pe.setInt(2, ciudad.getTblEstado_idEstado());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public int buscarCiudad(Ciudad ciudad) throws SQLException{
         int idCiudad = 0; 
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("Select * from tblCiudad Where ciudad = '" +ciudad.getCiudad() + "' && tblEstado_idEstado = '" +ciudad.getTblEstado_idEstado() + "'");
        ResultSet re = pe.executeQuery();
        if(re.next()){
            idCiudad = re.getInt("idCiudad");
        }
        re.close();
        pe.close();
        con.close();    
        return idCiudad;
    }
}
