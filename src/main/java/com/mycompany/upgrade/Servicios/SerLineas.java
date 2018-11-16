/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upgrade.Servicios;

import com.mycompany.upgrade.Entidades.Lineas;
import com.mycompany.upgrade.Facades.LineasFacadeREST;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author User
 */
@Path("lineas")
public class SerLineas {
    
    @EJB
    private LineasFacadeREST lineasFacadeREST;
    
    private EntityManager em;
    
    private EntityManagerFactory emf;
    
    protected EntityManager getEntityManager(){
        return em;
    }
    
    @GET
    @Path("prueba")
    public List<Lineas> findall(){
        return lineasFacadeREST.findAll();
    }
    
    /*@POST
    @Path("REST")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lineas> rest (DtoPrueba dtoPrueba)
    {
        emf = Persistence.createEntityManagerFactory("com.mycompany_Upgrade-Back_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT a FROM Alumno a WHERE a.id = :id")
                .setParameter("id", dtoPrueba.id);
        List<Lineas> lista = query.getResultList();
        return lista;
    }*/
    
    @POST
    @Path("REST")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lineas> rest2 ( )
    {
        emf = Persistence.createEntityManagerFactory("com.mycompany_UPGRADE-BACK_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT a.id FROM Lineas a ");           
        List<Lineas> lista = query.getResultList();
        return lista;
    }
}

