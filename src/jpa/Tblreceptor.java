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
@Table(name = "tblreceptor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblreceptor.findAll", query = "SELECT t FROM Tblreceptor t")
    , @NamedQuery(name = "Tblreceptor.findByRfcReceptor", query = "SELECT t FROM Tblreceptor t WHERE t.rfcReceptor = :rfcReceptor")})
public class Tblreceptor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rfcReceptor")
    private String rfcReceptor;
    @OneToMany(mappedBy = "tblReceptorrfcReceptor")
    private Collection<Tblfactura> tblfacturaCollection;
    @OneToMany(mappedBy = "tblReceptorrfcReceptor")
    private Collection<Tblcliente> tblclienteCollection;

    public Tblreceptor() {
    }

    public Tblreceptor(String rfcReceptor) {
        this.rfcReceptor = rfcReceptor;
    }

    public String getRfcReceptor() {
        return rfcReceptor;
    }

    public void setRfcReceptor(String rfcReceptor) {
        this.rfcReceptor = rfcReceptor;
    }

    @XmlTransient
    public Collection<Tblfactura> getTblfacturaCollection() {
        return tblfacturaCollection;
    }

    public void setTblfacturaCollection(Collection<Tblfactura> tblfacturaCollection) {
        this.tblfacturaCollection = tblfacturaCollection;
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
        hash += (rfcReceptor != null ? rfcReceptor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblreceptor)) {
            return false;
        }
        Tblreceptor other = (Tblreceptor) object;
        if ((this.rfcReceptor == null && other.rfcReceptor != null) || (this.rfcReceptor != null && !this.rfcReceptor.equals(other.rfcReceptor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblreceptor[ rfcReceptor=" + rfcReceptor + " ]";
    }
    
}
