package com.diagnocons.microservicios.app.pacs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aguirre.microservicios.commons.services.CommonServiceImpl;
import com.diagnocons.microservicios.app.pacs.models.entity.PersonName;
import com.diagnocons.microservicios.app.pacs.models.repository.PersonNameRepository;

@Service
public class PersonNameServiceImpl extends CommonServiceImpl<PersonName, PersonNameRepository> implements PersonNameService{

	@Override
	public List<PersonName> findLikeName(String name) {
		return repository.findLikeName(name);
	}

}
