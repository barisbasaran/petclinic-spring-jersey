package io.baris.petclinic.springjersey.pet;

import io.baris.petclinic.springjersey.pet.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Optional;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/pets")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Slf4j
@Component
public class PetResource {

    private final PetRepository petRepository;

    @Autowired
    public PetResource(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Path("/{petId}")
    @GET
    public Pet getPet(@PathParam("petId") int petId) {
        return Optional
            .ofNullable(petRepository.findById(petId))
            .map(PetMapper::mapToPet)
            .orElseThrow(() -> new NotFoundException("Pet not found"));
    }
}
