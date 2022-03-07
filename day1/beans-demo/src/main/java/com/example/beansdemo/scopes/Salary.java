package com.example.beansdemo.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Salary {
    private Double nr;

    public Salary() {
        this.nr = Math.random() * 1000;
    }

    public Double getNr() {
        return nr;
    }
}
