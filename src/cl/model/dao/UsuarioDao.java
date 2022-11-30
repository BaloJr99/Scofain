package cl.model.dao;

import cl.model.db.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {
    public boolean insertarUsuario(Usuario user) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblUsuarios(usuario, tblEmpleado_idEmpleado, contrasena, genero, fechaNacimiento) VALUES (?,?,?,?,?)");
            pe.setString(1, user.getUsuario());
            pe.setInt(2, user.getTblEmpleado_idEmpleado());
            pe.setString(3, user.getContrasena());
            pe.setString(4, user.getGenero());
            pe.setDate(5, user.getFechaNacimiento());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
}