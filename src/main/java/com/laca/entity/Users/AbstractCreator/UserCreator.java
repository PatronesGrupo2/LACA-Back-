package com.laca.entity.Users.AbstractCreator;

import entity.Users.AbstractProduct.User;

public interface UserCreator {
    User createUser(int ID, String userID, String fullName);
}
