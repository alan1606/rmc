package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Technician;

public interface TechnicianRepository extends PagingAndSortingRepository<Technician, Long>{

}
