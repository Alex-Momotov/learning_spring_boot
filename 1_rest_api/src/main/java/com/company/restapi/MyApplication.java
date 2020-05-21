package com.company.restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//----------------------------------------------------------------------------------------------------------------------
// @SpringBootApplication a convenience annotation that adds the following annotations:
//      - @Configuration Marks a class as a source of bean definitions
//      - @EnableAutoConfiguration Tells spring to start adding beans based on what is on classpath, other beans, and various property settings
//      - @ComponentScan tells spring to look for other components, configurations, services in the same package letting it find the rest controller


@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
