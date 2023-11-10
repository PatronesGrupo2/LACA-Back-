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

    public RouteApprover() {
    }

    public int getRouteApproverID() {
        return routeApproverID;
    }

    public void setRouteApproverID(int routeApproverID) {
        this.routeApproverID = routeApproverID;
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
        return "RouteApprover{" +
                "routeApproverID=" + routeApproverID +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
