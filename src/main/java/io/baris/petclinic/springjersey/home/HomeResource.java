package io.baris.petclinic.springjersey.home;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HomeResource {

    @GET
    public String home() {
        return "Welcome to Pet Clinic";
    }
}
