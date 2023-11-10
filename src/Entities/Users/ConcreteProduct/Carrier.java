package Entities.Users.ConcreteProduct;

import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteCreator.CarrierCreator;

public class Carrier implements User {
    private int carrierID;
    private String ID;
    private String fullName;

    public Carrier(int carrierID, String ID, String fullName){
        this.carrierID = carrierID;
        this.ID = ID;
        this.fullName = fullName;
    }
}
