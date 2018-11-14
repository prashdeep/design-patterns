package com.yodlee.design.patterns.creational;

import java.io.Serializable;

public enum SingleTonEnum implements Serializable {

    INSTANCE;



     Singleton getInstance(){
        return Singleton.getInstance();
    }
}
