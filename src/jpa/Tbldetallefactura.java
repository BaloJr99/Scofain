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
@Table(name = "tbldetallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldetallefactura.findAll", query = "SELECT t FROM Tbldetallefactura t")
    , @NamedQuery(name = "Tbldetallefactura.findByIdDetalle", query = "SELECT t FROM Tbldetallefactura t WHERE t.idDetalle = :idDetalle")
    , @NamedQuery(name = "Tbldetallefactura.findByImporte", query = "SELECT t FROM Tbldetallefactura t WHERE t.importe = :importe")
    , @NamedQuery(name = "Tbldetallefactura.findByCantidad", query = "SELECT t FROM Tbldetallefactura t WHERE t.cantidad = :cantidad")})
public class Tbldetallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDetalle")
    private String idDetalle;
    @Basic(optional = false)
    @Column(name = "importe")
    private float importe;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private float cantidad;
    @JoinColumn(name = "tblclaveUnidad_clave", referencedColumnName = "clave")
    @ManyToOne
    private Tblclaveunidad tblclaveUnidadclave;
    @JoinColumn(name = "tblFactura_folio", referencedColumnName = "folio")
    @ManyToOne
    private Tblfactura tblFacturafolio;
    @JoinColumn(name = "tblImpuestos_idImpuesto", referencedColumnName = "idImpuesto")
    @ManyToOne
    private Tblimpuestos tblImpuestosidImpuesto;
    @JoinColumn(name = "tblproductos_claveProducto", referencedColumnName = "claveProducto")
    @ManyToOne
    private Tblproductos tblproductosclaveProducto;

    public Tbldetallefactura() {
    }

    public Tbldetallefactura(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Tbldetallefactura(String idDetalle, float importe, float cantidad) {
        this.idDetalle = idDetalle;
        this.importe = importe;
        this.cantidad = cantidad;
    }

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Tblclaveunidad getTblclaveUnidadclave() {
        return tblclaveUnidadclave;
    }

    public void setTblclaveUnidadclave(Tblclaveunidad tblclaveUnidadclave) {
        this.tblclaveUnidadclave = tblclaveUnidadclave;
    }

    public Tblfactura getTblFacturafolio() {
        return tblFacturafolio;
    }

    public void setTblFacturafolio(Tblfactura tblFacturafolio) {
        this.tblFacturafolio = tblFacturafolio;
    }

    public Tblimpuestos getTblImpuestosidImpuesto() {
        return tblImpuestosidImpuesto;
    }

    public void setTblImpuestosidImpuesto(Tblimpuestos tblImpuestosidImpuesto) {
        this.tblImpuestosidImpuesto = tblImpuestosidImpuesto;
    }

    public Tblproductos getTblproductosclaveProducto() {
        return tblproductosclaveProducto;
    }

    public void setTblproductosclaveProducto(Tblproductos tblproductosclaveProducto) {
        this.tblproductosclaveProducto = tblproductosclaveProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldetallefactura)) {
            return false;
        }
        Tbldetallefactura other = (Tbldetallefactura) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tbldetallefactura[ idDetalle=" + idDetalle + " ]";
    }
    
}
