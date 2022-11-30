/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author baloc
 */
@Entity
@Table(name = "tblimpuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblimpuestos.findAll", query = "SELECT t FROM Tblimpuestos t")
    , @NamedQuery(name = "Tblimpuestos.findByIdImpuesto", query = "SELECT t FROM Tblimpuestos t WHERE t.idImpuesto = :idImpuesto")
    , @NamedQuery(name = "Tblimpuestos.findByExento", query = "SELECT t FROM Tblimpuestos t WHERE t.exento = :exento")})
public class Tblimpuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idImpuesto")
    private Integer idImpuesto;
    @Basic(optional = false)
    @Column(name = "exento")
    private boolean exento;
    @OneToMany(mappedBy = "tblImpuestosidImpuesto")
    private Collection<Tbldetallefactura> tbldetallefacturaCollection;
    @JoinColumn(name = "tblImpuestosRetenidos_idRetenidos", referencedColumnName = "idRetenidos")
    @ManyToOne
    private Tblimpuestosretenidos tblImpuestosRetenidosidRetenidos;
    @JoinColumn(name = "tblImpuestosTrasladados_idTrasladados", referencedColumnName = "idTrasladados")
    @ManyToOne
    private Tblimpuestostrasladados tblImpuestosTrasladadosidTrasladados;

    public Tblimpuestos() {
    }

    public Tblimpuestos(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public Tblimpuestos(Integer idImpuesto, boolean exento) {
        this.idImpuesto = idImpuesto;
        this.exento = exento;
    }

    public Integer getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public boolean getExento() {
        return exento;
    }

    public void setExento(boolean exento) {
        this.exento = exento;
    }

    @XmlTransient
    public Collection<Tbldetallefactura> getTbldetallefacturaCollection() {
        return tbldetallefacturaCollection;
    }

    public void setTbldetallefacturaCollection(Collection<Tbldetallefactura> tbldetallefacturaCollection) {
        this.tbldetallefacturaCollection = tbldetallefacturaCollection;
    }

    public Tblimpuestosretenidos getTblImpuestosRetenidosidRetenidos() {
        return tblImpuestosRetenidosidRetenidos;
    }

    public void setTblImpuestosRetenidosidRetenidos(Tblimpuestosretenidos tblImpuestosRetenidosidRetenidos) {
        this.tblImpuestosRetenidosidRetenidos = tblImpuestosRetenidosidRetenidos;
    }

    public Tblimpuestostrasladados getTblImpuestosTrasladadosidTrasladados() {
        return tblImpuestosTrasladadosidTrasladados;
    }

    public void setTblImpuestosTrasladadosidTrasladados(Tblimpuestostrasladados tblImpuestosTrasladadosidTrasladados) {
        this.tblImpuestosTrasladadosidTrasladados = tblImpuestosTrasladadosidTrasladados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImpuesto != null ? idImpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblimpuestos)) {
            return false;
        }
        Tblimpuestos other = (Tblimpuestos) object;
        if ((this.idImpuesto == null && other.idImpuesto != null) || (this.idImpuesto != null && !this.idImpuesto.equals(other.idImpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblimpuestos[ idImpuesto=" + idImpuesto + " ]";
    }
    
}
