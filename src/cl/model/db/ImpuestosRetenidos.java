package cl.model.db;

public class ImpuestosRetenidos {
    private int idTrasladados;
    private String tipo;
    private float procentaje;

    public ImpuestosRetenidos(String tipo, float procentaje) {
        this.tipo = tipo;
        this.procentaje = procentaje;
    }

    public int getIdTrasladados() {
        return idTrasladados;
    }

    public void setIdTrasladados(int idTrasladados) {
        this.idTrasladados = idTrasladados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getProcentaje() {
        return procentaje;
    }

    public void setProcentaje(float procentaje) {
        this.procentaje = procentaje;
    }
    
    
}
