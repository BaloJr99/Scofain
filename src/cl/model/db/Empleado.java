package cl.model.db;

import java.sql.Date;

public class Empleado {
    private int idEmpleado;
    private String puesto;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String rfc;
    private String curp;
    private int tblEstado_idEstado;
    private Date fechaAlta;
    private Date fechaBaja;
    private String numSeguro;

    public Empleado(String puesto, String nombre, String apellidoP, String apellidoM, String rfc, String curp, int tblEstado_idEstado, Date fechaAlta, Date fechaBaja, String numSeguro) {
        this.puesto = puesto;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.rfc = rfc;
        this.curp = curp;
        this.tblEstado_idEstado = tblEstado_idEstado;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.numSeguro = numSeguro;
    }

    public Empleado(int idEmpleado, String nombre, String apellidoP, String apellidoM) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    public Empleado(int idEmpleado, String nombre, String apellidoP, String apellidoM, String puesto) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.puesto = puesto;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getTblEstado_idEstado() {
        return tblEstado_idEstado;
    }

    public void setTblEstado_idEstado(int tblEstado_idEstado) {
        this.tblEstado_idEstado = tblEstado_idEstado;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getNumSeguro() {
        return numSeguro;
    }

    public void setNumSeguro(String numSeguro) {
        this.numSeguro = numSeguro;
    }

    
}
