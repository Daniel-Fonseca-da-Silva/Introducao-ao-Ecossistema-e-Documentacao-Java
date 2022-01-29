package com.dio;

import com.dio.base.Order;

import java.math.BigDecimal;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order("Code1234", new BigDecimal("100.00"));

        System.out.println(order.calculateFee());

    }
}
