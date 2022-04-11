package com.example.exampleconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleConfigClientController {

    @Autowired
    private ExampleConfigClientConfiguration props;

    @Value("${another.example.property}")
    private String anotherProp;

    @GetMapping("/another")
    public String showAnotherProp() {
        return anotherProp + " - " + props.getProperty();
    }
}
