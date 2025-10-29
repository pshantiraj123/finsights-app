package com.example.finsights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class FinsightsApp {
    @GetMapping("/")
    public String home() {
        return "Welcome to Finsights App!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FinsightsApp.class, args);
    }
}
