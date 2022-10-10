package com.diagnocons.microservicios.app.pacs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.microservicios.commons.controllers.CommonController;
import com.diagnocons.microservicios.app.pacs.models.entity.Patient;
import com.diagnocons.microservicios.app.pacs.services.PatientService;

@RestController
@RequestMapping("patients")
public class PatientController extends CommonController<Patient, PatientService>{

}
