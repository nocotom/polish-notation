package com.nocotom.calculator;

import java.math.BigDecimal;

public class AdditionExpression extends BinaryExpression {

    public AdditionExpression(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    BigDecimal evaluate(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }
}
