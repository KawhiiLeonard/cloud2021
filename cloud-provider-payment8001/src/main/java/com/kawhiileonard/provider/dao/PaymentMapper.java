package com.kawhiileonard.provider.dao;

import com.kawhiileonard.provider.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description
 * @auth kawhiileonard
 * @date 2021/3/12 20:41
 */
@Mapper
public interface PaymentMapper {
    int insert(Payment payment);

    Payment selectById(@Param("id") Long id);
}
