package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Status;

public interface StatusRepository extends PagingAndSortingRepository<Status, Long>{

}
