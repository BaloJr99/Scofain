package cl.model.db;

public class FormaPago {
    private String idFormaPago;
    private String tipoPago;

    public FormaPago(String idFormaPago, String tipoPago) {
        this.idFormaPago = idFormaPago;
        this.tipoPago = tipoPago;
    }    

    public String getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(String idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
}

