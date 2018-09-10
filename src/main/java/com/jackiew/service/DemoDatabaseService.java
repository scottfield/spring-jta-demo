package com.jackiew.service;

import com.jackiew.domain.DemoDomain;
import com.jackiew.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoDatabaseService {
    @Autowired
    private DemoRepo demoRepo;

    public void add(DemoDomain s) {
        demoRepo.save(s);
    }
}
