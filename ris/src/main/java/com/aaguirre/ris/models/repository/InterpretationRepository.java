package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Interpretation;

public interface InterpretationRepository extends PagingAndSortingRepository<Interpretation, Long> {

}
