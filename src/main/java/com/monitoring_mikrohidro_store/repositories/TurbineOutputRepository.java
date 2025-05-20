package com.monitoring_mikrohidro_store.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.monitoring_mikrohidro_store.entities.TurbineOutput;

public interface TurbineOutputRepository extends CrudRepository<TurbineOutput, Long> {
    @Query(value = "SELECT * FROM public.turbine_output where timestamp between :date1 and :date2", nativeQuery = true)
    List<TurbineOutput> findByTimestampBetween(@Param("date1") LocalDateTime date1,@Param("date2") LocalDateTime date2);
}
