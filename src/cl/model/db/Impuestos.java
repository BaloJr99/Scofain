package cl.model.db;

public class Impuestos {
    private int idImpuesto, tblImpuestosTrasladados_idTrasladados, tblImpuestosRetenidos_idRetenidos;
    private boolean exento;

    public Impuestos(int tblImpuestosTrasladados_idTrasladados, int tblImpuestosRetenidos_idRetenidos, boolean exento) {
        this.tblImpuestosTrasladados_idTrasladados = tblImpuestosTrasladados_idTrasladados;
        this.tblImpuestosRetenidos_idRetenidos = tblImpuestosRetenidos_idRetenidos;
        this.exento = exento;
    }

    public int getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(int idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public int getTblImpuestosTrasladados_idTrasladados() {
        return tblImpuestosTrasladados_idTrasladados;
    }

    public void setTblImpuestosTrasladados_idTrasladados(int tblImpuestosTrasladados_idTrasladados) {
        this.tblImpuestosTrasladados_idTrasladados = tblImpuestosTrasladados_idTrasladados;
    }

    public int getTblImpuestosRetenidos_idRetenidos() {
        return tblImpuestosRetenidos_idRetenidos;
    }

    public void setTblImpuestosRetenidos_idRetenidos(int tblImpuestosRetenidos_idRetenidos) {
        this.tblImpuestosRetenidos_idRetenidos = tblImpuestosRetenidos_idRetenidos;
    }

    public boolean isExento() {
        return exento;
    }

    public void setExento(boolean exento) {
        this.exento = exento;
    }
    
    
}
