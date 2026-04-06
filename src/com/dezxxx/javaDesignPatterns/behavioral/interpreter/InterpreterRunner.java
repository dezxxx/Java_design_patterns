package com.dezxxx.javaDesignPatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression expression =
                new AddExpression(
                        new NumberExpression(5),
                        new NumberExpression(10)
                );

        System.out.println(expression.interpret());
    }
}