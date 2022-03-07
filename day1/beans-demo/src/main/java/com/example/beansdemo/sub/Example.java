package com.example.beansdemo.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Example {
    @Autowired
    @Qualifier("getStringBean2")
    private String name;

    private AnotherExample anotherExample;

    public Example() {
    }

    public Example(AnotherExample anotherExample) {
        this.anotherExample = anotherExample;
    }

    public Example(String name, AnotherExample anotherExample) {
        this.name = name;
        this.anotherExample = anotherExample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnotherExample getAnotherExample() {
        return anotherExample;
    }

    //@Autowired
    public void setAnotherExample(AnotherExample anotherExample) {
        this.anotherExample = anotherExample;
    }
}
