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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tblcliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcliente.findAll", query = "SELECT t FROM Tblcliente t")
    , @NamedQuery(name = "Tblcliente.findByIdCliente", query = "SELECT t FROM Tblcliente t WHERE t.idCliente = :idCliente")
    , @NamedQuery(name = "Tblcliente.findByRazonSocial", query = "SELECT t FROM Tblcliente t WHERE t.razonSocial = :razonSocial")})
public class Tblcliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "razonSocial")
    private String razonSocial;
    @JoinColumn(name = "tblDomicilio_idDomicilio", referencedColumnName = "idDomicilio")
    @ManyToOne
    private Tbldomicilio tblDomicilioidDomicilio;
    @JoinColumn(name = "tblReceptor_rfcReceptor", referencedColumnName = "rfcReceptor")
    @ManyToOne
    private Tblreceptor tblReceptorrfcReceptor;
    @JoinColumn(name = "tblTelefono_idTelefono", referencedColumnName = "idTelefono")
    @ManyToOne
    private Tbltelefono tblTelefonoidTelefono;

    public Tblcliente() {
    }

    public Tblcliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Tblcliente(Integer idCliente, String razonSocial) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Tbldomicilio getTblDomicilioidDomicilio() {
        return tblDomicilioidDomicilio;
    }

    public void setTblDomicilioidDomicilio(Tbldomicilio tblDomicilioidDomicilio) {
        this.tblDomicilioidDomicilio = tblDomicilioidDomicilio;
    }

    public Tblreceptor getTblReceptorrfcReceptor() {
        return tblReceptorrfcReceptor;
    }

    public void setTblReceptorrfcReceptor(Tblreceptor tblReceptorrfcReceptor) {
        this.tblReceptorrfcReceptor = tblReceptorrfcReceptor;
    }

    public Tbltelefono getTblTelefonoidTelefono() {
        return tblTelefonoidTelefono;
    }

    public void setTblTelefonoidTelefono(Tbltelefono tblTelefonoidTelefono) {
        this.tblTelefonoidTelefono = tblTelefonoidTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcliente)) {
            return false;
        }
        Tblcliente other = (Tblcliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblcliente[ idCliente=" + idCliente + " ]";
    }
    
}
