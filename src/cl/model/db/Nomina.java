package cl.model.db;

import java.sql.Date;

public class Nomina {
    private String idNomina, estado;
    private Date fechaPago, fechaInicial, fechaFinal;
    private int tblEmpleado_idEmpleado;
    private float percepciones, deducciones, otros;

    public Nomina(String idNomina, String estado, Date fechaPago, Date fechaInicial, Date fechaFinal, int tblEmpleado_idEmpleado, float percepciones, float deducciones, float otros) {
        this.idNomina = idNomina;
        this.estado = estado;
        this.fechaPago = fechaPago;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.tblEmpleado_idEmpleado = tblEmpleado_idEmpleado;
        this.percepciones = percepciones;
        this.deducciones = deducciones;
        this.otros = otros;
    }
    
    public String getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getTblEmpleado_idEmpleado() {
        return tblEmpleado_idEmpleado;
    }

    public void setTblEmpleado_idEmpleado(int tblEmpleado_idEmpleado) {
        this.tblEmpleado_idEmpleado = tblEmpleado_idEmpleado;
    }

    public float getPercepciones() {
        return percepciones;
    }

    public void setPercepciones(float percepciones) {
        this.percepciones = percepciones;
    }

    public float getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(float deducciones) {
        this.deducciones = deducciones;
    }

    public float getOtros() {
        return otros;
    }

    public void setOtros(float otros) {
        this.otros = otros;
    }
}
