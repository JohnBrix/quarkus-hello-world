package com.johnbrix.controller;

import com.johnbrix.model.NameModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    /*lifecycle clean quarkus:build and quarkus:dev*/
    @GET
    public Response hello() {
        NameModel json = new NameModel();
        json.setfName("tangna mo");
        json.setlName("asdads");
        json.setmName("adsas.");

        /*This allow 404 but it can response with json unlike typical 404 is result response is empty*/
        /*entity response*/
        return Response.status(404).entity(json).build();
    }
}
