package cl.model.db;

import java.sql.Date;

public class Factura {
    private int folio;
    private Date fechaEmision;
    private String tblFormaPago_idFormaPago, tblMetodoPago_idMetodoPago, tblEmisor_rfcEmisor,
    tblReceptor_rfcReceptor, tblusoCFDI_clave, tbltipoComprobante_clave, estado;

    public Factura(int folio, Date fechaEmision, String tblFormaPago_idFormaPago, String tblMetodoPago_idMetodoPago, String tblEmisor_rfcEmisor, String tblReceptor_rfcReceptor, String tblusoCFDI_clave, String tbltipoComprobante_clave, String estado) {
        this.folio = folio;
        this.fechaEmision = fechaEmision;
        this.tblFormaPago_idFormaPago = tblFormaPago_idFormaPago;
        this.tblMetodoPago_idMetodoPago = tblMetodoPago_idMetodoPago;
        this.tblEmisor_rfcEmisor = tblEmisor_rfcEmisor;
        this.tblReceptor_rfcReceptor = tblReceptor_rfcReceptor;
        this.tblusoCFDI_clave = tblusoCFDI_clave;
        this.tbltipoComprobante_clave = tbltipoComprobante_clave;
        this.estado = estado;
    }
    
    public Factura(int folio, String tblReceptor_rfcReceptor, Date fechaEmision, String tbltipoComprobante_clave, String estado) {
        this.folio = folio;
        this.tblReceptor_rfcReceptor = tblReceptor_rfcReceptor;
        this.fechaEmision = fechaEmision;
        this.tbltipoComprobante_clave = tbltipoComprobante_clave;
        this.estado = estado;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTblFormaPago_idFormaPago() {
        return tblFormaPago_idFormaPago;
    }

    public void setTblFormaPago_idFormaPago(String tblFormaPago_idFormaPago) {
        this.tblFormaPago_idFormaPago = tblFormaPago_idFormaPago;
    }

    public String getTblMetodoPago_idMetodoPago() {
        return tblMetodoPago_idMetodoPago;
    }

    public void setTblMetodoPago_idMetodoPago(String tblMetodoPago_idMetodoPago) {
        this.tblMetodoPago_idMetodoPago = tblMetodoPago_idMetodoPago;
    }

    public String getTblEmisor_rfcEmisor() {
        return tblEmisor_rfcEmisor;
    }

    public void setTblEmisor_rfcEmisor(String tblEmisor_rfcEmisor) {
        this.tblEmisor_rfcEmisor = tblEmisor_rfcEmisor;
    }

    public String getTblReceptor_rfcReceptor() {
        return tblReceptor_rfcReceptor;
    }

    public void setTblReceptor_rfcReceptor(String tblReceptor_rfcReceptor) {
        this.tblReceptor_rfcReceptor = tblReceptor_rfcReceptor;
    }

    public String getTblusoCFDI_clave() {
        return tblusoCFDI_clave;
    }

    public void setTblusoCFDI_clave(String tblusoCFDI_clave) {
        this.tblusoCFDI_clave = tblusoCFDI_clave;
    }

    public String getTbltipoComprobante_clave() {
        return tbltipoComprobante_clave;
    }

    public void setTbltipoComprobante_clave(String tbltipoComprobante_clave) {
        this.tbltipoComprobante_clave = tbltipoComprobante_clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
