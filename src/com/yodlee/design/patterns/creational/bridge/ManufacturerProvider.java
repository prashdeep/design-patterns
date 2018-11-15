package com.yodlee.design.patterns.creational.bridge;

public class ManufacturerProvider {

    private Manufacturer manufacturer;
    private OSProvider osProvider;
    private Compatibility  compatibility;

    public ManufacturerProvider(Manufacturer manufacturer, OSProvider osProvider) throws InstantiationException {
        switch (manufacturer.manufactureType){
            case MACBOOK:
                if( !compatibility.isCompatible(manufacturer.manufactureType, osProvider.getOsType())){
                    throw new InstantiationException("Invalid Combination");
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