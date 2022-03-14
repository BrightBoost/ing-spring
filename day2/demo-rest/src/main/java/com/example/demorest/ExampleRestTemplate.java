package com.example.demorest;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExampleRestTemplate {


    @GetMapping("consume-rest")
    public Example consumeRest() {
        RestTemplate restTemplate = new RestTemplate();
        Example example = new Example();
        example.setName("Natallia");
        example.setNumber(42);
        ResponseEntity<Example> response = restTemplate.postForEntity("http://localhost:8080/bodyparamobject", example, Example.class);
        return response.getBody();
    }
}
