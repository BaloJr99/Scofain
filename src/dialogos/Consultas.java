package dialogos;

public class Consultas {
    private String poliza, descripcion, cuenta;
    private Float debe, haber;

    public Consultas(Float debe, Float haber, String descripcion, String cuenta) {
        this.descripcion = descripcion;
        this.cuenta = cuenta;
        this.debe = debe;
        this.haber = haber;
    }
    
    public Consultas(String poliza, String descripcion, Float debe, Float haber) {
        this.poliza = poliza;
        this.descripcion = descripcion;
        this.debe = debe;
        this.haber = haber;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getDebe() {
        return debe;
    }

    public void setDebe(Float debe) {
        this.debe = debe;
    }

    public Float getHaber() {
        return haber;
    }

    public void setHaber(Float haber) {
        this.haber = haber;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
}
