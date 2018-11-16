/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upgrade.Servicios;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author User
 */
@ApplicationPath("ser")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.upgrade.Facades.LineasFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.MarcasFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.NotasPedidoCabFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.NotasPedidoDetFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.PreventasTipoFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.ProductosDetFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.ProductosFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.ProductosTipoFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.ProformasCabFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.UnidadesFacadeREST.class);
        resources.add(com.mycompany.upgrade.Facades.VentasCabFacadeREST.class);
        resources.add(com.mycompany.upgrade.Servicios.SerLineas.class);
    }
    
}
