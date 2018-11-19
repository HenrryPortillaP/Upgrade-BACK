package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.Productos;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(Marcas.class)
public class Marcas_ { 

    public static volatile SingularAttribute<Marcas, Integer> creadoPor;
    public static volatile SingularAttribute<Marcas, Inet> editadoIp;
    public static volatile SingularAttribute<Marcas, Date> creado;
    public static volatile SingularAttribute<Marcas, String> abreviatura;
    public static volatile SingularAttribute<Marcas, Date> editado;
    public static volatile SingularAttribute<Marcas, Inet> creadoIp;
    public static volatile CollectionAttribute<Marcas, Productos> productosCollection;
    public static volatile SingularAttribute<Marcas, Integer> id;
    public static volatile SingularAttribute<Marcas, Boolean> inactivo;
    public static volatile SingularAttribute<Marcas, String> nombre;
    public static volatile SingularAttribute<Marcas, Integer> editadoPor;

}