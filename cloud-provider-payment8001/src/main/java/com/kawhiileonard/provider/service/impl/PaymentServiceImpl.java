package com.kawhiileonard.provider.service.impl;

import com.kawhiileonard.provider.dao.PaymentMapper;
import com.kawhiileonard.provider.model.Payment;
import com.kawhiileonard.provider.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description
 * @auth kawhiileonard
 * @date 2021/3/13 13:22
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment selectById(Long id) {
        return paymentMapper.selectById(id);
    }
}
