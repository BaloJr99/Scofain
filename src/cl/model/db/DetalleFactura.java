package cl.model.db;

public class DetalleFactura {
    private int tblImpuestos_idImpuesto, tblFactura_folio;
    private float importe, cantidad;
    private String idDetalle, tblproductos_claveProducto, tblclaveUnidad_clave;

    public DetalleFactura(int tblImpuestos_idImpuesto, int tblFactura_folio, float importe, float cantidad, String idDetalle, String tblproductos_claveProducto, String tblclaveUnidad_clave) {
        this.tblImpuestos_idImpuesto = tblImpuestos_idImpuesto;
        this.tblFactura_folio = tblFactura_folio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.idDetalle = idDetalle;
        this.tblproductos_claveProducto = tblproductos_claveProducto;
        this.tblclaveUnidad_clave = tblclaveUnidad_clave;
    }

    public DetalleFactura(int tblImpuestos_idImpuesto, int tblFactura_folio, float importe, float cantidad, String tblproductos_claveProducto, String tblclaveUnidad_clave) {
        this.tblImpuestos_idImpuesto = tblImpuestos_idImpuesto;
        this.tblFactura_folio = tblFactura_folio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.tblproductos_claveProducto = tblproductos_claveProducto;
        this.tblclaveUnidad_clave = tblclaveUnidad_clave;
    }
    
    

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getTblImpuestos_idImpuesto() {
        return tblImpuestos_idImpuesto;
    }

    public void setTblImpuestos_idImpuesto(int tblImpuestos_idImpuesto) {
        this.tblImpuestos_idImpuesto = tblImpuestos_idImpuesto;
    }

    public int getTblFactura_folio() {
        return tblFactura_folio;
    }

    public void setTblFactura_folio(int tblFactura_folio) {
        this.tblFactura_folio = tblFactura_folio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTblproductos_claveProducto() {
        return tblproductos_claveProducto;
    }

    public void setTblproductos_claveProducto(String tblproductos_claveProducto) {
        this.tblproductos_claveProducto = tblproductos_claveProducto;
    }

    public String getTblclaveUnidad_clave() {
        return tblclaveUnidad_clave;
    }

    public void setTblclaveUnidad_clave(String tblclaveUnidad_clave) {
        this.tblclaveUnidad_clave = tblclaveUnidad_clave;
    }

}
