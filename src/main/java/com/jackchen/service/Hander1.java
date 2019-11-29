package com.jackchen.service;

import com.jackchen.model.OrderDTO;
import org.springframework.stereotype.Service;

@Service("hander1")
public class Hander1 implements CalculateService {
    @Override
    public String calculate(OrderDTO dto) {
        return "第一种处理方式";
    }
}
