package com.diagnocons.microservicios.app.pacs.services;

import java.util.List;

import com.aguirre.microservicios.commons.services.CommonService;
import com.diagnocons.microservicios.app.pacs.models.entity.Study;

public interface StudyService extends CommonService<Study> {

	public List<Study> findByStudyId(String studyId);
	
	public List<Study> findByStudyIuid(String studyIuid);
	
	public List<Study> findByPersonNameId(String personName);

}
