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
@Table(name = "battery")
public class Battery {
    @Id
    private long id;
    private float voltage;
    private float currentOne;
    private float currentTwo;
    private LocalDateTime timestamp;
}
