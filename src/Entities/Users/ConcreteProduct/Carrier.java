package Entities.Users.ConcreteProduct;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.Strategy.RegisterTransportUnitStrategy;
import org.jetbrains.annotations.NotNull;

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

    public void registerTransport(@NotNull RegisterTransportUnitStrategy registerStrategy, @NotNull TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight){
        registerStrategy.registerTransport(transportCreator, maxMeasureCapacity, name, plate, height, width, maxWeight);
    }
}
