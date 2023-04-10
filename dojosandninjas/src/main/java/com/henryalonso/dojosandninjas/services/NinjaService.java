package com.henryalonso.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.henryalonso.dojosandninjas.models.Ninja;
import com.henryalonso.dojosandninjas.models.Dojo;

import com.henryalonso.dojosandninjas.repositories.NinjaRepository;


@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;

	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	//Create a new ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	//Return all ninja's
	public List<Ninja> findNinja() {
		return ninjaRepository.findAll();
	}
	
	//Return one ninja by Id
	public Ninja findById(Long id) {
		Optional<Ninja> ninjaOptional = ninjaRepository.findById(id);
		return ninjaOptional.orElseThrow(null);
	}
	
	//Return all ninjas that belong to a dojo
	public List<Ninja> ninjaByDojoId(Dojo dojo) {
		return ninjaRepository.findAllByDojo(dojo);
	}
	
}
