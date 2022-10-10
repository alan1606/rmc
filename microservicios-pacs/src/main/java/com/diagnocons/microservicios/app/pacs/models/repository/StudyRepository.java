package com.diagnocons.microservicios.app.pacs.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.diagnocons.microservicios.app.pacs.models.entity.Study;

public interface StudyRepository extends PagingAndSortingRepository<Study, Long>{

	public List<Study> findByStudyId(String studyId);
	
	public List<Study> findByStudyIuid(String studyIuid);
	
	@Query("select s from Study s where UPPER(s.patient.personName.familyName) like UPPER(CONCAT('%',?1, '%')) or UPPER(s.patient.personName.givenName) like UPPER(CONCAT('%',?1, '%')) order by s.id desc")
	public List<Study> findByPersonName(String personName);
}
