package Entities.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.Carrier;
import Entities.Users.ConcreteProduct.RouteApprover;

public class RouteApproverCreator implements UserCreator {
    public RouteApproverCreator() {
    }

    public User createUser() {
        return new RouteApprover();
    }
}
