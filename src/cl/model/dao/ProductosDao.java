package cl.model.dao;

import cl.model.db.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductosDao {
    
    Productos producto;
    
    public void insertarProducto(Productos producto) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblProductos (claveProducto, descripcion,"
                + "cantidad, precio, tblCatalogoProductosServicios_codigo) VALUES (?,?,?,?,?)");
        pe.setString(1, producto.getClaveProducto());
        pe.setString(2, producto.getDescripcion());
        pe.setFloat(3, producto.getCantidad());
        pe.setFloat(4, producto.getPrecio());
        pe.setString(5, producto.getTblCatalogoProductosServicios_codigo());
        pe.executeUpdate();
        pe.close();
        con.close();
    }
    
    public ArrayList<Productos> listaProductos() throws SQLException{
        ArrayList<Productos> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblProductos");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            producto = new Productos(re.getString("claveProducto"), re.getString("descripcion"), re.getString("tblCatalogoProductosServicios_codigo"), re.getFloat("precio"), re.getFloat("cantidad"));
            lista.add(producto);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
}
