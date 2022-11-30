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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tblusuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuarios.findAll", query = "SELECT t FROM Tblusuarios t")
    , @NamedQuery(name = "Tblusuarios.findByUsuario", query = "SELECT t FROM Tblusuarios t WHERE t.usuario = :usuario")
    , @NamedQuery(name = "Tblusuarios.findByContrasena", query = "SELECT t FROM Tblusuarios t WHERE t.contrasena = :contrasena")
    , @NamedQuery(name = "Tblusuarios.findByGenero", query = "SELECT t FROM Tblusuarios t WHERE t.genero = :genero")
    , @NamedQuery(name = "Tblusuarios.findByFechaNacimiento", query = "SELECT t FROM Tblusuarios t WHERE t.fechaNacimiento = :fechaNacimiento")})
public class Tblusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @JoinColumn(name = "tblEmpleado_idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne
    private Tblempleado tblEmpleadoidEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblUsuariosusuario")
    private Collection<Tbliniciosesion> tbliniciosesionCollection;

    public Tblusuarios() {
    }

    public Tblusuarios(String usuario) {
        this.usuario = usuario;
    }

    public Tblusuarios(String usuario, String contrasena, String genero, Date fechaNacimiento) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Tblempleado getTblEmpleadoidEmpleado() {
        return tblEmpleadoidEmpleado;
    }

    public void setTblEmpleadoidEmpleado(Tblempleado tblEmpleadoidEmpleado) {
        this.tblEmpleadoidEmpleado = tblEmpleadoidEmpleado;
    }

    @XmlTransient
    public Collection<Tbliniciosesion> getTbliniciosesionCollection() {
        return tbliniciosesionCollection;
    }

    public void setTbliniciosesionCollection(Collection<Tbliniciosesion> tbliniciosesionCollection) {
        this.tbliniciosesionCollection = tbliniciosesionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblusuarios)) {
            return false;
        }
        Tblusuarios other = (Tblusuarios) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblusuarios[ usuario=" + usuario + " ]";
    }
    
}
