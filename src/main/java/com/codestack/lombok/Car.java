package com.codestack.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Car {
    private long id;
    private CarType type;
    private CarCompany company;
    private String name;
    private BigDecimal price;
}