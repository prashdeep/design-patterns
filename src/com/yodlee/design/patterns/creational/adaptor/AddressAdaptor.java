package com.yodlee.design.patterns.creational.adaptor;

public class AddressAdaptor {

    LegacyExportAddress legacyAddress;

    Adaptee newerImplementation;

    public AddressAdaptor(LegacyExportAddress legacyExportAddress){
        this.legacyAddress = legacyExportAddress;
    }

    public LegacyExportAddress getLegacyAddress() {
        return legacyAddress;
    }

    public void setLegacyAddress(LegacyExportAddress legacyAddress) {
        this.legacyAddress = legacyAddress;
    }

    public Adaptee getNewerImplementation() {
        return newerImplementation;
    }

    public void setNewerImplementation(Adaptee newerImplementation) {
        this.newerImplementation = newerImplementation;
    }

    public void printAddress(){
        newerImplementation.printAddress(this.legacyAddress.getName(), this.legacyAddress.getCity(), this.legacyAddress.getState(), this.legacyAddress.getZipCode());
    }
}