package com.monitoring_mikrohidro_store.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.monitoring_mikrohidro_store.entities.TempSensor;

public interface TempSensorRepository extends CrudRepository<TempSensor, Long> {
    @Query(value = "SELECT * FROM public.temp_sensor where timestamp between :date1 and :date2", nativeQuery = true)
    List<TempSensor> findByTimestampBetween(@Param("date1") LocalDateTime date1,@Param("date2") LocalDateTime date2);
}
