package com.vantago.kraftwerke;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class KraftwerkeApplication {

	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(KraftwerkeApplication.class, args);
        //KraftwerkController kraftwerkController = (KraftwerkController) ctx.getBean("kraftwerkController");

        //System.out.println(kraftwerkController.findAll());
    }

}
