package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("example")
public class ExampleController {

    private ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    // get one
    @GetMapping("{id}")
    public Example getExample(@PathVariable long id) {
        return exampleService.getExample(id);
    }

    // get all
    @GetMapping
    public List<Example> getExamples() {
        return exampleService.getExamples();
    }

    // create
    @PostMapping
    public void createExample(@RequestBody Example example) {
        exampleService.saveExample(example);
    }


}
