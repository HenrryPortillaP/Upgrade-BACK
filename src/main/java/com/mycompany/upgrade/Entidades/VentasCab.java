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
@Table(name = "ventas_cab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentasCab.findAll", query = "SELECT v FROM VentasCab v")
    , @NamedQuery(name = "VentasCab.findByCreado", query = "SELECT v FROM VentasCab v WHERE v.creado = :creado")
    , @NamedQuery(name = "VentasCab.findByCreadoPor", query = "SELECT v FROM VentasCab v WHERE v.creadoPor = :creadoPor")
    , @NamedQuery(name = "VentasCab.findByEditado", query = "SELECT v FROM VentasCab v WHERE v.editado = :editado")
    , @NamedQuery(name = "VentasCab.findByEditadoPor", query = "SELECT v FROM VentasCab v WHERE v.editadoPor = :editadoPor")
    , @NamedQuery(name = "VentasCab.findById", query = "SELECT v FROM VentasCab v WHERE v.id = :id")
    , @NamedQuery(name = "VentasCab.findByAnulada", query = "SELECT v FROM VentasCab v WHERE v.anulada = :anulada")
    , @NamedQuery(name = "VentasCab.findByAlmacenId", query = "SELECT v FROM VentasCab v WHERE v.almacenId = :almacenId")
    , @NamedQuery(name = "VentasCab.findByDocumentoTipoId", query = "SELECT v FROM VentasCab v WHERE v.documentoTipoId = :documentoTipoId")
    , @NamedQuery(name = "VentasCab.findBySerie", query = "SELECT v FROM VentasCab v WHERE v.serie = :serie")
    , @NamedQuery(name = "VentasCab.findByNumero", query = "SELECT v FROM VentasCab v WHERE v.numero = :numero")
    , @NamedQuery(name = "VentasCab.findByDireccionClienteId", query = "SELECT v FROM VentasCab v WHERE v.direccionClienteId = :direccionClienteId")
    , @NamedQuery(name = "VentasCab.findByVendedorId", query = "SELECT v FROM VentasCab v WHERE v.vendedorId = :vendedorId")
    , @NamedQuery(name = "VentasCab.findByMonedaId", query = "SELECT v FROM VentasCab v WHERE v.monedaId = :monedaId")
    , @NamedQuery(name = "VentasCab.findByFecha", query = "SELECT v FROM VentasCab v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "VentasCab.findByFormaPagoId", query = "SELECT v FROM VentasCab v WHERE v.formaPagoId = :formaPagoId")
    , @NamedQuery(name = "VentasCab.findByImpuestoId", query = "SELECT v FROM VentasCab v WHERE v.impuestoId = :impuestoId")
    , @NamedQuery(name = "VentasCab.findByObservaciones", query = "SELECT v FROM VentasCab v WHERE v.observaciones = :observaciones")
    , @NamedQuery(name = "VentasCab.findByMontoImpuesto", query = "SELECT v FROM VentasCab v WHERE v.montoImpuesto = :montoImpuesto")
    , @NamedQuery(name = "VentasCab.findBySubtotal", query = "SELECT v FROM VentasCab v WHERE v.subtotal = :subtotal")
    , @NamedQuery(name = "VentasCab.findByTotal", query = "SELECT v FROM VentasCab v WHERE v.total = :total")
    , @NamedQuery(name = "VentasCab.findByMontoCobrar", query = "SELECT v FROM VentasCab v WHERE v.montoCobrar = :montoCobrar")
    , @NamedQuery(name = "VentasCab.findByMontoCobrado", query = "SELECT v FROM VentasCab v WHERE v.montoCobrado = :montoCobrado")
    , @NamedQuery(name = "VentasCab.findByDiasCredito", query = "SELECT v FROM VentasCab v WHERE v.diasCredito = :diasCredito")
    , @NamedQuery(name = "VentasCab.findByEmpresaId", query = "SELECT v FROM VentasCab v WHERE v.empresaId = :empresaId")
    , @NamedQuery(name = "VentasCab.findByFirma", query = "SELECT v FROM VentasCab v WHERE v.firma = :firma")
    , @NamedQuery(name = "VentasCab.findByOrdenCompraCliente", query = "SELECT v FROM VentasCab v WHERE v.ordenCompraCliente = :ordenCompraCliente")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class VentasCab implements Serializable {

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
    @Column(name = "anulada")
    private boolean anulada;
    @Column(name = "almacen_id")
    private Integer almacenId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "documento_tipo_id")
    private int documentoTipoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "serie")
    private int serie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "direccion_cliente_id")
    private int direccionClienteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vendedor_id")
    private int vendedorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moneda_id")
    private int monedaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forma_pago_id")
    private int formaPagoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "impuesto_id")
    private int impuestoId;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_impuesto")
    private BigDecimal montoImpuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_cobrar")
    private BigDecimal montoCobrar;
    @Column(name = "monto_cobrado")
    private BigDecimal montoCobrado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dias_credito")
    private int diasCredito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empresa_id")
    private int empresaId;
    @Size(max = 2147483647)
    @Column(name = "firma")
    private String firma;
    @Size(max = 2147483647)
    @Column(name = "orden_compra_cliente")
    private String ordenCompraCliente;
    @OneToMany(mappedBy = "ventaId")
    private Collection<NotasPedidoCab> notasPedidoCabCollection;

    public VentasCab() {
    }

    public VentasCab(Integer id) {
        this.id = id;
    }

    public VentasCab(Integer id, Date creado, int creadoPor, Inet creadoIp, boolean anulada, int documentoTipoId, int serie, int numero, int direccionClienteId, int vendedorId, int monedaId, Date fecha, int formaPagoId, int impuestoId, BigDecimal montoImpuesto, BigDecimal subtotal, BigDecimal total, BigDecimal montoCobrar, int diasCredito, int empresaId) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.creadoIp = creadoIp;
        this.anulada = anulada;
        this.documentoTipoId = documentoTipoId;
        this.serie = serie;
        this.numero = numero;
        this.direccionClienteId = direccionClienteId;
        this.vendedorId = vendedorId;
        this.monedaId = monedaId;
        this.fecha = fecha;
        this.formaPagoId = formaPagoId;
        this.impuestoId = impuestoId;
        this.montoImpuesto = montoImpuesto;
        this.subtotal = subtotal;
        this.total = total;
        this.montoCobrar = montoCobrar;
        this.diasCredito = diasCredito;
        this.empresaId = empresaId;
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

    public boolean getAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    public Integer getAlmacenId() {
        return almacenId;
    }

    public void setAlmacenId(Integer almacenId) {
        this.almacenId = almacenId;
    }

    public int getDocumentoTipoId() {
        return documentoTipoId;
    }

    public void setDocumentoTipoId(int documentoTipoId) {
        this.documentoTipoId = documentoTipoId;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDireccionClienteId() {
        return direccionClienteId;
    }

    public void setDireccionClienteId(int direccionClienteId) {
        this.direccionClienteId = direccionClienteId;
    }

    public int getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(int vendedorId) {
        this.vendedorId = vendedorId;
    }

    public int getMonedaId() {
        return monedaId;
    }

    public void setMonedaId(int monedaId) {
        this.monedaId = monedaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getFormaPagoId() {
        return formaPagoId;
    }

    public void setFormaPagoId(int formaPagoId) {
        this.formaPagoId = formaPagoId;
    }

    public int getImpuestoId() {
        return impuestoId;
    }

    public void setImpuestoId(int impuestoId) {
        this.impuestoId = impuestoId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(BigDecimal montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getMontoCobrar() {
        return montoCobrar;
    }

    public void setMontoCobrar(BigDecimal montoCobrar) {
        this.montoCobrar = montoCobrar;
    }

    public BigDecimal getMontoCobrado() {
        return montoCobrado;
    }

    public void setMontoCobrado(BigDecimal montoCobrado) {
        this.montoCobrado = montoCobrado;
    }

    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(int empresaId) {
        this.empresaId = empresaId;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getOrdenCompraCliente() {
        return ordenCompraCliente;
    }

    public void setOrdenCompraCliente(String ordenCompraCliente) {
        this.ordenCompraCliente = ordenCompraCliente;
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
        if (!(object instanceof VentasCab)) {
            return false;
        }
        VentasCab other = (VentasCab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.VentasCab[ id=" + id + " ]";
    }
    
}
