package org.sid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootEventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEventsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Publisher publisher) {
        return args -> {
            publisher.publishEvent();
        };
    }
}


