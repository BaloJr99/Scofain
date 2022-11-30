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
@Table(name = "tblmetodopago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblmetodopago.findAll", query = "SELECT t FROM Tblmetodopago t")
    , @NamedQuery(name = "Tblmetodopago.findByIdMetodoPago", query = "SELECT t FROM Tblmetodopago t WHERE t.idMetodoPago = :idMetodoPago")
    , @NamedQuery(name = "Tblmetodopago.findByTipoMetodo", query = "SELECT t FROM Tblmetodopago t WHERE t.tipoMetodo = :tipoMetodo")})
public class Tblmetodopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idMetodoPago")
    private String idMetodoPago;
    @Basic(optional = false)
    @Column(name = "tipoMetodo")
    private String tipoMetodo;
    @OneToMany(mappedBy = "tblMetodoPagoidMetodoPago")
    private Collection<Tblfactura> tblfacturaCollection;

    public Tblmetodopago() {
    }

    public Tblmetodopago(String idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public Tblmetodopago(String idMetodoPago, String tipoMetodo) {
        this.idMetodoPago = idMetodoPago;
        this.tipoMetodo = tipoMetodo;
    }

    public String getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(String idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
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
        hash += (idMetodoPago != null ? idMetodoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblmetodopago)) {
            return false;
        }
        Tblmetodopago other = (Tblmetodopago) object;
        if ((this.idMetodoPago == null && other.idMetodoPago != null) || (this.idMetodoPago != null && !this.idMetodoPago.equals(other.idMetodoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblmetodopago[ idMetodoPago=" + idMetodoPago + " ]";
    }
    
}
