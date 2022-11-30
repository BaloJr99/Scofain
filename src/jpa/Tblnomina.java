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
@Table(name = "tblnomina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblnomina.findAll", query = "SELECT t FROM Tblnomina t")
    , @NamedQuery(name = "Tblnomina.findByIdNomina", query = "SELECT t FROM Tblnomina t WHERE t.idNomina = :idNomina")
    , @NamedQuery(name = "Tblnomina.findByFechaPago", query = "SELECT t FROM Tblnomina t WHERE t.fechaPago = :fechaPago")
    , @NamedQuery(name = "Tblnomina.findByFechaInicial", query = "SELECT t FROM Tblnomina t WHERE t.fechaInicial = :fechaInicial")
    , @NamedQuery(name = "Tblnomina.findByFechaFinal", query = "SELECT t FROM Tblnomina t WHERE t.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "Tblnomina.findByEstado", query = "SELECT t FROM Tblnomina t WHERE t.estado = :estado")
    , @NamedQuery(name = "Tblnomina.findByPercepciones", query = "SELECT t FROM Tblnomina t WHERE t.percepciones = :percepciones")
    , @NamedQuery(name = "Tblnomina.findByDeducciones", query = "SELECT t FROM Tblnomina t WHERE t.deducciones = :deducciones")
    , @NamedQuery(name = "Tblnomina.findByOtros", query = "SELECT t FROM Tblnomina t WHERE t.otros = :otros")})
public class Tblnomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idNomina")
    private String idNomina;
    @Basic(optional = false)
    @Column(name = "fechaPago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Basic(optional = false)
    @Column(name = "fechaInicial")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;
    @Basic(optional = false)
    @Column(name = "fechaFinal")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "percepciones")
    private float percepciones;
    @Basic(optional = false)
    @Column(name = "deducciones")
    private float deducciones;
    @Basic(optional = false)
    @Column(name = "otros")
    private float otros;
    @JoinColumn(name = "tblEmpleado_idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne
    private Tblempleado tblEmpleadoidEmpleado;

    public Tblnomina() {
    }

    public Tblnomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public Tblnomina(String idNomina, Date fechaPago, Date fechaInicial, Date fechaFinal, String estado, float percepciones, float deducciones, float otros) {
        this.idNomina = idNomina;
        this.fechaPago = fechaPago;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.percepciones = percepciones;
        this.deducciones = deducciones;
        this.otros = otros;
    }

    public String getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPercepciones() {
        return percepciones;
    }

    public void setPercepciones(float percepciones) {
        this.percepciones = percepciones;
    }

    public float getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(float deducciones) {
        this.deducciones = deducciones;
    }

    public float getOtros() {
        return otros;
    }

    public void setOtros(float otros) {
        this.otros = otros;
    }

    public Tblempleado getTblEmpleadoidEmpleado() {
        return tblEmpleadoidEmpleado;
    }

    public void setTblEmpleadoidEmpleado(Tblempleado tblEmpleadoidEmpleado) {
        this.tblEmpleadoidEmpleado = tblEmpleadoidEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNomina != null ? idNomina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblnomina)) {
            return false;
        }
        Tblnomina other = (Tblnomina) object;
        if ((this.idNomina == null && other.idNomina != null) || (this.idNomina != null && !this.idNomina.equals(other.idNomina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Tblnomina[ idNomina=" + idNomina + " ]";
    }
    
}
