package com.monitoring_mikrohidro_store.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.monitoring_mikrohidro_store.entities.Battery;
import com.monitoring_mikrohidro_store.entities.HumiditySensor;
import com.monitoring_mikrohidro_store.entities.IntensitySensor;
import com.monitoring_mikrohidro_store.entities.SolarPanel;
import com.monitoring_mikrohidro_store.entities.TempSensor;
import com.monitoring_mikrohidro_store.entities.TurbineCitizens;
import com.monitoring_mikrohidro_store.entities.TurbineOutput;
import com.monitoring_mikrohidro_store.repositories.BatteryRepository;
import com.monitoring_mikrohidro_store.repositories.HumiditySensorRepository;
import com.monitoring_mikrohidro_store.repositories.IntensitySensorRepository;
import com.monitoring_mikrohidro_store.repositories.SolarPanelRepository;
import com.monitoring_mikrohidro_store.repositories.TempSensorRepository;
import com.monitoring_mikrohidro_store.repositories.TurbineCitizensRepository;
import com.monitoring_mikrohidro_store.repositories.TurbineOutputRepository;

@Controller
public class Query {
    @Autowired
    BatteryRepository batteryRepository;
    @Autowired
    HumiditySensorRepository humiditySensorRepository;
    @Autowired
    IntensitySensorRepository intensitySensorRepository;
    @Autowired
    SolarPanelRepository solarPanelRepository;
    @Autowired
    TempSensorRepository tempSensorRepository;
    @Autowired
    TurbineCitizensRepository turbineCitizensRepository;
    @Autowired
    TurbineOutputRepository turbineOutputRepository;

    @QueryMapping
    public List<Battery> getAllBatteries() {
        return StreamSupport.stream(batteryRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<Battery> findBatteriesByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(batteryRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<HumiditySensor> getAllHumiditySensors() {
        return StreamSupport.stream(humiditySensorRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
    
    @QueryMapping
    public List<HumiditySensor> findHumiditySensorsByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(humiditySensorRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<IntensitySensor> getAllIntensitySensors() {
        return StreamSupport.stream(intensitySensorRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<IntensitySensor> findIntensitySensorsByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(intensitySensorRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<SolarPanel> getAllSolarPanels() {
        return StreamSupport.stream(solarPanelRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<SolarPanel> findSolarPanelsByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(solarPanelRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<TempSensor> getAllTempSensors() {
        return StreamSupport.stream(tempSensorRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<TempSensor> findTempSensorsByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(tempSensorRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<TurbineOutput> getAllTurbineOutputs() {
        return StreamSupport.stream(turbineOutputRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<TurbineOutput> findTurbineOutputsByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(turbineOutputRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<TurbineCitizens> getAllTurbineCitizens() {
        return StreamSupport.stream(turbineCitizensRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<TurbineCitizens> findTurbineCitizensByTimestampBetween(@Argument LocalDateTime date1,@Argument LocalDateTime date2) {
        return StreamSupport.stream(turbineCitizensRepository.findByTimestampBetween(date1, date2).spliterator(), false)
                .collect(Collectors.toList());
    }
}
