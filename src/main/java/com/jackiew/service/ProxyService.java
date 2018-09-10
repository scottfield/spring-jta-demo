package com.jackiew.service;

import com.jackiew.domain.DemoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProxyService {
    @Autowired
    private DemoDatabaseService databaseService;
    @Autowired
    private MessageService messageService;

    @Transactional
    public void add(DemoDomain s) {
        databaseService.add(s);
        messageService.sendMessage(s);
        if (s.getName().equals("jetty")) {
            throw new IllegalArgumentException("jetty is not allowed");
        }
    }
}
