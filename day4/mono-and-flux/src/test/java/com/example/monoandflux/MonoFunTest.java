package com.example.monoandflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.io.IOException;

public class MonoFunTest {

    @Test
    public void helloMono() {
        Mono.just("A");
    }

    @Test
    public void helloMonoWithSubscriber() {
        Mono.just("B")
                .log()
                .subscribe(System.out::println,
                        s -> System.out.println("Oh no!"),
                        () -> System.out.println("I'm done!"));
    }

    @Test
    public void helloMonoWithSubscriberError() {
        Mono.error(new IOException())
                .log()
                .doOnError(s -> System.out.println("Oh no 1! " + s))
                .subscribe(System.out::println,
                        s -> System.out.println("Oh no 2!"),
                        () -> System.out.println("I'm done!"));
    }

    @Test
    public void helloMonoDoOnMethods() {
        Mono.just("C")
                .log()
                .doOnSubscribe(s -> System.out.println("I've subscribed to: " + s))
                .doOnRequest(r -> System.out.println("I've requested: " + r))
                .subscribe(System.out::println);
    }

    @Test
    public void helloMonoVoid() {
        Mono.empty()
                .log()
                .subscribe();
    }


}
