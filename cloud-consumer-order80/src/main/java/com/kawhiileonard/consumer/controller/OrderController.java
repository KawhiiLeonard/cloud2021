package com.kawhiileonard.consumer.controller;

import com.kawhiileonard.provider.model.CommonResult;
import com.kawhiileonard.provider.model.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description
 * @auth kawhiileonard
 * @date 2021/3/13 15:20
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    private static final String PARAM_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PARAM_URL + "/pay/add", payment, CommonResult.class);
    }

    @GetMapping("/find/{id}")
    public CommonResult find(@PathVariable Long id) {
        return restTemplate.getForObject(PARAM_URL + "/pay/find/" + id, CommonResult.class);
    }
}
