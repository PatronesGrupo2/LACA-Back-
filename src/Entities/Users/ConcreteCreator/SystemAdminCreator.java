package Entities.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.Carrier;
import Entities.Users.ConcreteProduct.SystemAdmin;

public class SystemAdminCreator implements UserCreator {
    public SystemAdminCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new SystemAdmin(ID, userID, fullName);
    }

}
