package cl.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private String  bd = "scofain";
    private String user = "root";
    private String password = "Pirata99*";
    private String url = "jdbc:mysql://localhost:3306/" + bd + "?serverTimezone=UTC";
    
    private Connection con = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.MysqlConnection");
            this.con = (Connection)DriverManager.getConnection(url, user, password);
            System.out.println("Conexion a la base de datos: " + url + " ...ok");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
    
    public void setCon(Connection con){
        this.con = con;
    }
}
