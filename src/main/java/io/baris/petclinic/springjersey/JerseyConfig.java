package io.baris.petclinic.springjersey;

import io.baris.petclinic.springjersey.home.HomeResource;
import io.baris.petclinic.springjersey.pet.PetResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HomeResource.class);
        register(PetResource.class);
    }
}