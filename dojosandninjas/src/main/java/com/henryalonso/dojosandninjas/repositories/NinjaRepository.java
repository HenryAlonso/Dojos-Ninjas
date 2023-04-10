package com.henryalonso.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.henryalonso.dojosandninjas.models.Ninja;
import com.henryalonso.dojosandninjas.models.Dojo;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	//Return all ninja's
	List<Ninja> findAll();
	
	//Return all ninja's associated with a Dojo
	List<Ninja> findAllByDojo(Dojo dojo);
	
}
