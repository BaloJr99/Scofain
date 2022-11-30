package cl.model.db;

import java.sql.Date;

public class Usuario {
    private String usuario, contrasena, genero;
    private int tblEmpleado_idEmpleado;
    private Date fechaNacimiento;

    public Usuario(String usuario, String contrasena, String genero, int tblEmpleado_idEmpleado, Date fechaNacimiento) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.genero = genero;
        this.tblEmpleado_idEmpleado = tblEmpleado_idEmpleado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTblEmpleado_idEmpleado() {
        return tblEmpleado_idEmpleado;
    }

    public void setTblEmpleado_idEmpleado(int tblEmpleado_idEmpleado) {
        this.tblEmpleado_idEmpleado = tblEmpleado_idEmpleado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

}
