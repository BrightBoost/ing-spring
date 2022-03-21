package com.example.demoaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("@annotation(LoggerAnnotationExample)")
    public Object loggerAnnotationExample(ProceedingJoinPoint jp) throws Throwable {
        // before
        System.out.println("Hii!");
        // start systime
       Object proceedObj = jp.proceed();
        //after
        //end systime
        System.out.println("Byeee!");

        //log this
       return proceedObj;
    }
}
