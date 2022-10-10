package com.diagnocons.microservicios.app.pacs.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.diagnocons.microservicios.app.pacs.models.entity.Patient;

public interface PatientRepository extends PagingAndSortingRepository<Patient, Long>{

}
