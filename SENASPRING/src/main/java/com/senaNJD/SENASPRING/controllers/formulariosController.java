package com.senaNJD.SENASPRING.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.senaNJD.SENASPRING.models.formulario;
import com.senaNJD.SENASPRING.services.formulariosRepository;



@Controller
@RequestMapping("formularios")

public class formulariosController {
	@Autowired
	private formulariosRepository repo;
	
	@GetMapping({"","/"})
	public String mostrarListaFormularios(Model model ) {
		List<formulario> formularios =repo.findAll();
		model.addAttribute("formularios",formularios);
		
		
		return "formularios/index";
	
				
	}
	


	
}
