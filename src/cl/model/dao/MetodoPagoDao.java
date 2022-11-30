package cl.model.dao;

import cl.model.db.MetodoPago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MetodoPagoDao {
    MetodoPago metodopago;
    
    public ArrayList<MetodoPago> listaMetodos() throws SQLException{
        ArrayList<MetodoPago> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblFormaPago");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            metodopago = new MetodoPago(re.getString("idMetodoPago"), re.getString("tipoMetodo"));
            lista.add(metodopago);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
}
