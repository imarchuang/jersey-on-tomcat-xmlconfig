package com.imarchuang.jersey.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * User: marchuang <br/>
 * Date: 2017-09-01 <br/>
 */

@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{name}")
    public Response sayHello(@PathParam("name") String msg){

        String output = "Jersey say hello to : " + msg;

        return Response.status(200).entity(output).build();

    }

}
