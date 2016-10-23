package com.jbeam;

import com.jbeam.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);

        SpringApplication.run(new Class<?>[] {Application.class, JpaConfig.class}, args);
    }
}
