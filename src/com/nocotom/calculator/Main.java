package com.nocotom.calculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String polishNotation = "- * / a - b + c c d + e + c c";

        Map<String, OperatorFactory> operators = new HashMap<>();
        operators.put("+", AdditionExpression::new);
        operators.put("-", SubtractExpression::new);
        operators.put("/", DivideExpression::new);
        operators.put("*", MultiplyExpression::new);

        Map<String, Expression> variables = new HashMap<>();
        variables.put("a", new NumberExpression(BigDecimal.valueOf(15)));
        variables.put("b", new NumberExpression(BigDecimal.valueOf(7)));
        variables.put("c", new NumberExpression(BigDecimal.valueOf(1)));
        variables.put("d", new NumberExpression(BigDecimal.valueOf(3)));
        variables.put("e", new NumberExpression(BigDecimal.valueOf(2)));

        PolishNotationExpression polishNotationExpression = new PolishNotationExpression(polishNotation, variables, operators);
        BigDecimal result = polishNotationExpression.evaluate();

        System.out.println(result);
    }
}
