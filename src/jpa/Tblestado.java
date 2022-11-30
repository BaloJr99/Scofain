/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tblestado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblestado.findAll", query = "SELECT t FROM Tblestado t")
    , @NamedQuery(name = "Tblestado.findByIdEstado", query = "SELECT t FROM Tblestado t WHERE t.idEstado = :idEstado")
    , @NamedQuery(name = "Tblestado.findByEstado", query = "SELECT t FROM Tblestado t WHERE t.estado = :estado")})
public class Tblestado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstado")
    private Integer idEstado;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "tblEstadoidEstado")
    private Collection<Tblciudad> tblciudadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblEstadoidEstado")
    private Collection<Tblempleado> tblempleadoCollection;

    public Tblestado() {
    }

    public Tblestado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Tblestado(Integer idEstado, String estado) {
        this.idEstado = idEstado;
        this.estado = estado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Tblciudad> getTblciudadCollection() {
        return tblciudadCollection;
    }

    public void setTblciudadCollection(Collection<Tblciudad> tblciudadCollection) {
        this.tblciudadCollection = tblciudadCollection;
    }

    @XmlTransient
    public Collection<Tblempleado> getTblempleadoCollection() {
        return tblempleadoCollection;
    }

    public void setTblempleadoCollection(Collection<Tblempleado> tblempleadoCollection) {
        this.tblempleadoCollection = tblempleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblestado)) {
            return false;
        }
        Tblestado other = (Tblestado) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblestado[ idEstado=" + idEstado + " ]";
    }
    
}
