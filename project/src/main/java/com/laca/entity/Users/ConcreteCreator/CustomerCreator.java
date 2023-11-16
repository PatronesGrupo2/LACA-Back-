package com.laca.entity.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.Customer;

public class CustomerCreator implements UserCreator {
    public CustomerCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new Customer(ID, userID, fullName);
    }
}
