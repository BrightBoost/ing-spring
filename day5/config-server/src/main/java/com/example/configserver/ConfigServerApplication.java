package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    // visit localhost:8888/appname/profile/label
    //http://localhost:8888/example-config-client/test
    //http://localhost:8888/example-config-client/default
    //http://localhost:8888/example-config-client.properties
    //http://localhost:8888/example-config-client-test.properties

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
