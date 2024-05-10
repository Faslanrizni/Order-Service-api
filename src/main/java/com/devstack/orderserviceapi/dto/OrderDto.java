package com.devstack.orderserviceapi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {


    private Long OrderId;
    private Long CustomerId;
    private Long productId;
    private Double cost;
}
