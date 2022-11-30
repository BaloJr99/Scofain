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
@Table(name = "tbltipocomprobante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbltipocomprobante.findAll", query = "SELECT t FROM Tbltipocomprobante t")
    , @NamedQuery(name = "Tbltipocomprobante.findByClave", query = "SELECT t FROM Tbltipocomprobante t WHERE t.clave = :clave")
    , @NamedQuery(name = "Tbltipocomprobante.findByDescripcion", query = "SELECT t FROM Tbltipocomprobante t WHERE t.descripcion = :descripcion")})
public class Tbltipocomprobante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "tbltipoComprobanteclave")
    private Collection<Tblfactura> tblfacturaCollection;

    public Tbltipocomprobante() {
    }

    public Tbltipocomprobante(String clave) {
        this.clave = clave;
    }

    public Tbltipocomprobante(String clave, String descripcion) {
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
    public Collection<Tblfactura> getTblfacturaCollection() {
        return tblfacturaCollection;
    }

    public void setTblfacturaCollection(Collection<Tblfactura> tblfacturaCollection) {
        this.tblfacturaCollection = tblfacturaCollection;
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
        if (!(object instanceof Tbltipocomprobante)) {
            return false;
        }
        Tbltipocomprobante other = (Tbltipocomprobante) object;
        if ((this.clave == null && other.clave != null) || (this.clave != null && !this.clave.equals(other.clave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tbltipocomprobante[ clave=" + clave + " ]";
    }
    
}
