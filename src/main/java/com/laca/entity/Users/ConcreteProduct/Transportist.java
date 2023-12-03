package com.laca.entity.Users.ConcreteProduct;

import com.laca.entity.Transport.AbstractCreator.TransportCreator;
import com.laca.entity.Users.AbstractProduct.User;
import com.laca.entity.Users.Strategy.RegisterTransportUnitStrategy;
import org.antlr.v4.runtime.misc.NotNull;

public class Transportist implements User {
    private int carrierID;
    private String ID;
    private String fullName;

    public Transportist() {
    }

    public Transportist(int carrierID, String ID, String fullName){
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
        return "Transportist{" +
                "carrierID=" + carrierID +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public void registerTransport(@NotNull RegisterTransportUnitStrategy registerStrategy, @NotNull TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight){
        registerStrategy.registerTransport(transportCreator, maxMeasureCapacity, name, plate, height, width, maxWeight);
    }
}
