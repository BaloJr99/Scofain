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
@Table(name = "tbldomicilio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldomicilio.findAll", query = "SELECT t FROM Tbldomicilio t")
    , @NamedQuery(name = "Tbldomicilio.findByIdDomicilio", query = "SELECT t FROM Tbldomicilio t WHERE t.idDomicilio = :idDomicilio")
    , @NamedQuery(name = "Tbldomicilio.findByCalle", query = "SELECT t FROM Tbldomicilio t WHERE t.calle = :calle")
    , @NamedQuery(name = "Tbldomicilio.findByNumeroInterior", query = "SELECT t FROM Tbldomicilio t WHERE t.numeroInterior = :numeroInterior")
    , @NamedQuery(name = "Tbldomicilio.findByNumeroExterior", query = "SELECT t FROM Tbldomicilio t WHERE t.numeroExterior = :numeroExterior")})
public class Tbldomicilio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDomicilio")
    private Integer idDomicilio;
    @Basic(optional = false)
    @Column(name = "calle")
    private String calle;
    @Basic(optional = false)
    @Column(name = "numeroInterior")
    private String numeroInterior;
    @Basic(optional = false)
    @Column(name = "numeroExterior")
    private String numeroExterior;
    @OneToMany(mappedBy = "tblDomicilioidDomicilio")
    private Collection<Tblemisor> tblemisorCollection;
    @JoinColumn(name = "tblColonia_codigoPostal", referencedColumnName = "codigoPostal")
    @ManyToOne(optional = false)
    private Tblcolonia tblColoniacodigoPostal;
    @OneToMany(mappedBy = "tblDomicilioidDomicilio")
    private Collection<Tblcliente> tblclienteCollection;

    public Tbldomicilio() {
    }

    public Tbldomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Tbldomicilio(Integer idDomicilio, String calle, String numeroInterior, String numeroExterior) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numeroInterior = numeroInterior;
        this.numeroExterior = numeroExterior;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    @XmlTransient
    public Collection<Tblemisor> getTblemisorCollection() {
        return tblemisorCollection;
    }

    public void setTblemisorCollection(Collection<Tblemisor> tblemisorCollection) {
        this.tblemisorCollection = tblemisorCollection;
    }

    public Tblcolonia getTblColoniacodigoPostal() {
        return tblColoniacodigoPostal;
    }

    public void setTblColoniacodigoPostal(Tblcolonia tblColoniacodigoPostal) {
        this.tblColoniacodigoPostal = tblColoniacodigoPostal;
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
        hash += (idDomicilio != null ? idDomicilio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldomicilio)) {
            return false;
        }
        Tbldomicilio other = (Tbldomicilio) object;
        if ((this.idDomicilio == null && other.idDomicilio != null) || (this.idDomicilio != null && !this.idDomicilio.equals(other.idDomicilio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tbldomicilio[ idDomicilio=" + idDomicilio + " ]";
    }
    
}
