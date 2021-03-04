package com.example.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableEurekaClient
@SpringBootApplication
public class CloudclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudclientApplication.class, args);
    }

}
