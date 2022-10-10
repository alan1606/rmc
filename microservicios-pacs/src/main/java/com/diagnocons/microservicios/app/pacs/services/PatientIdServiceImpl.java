package com.diagnocons.microservicios.app.pacs.services;

import org.springframework.stereotype.Service;

import com.aguirre.microservicios.commons.services.CommonServiceImpl;
import com.diagnocons.microservicios.app.pacs.models.entity.PatientId;
import com.diagnocons.microservicios.app.pacs.models.repository.PatientIdRepository;

@Service
public class PatientIdServiceImpl extends CommonServiceImpl<PatientId, PatientIdRepository> implements PatientIdService {

}
