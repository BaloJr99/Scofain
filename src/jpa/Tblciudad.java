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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tblciudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblciudad.findAll", query = "SELECT t FROM Tblciudad t")
    , @NamedQuery(name = "Tblciudad.findByIdCiudad", query = "SELECT t FROM Tblciudad t WHERE t.idCiudad = :idCiudad")
    , @NamedQuery(name = "Tblciudad.findByCiudad", query = "SELECT t FROM Tblciudad t WHERE t.ciudad = :ciudad")})
public class Tblciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCiudad")
    private Integer idCiudad;
    @Column(name = "ciudad")
    private String ciudad;
    @JoinColumn(name = "tblEstado_idEstado", referencedColumnName = "idEstado")
    @ManyToOne
    private Tblestado tblEstadoidEstado;
    @OneToMany(mappedBy = "tblCiudadidCiudad")
    private Collection<Tblcolonia> tblcoloniaCollection;

    public Tblciudad() {
    }

    public Tblciudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Tblestado getTblEstadoidEstado() {
        return tblEstadoidEstado;
    }

    public void setTblEstadoidEstado(Tblestado tblEstadoidEstado) {
        this.tblEstadoidEstado = tblEstadoidEstado;
    }

    @XmlTransient
    public Collection<Tblcolonia> getTblcoloniaCollection() {
        return tblcoloniaCollection;
    }

    public void setTblcoloniaCollection(Collection<Tblcolonia> tblcoloniaCollection) {
        this.tblcoloniaCollection = tblcoloniaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCiudad != null ? idCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblciudad)) {
            return false;
        }
        Tblciudad other = (Tblciudad) object;
        if ((this.idCiudad == null && other.idCiudad != null) || (this.idCiudad != null && !this.idCiudad.equals(other.idCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblciudad[ idCiudad=" + idCiudad + " ]";
    }
    
}
