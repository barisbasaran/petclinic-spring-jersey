package io.baris.petclinic.springjersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Component
@Path("/hello")
public class MyEndpoint {

    @GET
    @Path("/{name}")
    public String message(@PathParam("name") String name) {
        return "Hello %s".formatted(name);
    }
}
