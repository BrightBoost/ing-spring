package com.example.demorest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeDemoEndpointsController {
    @GetMapping("hi")
    public String sayHi() {
        return "Hi!";
    }

    @Async
    @GetMapping("slowHi")
    public String asyncHi() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("blabla");
        return "hi sorry I was sleeping";
    }
}
