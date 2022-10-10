package com.diagnocons.microservicios.app.pacs.services;

import org.springframework.stereotype.Service;

import com.aguirre.microservicios.commons.services.CommonServiceImpl;
import com.diagnocons.microservicios.app.pacs.models.entity.Patient;
import com.diagnocons.microservicios.app.pacs.models.repository.PatientRepository;

@Service
public class PatientServiceImpl extends CommonServiceImpl<Patient, PatientRepository> implements PatientService{

}
