package com.test.app.service.impl;

import com.test.app.service.PrototypeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class PrototypeServiceImpl implements PrototypeService {
    public PrototypeServiceImpl() {
        System.out.println("Конструктор PrototypeServiceImpl");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct PrototypeServiceImpl");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy PrototypeServiceImpl");
    }
}
