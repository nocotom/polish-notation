package com.nocotom.calculator;

import java.math.BigDecimal;

public class NumberExpression implements Expression {

    private final BigDecimal number;

    public NumberExpression(BigDecimal number) {
        this.number = number;
    }

    @Override
    public BigDecimal evaluate() {
        return number;
    }
}
