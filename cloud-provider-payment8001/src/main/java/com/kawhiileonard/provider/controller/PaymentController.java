package com.kawhiileonard.provider.controller;

import com.kawhiileonard.provider.model.CommonResult;
import com.kawhiileonard.provider.model.Payment;
import com.kawhiileonard.provider.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description
 * @auth kawhiileonard
 * @date 2021/3/13 13:23
 */
@RestController
@RequestMapping("/pay")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/add")
    public CommonResult create(Payment payment) {
        return paymentService.insert(payment) > 0 ?
                new CommonResult(200, "成功") : new CommonResult(500, "失败");
    }

    @GetMapping("/find/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        return new CommonResult(200, "成功", paymentService.selectById(id));
    }
}
