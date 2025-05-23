package com.monitoring_mikrohidro_store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "image")
public class Image {
    @Id
    private long id;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] data;
    private long cameraId;
    private long machineId;
}