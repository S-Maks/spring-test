package com.test.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;

@SpringBootApplication
@LiquibaseDataSource
public class LiquibaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiquibaseApplication.class);
    }
}
