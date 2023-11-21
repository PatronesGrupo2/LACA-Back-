package com.laca.entity.Users.ConcreteCreator;

import entity.Users.AbstractCreator.UserCreator;
import entity.Users.AbstractProduct.User;
import entity.Users.ConcreteProduct.PackageViewer;

public class PackageViewerCreator implements UserCreator {
    public PackageViewerCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new PackageViewer(ID, userID, fullName);
    }
}
