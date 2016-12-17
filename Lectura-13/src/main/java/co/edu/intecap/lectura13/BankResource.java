/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura13;

import co.edu.intecap.lectura13.business.ClientEJBLocal;
import co.edu.intecap.lectura13.model.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
/**
 * REST Web Service
 *
 * @author INTECAP
 */
@Path("cliente")
public class BankResource {
    @EJB
    ClientEJBLocal clientEJB;

    private ObjectMapper mapper = new ObjectMapper();
    
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BankResource
     */
    public BankResource() {
    }

    /**
     * Retrieves representation of an instance of co.edu.intecap.lectura13.BankResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return null;
    }

    /**
     * POST method for updating or creating an instance of BankResource
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearCliente(String content) {
        try {
            Cliente c = mapper.readValue(content, Cliente.class);
            clientEJB.createClient(c);
            return Response.status(Status.CREATED).build();
        } catch (Exception e) {
            return null;
        }        
    }
}
