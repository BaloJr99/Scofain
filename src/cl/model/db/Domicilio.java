package cl.model.db;

public class Domicilio {
    private String calle;
    private String numeroInterior;
    private String numeroExterior;
    private String tblColonia_codigoPostal;

    public Domicilio(String calle, String numeroInterior, String numeroExterior, String tblColonia_codigoPostal) {
        this.calle = calle;
        this.numeroInterior = numeroInterior;
        this.numeroExterior = numeroExterior;
        this.tblColonia_codigoPostal = tblColonia_codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getTblColonia_codigoPostal() {
        return tblColonia_codigoPostal;
    }

    public void setTblColonia_codigoPostal(String tblColonia_codigoPostal) {
        this.tblColonia_codigoPostal = tblColonia_codigoPostal;
    }
    
}
