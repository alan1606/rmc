package com.diagnocons.microservicios.worklist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diagnocons.microservicios.worklist.models.entity.Worklist;
import com.diagnocons.microservicios.worklist.services.WorklistService;

@RestController
public class WorklistController {

	@Autowired
	WorklistService service;
	
	@PostMapping("/procesar")
	ResponseEntity<?> procesarMensajeOmiO23Worklist(@RequestBody Worklist worklist){
		if(service.registrarEnWorklist(worklist)) {
			return ResponseEntity.ok(true);
		}
		return ResponseEntity.ok(false);
	}
}
