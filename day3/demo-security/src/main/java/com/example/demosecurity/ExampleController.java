package com.example.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("hi-user")
    public String sayHiUser() {
        return "Hi user :)";
    }

    @GetMapping("hi-admin")
    public String sayHiAdmin() {
        return "Hi admin :)";
    }

    @GetMapping("hi-open")
    public String sayHiOpen() {
        return "Hi open :)";
    }
}
