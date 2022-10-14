package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Ticket;

public interface TicketRepository extends PagingAndSortingRepository<Ticket, Long>{

}
