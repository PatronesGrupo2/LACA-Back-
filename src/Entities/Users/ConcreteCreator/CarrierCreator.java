package Entities.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.Carrier;

public class CarrierCreator implements UserCreator {
    public CarrierCreator() {
    }

    public User createUser() {
        return new Carrier();
    }
}
