package com.laca.entity.Users.ConcreteCreator;

import entity.Users.AbstractCreator.UserCreator;
import entity.Users.AbstractProduct.User;
import entity.Users.ConcreteProduct.RouteApprover;

public class RouteApproverCreator implements UserCreator {
    public RouteApproverCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new RouteApprover(ID, userID, fullName);
    }
}
