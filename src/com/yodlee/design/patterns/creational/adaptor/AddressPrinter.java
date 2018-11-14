package com.yodlee.design.patterns.creational.adaptor;

public class AddressPrinter implements Adaptee {
    @Override
    public void printAddress(String... address) {

        StringBuffer stringBuffer = new StringBuffer();
        for(String str: address){
            stringBuffer.append(str+"-");
        }
        System.out.println(stringBuffer.toString());
    }
}