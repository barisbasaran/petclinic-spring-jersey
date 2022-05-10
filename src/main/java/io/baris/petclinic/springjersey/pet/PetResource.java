package io.baris.petclinic.springjersey.pet;

import io.baris.petclinic.springjersey.pet.model.Pet;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import static io.baris.petclinic.springjersey.pet.model.Species.CAT;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/pets")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Slf4j
public class PetResource {

    @Path("/{petId}")
    @GET
    public Pet getPet(@PathParam("petId") int petId) {
        return Pet.builder()
            .id(petId)
            .name("Sofi")
            .age(2)
            .species(CAT)
            .build();
    }
}
