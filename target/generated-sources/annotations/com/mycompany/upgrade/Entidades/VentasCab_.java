package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.NotasPedidoCab;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(VentasCab.class)
public class VentasCab_ { 

    public static volatile SingularAttribute<VentasCab, Integer> direccionClienteId;
    public static volatile SingularAttribute<VentasCab, Integer> numero;
    public static volatile SingularAttribute<VentasCab, Integer> formaPagoId;
    public static volatile SingularAttribute<VentasCab, Integer> diasCredito;
    public static volatile SingularAttribute<VentasCab, Boolean> anulada;
    public static volatile SingularAttribute<VentasCab, Integer> editadoPor;
    public static volatile SingularAttribute<VentasCab, BigDecimal> montoCobrar;
    public static volatile CollectionAttribute<VentasCab, NotasPedidoCab> notasPedidoCabCollection;
    public static volatile SingularAttribute<VentasCab, Integer> creadoPor;
    public static volatile SingularAttribute<VentasCab, BigDecimal> total;
    public static volatile SingularAttribute<VentasCab, String> ordenCompraCliente;
    public static volatile SingularAttribute<VentasCab, Date> editado;
    public static volatile SingularAttribute<VentasCab, Integer> id;
    public static volatile SingularAttribute<VentasCab, Integer> empresaId;
    public static volatile SingularAttribute<VentasCab, Inet> creadoIp;
    public static volatile SingularAttribute<VentasCab, String> firma;
    public static volatile SingularAttribute<VentasCab, Integer> impuestoId;
    public static volatile SingularAttribute<VentasCab, Integer> documentoTipoId;
    public static volatile SingularAttribute<VentasCab, BigDecimal> montoCobrado;
    public static volatile SingularAttribute<VentasCab, Date> fecha;
    public static volatile SingularAttribute<VentasCab, Inet> editadoIp;
    public static volatile SingularAttribute<VentasCab, Date> creado;
    public static volatile SingularAttribute<VentasCab, Integer> almacenId;
    public static volatile SingularAttribute<VentasCab, Integer> monedaId;
    public static volatile SingularAttribute<VentasCab, BigDecimal> subtotal;
    public static volatile SingularAttribute<VentasCab, Integer> serie;
    public static volatile SingularAttribute<VentasCab, String> observaciones;
    public static volatile SingularAttribute<VentasCab, Integer> vendedorId;
    public static volatile SingularAttribute<VentasCab, BigDecimal> montoImpuesto;

}