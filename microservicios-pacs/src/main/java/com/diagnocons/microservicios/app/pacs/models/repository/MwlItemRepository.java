package com.diagnocons.microservicios.app.pacs.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.diagnocons.microservicios.app.pacs.models.entity.MwlItem;

public interface MwlItemRepository extends PagingAndSortingRepository<MwlItem, Long>{

}
