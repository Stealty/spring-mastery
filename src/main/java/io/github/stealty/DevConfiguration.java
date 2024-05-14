package io.github.stealty;

import io.github.stealty.anotations.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class DevConfiguration {
    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("Running application in development mode");
        };
    }
}
