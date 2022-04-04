package com.example.monoandflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class FluxFunTest {

    @Test
    public void helloFlux() {
        Flux.just("A", "B", "C", "D")
                .log()
                .subscribe(System.out::println);
    }

    @Test
    public void helloFluxRange() {
        Flux.range(1, 19)
                .log()
                .subscribe(System.out::println);
    }

    @Test
    public void helloFluxInterval() throws InterruptedException {
        Flux.interval(Duration.ofSeconds(1))
                .log()
                .take(3)
                .subscribe(System.out::println);

        Thread.sleep(4000);
    }
}
