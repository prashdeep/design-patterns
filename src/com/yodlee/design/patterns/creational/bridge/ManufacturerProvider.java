package com.yodlee.design.patterns.creational.bridge;

public class ManufacturerProvider {

    private Manufacturer manufacturer;
    private OSProvider osProvider;

    public ManufacturerProvider(Manufacturer manufacturer, OSProvider osProvider) throws InstantiationException {
        switch (manufacturer.manufactureType){
            case MACBOOK:
                if( osProvider.getOsType() != OSType.MAC_OS){
                    throw xception("Invalid Combination");
                }
        }
    }


}

enum ManufactureType{
    MACBOOK,
    OTHERS
}

enum OSType{
    WINDOWS,
    UBUNTU,
    LINUX,
    MAC_OS
}