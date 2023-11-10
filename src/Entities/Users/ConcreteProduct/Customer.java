package Entities.Users.ConcreteProduct;

import Entities.Users.AbstractProduct.User;

public class Customer implements User {
    private int customerID;
    private String ID;
    private String fullName;

    public Customer(int customerID, String ID, String fullName) {
        this.customerID = customerID;
        this.ID = ID;
        this.fullName = fullName;
    }
}
