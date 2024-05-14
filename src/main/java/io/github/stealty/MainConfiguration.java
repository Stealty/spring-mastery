package io.github.stealty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("Running application in any mode");
        };
    }
}
