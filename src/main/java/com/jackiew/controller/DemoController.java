package com.jackiew.controller;

import com.jackiew.domain.DemoDomain;
import com.jackiew.service.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private ProxyService proxyService;

    @RequestMapping("/hello")
    public String hello(DemoDomain s) {
        proxyService.add(s);
        return "success";
    }
}
