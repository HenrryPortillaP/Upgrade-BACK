package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.Lineas;
import com.mycompany.upgrade.Entidades.Marcas;
import com.mycompany.upgrade.Entidades.Productos;
import com.mycompany.upgrade.Entidades.ProductosDet;
import com.mycompany.upgrade.Entidades.ProductosTipo;
import com.mycompany.upgrade.Entidades.Unidades;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Boolean> rotativo;
    public static volatile CollectionAttribute<Productos, Productos> productosCollection;
    public static volatile SingularAttribute<Productos, Boolean> inactivo;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile SingularAttribute<Productos, Integer> editadoPor;
    public static volatile SingularAttribute<Productos, Integer> creadoPor;
    public static volatile SingularAttribute<Productos, Date> editado;
    public static volatile SingularAttribute<Productos, Boolean> regalo;
    public static volatile SingularAttribute<Productos, Productos> productoOrigenId;
    public static volatile SingularAttribute<Productos, Integer> id;
    public static volatile SingularAttribute<Productos, ProductosTipo> productoTipoId;
    public static volatile SingularAttribute<Productos, Unidades> unidadId;
    public static volatile CollectionAttribute<Productos, ProductosDet> productosDetCollection;
    public static volatile SingularAttribute<Productos, String> codigo;
    public static volatile SingularAttribute<Productos, Boolean> servicio;
    public static volatile SingularAttribute<Productos, Lineas> lineaId;
    public static volatile SingularAttribute<Productos, BigDecimal> peso;
    public static volatile SingularAttribute<Productos, Boolean> divisible;
    public static volatile SingularAttribute<Productos, Inet> creadoIp;
    public static volatile SingularAttribute<Productos, Unidades> divisibleUnidadId;
    public static volatile SingularAttribute<Productos, String> modelo;
    public static volatile SingularAttribute<Productos, BigDecimal> divisibleCantidad;
    public static volatile SingularAttribute<Productos, Inet> editadoIp;
    public static volatile SingularAttribute<Productos, Date> creado;
    public static volatile SingularAttribute<Productos, Marcas> marcaId;

}