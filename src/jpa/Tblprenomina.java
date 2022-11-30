/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author baloc
 */
@Entity
@Table(name = "tblprenomina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblprenomina.findAll", query = "SELECT t FROM Tblprenomina t")
    , @NamedQuery(name = "Tblprenomina.findByIdDetalleP", query = "SELECT t FROM Tblprenomina t WHERE t.idDetalleP = :idDetalleP")
    , @NamedQuery(name = "Tblprenomina.findByTipo", query = "SELECT t FROM Tblprenomina t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "Tblprenomina.findByGravado", query = "SELECT t FROM Tblprenomina t WHERE t.gravado = :gravado")
    , @NamedQuery(name = "Tblprenomina.findByExento", query = "SELECT t FROM Tblprenomina t WHERE t.exento = :exento")})
public class Tblprenomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDetalleP")
    private String idDetalleP;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "gravado")
    private float gravado;
    @Basic(optional = false)
    @Column(name = "exento")
    private float exento;
    @JoinColumn(name = "tblCatalogoCuentas_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Tblcatalogocuentas tblCatalogoCuentascodigo;
    @JoinColumn(name = "tblEmpleado_idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne
    private Tblempleado tblEmpleadoidEmpleado;

    public Tblprenomina() {
    }

    public Tblprenomina(String idDetalleP) {
        this.idDetalleP = idDetalleP;
    }

    public Tblprenomina(String idDetalleP, String tipo, float gravado, float exento) {
        this.idDetalleP = idDetalleP;
        this.tipo = tipo;
        this.gravado = gravado;
        this.exento = exento;
    }

    public String getIdDetalleP() {
        return idDetalleP;
    }

    public void setIdDetalleP(String idDetalleP) {
        this.idDetalleP = idDetalleP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getGravado() {
        return gravado;
    }

    public void setGravado(float gravado) {
        this.gravado = gravado;
    }

    public float getExento() {
        return exento;
    }

    public void setExento(float exento) {
        this.exento = exento;
    }

    public Tblcatalogocuentas getTblCatalogoCuentascodigo() {
        return tblCatalogoCuentascodigo;
    }

    public void setTblCatalogoCuentascodigo(Tblcatalogocuentas tblCatalogoCuentascodigo) {
        this.tblCatalogoCuentascodigo = tblCatalogoCuentascodigo;
    }

    public Tblempleado getTblEmpleadoidEmpleado() {
        return tblEmpleadoidEmpleado;
    }

    public void setTblEmpleadoidEmpleado(Tblempleado tblEmpleadoidEmpleado) {
        this.tblEmpleadoidEmpleado = tblEmpleadoidEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleP != null ? idDetalleP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblprenomina)) {
            return false;
        }
        Tblprenomina other = (Tblprenomina) object;
        if ((this.idDetalleP == null && other.idDetalleP != null) || (this.idDetalleP != null && !this.idDetalleP.equals(other.idDetalleP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblprenomina[ idDetalleP=" + idDetalleP + " ]";
    }
    
}
