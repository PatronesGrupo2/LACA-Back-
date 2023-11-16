package com.laca.entity.Users.ConcreteProduct;

import Entities.Users.AbstractProduct.User;

public class Carrier implements User {
    private int carrierID;
    private String ID;
    private String fullName;

    public Carrier() {
    }

    public Carrier(int carrierID, String ID, String fullName){
        this.carrierID = carrierID;
        this.ID = ID;
        this.fullName = fullName;
    }

    public int getCarrierID() {
        return carrierID;
    }

    public void setCarrierID(int carrierID) {
        this.carrierID = carrierID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "carrierID=" + carrierID +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
