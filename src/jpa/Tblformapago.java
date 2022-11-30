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
@Table(name = "tblformapago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblformapago.findAll", query = "SELECT t FROM Tblformapago t")
    , @NamedQuery(name = "Tblformapago.findByIdFormaPago", query = "SELECT t FROM Tblformapago t WHERE t.idFormaPago = :idFormaPago")
    , @NamedQuery(name = "Tblformapago.findByTipoPago", query = "SELECT t FROM Tblformapago t WHERE t.tipoPago = :tipoPago")})
public class Tblformapago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFormaPago")
    private String idFormaPago;
    @Basic(optional = false)
    @Column(name = "tipoPago")
    private String tipoPago;
    @OneToMany(mappedBy = "tblFormaPagoidFormaPago")
    private Collection<Tblfactura> tblfacturaCollection;

    public Tblformapago() {
    }

    public Tblformapago(String idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public Tblformapago(String idFormaPago, String tipoPago) {
        this.idFormaPago = idFormaPago;
        this.tipoPago = tipoPago;
    }

    public String getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(String idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
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
        hash += (idFormaPago != null ? idFormaPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblformapago)) {
            return false;
        }
        Tblformapago other = (Tblformapago) object;
        if ((this.idFormaPago == null && other.idFormaPago != null) || (this.idFormaPago != null && !this.idFormaPago.equals(other.idFormaPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblformapago[ idFormaPago=" + idFormaPago + " ]";
    }
    
}
