package cl.model.dao;

import cl.model.db.Domicilio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DomicilioDao {
    public boolean insertarDomicilio(Domicilio domicilio) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblDomicilio(calle, numeroInterior, numeroExterior, tblColonia_codigoPostal) VALUES (?,?,?,?)");
            pe.setString(1, domicilio.getCalle());
            pe.setString(2, domicilio.getNumeroInterior());
            pe.setString(3, domicilio.getNumeroExterior());
            pe.setString(4, domicilio.getTblColonia_codigoPostal());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public int buscarDomicilio(Domicilio domicilio) throws SQLException{
        int idDomicilio = 0; 
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("Select * from tblDomicilio Where calle = '" +domicilio.getCalle()+ "' && numeroInterior= '" +domicilio.getNumeroInterior() + "'&& numeroExterior= '" +domicilio.getNumeroExterior() + "'");
        ResultSet re = pe.executeQuery();
        if(re.next()){
            idDomicilio = re.getInt("idDomicilio");
        }
        re.close();
        pe.close();
        con.close();    
        return idDomicilio;
    }
}
