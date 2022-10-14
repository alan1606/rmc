package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Doctor;

public interface DoctorRepository extends PagingAndSortingRepository<Doctor, Long>{

}
