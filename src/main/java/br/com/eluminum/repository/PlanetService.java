package br.com.eluminum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eluminum.model.Planet;

@Service
public class PlanetService {
	@Autowired
	PlanetRepository planetRepository;
	
	public Planet create(Planet p) {
		return this.planetRepository.save(p);
	}
	public Iterable<Planet> getAll(){
		return this.planetRepository.findAll();
	}
}
