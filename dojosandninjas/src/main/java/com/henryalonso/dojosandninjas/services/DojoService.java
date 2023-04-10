package com.henryalonso.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.henryalonso.dojosandninjas.models.Dojo;
import com.henryalonso.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	//import our DojoRepository
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public Dojo getDojoById(Long id) {
	    Optional<Dojo> dojoOptional = dojoRepository.findById(id);
	    return dojoOptional.orElse(null);
	}


    
    public List<Dojo> getAllDojos() {
    	return dojoRepository.findAll();
    }
	
}
