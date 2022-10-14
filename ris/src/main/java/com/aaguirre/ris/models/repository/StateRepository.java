package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.State;

public interface StateRepository extends PagingAndSortingRepository<State, Long>{

}
