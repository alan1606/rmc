package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Business;

public interface BusinessRepository extends PagingAndSortingRepository<Business, Long>{

}
