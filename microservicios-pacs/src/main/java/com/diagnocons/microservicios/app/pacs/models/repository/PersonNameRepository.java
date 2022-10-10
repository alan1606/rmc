package com.diagnocons.microservicios.app.pacs.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.diagnocons.microservicios.app.pacs.models.entity.PersonName;

public interface PersonNameRepository extends PagingAndSortingRepository<PersonName, Long>{

	@Query("select p from PersonName p where upper(concat(p.givenName, ' ', p.familyName)) like upper(concat('%', ?1 ,'%')) ")
	public List<PersonName> findLikeName(String name);
	
}
