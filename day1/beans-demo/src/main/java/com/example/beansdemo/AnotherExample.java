package com.example.beansdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherExample {
//    cyclic dependency, yikes
//    @Autowired
//    private Example example;
}
