package com.yodlee.design.patterns.creational.iterator;

public class IteratorClient {
    public static void main(String[] args) {
        String[] names={"Vinay", "Kiran", "Vikram", "Abhishek"};
        Collection<String> nameList = new Collection<>(names);

        Iterator<String> iterator = nameList.iterator();
        System.out.println(iterator.hasNext());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}