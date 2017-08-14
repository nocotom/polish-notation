package com.nocotom.calculator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Stack;

public class PolishNotationExpression implements Expression {

    private final Expression entryPoint;

    public PolishNotationExpression(String notation, Map<String, Expression> variables, Map<String, OperatorFactory> operators) {
        entryPoint = parseNotation(notation, variables, operators);
    }

    @Override
    public BigDecimal evaluate() {
        return entryPoint.evaluate();
    }

    private Expression parseNotation(String notation, Map<String, Expression> variables, Map<String, OperatorFactory> operators) {
        Stack<Expression> expressions = new Stack<>();
        String reversedNotation = new StringBuilder(notation).reverse().toString();
        for (final String token : reversedNotation.split(" ")) {
            if (operators.containsKey(token)) {
                OperatorFactory factory = operators.get(token);
                expressions.push(factory.create(expressions.pop(), expressions.pop()));
            } else if (variables.containsKey(token)) {
                Expression expression = variables.get(token);
                expressions.push(expression);
            } else {
                throw new IllegalArgumentException("Unrecognized token: '" + token + "'.");
            }
        }

        return expressions.pop();
    }
}
