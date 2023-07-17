package org.example;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;


@Path("hello")
public class HelloWorld {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(@QueryParam("hello") String name){
        String helloWorld = "Hello World";
        Jsonb jsonb;
        jsonb = JsonbBuilder.create();
        String hello_world_json = jsonb.toJson(helloWorld);

        return Response.ok(hello_world_json).build();


    }


}
