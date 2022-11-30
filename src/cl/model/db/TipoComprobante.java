package cl.model.db;

public class TipoComprobante {
    private char clave;
    private String descripcion;

    public TipoComprobante(char clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public char getClave() {
        return clave;
    }

    public void setClave(char clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
