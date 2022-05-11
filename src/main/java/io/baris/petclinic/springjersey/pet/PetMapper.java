package io.baris.petclinic.springjersey.pet;

import io.baris.petclinic.springjersey.pet.model.Pet;
import io.baris.petclinic.springjersey.pet.model.PetEntity;

/**
 * Maps pet api classes
 */
public class PetMapper {

    public static Pet mapToPet(
        final PetEntity petEntity
    ) {
        return Pet.builder()
            .id(petEntity.getId())
            .age(petEntity.getAge())
            .species(petEntity.getSpecies())
            .name(petEntity.getName())
            .build();
    }
}
