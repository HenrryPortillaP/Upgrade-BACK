package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.Productos;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(ProductosDet.class)
public class ProductosDet_ { 

    public static volatile SingularAttribute<ProductosDet, Boolean> promocion;
    public static volatile SingularAttribute<ProductosDet, Integer> empresaId;
    public static volatile SingularAttribute<ProductosDet, BigDecimal> costo;
    public static volatile SingularAttribute<ProductosDet, Productos> productoId;
    public static volatile SingularAttribute<ProductosDet, Inet> creadoIp;
    public static volatile SingularAttribute<ProductosDet, Integer> percepcionId;
    public static volatile SingularAttribute<ProductosDet, BigDecimal> utilidad;
    public static volatile SingularAttribute<ProductosDet, Boolean> inactivo;
    public static volatile SingularAttribute<ProductosDet, Integer> impuestoId;
    public static volatile SingularAttribute<ProductosDet, Integer> editadoPor;
    public static volatile SingularAttribute<ProductosDet, Integer> creadoPor;
    public static volatile SingularAttribute<ProductosDet, Inet> editadoIp;
    public static volatile SingularAttribute<ProductosDet, Date> creado;
    public static volatile SingularAttribute<ProductosDet, Boolean> garantizable;
    public static volatile SingularAttribute<ProductosDet, Date> editado;
    public static volatile SingularAttribute<ProductosDet, Integer> monedaId;
    public static volatile SingularAttribute<ProductosDet, Boolean> regalo;
    public static volatile SingularAttribute<ProductosDet, Integer> id;
    public static volatile SingularAttribute<ProductosDet, Integer> garantiaDuracion;

}