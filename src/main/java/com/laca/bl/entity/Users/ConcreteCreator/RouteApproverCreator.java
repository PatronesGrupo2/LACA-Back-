package com.laca.bl.entity.Users.ConcreteCreator;

import com.laca.bl.entity.Users.AbstractCreator.UserCreator;
import com.laca.bl.entity.Users.AbstractProduct.User;
import com.laca.bl.entity.Users.ConcreteProduct.RouteApprover;

public class RouteApproverCreator implements UserCreator {
    public RouteApproverCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new RouteApprover(ID, userID, fullName);
    }
}
