package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.NotasPedidoCab;
import com.mycompany.upgrade.Entidades.NotasPedidoDet;
import com.mycompany.upgrade.Entidades.PreventasTipo;
import com.mycompany.upgrade.Entidades.ProformasCab;
import com.mycompany.upgrade.Entidades.VentasCab;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(NotasPedidoCab.class)
public class NotasPedidoCab_ { 

    public static volatile SingularAttribute<NotasPedidoCab, Integer> unidadNegocioId;
    public static volatile SingularAttribute<NotasPedidoCab, PreventasTipo> preventaTipoId;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> montoAdelanto;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> aprobadorUtilidad;
    public static volatile SingularAttribute<NotasPedidoCab, NotasPedidoCab> notaPedidoComisionId;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> formaPagoId;
    public static volatile SingularAttribute<NotasPedidoCab, Date> fechaAprobacionUtilidad;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> diasCredito;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> anulada;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> editadoPor;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> creadoPor;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> aprobadoSinAdelanto;
    public static volatile SingularAttribute<NotasPedidoCab, String> aprobacionComentario;
    public static volatile SingularAttribute<NotasPedidoCab, String> ordenCompraCliente;
    public static volatile CollectionAttribute<NotasPedidoCab, NotasPedidoDet> notasPedidoDetCollection;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> totalReal;
    public static volatile SingularAttribute<NotasPedidoCab, Date> editado;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> aprobadoSinAdelantoPorId;
    public static volatile SingularAttribute<NotasPedidoCab, ProformasCab> proformaId;
    public static volatile SingularAttribute<NotasPedidoCab, Date> fechaEntrega;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> id;
    public static volatile SingularAttribute<NotasPedidoCab, String> aprobadoCreditoComentario;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> cotizacionId;
    public static volatile SingularAttribute<NotasPedidoCab, Inet> creadoIp;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> editDetalles;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> deComision;
    public static volatile SingularAttribute<NotasPedidoCab, Date> fecha;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> almacenEntregaId;
    public static volatile SingularAttribute<NotasPedidoCab, String> observaciones;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> vendedorAtendedor;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> gastosOperativos;
    public static volatile SingularAttribute<NotasPedidoCab, VentasCab> ventaId;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> descargado;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> direccionClienteId;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> aprobadoCreditoAprobador;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> esGastoOperativo;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> numero;
    public static volatile CollectionAttribute<NotasPedidoCab, NotasPedidoCab> notasPedidoCabCollection;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> aprobadoCredito;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> total;
    public static volatile SingularAttribute<NotasPedidoCab, String> descripcionGastos;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> totalMinimo;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> comision;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> utilidadMinima;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> comisionMontoUsado;
    public static volatile SingularAttribute<NotasPedidoCab, Date> aprobadoEn;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> cerrada;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> comisionTerceros;
    public static volatile SingularAttribute<NotasPedidoCab, Character> categoria;
    public static volatile SingularAttribute<NotasPedidoCab, BigDecimal> totalSinComision;
    public static volatile SingularAttribute<NotasPedidoCab, Inet> editadoIp;
    public static volatile SingularAttribute<NotasPedidoCab, Date> creado;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> almacenId;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> monedaId;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> aprobada;
    public static volatile SingularAttribute<NotasPedidoCab, Integer> vendedorId;
    public static volatile SingularAttribute<NotasPedidoCab, Boolean> esComision;

}