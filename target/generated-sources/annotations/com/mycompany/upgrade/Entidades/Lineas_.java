package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.Productos;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(Lineas.class)
public class Lineas_ { 

    public static volatile SingularAttribute<Lineas, Integer> creadoPor;
    public static volatile SingularAttribute<Lineas, String> descripcion;
    public static volatile SingularAttribute<Lineas, Inet> editadoIp;
    public static volatile SingularAttribute<Lineas, Date> creado;
    public static volatile SingularAttribute<Lineas, Date> editado;
    public static volatile SingularAttribute<Lineas, Inet> creadoIp;
    public static volatile CollectionAttribute<Lineas, Productos> productosCollection;
    public static volatile SingularAttribute<Lineas, Integer> id;
    public static volatile SingularAttribute<Lineas, Boolean> inactivo;
    public static volatile SingularAttribute<Lineas, String> nombre;
    public static volatile SingularAttribute<Lineas, Integer> editadoPor;

}