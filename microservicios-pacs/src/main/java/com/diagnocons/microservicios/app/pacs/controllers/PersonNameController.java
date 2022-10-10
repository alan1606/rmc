package com.diagnocons.microservicios.app.pacs.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.microservicios.commons.controllers.CommonController;
import com.diagnocons.microservicios.app.pacs.models.entity.PersonName;
import com.diagnocons.microservicios.app.pacs.services.PersonNameService;

@RestController
@RequestMapping("person-names")
public class PersonNameController extends CommonController<PersonName, PersonNameService>{

	@GetMapping("/name/{name}")
	public ResponseEntity<?> findLikeName(@PathVariable String name){
		
		List<PersonName> persons = service.findLikeName(name);
		
		return ResponseEntity.ok(persons);
	}
	 
}
