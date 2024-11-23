package org.pragadeesh.spring.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

    @GetMapping("/message")
    public String message() {
        return "Your spring boot application is deployed to Microsoft azure platform successfully";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
