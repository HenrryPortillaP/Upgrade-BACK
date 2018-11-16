/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upgrade.Entidades;

import com.vladmihalcea.hibernate.type.basic.Inet;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLInetType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.TypeDef;

/**
 *
 * @author User
 */
@Entity
@Table(name = "cmrlz.preventas_tipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreventasTipo.findAll", query = "SELECT p FROM PreventasTipo p")
    , @NamedQuery(name = "PreventasTipo.findByCreado", query = "SELECT p FROM PreventasTipo p WHERE p.creado = :creado")
    , @NamedQuery(name = "PreventasTipo.findByCreadoPor", query = "SELECT p FROM PreventasTipo p WHERE p.creadoPor = :creadoPor")
    , @NamedQuery(name = "PreventasTipo.findByEditado", query = "SELECT p FROM PreventasTipo p WHERE p.editado = :editado")
    , @NamedQuery(name = "PreventasTipo.findByEditadoPor", query = "SELECT p FROM PreventasTipo p WHERE p.editadoPor = :editadoPor")
    , @NamedQuery(name = "PreventasTipo.findById", query = "SELECT p FROM PreventasTipo p WHERE p.id = :id")
    , @NamedQuery(name = "PreventasTipo.findByInactivo", query = "SELECT p FROM PreventasTipo p WHERE p.inactivo = :inactivo")
    , @NamedQuery(name = "PreventasTipo.findByNombre", query = "SELECT p FROM PreventasTipo p WHERE p.nombre = :nombre")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class PreventasTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creado_por")
    private int creadoPor;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(
        name = "creado_ip", 
        columnDefinition = "inet"
    )
    private Inet creadoIp;
    @Column(name = "editado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editado;
    @Column(name = "editado_por")
    private Integer editadoPor;
    @Lob
    @Column(
        name = "editado_ip", 
        columnDefinition = "inet"
    )
    private Inet editadoIp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inactivo")
    private boolean inactivo;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preventaTipoId")
    private Collection<ProformasCab> proformasCabCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preventaTipoId")
    private Collection<NotasPedidoCab> notasPedidoCabCollection;

    public PreventasTipo() {
    }

    public PreventasTipo(Integer id) {
        this.id = id;
    }

    public PreventasTipo(Integer id, Date creado, int creadoPor, Inet creadoIp, boolean inactivo) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.creadoIp = creadoIp;
        this.inactivo = inactivo;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public int getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(int creadoPor) {
        this.creadoPor = creadoPor;
    }

    public Inet getCreadoIp() {
        return creadoIp;
    }

    public void setCreadoIp(Inet creadoIp) {
        this.creadoIp = creadoIp;
    }

    public Date getEditado() {
        return editado;
    }

    public void setEditado(Date editado) {
        this.editado = editado;
    }

    public Integer getEditadoPor() {
        return editadoPor;
    }

    public void setEditadoPor(Integer editadoPor) {
        this.editadoPor = editadoPor;
    }

    public Inet getEditadoIp() {
        return editadoIp;
    }

    public void setEditadoIp(Inet editadoIp) {
        this.editadoIp = editadoIp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getInactivo() {
        return inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<ProformasCab> getProformasCabCollection() {
        return proformasCabCollection;
    }

    public void setProformasCabCollection(Collection<ProformasCab> proformasCabCollection) {
        this.proformasCabCollection = proformasCabCollection;
    }

    @XmlTransient
    public Collection<NotasPedidoCab> getNotasPedidoCabCollection() {
        return notasPedidoCabCollection;
    }

    public void setNotasPedidoCabCollection(Collection<NotasPedidoCab> notasPedidoCabCollection) {
        this.notasPedidoCabCollection = notasPedidoCabCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreventasTipo)) {
            return false;
        }
        PreventasTipo other = (PreventasTipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.PreventasTipo[ id=" + id + " ]";
    }
    
}
