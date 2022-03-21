package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("example")
public class ExampleController {

    private ExampleService exampleService;
    private ExampleTransactionService exampleTransactionService;

    @Autowired
    public ExampleController(ExampleService exampleService, ExampleTransactionService exampleTransactionService) {
        this.exampleService = exampleService;
        this.exampleTransactionService = exampleTransactionService;
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

    //update name
    @PutMapping("{id}/{name}")
    public void updateNameExample(@PathVariable long id, @PathVariable String name) {
        exampleTransactionService.updateNameExample(id, name);
    }

    @DeleteMapping("{id}")
    public void deleteExample(@PathVariable long id) throws Exception {
        exampleTransactionService.deleteExample(id);
    }

}
