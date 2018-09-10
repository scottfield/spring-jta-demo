package com.jackiew.service;

import com.jackiew.domain.DemoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(DemoDomain s) {
        jmsTemplate.convertAndSend("test", s.getName() + s.getId());
    }
}
