package com.aaguirre.ris.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aaguirre.ris.models.entity.Schedule;

public interface ScheduleRepository extends PagingAndSortingRepository<Schedule, Long> {

}
