package com.monitoring_mikrohidro_store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.monitoring_mikrohidro_store.entities.Battery;

public interface BatteryRepository extends CrudRepository<Battery, Long> {
    
}
