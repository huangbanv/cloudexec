package com.zhangjun.cloud.controller;

import com.zhangjun.cloud.service.ComputeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 张钧
 * @Description
 * @create 2022-09-06 12:03
 */
@RestController
public class ComputeController {

    @Resource
    private ComputeService computeService;

    @GetMapping(value = "/compute/get/{tax}")
    public String  getTax(@PathVariable("tax") Long tax){
        return computeService.getTax(tax);
    }

}
