package Entities.Users.ConcreteProduct;

import Entities.Users.AbstractProduct.User;

public class PackageViewer implements User {
    private int packegeViewerID;
    private String ID;
    private String fullName;

    public PackageViewer(int packegeViewerID, String ID, String fullName) {
        this.packegeViewerID = packegeViewerID;
        this.ID = ID;
        this.fullName = fullName;
    }

    public PackageViewer() {
    }

    public int getPackegeViewerID() {
        return packegeViewerID;
    }

    public void setPackegeViewerID(int packegeViewerID) {
        this.packegeViewerID = packegeViewerID;
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
        return "PackageViewer{" +
                "packegeViewerID=" + packegeViewerID +
                ", ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
