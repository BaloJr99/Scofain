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
@Table(name = "tbltelefono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbltelefono.findAll", query = "SELECT t FROM Tbltelefono t")
    , @NamedQuery(name = "Tbltelefono.findByIdTelefono", query = "SELECT t FROM Tbltelefono t WHERE t.idTelefono = :idTelefono")
    , @NamedQuery(name = "Tbltelefono.findByTelefono", query = "SELECT t FROM Tbltelefono t WHERE t.telefono = :telefono")})
public class Tbltelefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTelefono")
    private Integer idTelefono;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(mappedBy = "tblTelefonoidTelefono")
    private Collection<Tblcliente> tblclienteCollection;

    public Tbltelefono() {
    }

    public Tbltelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public Tbltelefono(Integer idTelefono, String telefono) {
        this.idTelefono = idTelefono;
        this.telefono = telefono;
    }

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<Tblcliente> getTblclienteCollection() {
        return tblclienteCollection;
    }

    public void setTblclienteCollection(Collection<Tblcliente> tblclienteCollection) {
        this.tblclienteCollection = tblclienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTelefono != null ? idTelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbltelefono)) {
            return false;
        }
        Tbltelefono other = (Tbltelefono) object;
        if ((this.idTelefono == null && other.idTelefono != null) || (this.idTelefono != null && !this.idTelefono.equals(other.idTelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tbltelefono[ idTelefono=" + idTelefono + " ]";
    }
    
}
