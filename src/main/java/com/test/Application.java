package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.test")
@PropertySource(value={"classpath:config/config.properties"})
@ImportResource("classpath:config/spring-config.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
