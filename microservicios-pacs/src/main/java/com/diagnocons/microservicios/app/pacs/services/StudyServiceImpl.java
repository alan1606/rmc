package com.diagnocons.microservicios.app.pacs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aguirre.microservicios.commons.services.CommonServiceImpl;
import com.diagnocons.microservicios.app.pacs.models.entity.Study;
import com.diagnocons.microservicios.app.pacs.models.repository.StudyRepository;

@Service
public class StudyServiceImpl extends CommonServiceImpl<Study, StudyRepository> implements StudyService{

	@Override
	public List<Study> findByStudyId(String studyId) {
		return repository.findByStudyId(studyId);
	}

	@Override
	public List<Study> findByStudyIuid(String studyIuid) {
		return repository.findByStudyIuid(studyIuid);
	}

	@Override
	public List<Study> findByPersonNameId(String personName) {
		return repository.findByPersonName(personName);
	}

}
