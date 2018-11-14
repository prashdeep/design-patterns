package com.yodlee.design.patterns.creational;

import java.io.*;

public class SingletonClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* Singleton instance = Singleton.getInstance();

        ObjectOutput outputStream = new ObjectOutputStream( new FileOutputStream(new File("file.ser"))) ;

        outputStream.writeObject(instance);

        outputStream.close();

        ObjectInput inputStream = new ObjectInputStream( new FileInputStream(new File("file.ser"))) ;
        Singleton returnObject = (Singleton)inputStream.readObject();

        System.out.println("Two instances are same : "+(instance == returnObject));
*/
       SingleTonEnum instance = SingleTonEnum.INSTANCE;
        SingleTonEnum secondInstance = SingleTonEnum.INSTANCE;

        ObjectOutput outputStream =
                new ObjectOutputStream( new FileOutputStream(new File("file.ser"))) ;

        outputStream.writeObject(instance);

        outputStream.close();

        ObjectInput inputStream = new ObjectInputStream( new FileInputStream(new File("file.ser"))) ;
        SingleTonEnum returnObject = (SingleTonEnum)inputStream.readObject();

        System.out.println("Two instances are same : "+(instance == returnObject));


    }
}