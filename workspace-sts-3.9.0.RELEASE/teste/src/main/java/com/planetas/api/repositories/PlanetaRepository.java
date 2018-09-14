package com.planetas.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.planetas.api.documents.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {

	Planeta findOne(String id);

	

	

}
