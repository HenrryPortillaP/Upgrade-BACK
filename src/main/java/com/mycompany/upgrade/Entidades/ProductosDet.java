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
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.TypeDef;

/**
 *
 * @author User
 */
@Entity
@Table(name = "extcs.productos_det")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosDet.findAll", query = "SELECT p FROM ProductosDet p")
    , @NamedQuery(name = "ProductosDet.findByCreado", query = "SELECT p FROM ProductosDet p WHERE p.creado = :creado")
    , @NamedQuery(name = "ProductosDet.findByCreadoPor", query = "SELECT p FROM ProductosDet p WHERE p.creadoPor = :creadoPor")
    , @NamedQuery(name = "ProductosDet.findByEditado", query = "SELECT p FROM ProductosDet p WHERE p.editado = :editado")
    , @NamedQuery(name = "ProductosDet.findByEditadoPor", query = "SELECT p FROM ProductosDet p WHERE p.editadoPor = :editadoPor")
    , @NamedQuery(name = "ProductosDet.findById", query = "SELECT p FROM ProductosDet p WHERE p.id = :id")
    , @NamedQuery(name = "ProductosDet.findByInactivo", query = "SELECT p FROM ProductosDet p WHERE p.inactivo = :inactivo")
    , @NamedQuery(name = "ProductosDet.findByEmpresaId", query = "SELECT p FROM ProductosDet p WHERE p.empresaId = :empresaId")
    , @NamedQuery(name = "ProductosDet.findByRegalo", query = "SELECT p FROM ProductosDet p WHERE p.regalo = :regalo")
    , @NamedQuery(name = "ProductosDet.findByMonedaId", query = "SELECT p FROM ProductosDet p WHERE p.monedaId = :monedaId")
    , @NamedQuery(name = "ProductosDet.findByCosto", query = "SELECT p FROM ProductosDet p WHERE p.costo = :costo")
    , @NamedQuery(name = "ProductosDet.findByImpuestoId", query = "SELECT p FROM ProductosDet p WHERE p.impuestoId = :impuestoId")
    , @NamedQuery(name = "ProductosDet.findByUtilidad", query = "SELECT p FROM ProductosDet p WHERE p.utilidad = :utilidad")
    , @NamedQuery(name = "ProductosDet.findByPercepcionId", query = "SELECT p FROM ProductosDet p WHERE p.percepcionId = :percepcionId")
    , @NamedQuery(name = "ProductosDet.findByGarantizable", query = "SELECT p FROM ProductosDet p WHERE p.garantizable = :garantizable")
    , @NamedQuery(name = "ProductosDet.findByGarantiaDuracion", query = "SELECT p FROM ProductosDet p WHERE p.garantiaDuracion = :garantiaDuracion")
    , @NamedQuery(name = "ProductosDet.findByPromocion", query = "SELECT p FROM ProductosDet p WHERE p.promocion = :promocion")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class ProductosDet implements Serializable {

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
    @Column(name = "empresa_id")
    private int empresaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regalo")
    private boolean regalo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moneda_id")
    private int monedaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo")
    private BigDecimal costo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "impuesto_id")
    private int impuestoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "utilidad")
    private BigDecimal utilidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "percepcion_id")
    private int percepcionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "garantizable")
    private boolean garantizable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "garantia_duracion")
    private int garantiaDuracion;
    @Column(name = "promocion")
    private Boolean promocion;
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Productos productoId;

    public ProductosDet() {
    }

    public ProductosDet(Integer id) {
        this.id = id;
    }

    public ProductosDet(Integer id, Date creado, int creadoPor, boolean inactivo, int empresaId, boolean regalo, int monedaId, BigDecimal costo, int impuestoId, BigDecimal utilidad, int percepcionId, boolean garantizable, int garantiaDuracion) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.inactivo = inactivo;
        this.empresaId = empresaId;
        this.regalo = regalo;
        this.monedaId = monedaId;
        this.costo = costo;
        this.impuestoId = impuestoId;
        this.utilidad = utilidad;
        this.percepcionId = percepcionId;
        this.garantizable = garantizable;
        this.garantiaDuracion = garantiaDuracion;
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

    public int getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(int empresaId) {
        this.empresaId = empresaId;
    }

    public boolean getRegalo() {
        return regalo;
    }

    public void setRegalo(boolean regalo) {
        this.regalo = regalo;
    }

    public int getMonedaId() {
        return monedaId;
    }

    public void setMonedaId(int monedaId) {
        this.monedaId = monedaId;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public int getImpuestoId() {
        return impuestoId;
    }

    public void setImpuestoId(int impuestoId) {
        this.impuestoId = impuestoId;
    }

    public BigDecimal getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(BigDecimal utilidad) {
        this.utilidad = utilidad;
    }

    public int getPercepcionId() {
        return percepcionId;
    }

    public void setPercepcionId(int percepcionId) {
        this.percepcionId = percepcionId;
    }

    public boolean getGarantizable() {
        return garantizable;
    }

    public void setGarantizable(boolean garantizable) {
        this.garantizable = garantizable;
    }

    public int getGarantiaDuracion() {
        return garantiaDuracion;
    }

    public void setGarantiaDuracion(int garantiaDuracion) {
        this.garantiaDuracion = garantiaDuracion;
    }

    public Boolean getPromocion() {
        return promocion;
    }

    public void setPromocion(Boolean promocion) {
        this.promocion = promocion;
    }

    public Productos getProductoId() {
        return productoId;
    }

    public void setProductoId(Productos productoId) {
        this.productoId = productoId;
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
        if (!(object instanceof ProductosDet)) {
            return false;
        }
        ProductosDet other = (ProductosDet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.ProductosDet[ id=" + id + " ]";
    }
    
}
