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
@Table(name = "tblempleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblempleado.findAll", query = "SELECT t FROM Tblempleado t")
    , @NamedQuery(name = "Tblempleado.findByIdEmpleado", query = "SELECT t FROM Tblempleado t WHERE t.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Tblempleado.findByPuesto", query = "SELECT t FROM Tblempleado t WHERE t.puesto = :puesto")
    , @NamedQuery(name = "Tblempleado.findByNombre", query = "SELECT t FROM Tblempleado t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblempleado.findByApellidoP", query = "SELECT t FROM Tblempleado t WHERE t.apellidoP = :apellidoP")
    , @NamedQuery(name = "Tblempleado.findByApellidoM", query = "SELECT t FROM Tblempleado t WHERE t.apellidoM = :apellidoM")
    , @NamedQuery(name = "Tblempleado.findByRfc", query = "SELECT t FROM Tblempleado t WHERE t.rfc = :rfc")
    , @NamedQuery(name = "Tblempleado.findByCurp", query = "SELECT t FROM Tblempleado t WHERE t.curp = :curp")
    , @NamedQuery(name = "Tblempleado.findByFechaAlta", query = "SELECT t FROM Tblempleado t WHERE t.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "Tblempleado.findByFechaBaja", query = "SELECT t FROM Tblempleado t WHERE t.fechaBaja = :fechaBaja")
    , @NamedQuery(name = "Tblempleado.findByNumSeguro", query = "SELECT t FROM Tblempleado t WHERE t.numSeguro = :numSeguro")})
public class Tblempleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @Column(name = "puesto")
    private String puesto;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellidoP")
    private String apellidoP;
    @Basic(optional = false)
    @Column(name = "apellidoM")
    private String apellidoM;
    @Basic(optional = false)
    @Column(name = "rfc")
    private String rfc;
    @Basic(optional = false)
    @Column(name = "curp")
    private String curp;
    @Basic(optional = false)
    @Column(name = "fechaAlta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "fechaBaja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    @Basic(optional = false)
    @Column(name = "numSeguro")
    private String numSeguro;
    @OneToMany(mappedBy = "tblEmpleadoidEmpleado")
    private Collection<Tblnomina> tblnominaCollection;
    @OneToMany(mappedBy = "tblEmpleadoidEmpleado")
    private Collection<Tblprenomina> tblprenominaCollection;
    @OneToMany(mappedBy = "tblEmpleadoidEmpleado")
    private Collection<Tblusuarios> tblusuariosCollection;
    @JoinColumn(name = "tblEstado_idEstado", referencedColumnName = "idEstado")
    @ManyToOne(optional = false)
    private Tblestado tblEstadoidEstado;

    public Tblempleado() {
    }

    public Tblempleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Tblempleado(Integer idEmpleado, String puesto, String nombre, String apellidoP, String apellidoM, String rfc, String curp, Date fechaAlta, String numSeguro) {
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.rfc = rfc;
        this.curp = curp;
        this.fechaAlta = fechaAlta;
        this.numSeguro = numSeguro;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getNumSeguro() {
        return numSeguro;
    }

    public void setNumSeguro(String numSeguro) {
        this.numSeguro = numSeguro;
    }

    @XmlTransient
    public Collection<Tblnomina> getTblnominaCollection() {
        return tblnominaCollection;
    }

    public void setTblnominaCollection(Collection<Tblnomina> tblnominaCollection) {
        this.tblnominaCollection = tblnominaCollection;
    }

    @XmlTransient
    public Collection<Tblprenomina> getTblprenominaCollection() {
        return tblprenominaCollection;
    }

    public void setTblprenominaCollection(Collection<Tblprenomina> tblprenominaCollection) {
        this.tblprenominaCollection = tblprenominaCollection;
    }

    @XmlTransient
    public Collection<Tblusuarios> getTblusuariosCollection() {
        return tblusuariosCollection;
    }

    public void setTblusuariosCollection(Collection<Tblusuarios> tblusuariosCollection) {
        this.tblusuariosCollection = tblusuariosCollection;
    }

    public Tblestado getTblEstadoidEstado() {
        return tblEstadoidEstado;
    }

    public void setTblEstadoidEstado(Tblestado tblEstadoidEstado) {
        this.tblEstadoidEstado = tblEstadoidEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblempleado)) {
            return false;
        }
        Tblempleado other = (Tblempleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblempleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
