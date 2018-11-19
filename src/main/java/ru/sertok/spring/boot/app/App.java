package ru.sertok.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "ru.sertok.spring.boot")
@EnableJpaRepositories(basePackages = "ru.sertok.spring.boot.repositories")
@EntityScan(basePackages = "ru.sertok.spring.boot.models")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
