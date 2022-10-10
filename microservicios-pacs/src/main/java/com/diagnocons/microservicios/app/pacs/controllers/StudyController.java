package com.diagnocons.microservicios.app.pacs.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.microservicios.commons.controllers.CommonController;
import com.diagnocons.microservicios.app.pacs.models.entity.Study;
import com.diagnocons.microservicios.app.pacs.services.StudyService;

@RestController
@RequestMapping("studies")
public class StudyController extends CommonController<Study, StudyService> {

	@GetMapping("/id-pacs/{idPacs}") // En la base de datos de postgres no existe un unique para el campo id pacs
										// generado por el ris
	public ResponseEntity<?> encontrarPorIdPacs(@PathVariable String idPacs) {

		List<Study> estudios = service.findByStudyId(idPacs);
		return ResponseEntity.ok(estudios);
	}

	@GetMapping("/iuid/{iuid}")
	public ResponseEntity<?> encontrarPorIuid(@PathVariable String iuid) {

		List<Study> estudios = service.findByStudyIuid(iuid);

		if (estudios.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(estudios.get(0)); //Se retorna el primer elemento, ya que existe un unique en la base de datos

	}
	
	@GetMapping("/person-name/{name}")
	public ResponseEntity<?> encontrarPorPersonName(@PathVariable String name){
		
		List<Study> studies = service.findByPersonNameId(name);
		return ResponseEntity.ok(studies);
	}

}
