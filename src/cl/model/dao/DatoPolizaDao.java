package cl.model.dao;

import cl.model.db.DatoPoliza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatoPolizaDao {
    DatoPoliza dato;
    
    public boolean insertarDatoPoliza(DatoPoliza dato) throws SQLException{
        boolean flag = false;
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("INSERT scofain.tblDatoPoliza(idDatoPoliza, tblCatalogoCuentas_codigo, tblPoliza_numPolizaGral, debe, haber) VALUES (?,?,?,?,?)");
            pe.setString(1, dato.getIdDatoPoliza());
            pe.setString(2, dato.getTblCatalogoCuentas_codigo());
            pe.setString(3, dato.getTblPoliza_numPolizaGral());
            pe.setFloat(4, dato.getDebe());
            pe.setFloat(5, dato.getHaber());
            pe.executeUpdate();
            pe.close();
            con.close();    
            flag = true;
        return flag;
    }
    
    public ArrayList<DatoPoliza> buscarDatosPoliza(String idNumPoliza) throws SQLException{
        ArrayList<DatoPoliza> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT * FROM tblDatoPoliza WHERE tblPoliza_numPolizaGral = '" + idNumPoliza + "'");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            dato = new DatoPoliza(re.getString("idDatoPoliza"), re.getString("tblCatalogoCuentas_codigo"), re.getString("tblPoliza_numPolizaGral"), re.getFloat("debe"), re.getFloat("haber"));
            lista.add(dato);
        }
        
        re.close();
        pe.close();
        con.close();
        
        return lista;
    }
    
    public void reajuste(String idNumPoliza, ArrayList<String> lista) throws SQLException{
        Connection con = new Conexion().getCon();
        PreparedStatement pe = null;
        
        for(int i = 0; i < lista.size(); i++){
            pe = con.prepareStatement("UPDATE tbldatopoliza SET idDatoPoliza = '" + idNumPoliza + "." + i + "' WHERE idDatoPoliza = '" + lista.get(i) + "'");
            pe.executeUpdate();
        }
        
        pe.close();
        con.close();
    }
}
