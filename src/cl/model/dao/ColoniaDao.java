package cl.model.dao;

import cl.model.db.Colonia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ColoniaDao {
    public boolean insertarColonia(Colonia colonia) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblColonia(codigoPostal, colonia, tblCiudad_idCiudad) VALUES (?,?,?)");
            pe.setString(1, colonia.getCodigoPostal());
            pe.setString(2, colonia.getColonia());
            pe.setInt(3, colonia.getTblCiudad_idCiudad());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public String buscarColonia(Colonia colonia) throws SQLException{
        String codigoPostal = ""; 
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("Select * from tblColonia Where colonia = '" +colonia.getColonia()+ "' && tblCiudad_idCiudad = '" +colonia.getTblCiudad_idCiudad() + "'");
        ResultSet re = pe.executeQuery();
        if(re.next()){
            codigoPostal = re.getString("codigoPostal");
        }
        re.close();
        pe.close();
        con.close();    
        return codigoPostal;
    }
}
