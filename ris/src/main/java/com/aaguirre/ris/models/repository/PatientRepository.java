package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Patient;

public interface PatientRepository extends PagingAndSortingRepository<Patient, Long>{

}
