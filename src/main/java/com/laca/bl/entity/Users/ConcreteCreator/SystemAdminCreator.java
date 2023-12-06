package com.laca.bl.entity.Users.ConcreteCreator;

import com.laca.bl.entity.Users.AbstractCreator.UserCreator;
import com.laca.bl.entity.Users.AbstractProduct.User;
import com.laca.bl.entity.Users.ConcreteProduct.SystemAdmin;

public class SystemAdminCreator implements UserCreator {
    public SystemAdminCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new SystemAdmin(ID, userID, fullName);
    }

}
