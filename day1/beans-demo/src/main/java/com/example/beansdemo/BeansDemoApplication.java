package com.example.beansdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// this annotation contains a lot of other annotations
// amongst which: @Component (making it a bean)
// and @Configuration, making it a configuration class
// in configuration classes we can annotate methods with @Bean to create beans
@SpringBootApplication
public class BeansDemoApplication {

    @Autowired
    private Example example;

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(BeansDemoApplication.class, args);
        for (String bean : ac.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
    }


    @Bean //of type String
    public String getStringBean() {
        return "Hi!";
    }

    @Bean //of type String
    public String getStringBean2() {
        return "Bye";
    }
//
//    @Bean
//    public Example getExample() {
//        return new Example();
//    }

}
