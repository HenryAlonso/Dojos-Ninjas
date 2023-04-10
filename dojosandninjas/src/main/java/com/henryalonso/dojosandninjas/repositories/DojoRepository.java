package com.henryalonso.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.henryalonso.dojosandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	//Bring all dojo's from the database
	List<Dojo> findAll();
}
