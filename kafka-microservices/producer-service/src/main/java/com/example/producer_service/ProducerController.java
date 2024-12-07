package com.example.producer_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private MessageProducer producer;

    @GetMapping("/publicar")
    public String publicarMensaje(@RequestParam("mensaje") String mensaje) {
        producer.sendMessage(mensaje);
        return "Mensaje publicado: " + mensaje;
    }
}
