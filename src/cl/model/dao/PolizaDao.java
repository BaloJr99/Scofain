package cl.model.dao;

import cl.model.db.Poliza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PolizaDao {
    Poliza poliza;
    
    public boolean insertarPoliza(Poliza poliza) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblPoliza(numPolizaGral, numPoliza, fecha, concepto) VALUES (?,?,?,?)");
            pe.setString(1, poliza.getNumPolizaGral());
            pe.setString(2, poliza.getNumPoliza());
            pe.setString(3, poliza.getFecha());
            pe.setString(4, poliza.getConcepto());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public ArrayList<Poliza> listaPolizas(String numPoliza) throws SQLException{
        
        ArrayList<Poliza> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblPoliza WHERE numPolizaGral = '" + numPoliza + "'");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            poliza = new Poliza(re.getString("fecha"), re.getString("concepto"));
        }
        
        lista.add(poliza);
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
}
