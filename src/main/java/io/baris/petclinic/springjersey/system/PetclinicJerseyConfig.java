package io.baris.petclinic.springjersey.system;

import io.baris.petclinic.springjersey.home.HomeResource;
import io.baris.petclinic.springjersey.pet.PetResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class PetclinicJerseyConfig extends ResourceConfig {

    public PetclinicJerseyConfig() {
        register(HomeResource.class);
        register(PetResource.class);
        register(OpenApiResource.class);
    }
}
