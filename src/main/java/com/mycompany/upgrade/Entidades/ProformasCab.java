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
@Table(name = "proformas_cab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProformasCab.findAll", query = "SELECT p FROM ProformasCab p")
    , @NamedQuery(name = "ProformasCab.findByCreado", query = "SELECT p FROM ProformasCab p WHERE p.creado = :creado")
    , @NamedQuery(name = "ProformasCab.findByCreadoPor", query = "SELECT p FROM ProformasCab p WHERE p.creadoPor = :creadoPor")
    , @NamedQuery(name = "ProformasCab.findByEditado", query = "SELECT p FROM ProformasCab p WHERE p.editado = :editado")
    , @NamedQuery(name = "ProformasCab.findByEditadoPor", query = "SELECT p FROM ProformasCab p WHERE p.editadoPor = :editadoPor")
    , @NamedQuery(name = "ProformasCab.findById", query = "SELECT p FROM ProformasCab p WHERE p.id = :id")
    , @NamedQuery(name = "ProformasCab.findBySucursalId", query = "SELECT p FROM ProformasCab p WHERE p.sucursalId = :sucursalId")
    , @NamedQuery(name = "ProformasCab.findByNumero", query = "SELECT p FROM ProformasCab p WHERE p.numero = :numero")
    , @NamedQuery(name = "ProformasCab.findByMonedaId", query = "SELECT p FROM ProformasCab p WHERE p.monedaId = :monedaId")
    , @NamedQuery(name = "ProformasCab.findByDireccionClienteId", query = "SELECT p FROM ProformasCab p WHERE p.direccionClienteId = :direccionClienteId")
    , @NamedQuery(name = "ProformasCab.findByVendedorId", query = "SELECT p FROM ProformasCab p WHERE p.vendedorId = :vendedorId")
    , @NamedQuery(name = "ProformasCab.findByFecha", query = "SELECT p FROM ProformasCab p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "ProformasCab.findByValidez", query = "SELECT p FROM ProformasCab p WHERE p.validez = :validez")
    , @NamedQuery(name = "ProformasCab.findByAnulada", query = "SELECT p FROM ProformasCab p WHERE p.anulada = :anulada")
    , @NamedQuery(name = "ProformasCab.findByFormaPagoId", query = "SELECT p FROM ProformasCab p WHERE p.formaPagoId = :formaPagoId")
    , @NamedQuery(name = "ProformasCab.findByTotal", query = "SELECT p FROM ProformasCab p WHERE p.total = :total")})
@TypeDef(
    name = "ipv4", 
    typeClass = PostgreSQLInetType.class, 
    defaultForType = Inet.class
)
public class ProformasCab implements Serializable {

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
    @Column(name = "creado_ip")
    private Inet creadoIp;
    @Column(name = "editado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editado;
    @Column(name = "editado_por")
    private Integer editadoPor;
    @Lob
    @Column(name = "editado_ip")
    private Inet editadoIp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "sucursal_id")
    private Integer sucursalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moneda_id")
    private int monedaId;
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
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "validez")
    private int validez;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anulada")
    private boolean anulada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forma_pago_id")
    private int formaPagoId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
    @JoinColumn(name = "preventa_tipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PreventasTipo preventaTipoId;
    @OneToMany(mappedBy = "proformaId")
    private Collection<NotasPedidoCab> notasPedidoCabCollection;

    public ProformasCab() {
    }

    public ProformasCab(Integer id) {
        this.id = id;
    }

    public ProformasCab(Integer id, Date creado, int creadoPor, Inet creadoIp, String numero, int monedaId, int direccionClienteId, int vendedorId, Date fecha, int validez, boolean anulada, int formaPagoId, BigDecimal total) {
        this.id = id;
        this.creado = creado;
        this.creadoPor = creadoPor;
        this.creadoIp = creadoIp;
        this.numero = numero;
        this.monedaId = monedaId;
        this.direccionClienteId = direccionClienteId;
        this.vendedorId = vendedorId;
        this.fecha = fecha;
        this.validez = validez;
        this.anulada = anulada;
        this.formaPagoId = formaPagoId;
        this.total = total;
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

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getMonedaId() {
        return monedaId;
    }

    public void setMonedaId(int monedaId) {
        this.monedaId = monedaId;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValidez() {
        return validez;
    }

    public void setValidez(int validez) {
        this.validez = validez;
    }

    public boolean getAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    public int getFormaPagoId() {
        return formaPagoId;
    }

    public void setFormaPagoId(int formaPagoId) {
        this.formaPagoId = formaPagoId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PreventasTipo getPreventaTipoId() {
        return preventaTipoId;
    }

    public void setPreventaTipoId(PreventasTipo preventaTipoId) {
        this.preventaTipoId = preventaTipoId;
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
        if (!(object instanceof ProformasCab)) {
            return false;
        }
        ProformasCab other = (ProformasCab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.upgrade.Entidades.ProformasCab[ id=" + id + " ]";
    }
    
}
