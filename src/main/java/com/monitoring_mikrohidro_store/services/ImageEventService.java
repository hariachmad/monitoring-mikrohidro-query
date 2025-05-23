package com.monitoring_mikrohidro_store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.monitoring_mikrohidro_store.entities.events.ImageEventV1;
import com.monitoring_mikrohidro_store.repositories.ImageRepository;

@Service
public class ImageEventService {
    @Autowired
    private ImageRepository imageRepository;

    @KafkaListener(topics = "image-event", groupId = "electric")
    public void consumeEvent(ImageEventV1 imageEvent) {
        imageRepository.save(imageEvent.getImage());           
    }
}
