package com.mycompany.upgrade.Entidades;

import com.mycompany.upgrade.Entidades.NotasPedidoCab;
import com.mycompany.upgrade.Entidades.ProformasCab;
import com.vladmihalcea.hibernate.type.basic.Inet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T09:26:29")
@StaticMetamodel(PreventasTipo.class)
public class PreventasTipo_ { 

    public static volatile SingularAttribute<PreventasTipo, Integer> creadoPor;
    public static volatile SingularAttribute<PreventasTipo, Inet> editadoIp;
    public static volatile SingularAttribute<PreventasTipo, Date> creado;
    public static volatile SingularAttribute<PreventasTipo, Date> editado;
    public static volatile SingularAttribute<PreventasTipo, Inet> creadoIp;
    public static volatile SingularAttribute<PreventasTipo, Integer> id;
    public static volatile SingularAttribute<PreventasTipo, Boolean> inactivo;
    public static volatile SingularAttribute<PreventasTipo, String> nombre;
    public static volatile CollectionAttribute<PreventasTipo, ProformasCab> proformasCabCollection;
    public static volatile SingularAttribute<PreventasTipo, Integer> editadoPor;
    public static volatile CollectionAttribute<PreventasTipo, NotasPedidoCab> notasPedidoCabCollection;

}