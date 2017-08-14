package com.nocotom.calculator;

import java.math.BigDecimal;

public abstract class BinaryExpression implements Expression {
    private final Expression first;
    private final Expression second;

    public BinaryExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public BigDecimal evaluate() {
        return evaluate(first.evaluate(), second.evaluate());
    }

    abstract BigDecimal evaluate(BigDecimal first, BigDecimal second);
}
