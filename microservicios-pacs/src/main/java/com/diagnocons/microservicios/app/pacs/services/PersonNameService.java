package com.diagnocons.microservicios.app.pacs.services;

import java.util.List;

import com.aguirre.microservicios.commons.services.CommonService;
import com.diagnocons.microservicios.app.pacs.models.entity.PersonName;

public interface PersonNameService extends CommonService<PersonName>{

	public List<PersonName> findLikeName(String name);

	
}
