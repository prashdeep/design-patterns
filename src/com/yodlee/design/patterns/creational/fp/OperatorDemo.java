package com.yodlee.design.patterns.creational.fp;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {

    public static void main(String[] args) {
        BinaryOperator<Integer> sumOperator  = (a, b)-> a + b;
        BinaryOperator<Integer> subOperator = (a, b)-> a - b;

        printResult(sumOperator, 56,67);
    }

    private static void printResult(BinaryOperator operator, int a, int b){
        System.out.println(operator.apply(a, b));
    }


}




