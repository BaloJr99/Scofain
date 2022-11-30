package cl.model.db;


public class Poliza {
    private String numPolizaGral, numPoliza, fecha;
    private String concepto;

    public Poliza(String numPolizaGral, String numPoliza, String fecha, String concepto) {
        this.numPolizaGral = numPolizaGral;
        this.numPoliza = numPoliza;
        this.fecha = fecha;
        this.concepto = concepto;
    }

    public Poliza(String fecha, String concepto) {
        this.fecha = fecha;
        this.concepto = concepto;
    }

    public String getNumPolizaGral() {
        return numPolizaGral;
    }

    public void setNumPolizaGral(String numPolizaGral) {
        this.numPolizaGral = numPolizaGral;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
