package cl.model.db;

public class DatoPoliza {
    private String idDatoPoliza;
    private String tblCatalogoCuentas_codigo;
    private String tblPoliza_numPolizaGral;
    private float debe;
    private float haber;

    public DatoPoliza(String idDatoPoliza, String tblCatalogoCuentas_codigo, String tblPoliza_numPolizaGral, float debe, float haber) {
        this.idDatoPoliza = idDatoPoliza;
        this.tblCatalogoCuentas_codigo = tblCatalogoCuentas_codigo;
        this.tblPoliza_numPolizaGral = tblPoliza_numPolizaGral;
        this.debe = debe;
        this.haber = haber;
    }

    public String getIdDatoPoliza() {
        return idDatoPoliza;
    }

    public void setIdDatoPoliza(String idDatoPoliza) {
        this.idDatoPoliza = idDatoPoliza;
    }

    public String getTblCatalogoCuentas_codigo() {
        return tblCatalogoCuentas_codigo;
    }

    public void setTblCatalogoCuentas_codigo(String tblCatalogoCuentas_codigo) {
        this.tblCatalogoCuentas_codigo = tblCatalogoCuentas_codigo;
    }

    public String getTblPoliza_numPolizaGral() {
        return tblPoliza_numPolizaGral;
    }

    public void setTblPoliza_numPolizaGral(String tblPoliza_numPolizaGral) {
        this.tblPoliza_numPolizaGral = tblPoliza_numPolizaGral;
    }

    public float getDebe() {
        return debe;
    }

    public void setDebe(float debe) {
        this.debe = debe;
    }

    public float getHaber() {
        return haber;
    }

    public void setHaber(float haber) {
        this.haber = haber;
    }
}
