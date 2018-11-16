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
@Table(name = "cmrlz.notas_pedido_det")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NotasPedidoDet.findAll", query = "SELECT n FROM NotasPedidoDet n")
    , @NamedQuery(name = "NotasPedidoDet.findByCreado", query = "SELECT n FROM NotasPedidoDet n WHERE n.creado = :creado")
    , @NamedQuery(name = "NotasPedidoDet.findByCreadoPor", query = "SELECT n FROM NotasPedidoDet n WHERE n.creadoPor = :creadoPor")
    , @NamedQuery(name = "NotasPedidoDet.findByEditado", query = "SELECT n FROM NotasPedidoDet n WHERE n.editado = :editado")
    , @NamedQuery(name = "NotasPedidoDet.findByEditadoPor", query = "SELECT n FROM NotasPedidoDet n WHERE n.editadoPor = :editadoPor")
    , @NamedQuery(name = "NotasPedidoDet.findById", query = "SELECT n FROM NotasPedidoDet n WHERE n.id = :id")
    , @NamedQuery(name = "NotasPedidoDet.findByExonerado", query = "SELECT n FROM NotasPedidoDet n WHERE n.exonerado = :exonerado")
    , @NamedQuery(name = "NotasPedidoDet.findByRegalo", query = "SELECT n FROM NotasPedidoDet n WHERE n.regalo = :regalo")
    , @NamedQuery(name = "NotasPedidoDet.findByProductoId", query = "SELECT n FROM NotasPedidoDet n WHERE n.productoId = :productoId")
    , @NamedQuery(name = "NotasPedidoDet.findByProductoCambioId", query = "SELECT n FROM NotasPedidoDet n WHERE n.productoCambioId = :productoCambioId")
    , @NamedQuery(name = "NotasPedidoDet.findByCantidad", query = "SELECT n FROM NotasPedidoDet n WHERE n.cantidad = :cantidad")
    , @NamedQuery(name = "NotasPedidoDet.findByPrecioUnitarioProducto", query = "SELECT n FROM NotasPedidoDet n WHERE n.precioUnitarioProducto = :precioUnitarioProducto")
    , @NamedQuery(name = "NotasPedidoDet.findByPrecioUnitarioNota", query = "SELECT n FROM NotasPedidoDet n WHERE n.precioUnitarioNota = :precioUnitarioNota")
    , @NamedQuery(name = "NotasPedidoDet.findByCantidadEntregada", query = "SELECT n FROM NotasPedidoDet n WHERE n.cantidadEntregada = :cantidadEntregada")
    , @NamedQuery(name = "NotasPedidoDet.findByEntregaCompleta", query = "SELECT n FROM NotasPedidoDet n WHERE n.entregaCompleta = :entregaCompleta")
    , @NamedQuery(name = "NotasPedidoDet.findByPrecioUnitarioVentaReal", query = "SELECT n FROM NotasPedidoDet n WHERE n.precioUnitarioVentaReal = :precioUnitarioVentaReal")
    , @NamedQuery(name = "NotasPedidoDet.findByPrecioUnitarioVenta", query = "SELECT n FROM NotasPedidoDet n WHERE n.precioUnitarioVenta = :precioUnitarioVenta")
    , @NamedQuery(name = "NotasPedidoDet.findBySolicitudCompraId", query = "SELECT n FROM NotasPedidoDet n WHERE n.solicitudCompraId = :solicitudCompraId")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class NotasPedidoDet implements Serializable {

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
    @Column(name = "exonerado")
    private boolean exonerado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regalo")
    private boolean regalo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "producto_id")
    private int productoId;
    @Column(name = "producto_cambio_id")
    private Integer productoCambioId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_unitario_producto")
    private BigDecimal precioUnitarioProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_unitario_nota")
    private BigDecimal precioUnitarioNota;
    @Column(name = "cantidad_entregada")
    private BigDecimal cantidadEntregada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entrega_completa")
    private boolean entregaCompleta;
    @Column(name = "precio_unitario_venta_real")
    private BigDecimal precioUnitarioVentaReal;
    @Column(name = "precio_unitario_venta")
    private BigDecimal precioUnitarioVenta;
    @Column(name = "solicitud_compra_id")
    private Integer solicitudCompraId;
    @JoinColumn(name = "nota_pedido_id", referencedColumnName = "id")
    @ManyToOne
    private NotasPedidoCab notaPedidoId;

    public NotasPedidoDet() {
    }

    public NotasPedidoDet(Integer id) {
        this.id = id;
    }

    public NotasPedidoDet(Integer id, Date creado, int creadoPor, Inet creadoIp, boolean exonerado, boolean regalo, int productoId, BigDecimal cantidad, BigDecimal precioUnitarioProducto, BigDecimal precioUnitarioNota, boolean entregaCompleta) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.creadoIp = creadoIp;
        this.exonerado = exonerado;
        this.regalo = regalo;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnitarioProducto = precioUnitarioProducto;
        this.precioUnitarioNota = precioUnitarioNota;
        this.entregaCompleta = entregaCompleta;
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

    public boolean getExonerado() {
        return exonerado;
    }

    public void setExonerado(boolean exonerado) {
        this.exonerado = exonerado;
    }

    public boolean getRegalo() {
        return regalo;
    }

    public void setRegalo(boolean regalo) {
        this.regalo = regalo;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public Integer getProductoCambioId() {
        return productoCambioId;
    }

    public void setProductoCambioId(Integer productoCambioId) {
        this.productoCambioId = productoCambioId;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitarioProducto() {
        return precioUnitarioProducto;
    }

    public void setPrecioUnitarioProducto(BigDecimal precioUnitarioProducto) {
        this.precioUnitarioProducto = precioUnitarioProducto;
    }

    public BigDecimal getPrecioUnitarioNota() {
        return precioUnitarioNota;
    }

    public void setPrecioUnitarioNota(BigDecimal precioUnitarioNota) {
        this.precioUnitarioNota = precioUnitarioNota;
    }

    public BigDecimal getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(BigDecimal cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    public boolean getEntregaCompleta() {
        return entregaCompleta;
    }

    public void setEntregaCompleta(boolean entregaCompleta) {
        this.entregaCompleta = entregaCompleta;
    }

    public BigDecimal getPrecioUnitarioVentaReal() {
        return precioUnitarioVentaReal;
    }

    public void setPrecioUnitarioVentaReal(BigDecimal precioUnitarioVentaReal) {
        this.precioUnitarioVentaReal = precioUnitarioVentaReal;
    }

    public BigDecimal getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(BigDecimal precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public Integer getSolicitudCompraId() {
        return solicitudCompraId;
    }

    public void setSolicitudCompraId(Integer solicitudCompraId) {
        this.solicitudCompraId = solicitudCompraId;
    }

    public NotasPedidoCab getNotaPedidoId() {
        return notaPedidoId;
    }

    public void setNotaPedidoId(NotasPedidoCab notaPedidoId) {
        this.notaPedidoId = notaPedidoId;
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
        if (!(object instanceof NotasPedidoDet)) {
            return false;
        }
        NotasPedidoDet other = (NotasPedidoDet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.NotasPedidoDet[ id=" + id + " ]";
    }
    
}
