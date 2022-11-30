package cl.model.dao;

import cl.model.db.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpleadoDao {
    public boolean insertarEmpleado(Empleado empleado) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblEmpleado(puesto, nombre, "
                    + "apellidoP, apellidoM, rfc, curp, tblEstado_idEstado, fechaAlta, fechaBaja, numSeguro) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pe.setString(1, empleado.getPuesto());
            pe.setString(2, empleado.getNombre());
            pe.setString(3, empleado.getApellidoP());
            pe.setString(4, empleado.getApellidoM());
            pe.setString(5, empleado.getRfc());
            pe.setString(6, empleado.getCurp());
            pe.setInt(7, empleado.getTblEstado_idEstado());
            pe.setDate(8, empleado.getFechaAlta());
            pe.setDate(9, empleado.getFechaBaja());
            pe.setString(10, empleado.getNumSeguro());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public ArrayList<Empleado> listaEmpleado() throws SQLException{
        
        ArrayList<Empleado> lista = new ArrayList<>();
        Empleado empleado = null;
        
        try {
            boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT * FROM tblEmpleado");
            ResultSet re = pe.executeQuery();
            
            while(re.next()){
                empleado = new Empleado(re.getInt(1), re.getString(3), re.getString(4), re.getString(5), re.getString(2));
                lista.add(empleado);
            }
            
            pe.close();
            con.close();    
            flag = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());            
        }
        return lista;
    }
}
