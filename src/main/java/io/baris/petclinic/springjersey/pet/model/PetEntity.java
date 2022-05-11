package io.baris.petclinic.springjersey.pet.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "pet")
public class PetEntity {

    @Id
    private int id;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Species species;
}
