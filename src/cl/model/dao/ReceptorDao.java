package cl.model.dao;

import cl.model.db.Receptor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReceptorDao {
    public boolean insertarReceptor(Receptor receptor) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblReceptor(rfcReceptor) VALUES (?)");
            pe.setString(1, receptor.getRfc());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
}
