package com.pluralsight;

public class CellPhone {
    //private not able to be accessed outside of Cellphone.java
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //parameterless constructor, that means theres nothing in the CellPhone()
    //what should be done to construct a cell phone

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(int newSerialNumber){
        this.serialNumber = newSerialNumber;
    }

}

