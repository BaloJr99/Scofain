/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tblcolonia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcolonia.findAll", query = "SELECT t FROM Tblcolonia t")
    , @NamedQuery(name = "Tblcolonia.findByCodigoPostal", query = "SELECT t FROM Tblcolonia t WHERE t.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Tblcolonia.findByColonia", query = "SELECT t FROM Tblcolonia t WHERE t.colonia = :colonia")})
public class Tblcolonia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigoPostal")
    private String codigoPostal;
    @Basic(optional = false)
    @Column(name = "colonia")
    private String colonia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblColoniacodigoPostal")
    private Collection<Tbldomicilio> tbldomicilioCollection;
    @JoinColumn(name = "tblCiudad_idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne
    private Tblciudad tblCiudadidCiudad;

    public Tblcolonia() {
    }

    public Tblcolonia(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Tblcolonia(String codigoPostal, String colonia) {
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @XmlTransient
    public Collection<Tbldomicilio> getTbldomicilioCollection() {
        return tbldomicilioCollection;
    }

    public void setTbldomicilioCollection(Collection<Tbldomicilio> tbldomicilioCollection) {
        this.tbldomicilioCollection = tbldomicilioCollection;
    }

    public Tblciudad getTblCiudadidCiudad() {
        return tblCiudadidCiudad;
    }

    public void setTblCiudadidCiudad(Tblciudad tblCiudadidCiudad) {
        this.tblCiudadidCiudad = tblCiudadidCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPostal != null ? codigoPostal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcolonia)) {
            return false;
        }
        Tblcolonia other = (Tblcolonia) object;
        if ((this.codigoPostal == null && other.codigoPostal != null) || (this.codigoPostal != null && !this.codigoPostal.equals(other.codigoPostal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblcolonia[ codigoPostal=" + codigoPostal + " ]";
    }
    
}
