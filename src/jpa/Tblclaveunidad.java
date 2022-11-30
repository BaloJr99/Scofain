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
@Table(name = "tblclaveunidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblclaveunidad.findAll", query = "SELECT t FROM Tblclaveunidad t")
    , @NamedQuery(name = "Tblclaveunidad.findByClave", query = "SELECT t FROM Tblclaveunidad t WHERE t.clave = :clave")
    , @NamedQuery(name = "Tblclaveunidad.findByDescripcion", query = "SELECT t FROM Tblclaveunidad t WHERE t.descripcion = :descripcion")})
public class Tblclaveunidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "tblclaveUnidadclave")
    private Collection<Tbldetallefactura> tbldetallefacturaCollection;

    public Tblclaveunidad() {
    }

    public Tblclaveunidad(String clave) {
        this.clave = clave;
    }

    public Tblclaveunidad(String clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Tbldetallefactura> getTbldetallefacturaCollection() {
        return tbldetallefacturaCollection;
    }

    public void setTbldetallefacturaCollection(Collection<Tbldetallefactura> tbldetallefacturaCollection) {
        this.tbldetallefacturaCollection = tbldetallefacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clave != null ? clave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblclaveunidad)) {
            return false;
        }
        Tblclaveunidad other = (Tblclaveunidad) object;
        if ((this.clave == null && other.clave != null) || (this.clave != null && !this.clave.equals(other.clave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblclaveunidad[ clave=" + clave + " ]";
    }
    
}
