package cl.model.db;

public class Ciudad {
    private int tblEstado_idEstado;
    private String ciudad;

    public Ciudad(int tblEstado_idEstado, String ciudad) {
        this.tblEstado_idEstado = tblEstado_idEstado;
        this.ciudad = ciudad;
    }
    
    public int getTblEstado_idEstado() {
        return tblEstado_idEstado;
    }

    public void setTblEstado_idEstado(int tblEstado_idEstado) {
        this.tblEstado_idEstado = tblEstado_idEstado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
