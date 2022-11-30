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
@Table(name = "tblcatalogocuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcatalogocuentas.findAll", query = "SELECT t FROM Tblcatalogocuentas t")
    , @NamedQuery(name = "Tblcatalogocuentas.findByCodigo", query = "SELECT t FROM Tblcatalogocuentas t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Tblcatalogocuentas.findByDescripcion", query = "SELECT t FROM Tblcatalogocuentas t WHERE t.descripcion = :descripcion")})
public class Tblcatalogocuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "tblCatalogoCuentascodigo")
    private Collection<Tbldatopoliza> tbldatopolizaCollection;
    @OneToMany(mappedBy = "tblCatalogoCuentascodigo")
    private Collection<Tblprenomina> tblprenominaCollection;

    public Tblcatalogocuentas() {
    }

    public Tblcatalogocuentas(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Tbldatopoliza> getTbldatopolizaCollection() {
        return tbldatopolizaCollection;
    }

    public void setTbldatopolizaCollection(Collection<Tbldatopoliza> tbldatopolizaCollection) {
        this.tbldatopolizaCollection = tbldatopolizaCollection;
    }

    @XmlTransient
    public Collection<Tblprenomina> getTblprenominaCollection() {
        return tblprenominaCollection;
    }

    public void setTblprenominaCollection(Collection<Tblprenomina> tblprenominaCollection) {
        this.tblprenominaCollection = tblprenominaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcatalogocuentas)) {
            return false;
        }
        Tblcatalogocuentas other = (Tblcatalogocuentas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblcatalogocuentas[ codigo=" + codigo + " ]";
    }
    
}
