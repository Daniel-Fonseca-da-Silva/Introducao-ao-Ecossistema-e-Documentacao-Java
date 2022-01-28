package com.dio.base;

public class Order {

    private String code;
    private final int totalValue;

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

//    public double calculateFee() {
//        if(this.totalValue > 100) {
//            return this.totalValue * 0.99;
//        } else {
//            return this.totalValue;
//        }
//    }

        public double calculateFee() {
        switch (totalValue) {
            case 100:
                    return totalValue * 0.99;
            case 200:
                    return totalValue * 1.99;
            default:
                return totalValue;
        }
    }


}
