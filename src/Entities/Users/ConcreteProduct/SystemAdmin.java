package Entities.Users.ConcreteProduct;

import Entities.Users.AbstractProduct.User;

public class SystemAdmin implements User {
    private int systemAdminID;
    private String ID;
    private String fullName;

    public SystemAdmin(int systemAdminID, String ID, String fullName) {
        this.systemAdminID = systemAdminID;
        this.ID = ID;
        this.fullName = fullName;
    }
}
