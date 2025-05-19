package com.monitoring_mikrohidro_store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.monitoring_mikrohidro_store.entities.events.ElectricityEventV1;
import com.monitoring_mikrohidro_store.repositories.BatteryRepository;
import com.monitoring_mikrohidro_store.repositories.HumiditySensorRepository;
import com.monitoring_mikrohidro_store.repositories.IntensitySensorRepository;
import com.monitoring_mikrohidro_store.repositories.SolarPanelRepository;
import com.monitoring_mikrohidro_store.repositories.TempSensorRepository;
import com.monitoring_mikrohidro_store.repositories.TurbineCitizensRepository;
import com.monitoring_mikrohidro_store.repositories.TurbineOutputRepository;

@Service
public class ElectricEventService {
    @Autowired
    private BatteryRepository batteryRepository;
    @Autowired
    private TurbineOutputRepository turbineOutputRepository;
    @Autowired
    private TurbineCitizensRepository turbineCitizensRepository;
    @Autowired
    private SolarPanelRepository solarPanelRepository;
    @Autowired
    private IntensitySensorRepository intensitySensorRepository;
    @Autowired
    private TempSensorRepository tempSensorRepository;
    @Autowired
    private HumiditySensorRepository humiditySensorRepository;

    @KafkaListener(topics = "electricity-event", groupId = "electric")
    public void consumeEvent(ElectricityEventV1 electricEvent) {
        batteryRepository.save(electricEvent.getBattery());
        turbineOutputRepository.save(electricEvent.getTurbineOutput());
        turbineCitizensRepository.save(electricEvent.getTurbineCitizens());
        solarPanelRepository.save(electricEvent.getSolarPanel());
        intensitySensorRepository.save(electricEvent.getIntensitySensor());
        tempSensorRepository.save(electricEvent.getTempSensor());
        humiditySensorRepository.save(electricEvent.getHumiditySensor());           
    }
}
