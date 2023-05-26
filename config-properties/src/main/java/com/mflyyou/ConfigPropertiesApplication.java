package com.mflyyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ConfigPropertiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigPropertiesApplication.class, args);
    }
}
