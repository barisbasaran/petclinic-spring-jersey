package io.baris.petclinic.springjersey.pet;

import io.baris.petclinic.springjersey.pet.model.PetEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PetRepository extends Repository<PetEntity, Integer> {

	@Query("SELECT pet FROM PetEntity pet WHERE pet.id =:id")
	@Transactional(readOnly = true)
	PetEntity findById(@Param("id") Integer id);
}
