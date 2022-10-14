package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Appointment;

public interface AppointmentRepository extends PagingAndSortingRepository<Appointment, Long> {

}
