package com.nocotom.calculator;

import java.math.BigDecimal;

public class MultiplyExpression extends BinaryExpression {

    public MultiplyExpression(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    BigDecimal evaluate(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }
}
