package br.com.eluminum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.eluminum.model.Planet;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Long> {
	

}
