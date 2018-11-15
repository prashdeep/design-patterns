package com.yodlee.design.patterns.creational.command;

public class CommandInvokerClient {
    public static void main(String[] args) {

        Command<Integer> addCommand = (i,j)-> i + j;
        Command<Integer> subCommand = (i,j)-> i - j;
        Command<Integer> multiplyCommand =( i,j)-> i * j;

        Invoker invoker = new Invoker(34, 56);
        invoker.addCommand(addCommand);
        invoker.addCommand(subCommand);
        invoker.addCommand(multiplyCommand);
        //invoker.addCommand(( i,j)-> i * j);
        Integer result = (Integer) invoker.execute(addCommand);
        System.out.println("The result of add command is "+result);
    }
}