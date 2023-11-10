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
}
