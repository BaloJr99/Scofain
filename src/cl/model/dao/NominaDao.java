package cl.model.dao;

import cl.model.db.Nomina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NominaDao {
    Nomina nomina;
    
    public void insertarNomina(Nomina nomina) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("INSERT scofain.tblNomina (idNomina, fechaPago, fechaInicial, fechaFinal,"
                + "tblEmpleado_idEmpleado, estado, percepciones, deducciones, otros) VALUES (?,?,?,?,?,?,?,?,?)");
        pe.setString(1, nomina.getIdNomina());
        pe.setDate(2, nomina.getFechaPago());
        pe.setDate(3, nomina.getFechaInicial());
        pe.setDate(4, nomina.getFechaFinal());
        pe.setInt(5, nomina.getTblEmpleado_idEmpleado());
        pe.setString(6, nomina.getEstado());
        pe.setFloat(7, nomina.getPercepciones());
        pe.setFloat(8, nomina.getDeducciones());
        pe.setFloat(9, nomina.getOtros());
        
        pe.executeUpdate();
        
        pe.close();
        con.close();
    }
    
    public ArrayList<Nomina> listaNomina(int numNomina) throws SQLException{
        ArrayList<Nomina> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblNomina WHERE idNomina LIKE '" + numNomina + ".%'");
        
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            nomina = new Nomina(re.getString("idNomina"), re.getString("estado"), re.getDate("fechaPago"), 
            re.getDate("fechaInicial"), re.getDate("fechaFinal"), re.getInt("tblEmpleado_idEmpleado"), 
            re.getFloat("percepciones"), re.getFloat("deducciones"), re.getFloat("otros"));
            lista.add(nomina);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
    public void cancelarNomina(int numNomina) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblNomina WHERE idNomina LIKE '" + numNomina + ".%'");
        
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            pe = con.prepareStatement("UPDATE tblNomina set estado = 'Cancelado' WHERE idNomina = '" + re.getString("idNomina") + "'");
            pe.executeUpdate();
        }
        
        pe.close();
        con.close();
    }
    
    public void generarNomina(int numNomina) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblNomina WHERE idNomina LIKE '" + numNomina + ".%'");
        
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            pe = con.prepareStatement("UPDATE tblNomina set estado = 'Vigente' WHERE idNomina = '" + re.getString("idNomina") + "'");
            pe.executeUpdate();
        }
        
        pe.close();
        con.close();
    }
    
    public void eliminarNomina(int numNomina, int idEmpleado) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("DELETE FROM tblNomina WHERE idNomina LIKE '" + numNomina + "." + idEmpleado + "'");
        
        pe.executeUpdate();
        pe.close();
        con.close();
    }
    
}
