package com.test.app.service.impl;

import com.test.app.service.SingletonService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class SingletonServiceImpl implements SingletonService {
    public SingletonServiceImpl() {
        System.out.println("Конструктор SingletonServiceImpl");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct SingletonServiceImpl");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy SingletonServiceImpl");
    }
}
