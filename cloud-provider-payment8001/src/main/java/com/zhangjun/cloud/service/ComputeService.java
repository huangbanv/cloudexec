package com.zhangjun.cloud.service;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author 张钧
 * @Description
 * @create 2022-09-06 12:06
 */
@Component
public class ComputeService {
    public String getTax(Long tax) {
        if(tax > 800){
            return "8001端口" + new BigDecimal(tax).subtract(new BigDecimal(800)).multiply(new BigDecimal("0.8"));
        }
        return "8001端口" + 0;
    }
}
