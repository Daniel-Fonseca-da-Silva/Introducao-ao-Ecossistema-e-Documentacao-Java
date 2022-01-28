package com.dio;

import com.dio.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order("Code1234", 199);

        System.out.println(order.calculateFee());

    }
}
