package com.example.beansdemo;

import com.example.beansdemo.AnotherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Example {
    @Autowired
    @Qualifier("getStringBean2")
    private String name;

    @Autowired
    private AnotherExample anotherExample;

}
