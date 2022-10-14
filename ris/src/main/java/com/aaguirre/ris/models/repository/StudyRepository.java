package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Study;

public interface StudyRepository extends PagingAndSortingRepository<Study, Long>{

}
