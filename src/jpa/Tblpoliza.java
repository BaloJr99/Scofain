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
@Table(name = "tblpoliza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpoliza.findAll", query = "SELECT t FROM Tblpoliza t")
    , @NamedQuery(name = "Tblpoliza.findByNumPolizaGral", query = "SELECT t FROM Tblpoliza t WHERE t.numPolizaGral = :numPolizaGral")
    , @NamedQuery(name = "Tblpoliza.findByNumPoliza", query = "SELECT t FROM Tblpoliza t WHERE t.numPoliza = :numPoliza")
    , @NamedQuery(name = "Tblpoliza.findByFecha", query = "SELECT t FROM Tblpoliza t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Tblpoliza.findByConcepto", query = "SELECT t FROM Tblpoliza t WHERE t.concepto = :concepto")})
public class Tblpoliza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numPolizaGral")
    private String numPolizaGral;
    @Basic(optional = false)
    @Column(name = "numPoliza")
    private String numPoliza;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "concepto")
    private String concepto;
    @OneToMany(mappedBy = "tblPolizanumPolizaGral")
    private Collection<Tbldatopoliza> tbldatopolizaCollection;

    public Tblpoliza() {
    }

    public Tblpoliza(String numPolizaGral) {
        this.numPolizaGral = numPolizaGral;
    }

    public Tblpoliza(String numPolizaGral, String numPoliza, String fecha) {
        this.numPolizaGral = numPolizaGral;
        this.numPoliza = numPoliza;
        this.fecha = fecha;
    }

    public String getNumPolizaGral() {
        return numPolizaGral;
    }

    public void setNumPolizaGral(String numPolizaGral) {
        this.numPolizaGral = numPolizaGral;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @XmlTransient
    public Collection<Tbldatopoliza> getTbldatopolizaCollection() {
        return tbldatopolizaCollection;
    }

    public void setTbldatopolizaCollection(Collection<Tbldatopoliza> tbldatopolizaCollection) {
        this.tbldatopolizaCollection = tbldatopolizaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numPolizaGral != null ? numPolizaGral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblpoliza)) {
            return false;
        }
        Tblpoliza other = (Tblpoliza) object;
        if ((this.numPolizaGral == null && other.numPolizaGral != null) || (this.numPolizaGral != null && !this.numPolizaGral.equals(other.numPolizaGral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblpoliza[ numPolizaGral=" + numPolizaGral + " ]";
    }
    
}
