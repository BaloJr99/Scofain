package cl.model.dao;

import cl.model.db.Telefono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TelefonoDao {
    public boolean insertarTelefono(Telefono telefono) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblTelefono(telefono) VALUES (?)");
            pe.setString(1, telefono.getTelefono());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public int buscarTelefono(Telefono telefono) throws SQLException{
        int idTelefono = 0; 
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("Select * from tblTelefono Where telefono = '" +telefono.getTelefono() + "'");
        ResultSet re = pe.executeQuery();
        if(re.next()){
            idTelefono = re.getInt("idTelefono");
        }
        re.close();
        pe.close();
        con.close();    
        return idTelefono;
    }
}
