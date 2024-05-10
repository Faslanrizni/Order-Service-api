package com.devstack.orderserviceapi.service;

import com.devstack.orderserviceapi.dto.OrderDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public interface OrderService {
    public void makeOrder(OrderDto dto);
}
