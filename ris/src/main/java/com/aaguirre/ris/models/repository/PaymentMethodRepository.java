package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.PaymentMethod;

public interface PaymentMethodRepository extends PagingAndSortingRepository<PaymentMethod, Long>{

}
