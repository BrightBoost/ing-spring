package com.example.monoandflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class OperatorFunTest {

    @Test
    public void helloMapFlux() {
        Flux.range(1, 10)
                .map(i -> i*i)
                .log()
                .subscribe(System.out::println);
    }

    @Test
    public void helloFlatMapFlux() {
        Flux.range(1, 10)
                .flatMap(i -> Flux.range(i*i, 3))
                .subscribe(System.out::println);
    }

    // operators to combine publishers

    @Test
    public void helloConcat() throws InterruptedException {
        Flux.concat(Flux.range(1, 3).delayElements(Duration.ofMillis(300)),
                Flux.range(4, 3).delayElements(Duration.ofMillis(200)))
                .log()
                .subscribe(System.out::println);

        Thread.sleep(2000);
    }

    @Test
    public void helloMerge() throws InterruptedException {
        Flux.merge(Flux.range(1, 3).delayElements(Duration.ofMillis(300)),
                        Flux.range(4, 3).delayElements(Duration.ofMillis(200)))
                .log()
                .subscribe(System.out::println);

        Thread.sleep(2000);

    }

    @Test
    public void helloZip() throws InterruptedException {
        Flux.zip(Flux.range(1, 3),
                        Flux.range(4, 3),
                        (x, y) -> x + y)
                .log()
                .subscribe(System.out::println);

    }


}
