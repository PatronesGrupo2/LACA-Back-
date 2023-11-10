package Entities.Users.AbstractCreator;

import Entities.Users.AbstractProduct.User;

public interface UserCreator {
    User createUser(int ID, String userID, String fullName);
}
