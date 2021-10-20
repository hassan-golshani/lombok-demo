package com.codestack.lombok;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(1, CarType.SEDAN, CarCompany.TOYOTA, "Camry", new BigDecimal(999));
        car.setPrice(new BigDecimal(1000));

        System.out.println(car);
    }
}