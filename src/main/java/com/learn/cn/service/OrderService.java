package com.learn.cn.service;

import com.learn.cn.error.BusinessException;
import com.learn.cn.service.model.OrderModel;

public interface OrderService {

    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}
