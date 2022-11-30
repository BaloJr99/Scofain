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
@Table(name = "tblproductos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblproductos.findAll", query = "SELECT t FROM Tblproductos t")
    , @NamedQuery(name = "Tblproductos.findByClaveProducto", query = "SELECT t FROM Tblproductos t WHERE t.claveProducto = :claveProducto")
    , @NamedQuery(name = "Tblproductos.findByDescripcion", query = "SELECT t FROM Tblproductos t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "Tblproductos.findByCantidad", query = "SELECT t FROM Tblproductos t WHERE t.cantidad = :cantidad")
    , @NamedQuery(name = "Tblproductos.findByPrecio", query = "SELECT t FROM Tblproductos t WHERE t.precio = :precio")})
public class Tblproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "claveProducto")
    private String claveProducto;
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private float cantidad;
    @Basic(optional = false)
    @Column(name = "precio")
    private float precio;
    @JoinColumn(name = "tblCatalogoProductosServicios_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Tblcatalogoproductosservicios tblCatalogoProductosServicioscodigo;
    @OneToMany(mappedBy = "tblproductosclaveProducto")
    private Collection<Tbldetallefactura> tbldetallefacturaCollection;

    public Tblproductos() {
    }

    public Tblproductos(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public Tblproductos(String claveProducto, float cantidad, float precio) {
        this.claveProducto = claveProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Tblcatalogoproductosservicios getTblCatalogoProductosServicioscodigo() {
        return tblCatalogoProductosServicioscodigo;
    }

    public void setTblCatalogoProductosServicioscodigo(Tblcatalogoproductosservicios tblCatalogoProductosServicioscodigo) {
        this.tblCatalogoProductosServicioscodigo = tblCatalogoProductosServicioscodigo;
    }

    @XmlTransient
    public Collection<Tbldetallefactura> getTbldetallefacturaCollection() {
        return tbldetallefacturaCollection;
    }

    public void setTbldetallefacturaCollection(Collection<Tbldetallefactura> tbldetallefacturaCollection) {
        this.tbldetallefacturaCollection = tbldetallefacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveProducto != null ? claveProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblproductos)) {
            return false;
        }
        Tblproductos other = (Tblproductos) object;
        if ((this.claveProducto == null && other.claveProducto != null) || (this.claveProducto != null && !this.claveProducto.equals(other.claveProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblproductos[ claveProducto=" + claveProducto + " ]";
    }
    
}
