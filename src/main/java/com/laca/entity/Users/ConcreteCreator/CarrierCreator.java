package com.laca.entity.Users.ConcreteCreator;

import entity.Users.AbstractCreator.UserCreator;
import entity.Users.AbstractProduct.User;
import entity.Users.ConcreteProduct.Carrier;

public class CarrierCreator implements UserCreator {
    public CarrierCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new Carrier(ID, userID, fullName);
    }
}
