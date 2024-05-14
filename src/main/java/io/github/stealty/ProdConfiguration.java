package io.github.stealty;

import io.github.stealty.anotations.Production;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Production
public class ProdConfiguration {
    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("Running application in production mode");
        };
    }
}
