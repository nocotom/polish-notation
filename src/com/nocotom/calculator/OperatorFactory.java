package com.nocotom.calculator;

public interface OperatorFactory {

    BinaryExpression create(Expression first, Expression second);
}
