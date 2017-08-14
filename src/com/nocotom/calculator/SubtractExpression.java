package com.nocotom.calculator;

import java.math.BigDecimal;

public class SubtractExpression extends BinaryExpression {

    public SubtractExpression(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    BigDecimal evaluate(BigDecimal first, BigDecimal second) {
        return first.subtract(second);
    }
}
