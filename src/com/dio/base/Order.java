package com.dio.base;

import java.math.BigDecimal;

/**
 *  @author Daniel Fonseca
 *  @version 1.0.0
 *  @see BigDecimal
 *  @since Release 1.0.0
 */
public class Order {

    // Representa o código do pedido
    private String code;
    private final BigDecimal totalValue;

    /**
     *  Construtor da classe
     *  @param  code        Código do pedido
     *  @param  totalValue  valor total do pedido
     */
    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     *  Calcula o total de acordo com o valor do pedido. Se o valor for maior que R$100,00 uma taxa será cobrada
     * @return  valor total do pedido com as taxas
     * @throws  RuntimeException    Se o valor do pedido for negativo
     * */
    public BigDecimal calculateFee() throws RuntimeException {
        if(this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo");
        }
        if(this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

}
