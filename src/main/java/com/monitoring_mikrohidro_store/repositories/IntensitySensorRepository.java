package com.monitoring_mikrohidro_store.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.monitoring_mikrohidro_store.entities.IntensitySensor;

public interface IntensitySensorRepository extends CrudRepository<IntensitySensor, Long> {
    @Query(value = "SELECT * FROM public.intensity_sensor where timestamp between :date1 and :date2", nativeQuery = true)
    List<IntensitySensor> findByTimestampBetween(@Param("date1") LocalDateTime date1,@Param("date2") LocalDateTime date2);
}
