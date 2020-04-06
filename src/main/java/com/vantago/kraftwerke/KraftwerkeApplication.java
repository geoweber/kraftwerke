package com.vantago.kraftwerke;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class KraftwerkeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KraftwerkeApplication.class, args);
    }

}
