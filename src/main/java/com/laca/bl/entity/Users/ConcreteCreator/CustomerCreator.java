package com.laca.bl.entity.Users.ConcreteCreator;

import com.laca.bl.entity.Users.AbstractCreator.UserCreator;
import com.laca.bl.entity.Users.AbstractProduct.User;
import com.laca.bl.entity.Users.ConcreteProduct.Customer;

public class CustomerCreator implements UserCreator {
    public CustomerCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new Customer(ID, userID, fullName);
    }
}
