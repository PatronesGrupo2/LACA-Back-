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

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
