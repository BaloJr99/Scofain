package cl.model.db;

public class RegimenFiscal {
    private String idRegimen, tipo;

    public RegimenFiscal(String idRegimen, String tipo) {
        this.idRegimen = idRegimen;
        this.tipo = tipo;
    }

    public String getIdRegimen() {
        return idRegimen;
    }

    public void setIdRegimen(String idRegimen) {
        this.idRegimen = idRegimen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
