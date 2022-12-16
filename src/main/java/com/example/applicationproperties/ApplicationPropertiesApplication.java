package com.example.applicationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ApplicationPropertiesApplication implements CommandLineRunner {
    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("AppName : "+appName);
        System.out.println("AppNameFromEnvironment : "+environment.getProperty("spring.application.name"));
    }
}
