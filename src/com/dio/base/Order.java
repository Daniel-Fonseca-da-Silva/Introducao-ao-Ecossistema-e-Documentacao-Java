package com.dio.base;

// Classe order
public class Order {

    private String code;
    private final int totalValue;
    private String[] itens;

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Comentário sobre while, do while, for e enhanced for
     */

    // While
//    public void printItens() {
//        int i = 0;
//        while(i < itens.length) {
//            System.out.println(itens[i]);
//            i++;
//        }
//    }

    // Do While
//    public void printItens() {
//        int i = 0;
//
//        do {
//            System.out.println(itens[i]);
//            i++;
//        }while(i < itens.length);
//    }

    // For
//    public void printItens() {
//        for(int i = 0; i < itens.length; i ++) {
//            System.out.println(itens[i]);
//        }
//    }

    // Enhanced for
    public void printItens() {
        for(String i : itens) {
            System.out.println(i);
        }
    }

}
