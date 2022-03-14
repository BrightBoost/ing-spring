package com.example.demorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DemoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRestApplication.class, args);
    }

}
