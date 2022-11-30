/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author baloc
 */
@Entity
@Table(name = "tblfactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblfactura.findAll", query = "SELECT t FROM Tblfactura t")
    , @NamedQuery(name = "Tblfactura.findByFolio", query = "SELECT t FROM Tblfactura t WHERE t.folio = :folio")
    , @NamedQuery(name = "Tblfactura.findByFechaEmision", query = "SELECT t FROM Tblfactura t WHERE t.fechaEmision = :fechaEmision")
    , @NamedQuery(name = "Tblfactura.findByEstadoFactura", query = "SELECT t FROM Tblfactura t WHERE t.estadoFactura = :estadoFactura")})
public class Tblfactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "folio")
    private Integer folio;
    @Basic(optional = false)
    @Column(name = "fechaEmision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    @Basic(optional = false)
    @Column(name = "estadoFactura")
    private String estadoFactura;
    @JoinColumn(name = "tblEmisor_rfcEmisor", referencedColumnName = "rfcEmisor")
    @ManyToOne
    private Tblemisor tblEmisorrfcEmisor;
    @JoinColumn(name = "tblFormaPago_idFormaPago", referencedColumnName = "idFormaPago")
    @ManyToOne
    private Tblformapago tblFormaPagoidFormaPago;
    @JoinColumn(name = "tblMetodoPago_idMetodoPago", referencedColumnName = "idMetodoPago")
    @ManyToOne
    private Tblmetodopago tblMetodoPagoidMetodoPago;
    @JoinColumn(name = "tblReceptor_rfcReceptor", referencedColumnName = "rfcReceptor")
    @ManyToOne
    private Tblreceptor tblReceptorrfcReceptor;
    @JoinColumn(name = "tbltipoComprobante_clave", referencedColumnName = "clave")
    @ManyToOne
    private Tbltipocomprobante tbltipoComprobanteclave;
    @JoinColumn(name = "tblusoCFDI_clave", referencedColumnName = "clave")
    @ManyToOne
    private Tblusocfdi tblusoCFDIclave;
    @OneToMany(mappedBy = "tblFacturafolio")
    private Collection<Tbldetallefactura> tbldetallefacturaCollection;

    public Tblfactura() {
    }

    public Tblfactura(Integer folio) {
        this.folio = folio;
    }

    public Tblfactura(Integer folio, Date fechaEmision, String estadoFactura) {
        this.folio = folio;
        this.fechaEmision = fechaEmision;
        this.estadoFactura = estadoFactura;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public Tblemisor getTblEmisorrfcEmisor() {
        return tblEmisorrfcEmisor;
    }

    public void setTblEmisorrfcEmisor(Tblemisor tblEmisorrfcEmisor) {
        this.tblEmisorrfcEmisor = tblEmisorrfcEmisor;
    }

    public Tblformapago getTblFormaPagoidFormaPago() {
        return tblFormaPagoidFormaPago;
    }

    public void setTblFormaPagoidFormaPago(Tblformapago tblFormaPagoidFormaPago) {
        this.tblFormaPagoidFormaPago = tblFormaPagoidFormaPago;
    }

    public Tblmetodopago getTblMetodoPagoidMetodoPago() {
        return tblMetodoPagoidMetodoPago;
    }

    public void setTblMetodoPagoidMetodoPago(Tblmetodopago tblMetodoPagoidMetodoPago) {
        this.tblMetodoPagoidMetodoPago = tblMetodoPagoidMetodoPago;
    }

    public Tblreceptor getTblReceptorrfcReceptor() {
        return tblReceptorrfcReceptor;
    }

    public void setTblReceptorrfcReceptor(Tblreceptor tblReceptorrfcReceptor) {
        this.tblReceptorrfcReceptor = tblReceptorrfcReceptor;
    }

    public Tbltipocomprobante getTbltipoComprobanteclave() {
        return tbltipoComprobanteclave;
    }

    public void setTbltipoComprobanteclave(Tbltipocomprobante tbltipoComprobanteclave) {
        this.tbltipoComprobanteclave = tbltipoComprobanteclave;
    }

    public Tblusocfdi getTblusoCFDIclave() {
        return tblusoCFDIclave;
    }

    public void setTblusoCFDIclave(Tblusocfdi tblusoCFDIclave) {
        this.tblusoCFDIclave = tblusoCFDIclave;
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
        hash += (folio != null ? folio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblfactura)) {
            return false;
        }
        Tblfactura other = (Tblfactura) object;
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblfactura[ folio=" + folio + " ]";
    }
    
}
