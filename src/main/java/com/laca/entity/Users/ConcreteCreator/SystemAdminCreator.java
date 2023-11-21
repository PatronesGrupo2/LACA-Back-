package com.laca.entity.Users.ConcreteCreator;

import entity.Users.AbstractCreator.UserCreator;
import entity.Users.AbstractProduct.User;
import entity.Users.ConcreteProduct.SystemAdmin;

public class SystemAdminCreator implements UserCreator {
    public SystemAdminCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new SystemAdmin(ID, userID, fullName);
    }

}
