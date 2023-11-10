package Entities.Users.ConcreteProduct;

import Entities.Users.AbstractProduct.User;

public class RouteApprover implements User {
    private int routeApproverID;
    private String ID;
    private String fullName;

    public RouteApprover(int routeApproverID, String ID, String fullName) {
        this.routeApproverID = routeApproverID;
        this.ID = ID;
        this.fullName = fullName;
    }
}
