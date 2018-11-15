package com.yodlee.design.patterns.creational;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        UnaryOperator<Integer> squareOperator = ( i )-> i * i;

        //System.out.println(squareOperator.apply(5));

        List<Integer> list = Arrays.asList(34,4,5,2,3,1,2,5,6,7,8,9);

        list.stream().distinct().filter(i -> i %2 ==0).sorted().forEach(System.out::println);
    }
}