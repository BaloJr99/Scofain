package cl.model.dao;

import cl.model.db.FormaPago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FormaPagoDao {
    FormaPago formapago;
    
    public ArrayList<FormaPago> listaFormas() throws SQLException{
        ArrayList<FormaPago> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblFormaPago");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            formapago = new FormaPago(re.getString("idFormaPago"), re.getString("tipoPago"));
            lista.add(formapago);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
}
