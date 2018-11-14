package com.yodlee.design.patterns.creational.builder;

public class Laptop {

    private final String cpu;
    private final int memory;
    private final int storage;

    private String osType;
    private boolean msOfficeRequired;
    private boolean fingerPrintScannerRequired;
    private String modelSize;

    private LaptopBuilder laptopBuilder;

    public Laptop(int memory, int storage, String cpu){
        this.memory = memory;
        this.storage = storage;
        this.cpu =cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    public String getOsType() {
        return osType;
    }

    public boolean isMsOfficeRequired() {
        return msOfficeRequired;
    }

    public boolean isFingerPrintScannerRequired() {
        return fingerPrintScannerRequired;
    }

    public String getModelSize() {
        return modelSize;
    }

    public static class LaptopBuilder{

        private String cpu;
        private int memory;
        private int storage;

        private boolean msOfficeRequired;
        private boolean fingerPrintScannerRequired;
        private String modelSize;

        public LaptopBuilder(int memory, int storage, String cpu){
            this.memory = memory;
            this.storage = storage;
            this.cpu =cpu;
        }

        public  LaptopBuilder setMsOfficeRequired(boolean required){
            this.msOfficeRequired = required;
            return this;
        }

        public LaptopBuilder setFingerPrintScannerRequired(boolean required){
            this.fingerPrintScannerRequired = required;
            return this;
        }

        public LaptopBuilder setModelSize(String modelSize){
            this.modelSize = modelSize;
            return this;
        }

        public Laptop build(){
            Laptop laptop = new Laptop(this.memory, this.storage, this.cpu);
            laptop.fingerPrintScannerRequired = this.fingerPrintScannerRequired;
            laptop.msOfficeRequired = this.msOfficeRequired;
            laptop.modelSize = this.modelSize;
            return laptop;
        }
    }
}