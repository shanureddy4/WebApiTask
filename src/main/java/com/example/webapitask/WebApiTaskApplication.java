package com.example.webapitask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class WebApiTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApiTaskApplication.class, args);
    }

}
