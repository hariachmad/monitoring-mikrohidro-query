package com.monitoring_mikrohidro_store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.monitoring_mikrohidro_store.entities.TurbineOutput;

public interface TurbineOutputRepository extends CrudRepository<TurbineOutput, Long> {
    
}
