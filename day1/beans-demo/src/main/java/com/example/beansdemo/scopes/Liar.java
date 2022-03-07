package com.example.beansdemo.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Liar {

    @Autowired
    private ApplicationContext applicationContext;

    public Salary getSalary() {
        Salary l = (Salary) applicationContext.getBean("salary");
        return l;

    }
}
