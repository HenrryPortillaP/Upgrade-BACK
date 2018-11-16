/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upgrade.Entidades;

import com.vladmihalcea.hibernate.type.basic.Inet;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLInetType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "extcs.productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByCreado", query = "SELECT p FROM Productos p WHERE p.creado = :creado")
    , @NamedQuery(name = "Productos.findByCreadoPor", query = "SELECT p FROM Productos p WHERE p.creadoPor = :creadoPor")
    , @NamedQuery(name = "Productos.findByEditado", query = "SELECT p FROM Productos p WHERE p.editado = :editado")
    , @NamedQuery(name = "Productos.findByEditadoPor", query = "SELECT p FROM Productos p WHERE p.editadoPor = :editadoPor")
    , @NamedQuery(name = "Productos.findById", query = "SELECT p FROM Productos p WHERE p.id = :id")
    , @NamedQuery(name = "Productos.findByInactivo", query = "SELECT p FROM Productos p WHERE p.inactivo = :inactivo")
    , @NamedQuery(name = "Productos.findByCodigo", query = "SELECT p FROM Productos p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Productos.findByNombre", query = "SELECT p FROM Productos p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Productos.findByRegalo", query = "SELECT p FROM Productos p WHERE p.regalo = :regalo")
    , @NamedQuery(name = "Productos.findByModelo", query = "SELECT p FROM Productos p WHERE p.modelo = :modelo")
    , @NamedQuery(name = "Productos.findByServicio", query = "SELECT p FROM Productos p WHERE p.servicio = :servicio")
    , @NamedQuery(name = "Productos.findByPeso", query = "SELECT p FROM Productos p WHERE p.peso = :peso")
    , @NamedQuery(name = "Productos.findByDivisible", query = "SELECT p FROM Productos p WHERE p.divisible = :divisible")
    , @NamedQuery(name = "Productos.findByDivisibleCantidad", query = "SELECT p FROM Productos p WHERE p.divisibleCantidad = :divisibleCantidad")
    , @NamedQuery(name = "Productos.findByRotativo", query = "SELECT p FROM Productos p WHERE p.rotativo = :rotativo")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class Productos implements Serializable {

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
    @Size(min = 1, max = 2147483647)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regalo")
    private boolean regalo;
    @Size(max = 2147483647)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "servicio")
    private boolean servicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private BigDecimal peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "divisible")
    private boolean divisible;
    @Column(name = "divisible_cantidad")
    private BigDecimal divisibleCantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rotativo")
    private boolean rotativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId")
    private Collection<ProductosDet> productosDetCollection;
    @JoinColumn(name = "linea_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Lineas lineaId;
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Marcas marcaId;
    @OneToMany(mappedBy = "productoOrigenId")
    private Collection<Productos> productosCollection;
    @JoinColumn(name = "producto_origen_id", referencedColumnName = "id")
    @ManyToOne
    private Productos productoOrigenId;
    @JoinColumn(name = "producto_tipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProductosTipo productoTipoId;
    @JoinColumn(name = "unidad_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Unidades unidadId;
    @JoinColumn(name = "divisible_unidad_id", referencedColumnName = "id")
    @ManyToOne
    private Unidades divisibleUnidadId;

    public Productos() {
    }

    public Productos(Integer id) {
        this.id = id;
    }

    public Productos(Integer id, Date creado, int creadoPor, boolean inactivo, String codigo, String nombre, boolean regalo, boolean servicio, BigDecimal peso, boolean divisible, boolean rotativo) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.inactivo = inactivo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.regalo = regalo;
        this.servicio = servicio;
        this.peso = peso;
        this.divisible = divisible;
        this.rotativo = rotativo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getRegalo() {
        return regalo;
    }

    public void setRegalo(boolean regalo) {
        this.regalo = regalo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public boolean getDivisible() {
        return divisible;
    }

    public void setDivisible(boolean divisible) {
        this.divisible = divisible;
    }

    public BigDecimal getDivisibleCantidad() {
        return divisibleCantidad;
    }

    public void setDivisibleCantidad(BigDecimal divisibleCantidad) {
        this.divisibleCantidad = divisibleCantidad;
    }

    public boolean getRotativo() {
        return rotativo;
    }

    public void setRotativo(boolean rotativo) {
        this.rotativo = rotativo;
    }

    @XmlTransient
    public Collection<ProductosDet> getProductosDetCollection() {
        return productosDetCollection;
    }

    public void setProductosDetCollection(Collection<ProductosDet> productosDetCollection) {
        this.productosDetCollection = productosDetCollection;
    }

    public Lineas getLineaId() {
        return lineaId;
    }

    public void setLineaId(Lineas lineaId) {
        this.lineaId = lineaId;
    }

    public Marcas getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Marcas marcaId) {
        this.marcaId = marcaId;
    }

    @XmlTransient
    public Collection<Productos> getProductosCollection() {
        return productosCollection;
    }

    public void setProductosCollection(Collection<Productos> productosCollection) {
        this.productosCollection = productosCollection;
    }

    public Productos getProductoOrigenId() {
        return productoOrigenId;
    }

    public void setProductoOrigenId(Productos productoOrigenId) {
        this.productoOrigenId = productoOrigenId;
    }

    public ProductosTipo getProductoTipoId() {
        return productoTipoId;
    }

    public void setProductoTipoId(ProductosTipo productoTipoId) {
        this.productoTipoId = productoTipoId;
    }

    public Unidades getUnidadId() {
        return unidadId;
    }

    public void setUnidadId(Unidades unidadId) {
        this.unidadId = unidadId;
    }

    public Unidades getDivisibleUnidadId() {
        return divisibleUnidadId;
    }

    public void setDivisibleUnidadId(Unidades divisibleUnidadId) {
        this.divisibleUnidadId = divisibleUnidadId;
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
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.Productos[ id=" + id + " ]";
    }
    
}
