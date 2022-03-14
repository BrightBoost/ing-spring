package com.example.demorest;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleSendingParamsController {
    // query param
    @GetMapping("queryparam")
    public String sayPersonalizedHi(@RequestParam String name) {
        return "Hi " + name;
    }

    // path param
    @GetMapping("pathparam/{name}")
    public String sayPersonalizedHiPath(@PathVariable String name) {
        return "Hi " + name;
    }

    // body param with string
    @GetMapping("bodyparam")
    public String sayPersonalizedHiBody(@RequestBody String name) {
        return "Hi " + name;
    }

    // body param with string
    @GetMapping("bodyparamobject")
    public String sayPersonalizedHiBody(@RequestBody Example example) {
        return "Hi " + example.getName() + " My favorite number is " + example.getNumber();
    }

    // breaking the convention of saving something with post for the sake of the rest template example
    @PostMapping("bodyparamobject")
    public Example sayPersonalizedHiBody2(@RequestBody Example example) {
       // return "Hi " + example.getName() + " My favorite number is " + example.getNumber();
        return example;
    }


}
