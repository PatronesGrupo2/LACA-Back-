package com.laca.entity.Users.ConcreteProduct;

import com.laca.entity.Users.AbstractProduct.User;

public class SystemAdmin implements User {
    private int systemAdminID;
    private String ID;
    private String fullName;

    public SystemAdmin(int systemAdminID, String ID, String fullName) {
        this.systemAdminID = systemAdminID;
        this.ID = ID;
        this.fullName = fullName;
    }

    public SystemAdmin() {
    }

    public int getSystemAdminID() {
        return systemAdminID;
    }

    public void setSystemAdminID(int systemAdminID) {
        this.systemAdminID = systemAdminID;
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
        return "SystemAdmin{" +
                "systemAdminID=" + systemAdminID +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
