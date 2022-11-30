package cl.model.db;

public class Cliente {
    private String razonSocial;
    private String tblReceptor_rfcReceptor;
    private int tblDomicilio_idDomicilio;
    private int tblTelefono_idTelefono;

    public Cliente(String razonSocial, String tblReceptor_rfcReceptor, int tblDomicilio_idDomicilio, int tblTelefono_idTelefono) {
        this.razonSocial = razonSocial;
        this.tblReceptor_rfcReceptor = tblReceptor_rfcReceptor;
        this.tblDomicilio_idDomicilio = tblDomicilio_idDomicilio;
        this.tblTelefono_idTelefono = tblTelefono_idTelefono;
    }

    public Cliente(String razonSocial, String tblReceptor_rfcReceptor) {
        this.razonSocial = razonSocial;
        this.tblReceptor_rfcReceptor = tblReceptor_rfcReceptor;
    }
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTblReceptor_rfcReceptor() {
        return tblReceptor_rfcReceptor;
    }

    public void setTblReceptor_rfcReceptor(String tblReceptor_rfcReceptor) {
        this.tblReceptor_rfcReceptor = tblReceptor_rfcReceptor;
    }

    public int getTblDomicilio_idDomicilio() {
        return tblDomicilio_idDomicilio;
    }

    public void setTblDomicilio_idDomicilio(int tblDomicilio_idDomicilio) {
        this.tblDomicilio_idDomicilio = tblDomicilio_idDomicilio;
    }

    public int getTblTelefono_idTelefono() {
        return tblTelefono_idTelefono;
    }

    public void setTblTelefono_idTelefono(int tblTelefono_idTelefono) {
        this.tblTelefono_idTelefono = tblTelefono_idTelefono;
    }
}
