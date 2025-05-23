package com.monitoring_mikrohidro_store.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "temp_sensor")
public class TempSensor {
    @Id
    private long id;
    private long machineId;
    private float temperature;
    private LocalDateTime timestamp;
}