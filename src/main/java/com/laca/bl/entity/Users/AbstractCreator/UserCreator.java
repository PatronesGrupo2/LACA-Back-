package com.laca.bl.entity.Users.AbstractCreator;

import com.laca.bl.entity.Users.AbstractProduct.User;

public interface UserCreator {
    User createUser(int ID, String userID, String fullName);
}
