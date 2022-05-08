package com.johnbrix;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    public Response hello() {
        Pojo json = new Pojo();
        json.setfName("Johnbrix");
        json.setlName("Pomoy");
        json.setmName("B.");

        /*This allow 404 but it can response with json unlike typical 404 is result response is empty*/
        /*entity response*/
        return Response.status(404).entity(json).build();
    }
}
