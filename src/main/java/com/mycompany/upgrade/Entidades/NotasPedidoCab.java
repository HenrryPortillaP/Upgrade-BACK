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
@Table(name = "cmrlz.notas_pedido_cab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NotasPedidoCab.findAll", query = "SELECT n FROM NotasPedidoCab n")
    , @NamedQuery(name = "NotasPedidoCab.findByCreado", query = "SELECT n FROM NotasPedidoCab n WHERE n.creado = :creado")
    , @NamedQuery(name = "NotasPedidoCab.findByCreadoPor", query = "SELECT n FROM NotasPedidoCab n WHERE n.creadoPor = :creadoPor")
    , @NamedQuery(name = "NotasPedidoCab.findByEditado", query = "SELECT n FROM NotasPedidoCab n WHERE n.editado = :editado")
    , @NamedQuery(name = "NotasPedidoCab.findByEditadoPor", query = "SELECT n FROM NotasPedidoCab n WHERE n.editadoPor = :editadoPor")
    , @NamedQuery(name = "NotasPedidoCab.findById", query = "SELECT n FROM NotasPedidoCab n WHERE n.id = :id")
    , @NamedQuery(name = "NotasPedidoCab.findByNumero", query = "SELECT n FROM NotasPedidoCab n WHERE n.numero = :numero")
    , @NamedQuery(name = "NotasPedidoCab.findByFecha", query = "SELECT n FROM NotasPedidoCab n WHERE n.fecha = :fecha")
    , @NamedQuery(name = "NotasPedidoCab.findByAnulada", query = "SELECT n FROM NotasPedidoCab n WHERE n.anulada = :anulada")
    , @NamedQuery(name = "NotasPedidoCab.findByDireccionClienteId", query = "SELECT n FROM NotasPedidoCab n WHERE n.direccionClienteId = :direccionClienteId")
    , @NamedQuery(name = "NotasPedidoCab.findByVendedorId", query = "SELECT n FROM NotasPedidoCab n WHERE n.vendedorId = :vendedorId")
    , @NamedQuery(name = "NotasPedidoCab.findByMonedaId", query = "SELECT n FROM NotasPedidoCab n WHERE n.monedaId = :monedaId")
    , @NamedQuery(name = "NotasPedidoCab.findByCerrada", query = "SELECT n FROM NotasPedidoCab n WHERE n.cerrada = :cerrada")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobada", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobada = :aprobada")
    , @NamedQuery(name = "NotasPedidoCab.findByFormaPagoId", query = "SELECT n FROM NotasPedidoCab n WHERE n.formaPagoId = :formaPagoId")
    , @NamedQuery(name = "NotasPedidoCab.findByAlmacenId", query = "SELECT n FROM NotasPedidoCab n WHERE n.almacenId = :almacenId")
    , @NamedQuery(name = "NotasPedidoCab.findByFechaEntrega", query = "SELECT n FROM NotasPedidoCab n WHERE n.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "NotasPedidoCab.findByObservaciones", query = "SELECT n FROM NotasPedidoCab n WHERE n.observaciones = :observaciones")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadoSinAdelanto", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadoSinAdelanto = :aprobadoSinAdelanto")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadoSinAdelantoPorId", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadoSinAdelantoPorId = :aprobadoSinAdelantoPorId")
    , @NamedQuery(name = "NotasPedidoCab.findByTotalMinimo", query = "SELECT n FROM NotasPedidoCab n WHERE n.totalMinimo = :totalMinimo")
    , @NamedQuery(name = "NotasPedidoCab.findByTotal", query = "SELECT n FROM NotasPedidoCab n WHERE n.total = :total")
    , @NamedQuery(name = "NotasPedidoCab.findByMontoAdelanto", query = "SELECT n FROM NotasPedidoCab n WHERE n.montoAdelanto = :montoAdelanto")
    , @NamedQuery(name = "NotasPedidoCab.findByUtilidadMinima", query = "SELECT n FROM NotasPedidoCab n WHERE n.utilidadMinima = :utilidadMinima")
    , @NamedQuery(name = "NotasPedidoCab.findByComision", query = "SELECT n FROM NotasPedidoCab n WHERE n.comision = :comision")
    , @NamedQuery(name = "NotasPedidoCab.findByComisionMontoUsado", query = "SELECT n FROM NotasPedidoCab n WHERE n.comisionMontoUsado = :comisionMontoUsado")
    , @NamedQuery(name = "NotasPedidoCab.findByTotalSinComision", query = "SELECT n FROM NotasPedidoCab n WHERE n.totalSinComision = :totalSinComision")
    , @NamedQuery(name = "NotasPedidoCab.findByDiasCredito", query = "SELECT n FROM NotasPedidoCab n WHERE n.diasCredito = :diasCredito")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobacionComentario", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobacionComentario = :aprobacionComentario")
    , @NamedQuery(name = "NotasPedidoCab.findByAlmacenEntregaId", query = "SELECT n FROM NotasPedidoCab n WHERE n.almacenEntregaId = :almacenEntregaId")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadoEn", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadoEn = :aprobadoEn")
    , @NamedQuery(name = "NotasPedidoCab.findByTotalReal", query = "SELECT n FROM NotasPedidoCab n WHERE n.totalReal = :totalReal")
    , @NamedQuery(name = "NotasPedidoCab.findByDeComision", query = "SELECT n FROM NotasPedidoCab n WHERE n.deComision = :deComision")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadoCredito", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadoCredito = :aprobadoCredito")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadoCreditoComentario", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadoCreditoComentario = :aprobadoCreditoComentario")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadoCreditoAprobador", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadoCreditoAprobador = :aprobadoCreditoAprobador")
    , @NamedQuery(name = "NotasPedidoCab.findByCotizacionId", query = "SELECT n FROM NotasPedidoCab n WHERE n.cotizacionId = :cotizacionId")
    , @NamedQuery(name = "NotasPedidoCab.findByAprobadorUtilidad", query = "SELECT n FROM NotasPedidoCab n WHERE n.aprobadorUtilidad = :aprobadorUtilidad")
    , @NamedQuery(name = "NotasPedidoCab.findByFechaAprobacionUtilidad", query = "SELECT n FROM NotasPedidoCab n WHERE n.fechaAprobacionUtilidad = :fechaAprobacionUtilidad")
    , @NamedQuery(name = "NotasPedidoCab.findByUnidadNegocioId", query = "SELECT n FROM NotasPedidoCab n WHERE n.unidadNegocioId = :unidadNegocioId")
    , @NamedQuery(name = "NotasPedidoCab.findByVendedorAtendedor", query = "SELECT n FROM NotasPedidoCab n WHERE n.vendedorAtendedor = :vendedorAtendedor")
    , @NamedQuery(name = "NotasPedidoCab.findByDescargado", query = "SELECT n FROM NotasPedidoCab n WHERE n.descargado = :descargado")
    , @NamedQuery(name = "NotasPedidoCab.findByComisionTerceros", query = "SELECT n FROM NotasPedidoCab n WHERE n.comisionTerceros = :comisionTerceros")
    , @NamedQuery(name = "NotasPedidoCab.findByCategoria", query = "SELECT n FROM NotasPedidoCab n WHERE n.categoria = :categoria")
    , @NamedQuery(name = "NotasPedidoCab.findByOrdenCompraCliente", query = "SELECT n FROM NotasPedidoCab n WHERE n.ordenCompraCliente = :ordenCompraCliente")
    , @NamedQuery(name = "NotasPedidoCab.findByEditDetalles", query = "SELECT n FROM NotasPedidoCab n WHERE n.editDetalles = :editDetalles")
    , @NamedQuery(name = "NotasPedidoCab.findByEsComision", query = "SELECT n FROM NotasPedidoCab n WHERE n.esComision = :esComision")
    , @NamedQuery(name = "NotasPedidoCab.findByGastosOperativos", query = "SELECT n FROM NotasPedidoCab n WHERE n.gastosOperativos = :gastosOperativos")
    , @NamedQuery(name = "NotasPedidoCab.findByEsGastoOperativo", query = "SELECT n FROM NotasPedidoCab n WHERE n.esGastoOperativo = :esGastoOperativo")
    , @NamedQuery(name = "NotasPedidoCab.findByDescripcionGastos", query = "SELECT n FROM NotasPedidoCab n WHERE n.descripcionGastos = :descripcionGastos")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class NotasPedidoCab implements Serializable {

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
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anulada")
    private boolean anulada;
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
    @Column(name = "cerrada")
    private boolean cerrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aprobada")
    private boolean aprobada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forma_pago_id")
    private int formaPagoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "almacen_id")
    private int almacenId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aprobado_sin_adelanto")
    private boolean aprobadoSinAdelanto;
    @Column(name = "aprobado_sin_adelanto_por_id")
    private Integer aprobadoSinAdelantoPorId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_minimo")
    private BigDecimal totalMinimo;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "monto_adelanto")
    private BigDecimal montoAdelanto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "utilidad_minima")
    private BigDecimal utilidadMinima;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comision")
    private boolean comision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comision_monto_usado")
    private BigDecimal comisionMontoUsado;
    @Column(name = "total_sin_comision")
    private BigDecimal totalSinComision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dias_credito")
    private int diasCredito;
    @Size(max = 2147483647)
    @Column(name = "aprobacion_comentario")
    private String aprobacionComentario;
    @Column(name = "almacen_entrega_id")
    private Integer almacenEntregaId;
    @Column(name = "aprobado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aprobadoEn;
    @Column(name = "total_real")
    private BigDecimal totalReal;
    @Column(name = "de_comision")
    private Boolean deComision;
    @Column(name = "aprobado_credito")
    private Boolean aprobadoCredito;
    @Size(max = 2147483647)
    @Column(name = "aprobado_credito_comentario")
    private String aprobadoCreditoComentario;
    @Column(name = "aprobado_credito_aprobador")
    private Integer aprobadoCreditoAprobador;
    @Column(name = "cotizacion_id")
    private Integer cotizacionId;
    @Column(name = "aprobador_utilidad")
    private Integer aprobadorUtilidad;
    @Column(name = "fecha_aprobacion_utilidad")
    @Temporal(TemporalType.DATE)
    private Date fechaAprobacionUtilidad;
    @Column(name = "unidad_negocio_id")
    private Integer unidadNegocioId;
    @Column(name = "vendedor_atendedor")
    private Integer vendedorAtendedor;
    @Column(name = "descargado")
    private Boolean descargado;
    @Column(name = "comision_terceros")
    private BigDecimal comisionTerceros;
    @Column(name = "categoria")
    private Character categoria;
    @Size(max = 2147483647)
    @Column(name = "orden_compra_cliente")
    private String ordenCompraCliente;
    @Column(name = "edit_detalles")
    private Integer editDetalles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "es_comision")
    private boolean esComision;
    @Column(name = "gastos_operativos")
    private BigDecimal gastosOperativos;
    @Column(name = "es_gasto_operativo")
    private Boolean esGastoOperativo;
    @Size(max = 2147483647)
    @Column(name = "descripcion_gastos")
    private String descripcionGastos;
    @OneToMany(mappedBy = "notaPedidoId")
    private Collection<NotasPedidoDet> notasPedidoDetCollection;
    @OneToMany(mappedBy = "notaPedidoComisionId")
    private Collection<NotasPedidoCab> notasPedidoCabCollection;
    @JoinColumn(name = "nota_pedido_comision_id", referencedColumnName = "id")
    @ManyToOne
    private NotasPedidoCab notaPedidoComisionId;
    @JoinColumn(name = "preventa_tipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PreventasTipo preventaTipoId;
    @JoinColumn(name = "proforma_id", referencedColumnName = "id")
    @ManyToOne
    private ProformasCab proformaId;
    @JoinColumn(name = "venta_id", referencedColumnName = "id")
    @ManyToOne
    private VentasCab ventaId;

    public NotasPedidoCab() {
    }

    public NotasPedidoCab(Integer id) {
        this.id = id;
    }

    public NotasPedidoCab(Integer id, Date creado, int creadoPor, Inet creadoIp, int numero, Date fecha, boolean anulada, int direccionClienteId, int vendedorId, int monedaId, boolean cerrada, boolean aprobada, int formaPagoId, int almacenId, Date fechaEntrega, boolean aprobadoSinAdelanto, BigDecimal totalMinimo, BigDecimal utilidadMinima, boolean comision, BigDecimal comisionMontoUsado, int diasCredito, boolean esComision) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.creadoIp = creadoIp;
        this.numero = numero;
        this.fecha = fecha;
        this.anulada = anulada;
        this.direccionClienteId = direccionClienteId;
        this.vendedorId = vendedorId;
        this.monedaId = monedaId;
        this.cerrada = cerrada;
        this.aprobada = aprobada;
        this.formaPagoId = formaPagoId;
        this.almacenId = almacenId;
        this.fechaEntrega = fechaEntrega;
        this.aprobadoSinAdelanto = aprobadoSinAdelanto;
        this.totalMinimo = totalMinimo;
        this.utilidadMinima = utilidadMinima;
        this.comision = comision;
        this.comisionMontoUsado = comisionMontoUsado;
        this.diasCredito = diasCredito;
        this.esComision = esComision;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
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

    public boolean getCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public int getFormaPagoId() {
        return formaPagoId;
    }

    public void setFormaPagoId(int formaPagoId) {
        this.formaPagoId = formaPagoId;
    }

    public int getAlmacenId() {
        return almacenId;
    }

    public void setAlmacenId(int almacenId) {
        this.almacenId = almacenId;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean getAprobadoSinAdelanto() {
        return aprobadoSinAdelanto;
    }

    public void setAprobadoSinAdelanto(boolean aprobadoSinAdelanto) {
        this.aprobadoSinAdelanto = aprobadoSinAdelanto;
    }

    public Integer getAprobadoSinAdelantoPorId() {
        return aprobadoSinAdelantoPorId;
    }

    public void setAprobadoSinAdelantoPorId(Integer aprobadoSinAdelantoPorId) {
        this.aprobadoSinAdelantoPorId = aprobadoSinAdelantoPorId;
    }

    public BigDecimal getTotalMinimo() {
        return totalMinimo;
    }

    public void setTotalMinimo(BigDecimal totalMinimo) {
        this.totalMinimo = totalMinimo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getMontoAdelanto() {
        return montoAdelanto;
    }

    public void setMontoAdelanto(BigDecimal montoAdelanto) {
        this.montoAdelanto = montoAdelanto;
    }

    public BigDecimal getUtilidadMinima() {
        return utilidadMinima;
    }

    public void setUtilidadMinima(BigDecimal utilidadMinima) {
        this.utilidadMinima = utilidadMinima;
    }

    public boolean getComision() {
        return comision;
    }

    public void setComision(boolean comision) {
        this.comision = comision;
    }

    public BigDecimal getComisionMontoUsado() {
        return comisionMontoUsado;
    }

    public void setComisionMontoUsado(BigDecimal comisionMontoUsado) {
        this.comisionMontoUsado = comisionMontoUsado;
    }

    public BigDecimal getTotalSinComision() {
        return totalSinComision;
    }

    public void setTotalSinComision(BigDecimal totalSinComision) {
        this.totalSinComision = totalSinComision;
    }

    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public String getAprobacionComentario() {
        return aprobacionComentario;
    }

    public void setAprobacionComentario(String aprobacionComentario) {
        this.aprobacionComentario = aprobacionComentario;
    }

    public Integer getAlmacenEntregaId() {
        return almacenEntregaId;
    }

    public void setAlmacenEntregaId(Integer almacenEntregaId) {
        this.almacenEntregaId = almacenEntregaId;
    }

    public Date getAprobadoEn() {
        return aprobadoEn;
    }

    public void setAprobadoEn(Date aprobadoEn) {
        this.aprobadoEn = aprobadoEn;
    }

    public BigDecimal getTotalReal() {
        return totalReal;
    }

    public void setTotalReal(BigDecimal totalReal) {
        this.totalReal = totalReal;
    }

    public Boolean getDeComision() {
        return deComision;
    }

    public void setDeComision(Boolean deComision) {
        this.deComision = deComision;
    }

    public Boolean getAprobadoCredito() {
        return aprobadoCredito;
    }

    public void setAprobadoCredito(Boolean aprobadoCredito) {
        this.aprobadoCredito = aprobadoCredito;
    }

    public String getAprobadoCreditoComentario() {
        return aprobadoCreditoComentario;
    }

    public void setAprobadoCreditoComentario(String aprobadoCreditoComentario) {
        this.aprobadoCreditoComentario = aprobadoCreditoComentario;
    }

    public Integer getAprobadoCreditoAprobador() {
        return aprobadoCreditoAprobador;
    }

    public void setAprobadoCreditoAprobador(Integer aprobadoCreditoAprobador) {
        this.aprobadoCreditoAprobador = aprobadoCreditoAprobador;
    }

    public Integer getCotizacionId() {
        return cotizacionId;
    }

    public void setCotizacionId(Integer cotizacionId) {
        this.cotizacionId = cotizacionId;
    }

    public Integer getAprobadorUtilidad() {
        return aprobadorUtilidad;
    }

    public void setAprobadorUtilidad(Integer aprobadorUtilidad) {
        this.aprobadorUtilidad = aprobadorUtilidad;
    }

    public Date getFechaAprobacionUtilidad() {
        return fechaAprobacionUtilidad;
    }

    public void setFechaAprobacionUtilidad(Date fechaAprobacionUtilidad) {
        this.fechaAprobacionUtilidad = fechaAprobacionUtilidad;
    }

    public Integer getUnidadNegocioId() {
        return unidadNegocioId;
    }

    public void setUnidadNegocioId(Integer unidadNegocioId) {
        this.unidadNegocioId = unidadNegocioId;
    }

    public Integer getVendedorAtendedor() {
        return vendedorAtendedor;
    }

    public void setVendedorAtendedor(Integer vendedorAtendedor) {
        this.vendedorAtendedor = vendedorAtendedor;
    }

    public Boolean getDescargado() {
        return descargado;
    }

    public void setDescargado(Boolean descargado) {
        this.descargado = descargado;
    }

    public BigDecimal getComisionTerceros() {
        return comisionTerceros;
    }

    public void setComisionTerceros(BigDecimal comisionTerceros) {
        this.comisionTerceros = comisionTerceros;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    public String getOrdenCompraCliente() {
        return ordenCompraCliente;
    }

    public void setOrdenCompraCliente(String ordenCompraCliente) {
        this.ordenCompraCliente = ordenCompraCliente;
    }

    public Integer getEditDetalles() {
        return editDetalles;
    }

    public void setEditDetalles(Integer editDetalles) {
        this.editDetalles = editDetalles;
    }

    public boolean getEsComision() {
        return esComision;
    }

    public void setEsComision(boolean esComision) {
        this.esComision = esComision;
    }

    public BigDecimal getGastosOperativos() {
        return gastosOperativos;
    }

    public void setGastosOperativos(BigDecimal gastosOperativos) {
        this.gastosOperativos = gastosOperativos;
    }

    public Boolean getEsGastoOperativo() {
        return esGastoOperativo;
    }

    public void setEsGastoOperativo(Boolean esGastoOperativo) {
        this.esGastoOperativo = esGastoOperativo;
    }

    public String getDescripcionGastos() {
        return descripcionGastos;
    }

    public void setDescripcionGastos(String descripcionGastos) {
        this.descripcionGastos = descripcionGastos;
    }

    @XmlTransient
    public Collection<NotasPedidoDet> getNotasPedidoDetCollection() {
        return notasPedidoDetCollection;
    }

    public void setNotasPedidoDetCollection(Collection<NotasPedidoDet> notasPedidoDetCollection) {
        this.notasPedidoDetCollection = notasPedidoDetCollection;
    }

    @XmlTransient
    public Collection<NotasPedidoCab> getNotasPedidoCabCollection() {
        return notasPedidoCabCollection;
    }

    public void setNotasPedidoCabCollection(Collection<NotasPedidoCab> notasPedidoCabCollection) {
        this.notasPedidoCabCollection = notasPedidoCabCollection;
    }

    public NotasPedidoCab getNotaPedidoComisionId() {
        return notaPedidoComisionId;
    }

    public void setNotaPedidoComisionId(NotasPedidoCab notaPedidoComisionId) {
        this.notaPedidoComisionId = notaPedidoComisionId;
    }

    public PreventasTipo getPreventaTipoId() {
        return preventaTipoId;
    }

    public void setPreventaTipoId(PreventasTipo preventaTipoId) {
        this.preventaTipoId = preventaTipoId;
    }

    public ProformasCab getProformaId() {
        return proformaId;
    }

    public void setProformaId(ProformasCab proformaId) {
        this.proformaId = proformaId;
    }

    public VentasCab getVentaId() {
        return ventaId;
    }

    public void setVentaId(VentasCab ventaId) {
        this.ventaId = ventaId;
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
        if (!(object instanceof NotasPedidoCab)) {
            return false;
        }
        NotasPedidoCab other = (NotasPedidoCab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.NotasPedidoCab[ id=" + id + " ]";
    }
    
}
