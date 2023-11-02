package Entities.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.Carrier;
import Entities.Users.ConcreteProduct.Customer;

public class CustomerCreator implements UserCreator {
    public CustomerCreator() {
    }

    public User createUser() {
        return new Customer();
    }
}
