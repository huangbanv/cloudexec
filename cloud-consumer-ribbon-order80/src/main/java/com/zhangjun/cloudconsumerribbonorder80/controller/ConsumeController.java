package com.zhangjun.cloudconsumerribbonorder80.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 张钧
 * @Description
 * @create 2022-09-13 12:26
 */
@RestController
public class ConsumeController {

    @Autowired
    RestTemplate restTemplate;

    private static final String PROVIDER_PREFIX = "http://CLOUD-COMPUTE-SERVICE";

    @GetMapping(value = "/consumer/payment/get/{tax}")
    public String getTax(@PathVariable("tax") Long tax) {
        return restTemplate.getForObject(PROVIDER_PREFIX + "/compute/get/" + String.valueOf(tax),String.class);
    }

}
