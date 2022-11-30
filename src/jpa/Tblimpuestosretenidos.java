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
@Table(name = "tblimpuestosretenidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblimpuestosretenidos.findAll", query = "SELECT t FROM Tblimpuestosretenidos t")
    , @NamedQuery(name = "Tblimpuestosretenidos.findByIdRetenidos", query = "SELECT t FROM Tblimpuestosretenidos t WHERE t.idRetenidos = :idRetenidos")
    , @NamedQuery(name = "Tblimpuestosretenidos.findByTipo", query = "SELECT t FROM Tblimpuestosretenidos t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "Tblimpuestosretenidos.findByPorcentaje", query = "SELECT t FROM Tblimpuestosretenidos t WHERE t.porcentaje = :porcentaje")})
public class Tblimpuestosretenidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRetenidos")
    private Integer idRetenidos;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "porcentaje")
    private float porcentaje;
    @OneToMany(mappedBy = "tblImpuestosRetenidosidRetenidos")
    private Collection<Tblimpuestos> tblimpuestosCollection;

    public Tblimpuestosretenidos() {
    }

    public Tblimpuestosretenidos(Integer idRetenidos) {
        this.idRetenidos = idRetenidos;
    }

    public Tblimpuestosretenidos(Integer idRetenidos, String tipo, float porcentaje) {
        this.idRetenidos = idRetenidos;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
    }

    public Integer getIdRetenidos() {
        return idRetenidos;
    }

    public void setIdRetenidos(Integer idRetenidos) {
        this.idRetenidos = idRetenidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @XmlTransient
    public Collection<Tblimpuestos> getTblimpuestosCollection() {
        return tblimpuestosCollection;
    }

    public void setTblimpuestosCollection(Collection<Tblimpuestos> tblimpuestosCollection) {
        this.tblimpuestosCollection = tblimpuestosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetenidos != null ? idRetenidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblimpuestosretenidos)) {
            return false;
        }
        Tblimpuestosretenidos other = (Tblimpuestosretenidos) object;
        if ((this.idRetenidos == null && other.idRetenidos != null) || (this.idRetenidos != null && !this.idRetenidos.equals(other.idRetenidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblimpuestosretenidos[ idRetenidos=" + idRetenidos + " ]";
    }
    
}
