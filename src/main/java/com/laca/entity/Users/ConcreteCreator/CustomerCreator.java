package com.laca.entity.Users.ConcreteCreator;

import entity.Users.AbstractCreator.UserCreator;
import entity.Users.AbstractProduct.User;
import entity.Users.ConcreteProduct.Customer;

public class CustomerCreator implements UserCreator {
    public CustomerCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new Customer(ID, userID, fullName);
    }
}
