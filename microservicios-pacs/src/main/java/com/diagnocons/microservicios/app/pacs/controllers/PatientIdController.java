package com.diagnocons.microservicios.app.pacs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.microservicios.commons.controllers.CommonController;
import com.diagnocons.microservicios.app.pacs.models.entity.PatientId;
import com.diagnocons.microservicios.app.pacs.services.PatientIdService;

@RestController
@RequestMapping("patients-ids")
public class PatientIdController extends CommonController<PatientId, PatientIdService> {

}
