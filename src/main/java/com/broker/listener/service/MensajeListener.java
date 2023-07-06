package com.broker.listener.service;

import org.slf4j.Logger;
import org.springframework.jms.annotation.*;
import org.springframework.stereotype.*;

@Service
public class MensajeListener {
    Logger LOG = org.slf4j.LoggerFactory.getLogger(MensajeListener.class);
    @JmsListener(destination = "mensakkkkjeee")
    public void recibirMensaje(String mensaje) {
        LOG.info("Mensaje recibido: {}", mensaje);
    }

}