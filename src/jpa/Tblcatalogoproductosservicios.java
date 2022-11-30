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
@Table(name = "tblcatalogoproductosservicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcatalogoproductosservicios.findAll", query = "SELECT t FROM Tblcatalogoproductosservicios t")
    , @NamedQuery(name = "Tblcatalogoproductosservicios.findByCodigo", query = "SELECT t FROM Tblcatalogoproductosservicios t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Tblcatalogoproductosservicios.findByDescripcion", query = "SELECT t FROM Tblcatalogoproductosservicios t WHERE t.descripcion = :descripcion")})
public class Tblcatalogoproductosservicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "tblCatalogoProductosServicioscodigo")
    private Collection<Tblproductos> tblproductosCollection;

    public Tblcatalogoproductosservicios() {
    }

    public Tblcatalogoproductosservicios(String codigo) {
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
    public Collection<Tblproductos> getTblproductosCollection() {
        return tblproductosCollection;
    }

    public void setTblproductosCollection(Collection<Tblproductos> tblproductosCollection) {
        this.tblproductosCollection = tblproductosCollection;
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
        if (!(object instanceof Tblcatalogoproductosservicios)) {
            return false;
        }
        Tblcatalogoproductosservicios other = (Tblcatalogoproductosservicios) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblcatalogoproductosservicios[ codigo=" + codigo + " ]";
    }
    
}
