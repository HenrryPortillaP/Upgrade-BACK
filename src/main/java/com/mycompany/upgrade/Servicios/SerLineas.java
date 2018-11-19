/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upgrade.Servicios;

import com.mycompany.upgrade.Api.ApiLineas;
import com.mycompany.upgrade.Entidades.Lineas;
import java.util.List;
import javax.ws.rs.Consumes;
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
    
    
    ApiLineas apiLineas = new ApiLineas();
    
    @POST
    @Path("REST")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Lineas> REST ( )
    {
        return apiLineas.rest2();
    }
}
