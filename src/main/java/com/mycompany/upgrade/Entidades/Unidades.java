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
@Table(name = "unidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidades.findAll", query = "SELECT u FROM Unidades u")
    , @NamedQuery(name = "Unidades.findByCreado", query = "SELECT u FROM Unidades u WHERE u.creado = :creado")
    , @NamedQuery(name = "Unidades.findByCreadoPor", query = "SELECT u FROM Unidades u WHERE u.creadoPor = :creadoPor")
    , @NamedQuery(name = "Unidades.findByEditado", query = "SELECT u FROM Unidades u WHERE u.editado = :editado")
    , @NamedQuery(name = "Unidades.findByEditadoPor", query = "SELECT u FROM Unidades u WHERE u.editadoPor = :editadoPor")
    , @NamedQuery(name = "Unidades.findById", query = "SELECT u FROM Unidades u WHERE u.id = :id")
    , @NamedQuery(name = "Unidades.findByInactivo", query = "SELECT u FROM Unidades u WHERE u.inactivo = :inactivo")
    , @NamedQuery(name = "Unidades.findByNombre", query = "SELECT u FROM Unidades u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Unidades.findByAbreviatura", query = "SELECT u FROM Unidades u WHERE u.abreviatura = :abreviatura")
    , @NamedQuery(name = "Unidades.findByPeso", query = "SELECT u FROM Unidades u WHERE u.peso = :peso")
    , @NamedQuery(name = "Unidades.findByDivisible", query = "SELECT u FROM Unidades u WHERE u.divisible = :divisible")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class Unidades implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "abreviatura")
    private String abreviatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private boolean peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "divisible")
    private boolean divisible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadId")
    private Collection<Productos> productosCollection;
    @OneToMany(mappedBy = "divisibleUnidadId")
    private Collection<Productos> productosCollection1;

    public Unidades() {
    }

    public Unidades(Integer id) {
        this.id = id;
    }

    public Unidades(Integer id, Date creado, int creadoPor, boolean inactivo, String nombre, String abreviatura, boolean peso, boolean divisible) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.inactivo = inactivo;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.peso = peso;
        this.divisible = divisible;
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

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public boolean getPeso() {
        return peso;
    }

    public void setPeso(boolean peso) {
        this.peso = peso;
    }

    public boolean getDivisible() {
        return divisible;
    }

    public void setDivisible(boolean divisible) {
        this.divisible = divisible;
    }

    @XmlTransient
    public Collection<Productos> getProductosCollection() {
        return productosCollection;
    }

    public void setProductosCollection(Collection<Productos> productosCollection) {
        this.productosCollection = productosCollection;
    }

    @XmlTransient
    public Collection<Productos> getProductosCollection1() {
        return productosCollection1;
    }

    public void setProductosCollection1(Collection<Productos> productosCollection1) {
        this.productosCollection1 = productosCollection1;
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
        if (!(object instanceof Unidades)) {
            return false;
        }
        Unidades other = (Unidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.Unidades[ id=" + id + " ]";
    }
    
}
