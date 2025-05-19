package com.monitoring_mikrohidro_store.entities.events;

import java.time.LocalDateTime;

import com.monitoring_mikrohidro_store.entities.Battery;
import com.monitoring_mikrohidro_store.entities.HumiditySensor;
import com.monitoring_mikrohidro_store.entities.IntensitySensor;
import com.monitoring_mikrohidro_store.entities.SolarPanel;
import com.monitoring_mikrohidro_store.entities.TempSensor;
import com.monitoring_mikrohidro_store.entities.TurbineCitizens;
import com.monitoring_mikrohidro_store.entities.TurbineOutput;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityEventV1 {

    long machineId;
    long eventId;
    String eventVersion;
    LocalDateTime eventTimestamp;

    Battery battery;

    HumiditySensor humiditySensor;

    IntensitySensor intensitySensor;

    SolarPanel solarPanel;

    TempSensor tempSensor;

    TurbineCitizens turbineCitizens;
    TurbineOutput turbineOutput;
}
