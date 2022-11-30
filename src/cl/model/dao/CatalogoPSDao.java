package cl.model.dao;

import cl.model.db.CatalogoPS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CatalogoPSDao {
    CatalogoPS catalogo;
    
    public ArrayList<CatalogoPS> obtenerCuentas() throws SQLException{
        ArrayList<CatalogoPS> listaCatalogo = new ArrayList<>();
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * from tblCatalogoProductosServicios");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            catalogo = new CatalogoPS(re.getString("codigo"), re.getString("descripcion"));
            listaCatalogo.add(catalogo);
        }
        re.close();
        pe.close();
        con.close();    
        return listaCatalogo;
    }
}
