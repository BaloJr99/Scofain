package cl.model.db;

public class MetodoPago {
    private String idMetodoPago;
    private String tipoMetodo;

    public MetodoPago(String idMetodoPago, String tipoMetodo) {
        this.idMetodoPago = idMetodoPago;
        this.tipoMetodo = tipoMetodo;
    }
    
    public String getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(String idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

}
