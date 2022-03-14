package com.example.demorest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Long> {
    List<Example> findAll();
}
