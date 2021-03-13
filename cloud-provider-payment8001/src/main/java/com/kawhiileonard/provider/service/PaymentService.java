package com.kawhiileonard.provider.service;

import com.kawhiileonard.provider.model.Payment;

/**
 * @description
 * @auth kawhiileonard
 * @date 2021/3/13 13:21
 */
public interface PaymentService {
    int insert(Payment payment);

    Payment selectById( Long id);
}
