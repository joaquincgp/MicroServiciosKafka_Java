package com.example.consumer_service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "test-topic", groupId = "grupo-ejemplo")
    public void consume(String message) {
        System.out.println("Mensaje recibido: " + message);
        // Aquí puedes añadir lógica adicional para procesar el mensaje
    }
}
