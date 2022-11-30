package cl.model.db;

public class Productos {
    private String claveProducto, descripcion, tblCatalogoProductosServicios_codigo;
    private float precio, cantidad;

    public Productos(String claveProducto, String descripcion, String tblCatalogoProductosServicios_codigo, float precio, float cantidad) {
        this.claveProducto = claveProducto;
        this.descripcion = descripcion;
        this.tblCatalogoProductosServicios_codigo = tblCatalogoProductosServicios_codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTblCatalogoProductosServicios_codigo() {
        return tblCatalogoProductosServicios_codigo;
    }

    public void setTblCatalogoProductosServicios_codigo(String tblCatalogoProductosServicios_codigo) {
        this.tblCatalogoProductosServicios_codigo = tblCatalogoProductosServicios_codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    
}
