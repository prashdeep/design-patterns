package com.yodlee.design.patterns.creational.adaptor;

public class LegacyExportAddress {

    private Address address;

    public LegacyExportAddress(Address address){
        this.address = address;
    }

    public String getName(){
        return address.getName();
    }

    public String getState(){
        return address.getState();
    }

    public String getZipCode(){
        return address.getZipCode();
    }

    public String getCity(){
        return address.getCity();
    }
}