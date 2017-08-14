package com.nocotom.calculator;

import java.math.BigDecimal;

public class DivideExpression extends BinaryExpression {

    public DivideExpression(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    BigDecimal evaluate(BigDecimal first, BigDecimal second) {
        return first.divide(second);
    }
}
