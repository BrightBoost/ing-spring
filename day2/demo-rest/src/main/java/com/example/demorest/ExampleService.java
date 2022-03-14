package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    private ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    // create service
    public void saveExample(Example example) {
        exampleRepository.save(example);
    }

    // read service
    public Example getExample(long id) {
        return exampleRepository.findById(id).orElseGet(() -> null);
    }

    // read service for all example objects
    public List<Example> getExamples() {
        return exampleRepository.findAll();
    }

    // update service

    // delete service
}
