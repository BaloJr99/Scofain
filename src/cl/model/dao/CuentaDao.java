package cl.model.dao;

import cl.model.db.Cuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CuentaDao {
    Cuenta cuenta;
    
    public boolean insertarCuenta(Cuenta cuenta) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblCatalogoCuentas(codigo, descripcion) VALUES (?,?)");
            pe.setString(1, cuenta.getCodigo());
            pe.setString(2, cuenta.getDescripcion());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public ArrayList<Cuenta> obtenerCuentas() throws SQLException{
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * from tblCatalogoCuentas");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            cuenta = new Cuenta(re.getString("codigo"), re.getString("descripcion"));
            listaCuentas.add(cuenta);
        }
        
        re.close();
        pe.close();
        con.close();    
        return listaCuentas;
    }
}
