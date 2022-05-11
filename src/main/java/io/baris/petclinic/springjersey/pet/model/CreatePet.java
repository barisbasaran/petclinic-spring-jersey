package io.baris.petclinic.springjersey.pet.model;

import lombok.Builder;
import lombok.Value;

/**
 * Model for creating a pet
 */

@Builder
@Value
public class CreatePet {

    String name;
    int age;
    Species species;
}
