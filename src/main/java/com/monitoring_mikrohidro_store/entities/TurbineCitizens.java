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
@Table(name = "turbine_citizens")
public class TurbineCitizens {
    @Id
    private long id;
    private long machineId;
    private float voltage;
    private float current;
    private LocalDateTime timestamp;
}