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
@Table(name = "tbldatopoliza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldatopoliza.findAll", query = "SELECT t FROM Tbldatopoliza t")
    , @NamedQuery(name = "Tbldatopoliza.findByIdDatoPoliza", query = "SELECT t FROM Tbldatopoliza t WHERE t.idDatoPoliza = :idDatoPoliza")
    , @NamedQuery(name = "Tbldatopoliza.findByDebe", query = "SELECT t FROM Tbldatopoliza t WHERE t.debe = :debe")
    , @NamedQuery(name = "Tbldatopoliza.findByHaber", query = "SELECT t FROM Tbldatopoliza t WHERE t.haber = :haber")})
public class Tbldatopoliza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDatoPoliza")
    private String idDatoPoliza;
    @Basic(optional = false)
    @Column(name = "debe")
    private float debe;
    @Basic(optional = false)
    @Column(name = "haber")
    private float haber;
    @JoinColumn(name = "tblCatalogoCuentas_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Tblcatalogocuentas tblCatalogoCuentascodigo;
    @JoinColumn(name = "tblPoliza_numPolizaGral", referencedColumnName = "numPolizaGral")
    @ManyToOne
    private Tblpoliza tblPolizanumPolizaGral;

    public Tbldatopoliza() {
    }

    public Tbldatopoliza(String idDatoPoliza) {
        this.idDatoPoliza = idDatoPoliza;
    }

    public Tbldatopoliza(String idDatoPoliza, float debe, float haber) {
        this.idDatoPoliza = idDatoPoliza;
        this.debe = debe;
        this.haber = haber;
    }

    public String getIdDatoPoliza() {
        return idDatoPoliza;
    }

    public void setIdDatoPoliza(String idDatoPoliza) {
        this.idDatoPoliza = idDatoPoliza;
    }

    public float getDebe() {
        return debe;
    }

    public void setDebe(float debe) {
        this.debe = debe;
    }

    public float getHaber() {
        return haber;
    }

    public void setHaber(float haber) {
        this.haber = haber;
    }

    public Tblcatalogocuentas getTblCatalogoCuentascodigo() {
        return tblCatalogoCuentascodigo;
    }

    public void setTblCatalogoCuentascodigo(Tblcatalogocuentas tblCatalogoCuentascodigo) {
        this.tblCatalogoCuentascodigo = tblCatalogoCuentascodigo;
    }

    public Tblpoliza getTblPolizanumPolizaGral() {
        return tblPolizanumPolizaGral;
    }

    public void setTblPolizanumPolizaGral(Tblpoliza tblPolizanumPolizaGral) {
        this.tblPolizanumPolizaGral = tblPolizanumPolizaGral;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatoPoliza != null ? idDatoPoliza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldatopoliza)) {
            return false;
        }
        Tbldatopoliza other = (Tbldatopoliza) object;
        if ((this.idDatoPoliza == null && other.idDatoPoliza != null) || (this.idDatoPoliza != null && !this.idDatoPoliza.equals(other.idDatoPoliza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tbldatopoliza[ idDatoPoliza=" + idDatoPoliza + " ]";
    }
    
}
