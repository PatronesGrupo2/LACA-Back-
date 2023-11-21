package com.laca.entity.Users.ConcreteCreator;

import com.laca.entity.Users.AbstractCreator.UserCreator;
import com.laca.entity.Users.AbstractProduct.User;
import com.laca.entity.Users.ConcreteProduct.Carrier;

public class CarrierCreator implements UserCreator {
    public CarrierCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new Carrier(ID, userID, fullName);
    }
}
