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
@Table(name = "tblemisor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblemisor.findAll", query = "SELECT t FROM Tblemisor t")
    , @NamedQuery(name = "Tblemisor.findByRfcEmisor", query = "SELECT t FROM Tblemisor t WHERE t.rfcEmisor = :rfcEmisor")
    , @NamedQuery(name = "Tblemisor.findByCorreo", query = "SELECT t FROM Tblemisor t WHERE t.correo = :correo")
    , @NamedQuery(name = "Tblemisor.findByTelefono", query = "SELECT t FROM Tblemisor t WHERE t.telefono = :telefono")})
public class Tblemisor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rfcEmisor")
    private String rfcEmisor;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "tblDomicilio_idDomicilio", referencedColumnName = "idDomicilio")
    @ManyToOne
    private Tbldomicilio tblDomicilioidDomicilio;
    @JoinColumn(name = "tblRegimenFiscal_idRegimen", referencedColumnName = "idRegimen")
    @ManyToOne
    private Tblregimenfiscal tblRegimenFiscalidRegimen;
    @OneToMany(mappedBy = "tblEmisorrfcEmisor")
    private Collection<Tblfactura> tblfacturaCollection;

    public Tblemisor() {
    }

    public Tblemisor(String rfcEmisor) {
        this.rfcEmisor = rfcEmisor;
    }

    public Tblemisor(String rfcEmisor, String correo, String telefono) {
        this.rfcEmisor = rfcEmisor;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getRfcEmisor() {
        return rfcEmisor;
    }

    public void setRfcEmisor(String rfcEmisor) {
        this.rfcEmisor = rfcEmisor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Tbldomicilio getTblDomicilioidDomicilio() {
        return tblDomicilioidDomicilio;
    }

    public void setTblDomicilioidDomicilio(Tbldomicilio tblDomicilioidDomicilio) {
        this.tblDomicilioidDomicilio = tblDomicilioidDomicilio;
    }

    public Tblregimenfiscal getTblRegimenFiscalidRegimen() {
        return tblRegimenFiscalidRegimen;
    }

    public void setTblRegimenFiscalidRegimen(Tblregimenfiscal tblRegimenFiscalidRegimen) {
        this.tblRegimenFiscalidRegimen = tblRegimenFiscalidRegimen;
    }

    @XmlTransient
    public Collection<Tblfactura> getTblfacturaCollection() {
        return tblfacturaCollection;
    }

    public void setTblfacturaCollection(Collection<Tblfactura> tblfacturaCollection) {
        this.tblfacturaCollection = tblfacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rfcEmisor != null ? rfcEmisor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblemisor)) {
            return false;
        }
        Tblemisor other = (Tblemisor) object;
        if ((this.rfcEmisor == null && other.rfcEmisor != null) || (this.rfcEmisor != null && !this.rfcEmisor.equals(other.rfcEmisor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblemisor[ rfcEmisor=" + rfcEmisor + " ]";
    }
    
}
