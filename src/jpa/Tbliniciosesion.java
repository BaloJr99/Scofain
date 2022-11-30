/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author baloc
 */
@Entity
@Table(name = "tbliniciosesion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbliniciosesion.findAll", query = "SELECT t FROM Tbliniciosesion t")
    , @NamedQuery(name = "Tbliniciosesion.findByIdInicios", query = "SELECT t FROM Tbliniciosesion t WHERE t.idInicios = :idInicios")
    , @NamedQuery(name = "Tbliniciosesion.findByFecha", query = "SELECT t FROM Tbliniciosesion t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Tbliniciosesion.findByArea", query = "SELECT t FROM Tbliniciosesion t WHERE t.area = :area")})
public class Tbliniciosesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInicios")
    private Integer idInicios;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "area")
    private String area;
    @JoinColumn(name = "tblUsuarios_usuario", referencedColumnName = "usuario")
    @ManyToOne(optional = false)
    private Tblusuarios tblUsuariosusuario;

    public Tbliniciosesion() {
    }

    public Tbliniciosesion(Integer idInicios) {
        this.idInicios = idInicios;
    }

    public Tbliniciosesion(Integer idInicios, Date fecha, String area) {
        this.idInicios = idInicios;
        this.fecha = fecha;
        this.area = area;
    }

    public Integer getIdInicios() {
        return idInicios;
    }

    public void setIdInicios(Integer idInicios) {
        this.idInicios = idInicios;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Tblusuarios getTblUsuariosusuario() {
        return tblUsuariosusuario;
    }

    public void setTblUsuariosusuario(Tblusuarios tblUsuariosusuario) {
        this.tblUsuariosusuario = tblUsuariosusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInicios != null ? idInicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbliniciosesion)) {
            return false;
        }
        Tbliniciosesion other = (Tbliniciosesion) object;
        if ((this.idInicios == null && other.idInicios != null) || (this.idInicios != null && !this.idInicios.equals(other.idInicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tbliniciosesion[ idInicios=" + idInicios + " ]";
    }
    
}
