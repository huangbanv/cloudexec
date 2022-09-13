package com.zhangjun.cloud.controller;

import com.zhangjun.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.transform.Result;

/**
 * @author 张钧
 * @Description
 * @create 2022-09-06 11:56
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{tax}")
    public String getTax(@PathVariable("tax") Long tax) {
        return paymentFeignService.getTax(tax);
    }
}
