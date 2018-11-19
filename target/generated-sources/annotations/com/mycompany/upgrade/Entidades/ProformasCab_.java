package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.NotasPedidoCab;
import com.mycompany.upgrade.Entidades.PreventasTipo;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(ProformasCab.class)
public class ProformasCab_ { 

    public static volatile SingularAttribute<ProformasCab, Integer> direccionClienteId;
    public static volatile SingularAttribute<ProformasCab, PreventasTipo> preventaTipoId;
    public static volatile SingularAttribute<ProformasCab, String> numero;
    public static volatile SingularAttribute<ProformasCab, Inet> creadoIp;
    public static volatile SingularAttribute<ProformasCab, Integer> sucursalId;
    public static volatile SingularAttribute<ProformasCab, Integer> formaPagoId;
    public static volatile SingularAttribute<ProformasCab, Boolean> anulada;
    public static volatile SingularAttribute<ProformasCab, Integer> editadoPor;
    public static volatile CollectionAttribute<ProformasCab, NotasPedidoCab> notasPedidoCabCollection;
    public static volatile SingularAttribute<ProformasCab, Integer> creadoPor;
    public static volatile SingularAttribute<ProformasCab, Date> fecha;
    public static volatile SingularAttribute<ProformasCab, Inet> editadoIp;
    public static volatile SingularAttribute<ProformasCab, BigDecimal> total;
    public static volatile SingularAttribute<ProformasCab, Date> creado;
    public static volatile SingularAttribute<ProformasCab, Date> editado;
    public static volatile SingularAttribute<ProformasCab, Integer> monedaId;
    public static volatile SingularAttribute<ProformasCab, Integer> validez;
    public static volatile SingularAttribute<ProformasCab, Integer> id;
    public static volatile SingularAttribute<ProformasCab, Integer> vendedorId;

}