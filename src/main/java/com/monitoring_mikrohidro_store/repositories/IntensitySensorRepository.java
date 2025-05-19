package com.monitoring_mikrohidro_store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.monitoring_mikrohidro_store.entities.IntensitySensor;

public interface IntensitySensorRepository extends CrudRepository<IntensitySensor, Long> {
    
}
