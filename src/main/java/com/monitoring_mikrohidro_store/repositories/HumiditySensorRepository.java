package com.monitoring_mikrohidro_store.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.monitoring_mikrohidro_store.entities.HumiditySensor;

public interface HumiditySensorRepository extends CrudRepository<HumiditySensor, Long> {
    @Query(value = "SELECT * FROM public.humidity_sensor where timestamp between :date1 and :date2", nativeQuery = true)
    List<HumiditySensor> findByTimestampBetween(@Param("date1") LocalDateTime date1,@Param("date2") LocalDateTime date2);
}
