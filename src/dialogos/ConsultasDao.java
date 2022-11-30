package dialogos;

import cl.model.dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasDao {
    
    Consultas consulta;
    
    public ArrayList<Consultas> consulta1(Date fechaInicial, Date fechaFinal, String codigo) throws SQLException{
        ArrayList<Consultas> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT tblpoliza.numPoliza, "
                + "tblpoliza.concepto, tbldatopoliza.debe, tbldatopoliza.haber FROM tblpoliza "
                + "INNER JOIN tbldatopoliza ON tbldatopoliza.tblPoliza_numPolizaGral = tblpoliza.numPolizaGral "
                + "WHERE tbldatopoliza.tblCatalogoCuentas_codigo = '" + codigo + "' AND tblpoliza.fecha BETWEEN '" + fechaInicial + "' "
                + "AND '" + fechaFinal + "'");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            consulta = new Consultas(re.getString("numPoliza"), 
                    re.getString("concepto"), re.getFloat("debe"), re.getFloat("haber"));
            lista.add(consulta);
        }
        
        return lista;
    }
    
    public ArrayList<Consultas> consulta2(int mes, int año) throws SQLException{
        ArrayList<Consultas> lista = new ArrayList<>();
        
        Connection con = new Conexion().getCon();
        PreparedStatement pe = con.prepareStatement("SELECT tblcatalogocuentas.codigo, tblcatalogocuentas.descripcion, "
                + "SUM(tbldatopoliza.debe), SUM(tbldatopoliza.haber) FROM tblcatalogocuentas "
                + "INNER JOIN tbldatopoliza ON tbldatopoliza.tblCatalogoCuentas_codigo = tblcatalogocuentas.codigo "
                + "INNER JOIN tblpoliza ON tblpoliza.numPolizaGral = tbldatopoliza.tblPoliza_numPolizaGral "
                + "WHERE YEAR(tblpoliza.fecha) = '" + año + "' AND MONTH(tblpoliza.fecha) = '" + mes + "' GROUP BY tblcatalogocuentas.codigo");
        ResultSet re = pe.executeQuery();
        
        while(re.next()){
            consulta = new Consultas(re.getFloat("SUM(tbldatopoliza.debe)"), re.getFloat("SUM(tbldatopoliza.haber)"), re.getString("descripcion"), 
                    re.getString("codigo"));
            lista.add(consulta);
        }
        
        return lista;
    }
}
