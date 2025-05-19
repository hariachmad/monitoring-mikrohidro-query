package com.monitoring_mikrohidro_store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.monitoring_mikrohidro_store.entities.SolarPanel;

public interface SolarPanelRepository extends CrudRepository<SolarPanel, Long> {
    
}
