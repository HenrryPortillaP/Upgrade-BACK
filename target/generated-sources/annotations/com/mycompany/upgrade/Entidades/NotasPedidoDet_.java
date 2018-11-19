package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.NotasPedidoCab;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(NotasPedidoDet.class)
public class NotasPedidoDet_ { 

    public static volatile SingularAttribute<NotasPedidoDet, BigDecimal> precioUnitarioNota;
    public static volatile SingularAttribute<NotasPedidoDet, Boolean> entregaCompleta;
    public static volatile SingularAttribute<NotasPedidoDet, Integer> productoCambioId;
    public static volatile SingularAttribute<NotasPedidoDet, Integer> productoId;
    public static volatile SingularAttribute<NotasPedidoDet, Inet> creadoIp;
    public static volatile SingularAttribute<NotasPedidoDet, NotasPedidoCab> notaPedidoId;
    public static volatile SingularAttribute<NotasPedidoDet, Integer> editadoPor;
    public static volatile SingularAttribute<NotasPedidoDet, Integer> creadoPor;
    public static volatile SingularAttribute<NotasPedidoDet, BigDecimal> precioUnitarioVenta;
    public static volatile SingularAttribute<NotasPedidoDet, Inet> editadoIp;
    public static volatile SingularAttribute<NotasPedidoDet, BigDecimal> precioUnitarioVentaReal;
    public static volatile SingularAttribute<NotasPedidoDet, Date> creado;
    public static volatile SingularAttribute<NotasPedidoDet, Integer> solicitudCompraId;
    public static volatile SingularAttribute<NotasPedidoDet, Date> editado;
    public static volatile SingularAttribute<NotasPedidoDet, BigDecimal> cantidadEntregada;
    public static volatile SingularAttribute<NotasPedidoDet, Boolean> exonerado;
    public static volatile SingularAttribute<NotasPedidoDet, Boolean> regalo;
    public static volatile SingularAttribute<NotasPedidoDet, Integer> id;
    public static volatile SingularAttribute<NotasPedidoDet, BigDecimal> cantidad;
    public static volatile SingularAttribute<NotasPedidoDet, BigDecimal> precioUnitarioProducto;

}