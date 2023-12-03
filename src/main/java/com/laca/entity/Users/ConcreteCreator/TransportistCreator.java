package com.laca.entity.Users.ConcreteCreator;

import com.laca.entity.Users.AbstractCreator.UserCreator;
import com.laca.entity.Users.AbstractProduct.User;
import com.laca.entity.Users.ConcreteProduct.Transportist;

public class TransportistCreator implements UserCreator {
    public TransportistCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new Transportist(ID, userID, fullName);
    }
}
