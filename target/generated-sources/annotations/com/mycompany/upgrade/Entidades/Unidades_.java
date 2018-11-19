package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.Productos;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(Unidades.class)
public class Unidades_ { 

    public static volatile SingularAttribute<Unidades, String> abreviatura;
    public static volatile SingularAttribute<Unidades, Boolean> peso;
    public static volatile SingularAttribute<Unidades, Boolean> divisible;
    public static volatile SingularAttribute<Unidades, Inet> creadoIp;
    public static volatile CollectionAttribute<Unidades, Productos> productosCollection;
    public static volatile SingularAttribute<Unidades, Boolean> inactivo;
    public static volatile SingularAttribute<Unidades, String> nombre;
    public static volatile SingularAttribute<Unidades, Integer> editadoPor;
    public static volatile SingularAttribute<Unidades, Integer> creadoPor;
    public static volatile SingularAttribute<Unidades, Inet> editadoIp;
    public static volatile SingularAttribute<Unidades, Date> creado;
    public static volatile CollectionAttribute<Unidades, Productos> productosCollection1;
    public static volatile SingularAttribute<Unidades, Date> editado;
    public static volatile SingularAttribute<Unidades, Integer> id;

}