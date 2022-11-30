package cl.model.db;

public class Prenomina {
    private String idDetalleP, tipo, tblCatalogoCuentas_codigo;
    private int tblEmpleado_idEmpleado;
    private float gravado, exento;

    public Prenomina(String idDetalleP, String tipo, String tblCatalogoCuentas_codigo, int tblEmpleado_idEmpleado, float gravado, float exento) {
        this.idDetalleP = idDetalleP;
        this.tipo = tipo;
        this.tblCatalogoCuentas_codigo = tblCatalogoCuentas_codigo;
        this.tblEmpleado_idEmpleado = tblEmpleado_idEmpleado;
        this.gravado = gravado;
        this.exento = exento;
    }

    public String getIdDetalleP() {
        return idDetalleP;
    }

    public void setIdDetalleP(String idDetalleP) {
        this.idDetalleP = idDetalleP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTblCatalogoCuentas_codigo() {
        return tblCatalogoCuentas_codigo;
    }

    public void setTblCatalogoCuentas_codigo(String tblCatalogoCuentas_codigo) {
        this.tblCatalogoCuentas_codigo = tblCatalogoCuentas_codigo;
    }

    public float getGravado() {
        return gravado;
    }

    public void setGravado(float gravado) {
        this.gravado = gravado;
    }

    public float getExento() {
        return exento;
    }

    public void setExento(float exento) {
        this.exento = exento;
    }    

    public int getTblEmpleado_idEmpleado() {
        return tblEmpleado_idEmpleado;
    }

    public void setTblEmpleado_idEmpleado(int tblEmpleado_idEmpleado) {
        this.tblEmpleado_idEmpleado = tblEmpleado_idEmpleado;
    }
}
