package com.jackchen.service;

import com.jackchen.model.OrderDTO;
import org.springframework.stereotype.Service;

@Service("hander2")
public class Hander2 implements CalculateService {
    @Override
    public String calculate(OrderDTO dto) {

        return "--------第二种处理方式-----------";
    }
}
