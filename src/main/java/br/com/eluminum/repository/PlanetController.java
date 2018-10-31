package br.com.eluminum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eluminum.model.Planet;

@RestController
public class PlanetController {
	@Autowired
	PlanetService planetService;
	@GetMapping("/planet")
	public Iterable<Planet> findAll(){
		return this.planetService.getAll();
	}
	@PostMapping("/planet")
	public Planet save(@RequestBody Planet planet) {
		return this.planetService.create(planet);
	}
}
