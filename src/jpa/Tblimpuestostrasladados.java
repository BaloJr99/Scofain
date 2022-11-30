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
@Table(name = "tblimpuestostrasladados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblimpuestostrasladados.findAll", query = "SELECT t FROM Tblimpuestostrasladados t")
    , @NamedQuery(name = "Tblimpuestostrasladados.findByIdTrasladados", query = "SELECT t FROM Tblimpuestostrasladados t WHERE t.idTrasladados = :idTrasladados")
    , @NamedQuery(name = "Tblimpuestostrasladados.findByTipo", query = "SELECT t FROM Tblimpuestostrasladados t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "Tblimpuestostrasladados.findByPorcentaje", query = "SELECT t FROM Tblimpuestostrasladados t WHERE t.porcentaje = :porcentaje")})
public class Tblimpuestostrasladados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTrasladados")
    private Integer idTrasladados;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "porcentaje")
    private float porcentaje;
    @OneToMany(mappedBy = "tblImpuestosTrasladadosidTrasladados")
    private Collection<Tblimpuestos> tblimpuestosCollection;

    public Tblimpuestostrasladados() {
    }

    public Tblimpuestostrasladados(Integer idTrasladados) {
        this.idTrasladados = idTrasladados;
    }

    public Tblimpuestostrasladados(Integer idTrasladados, String tipo, float porcentaje) {
        this.idTrasladados = idTrasladados;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
    }

    public Integer getIdTrasladados() {
        return idTrasladados;
    }

    public void setIdTrasladados(Integer idTrasladados) {
        this.idTrasladados = idTrasladados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @XmlTransient
    public Collection<Tblimpuestos> getTblimpuestosCollection() {
        return tblimpuestosCollection;
    }

    public void setTblimpuestosCollection(Collection<Tblimpuestos> tblimpuestosCollection) {
        this.tblimpuestosCollection = tblimpuestosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrasladados != null ? idTrasladados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblimpuestostrasladados)) {
            return false;
        }
        Tblimpuestostrasladados other = (Tblimpuestostrasladados) object;
        if ((this.idTrasladados == null && other.idTrasladados != null) || (this.idTrasladados != null && !this.idTrasladados.equals(other.idTrasladados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblimpuestostrasladados[ idTrasladados=" + idTrasladados + " ]";
    }
    
}
