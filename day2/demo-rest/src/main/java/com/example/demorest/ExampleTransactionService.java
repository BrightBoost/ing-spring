package com.example.demorest;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;

@Service
public class ExampleTransactionService {
    private ExampleRepository exampleRepository;

    public ExampleTransactionService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    // create service
    @Transactional
    public void updateNameExample(long id, String name) {
        Example toBeUpdated = exampleRepository.findById(id).get();
        toBeUpdated.setName(name);
    }

    // create service
    @Transactional//(rollbackOn = {RuntimeException.class})
    public void deleteExample(long id) throws Exception {
        exampleRepository.deleteById(id);
        throw new Exception();
    }


}

