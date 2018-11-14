package com.yodlee.design.patterns.creational.adaptor;

public class AddressAdaptorClient {

    public static void main(String[] args) {
        Address address = new Address();
        address.setName("Vinay");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setZipCode("577142");

        LegacyExportAddress legacyExportAddress = new LegacyExportAddress(address);

        AddressAdaptor addressAdaptor = new AddressAdaptor(legacyExportAddress);

        addressAdaptor.setNewerImplementation((addresses)-> {
            StringBuffer stringBuffer = new StringBuffer();
            for(String str: addresses){
                stringBuffer.append(str+"\n");
            }
            System.out.println(stringBuffer.toString());
        });

        addressAdaptor.printAddress();

    }
}