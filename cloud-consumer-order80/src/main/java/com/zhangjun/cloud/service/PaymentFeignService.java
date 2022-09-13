package com.zhangjun.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 张钧
 * @Description
 * @create 2022-09-06 11:57
 */
@Component
@FeignClient("CLOUD-COMPUTE-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/compute/get/{tax}")
    public String getTax(@PathVariable("tax") Long tax);
}
