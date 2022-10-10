package com.diagnocons.microservicios.app.pacs.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.diagnocons.microservicios.app.pacs.models.entity.PatientId;

public interface PatientIdRepository extends PagingAndSortingRepository<PatientId, Long> {

}
