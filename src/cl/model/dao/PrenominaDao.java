package cl.model.dao;

import cl.model.db.Empleado;
import cl.model.db.Prenomina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrenominaDao {
    Empleado empleado;
    Prenomina prenomina;
    
    public void insertarPrenomina(Prenomina prenomina) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblPrenomina (idDetalleP, tblEmpleado_idEmpleado, tipo, "
                + "tblCatalogoCuentas_codigo, gravado, exento) VALUES (?,?,?,?,?,?)");
        pe.setString(1, prenomina.getIdDetalleP());
        pe.setInt(2, prenomina.getTblEmpleado_idEmpleado());
        pe.setString(3, prenomina.getTipo());
        pe.setString(4, prenomina.getTblCatalogoCuentas_codigo());
        pe.setFloat(5, prenomina.getGravado());
        pe.setFloat(6, prenomina.getExento());
        
        pe.executeUpdate();
        pe.close();
        con.close();
    }
    
    public ArrayList<Prenomina> listaPrenomina(int idEmpleado) throws SQLException{
        ArrayList<Prenomina> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblPrenomina WHERE tblEmpleado_idEmpleado = " + idEmpleado + "");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            prenomina = new Prenomina(re.getString("idDetalleP"), re.getString("tipo"), re.getString("tblCatalogoCuentas_codigo"),
            re.getInt("tblEmpleado_idEmpleado"), re.getFloat("gravado"), re.getFloat("exento"));
            lista.add(prenomina);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
        
    }
    
    public void eliminar(String idDetalle) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("DELETE FROM tblPrenomina WHERE idDetalleP = '" + idDetalle + "'");
        pe.executeUpdate();
        
        pe.close();
        con.close();
    }
    
    public void reajustar(int idEmpleado, String tipo) throws SQLException{
        int cont = 0;
        String detalleN = "";
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblPrenomina WHERE tblEmpleado_idEmpleado = " + idEmpleado + " AND "
                + " tipo = '" + tipo + "'");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            cont++;
            detalleN = re.getString("idDetalleP");
            pe = con.prepareStatement("UPDATE tblPrenomina set idDetalleP = '" + 
                    detalleN.replace(detalleN.substring(String.valueOf(idEmpleado).length() + 2), "." + String.valueOf(cont)) + "'  WHERE idDetalleP = '" + re.getString("idDetalleP") + "'");
            pe.executeUpdate();
        }
        re.close();
        pe.close();
        con.close();
    }
    
    public ArrayList<Empleado> listaEmpleados() throws SQLException{
        ArrayList<Empleado> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT tblempleado.nombre, tblempleado.apellidoP, tblempleado.apellidoM, tblempleado.idEmpleado "
                + "FROM tblempleado INNER JOIN tblprenomina ON tblprenomina.tblEmpleado_idEmpleado = tblempleado.idEmpleado "
                + "GROUP BY idEmpleado");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            empleado = new Empleado(re.getInt("idEmpleado"), re.getString("nombre"), re.getString("apellidoP"), re.getString("apellidoM"));
            lista.add(empleado);
        }
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
    public Float percepciones(int id) throws SQLException{
        float percepcion = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT SUM(gravado) + SUM(exento) FROM tblprenomina  WHERE tipo = 'Percepcion' AND tblEmpleado_idEmpleado = " + id + " group by tipo;");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            percepcion = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return percepcion;
    }
    
    public Float deducciones(int id) throws SQLException{
        float percepcion = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT SUM(gravado) + SUM(exento) FROM tblprenomina  WHERE tipo = 'Deduccion' AND tblEmpleado_idEmpleado = " + id + " group by tipo;");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            percepcion = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return percepcion;
    }
    
    public Float otros(int id) throws SQLException{
        float percepcion = 0;
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT SUM(gravado) + SUM(exento) FROM tblprenomina  WHERE tipo = 'Otros' AND tblEmpleado_idEmpleado = " + id + " group by tipo;");
        ResultSet re = pe.executeQuery();
        
        if(re.next()){
            percepcion = re.getFloat(1);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return percepcion;
    }
}
