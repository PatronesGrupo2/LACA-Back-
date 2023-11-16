package com.laca.entity.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.PackageViewer;

public class PackageViewerCreator implements UserCreator {
    public PackageViewerCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new PackageViewer(ID, userID, fullName);
    }
}
