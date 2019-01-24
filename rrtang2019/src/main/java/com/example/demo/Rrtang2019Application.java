package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
public class Rrtang2019Application {

    public static void main(String[] args) {
        SpringApplication.run(Rrtang2019Application.class, args);
    }
}
