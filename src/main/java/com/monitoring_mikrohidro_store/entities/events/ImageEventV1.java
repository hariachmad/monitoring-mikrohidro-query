package com.monitoring_mikrohidro_store.entities.events;

import java.time.LocalDateTime;

import com.monitoring_mikrohidro_store.entities.Image;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageEventV1 {
    long machineId;
    long eventId;
    String eventVersion;
    LocalDateTime eventTimestamp;
    long cameraId;
    byte[] data;
    Image image;
}