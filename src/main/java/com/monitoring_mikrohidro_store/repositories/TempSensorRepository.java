package com.monitoring_mikrohidro_store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.monitoring_mikrohidro_store.entities.TempSensor;

public interface TempSensorRepository extends CrudRepository<TempSensor, Long> {
    
}
