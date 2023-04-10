package com.henryalonso.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.henryalonso.dojosandninjas.models.Dojo;
import com.henryalonso.dojosandninjas.models.Ninja;
import com.henryalonso.dojosandninjas.services.DojoService;
import com.henryalonso.dojosandninjas.services.NinjaService;

@Controller
public class MainController {
	
    @Autowired
    private DojoService dojoService;
    
    @Autowired
    private NinjaService ninjaService;
	
    @GetMapping("/")
    public String index() {
    return "redirect:/dojos/new";
    }
    
    @GetMapping("/dojos/new")
    public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
    	model.addAttribute("dojos",dojoService.getAllDojos());
    	return "index.jsp";
    }
    
    @GetMapping("/ninjas/new")
    public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
    	model.addAttribute("dojos", dojoService.getAllDojos());
    	return "newNinja.jsp";
    }
    
    @GetMapping("/dojos/{id}")
    public String allDojos(@PathVariable("id")Long id, Model model) {
    	Dojo dojo = dojoService.getDojoById(id);
    	model.addAttribute("dojo", dojo);
    	return "allDojos.jsp";
    }
    
    @PostMapping("/dojos/new/process")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
    	Dojo newDojo = dojoService.createDojo(dojo);
    	return String.format("redirect:/dojos/%s", newDojo.getId());
    }
    
    @PostMapping("/ninjas/new/process")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja) {
    	Ninja newNinja = ninjaService.createNinja(ninja);
    	return String.format("redirect:/dojos/" + newNinja.getDojo().getId());
    }
    
}
