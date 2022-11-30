package cl.model.dao;

import cl.model.db.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDao {
    Cliente cliente;
    
    public boolean insertarCliente(Cliente cliente) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblCliente(razonSocial, tblReceptor_rfcReceptor, tblDomicilio_idDomicilio, tblTelefono_idTelefono) VALUES (?,?,?,?)");
            pe.setString(1, cliente.getRazonSocial());
            pe.setString(2, cliente.getTblReceptor_rfcReceptor());
            pe.setInt(3, cliente.getTblDomicilio_idDomicilio());
            pe.setInt(4, cliente.getTblTelefono_idTelefono());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public ArrayList<Cliente> buscarClientes() throws SQLException{
        ArrayList <Cliente> listaCliente = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblCliente");
        
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
           cliente = new Cliente(re.getString("razonSocial"), re.getString("tblReceptor_rfcReceptor"));
           listaCliente.add(cliente);
        }
        re.close();
        pe.close();
        con.close();
        
        return listaCliente;
    }
}
