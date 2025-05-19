package com.monitoring_mikrohidro_store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.monitoring_mikrohidro_store.entities.HumiditySensor;

public interface HumiditySensorRepository extends CrudRepository<HumiditySensor, Long> {
    
}
