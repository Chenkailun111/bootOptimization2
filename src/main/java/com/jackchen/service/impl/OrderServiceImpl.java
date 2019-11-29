package com.jackchen.service.impl;

import com.jackchen.model.OrderDTO;
import com.jackchen.service.CalculateService;
import com.jackchen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private Map<String, CalculateService> calculateServiceMap;
    @Override
    public String order(OrderDTO orderDTO) {
        if (orderDTO.getType() == null){
            throw new RuntimeException("促销方案不可以为空");
        }
        return calculateServiceMap.get(orderDTO.getType()).calculate(orderDTO);
    }
}
