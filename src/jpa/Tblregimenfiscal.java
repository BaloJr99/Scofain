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
@Table(name = "tblregimenfiscal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblregimenfiscal.findAll", query = "SELECT t FROM Tblregimenfiscal t")
    , @NamedQuery(name = "Tblregimenfiscal.findByIdRegimen", query = "SELECT t FROM Tblregimenfiscal t WHERE t.idRegimen = :idRegimen")
    , @NamedQuery(name = "Tblregimenfiscal.findByTipo", query = "SELECT t FROM Tblregimenfiscal t WHERE t.tipo = :tipo")})
public class Tblregimenfiscal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idRegimen")
    private String idRegimen;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(mappedBy = "tblRegimenFiscalidRegimen")
    private Collection<Tblemisor> tblemisorCollection;

    public Tblregimenfiscal() {
    }

    public Tblregimenfiscal(String idRegimen) {
        this.idRegimen = idRegimen;
    }

    public Tblregimenfiscal(String idRegimen, String tipo) {
        this.idRegimen = idRegimen;
        this.tipo = tipo;
    }

    public String getIdRegimen() {
        return idRegimen;
    }

    public void setIdRegimen(String idRegimen) {
        this.idRegimen = idRegimen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Tblemisor> getTblemisorCollection() {
        return tblemisorCollection;
    }

    public void setTblemisorCollection(Collection<Tblemisor> tblemisorCollection) {
        this.tblemisorCollection = tblemisorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegimen != null ? idRegimen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblregimenfiscal)) {
            return false;
        }
        Tblregimenfiscal other = (Tblregimenfiscal) object;
        if ((this.idRegimen == null && other.idRegimen != null) || (this.idRegimen != null && !this.idRegimen.equals(other.idRegimen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblregimenfiscal[ idRegimen=" + idRegimen + " ]";
    }
    
}
