package cl.model.db;

public class Colonia {
    private String codigoPostal, colonia;
    private int tblCiudad_idCiudad;

    public Colonia(String codigoPostal, String colonia, int tblCiudad_idCiudad) {
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
        this.tblCiudad_idCiudad = tblCiudad_idCiudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getTblCiudad_idCiudad() {
        return tblCiudad_idCiudad;
    }

    public void setTblCiudad_idCiudad(int tblCiudad_idCiudad) {
        this.tblCiudad_idCiudad = tblCiudad_idCiudad;
    }
}
