package com.example.demoaspect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @LoggerAnnotationExample
    @GetMapping("hi")
    public String hi() {
        return "Hi!";
    }
}
