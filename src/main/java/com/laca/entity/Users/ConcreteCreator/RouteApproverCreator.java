package com.laca.entity.Users.ConcreteCreator;

import com.laca.entity.Users.AbstractCreator.UserCreator;
import com.laca.entity.Users.AbstractProduct.User;
import com.laca.entity.Users.ConcreteProduct.RouteApprover;

public class RouteApproverCreator implements UserCreator {
    public RouteApproverCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new RouteApprover(ID, userID, fullName);
    }
}
