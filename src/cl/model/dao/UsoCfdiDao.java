package cl.model.dao;

import cl.model.db.UsoCFDI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsoCfdiDao {
    UsoCFDI uso;
    
    public ArrayList<UsoCFDI> listaUso() throws SQLException{
        ArrayList<UsoCFDI> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblusoCFDI");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            uso = new UsoCFDI(re.getString("clave"), re.getString("descripcion"));
            lista.add(uso);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
}
