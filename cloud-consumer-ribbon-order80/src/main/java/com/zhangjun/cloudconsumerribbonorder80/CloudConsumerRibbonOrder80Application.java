package com.zhangjun.cloudconsumerribbonorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerRibbonOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerRibbonOrder80Application.class, args);
    }

}
