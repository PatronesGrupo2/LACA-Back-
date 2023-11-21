package com.laca.entity.Users.ConcreteCreator;

import com.laca.entity.Users.AbstractCreator.UserCreator;
import com.laca.entity.Users.AbstractProduct.User;
import com.laca.entity.Users.ConcreteProduct.PackageViewer;

public class PackageViewerCreator implements UserCreator {
    public PackageViewerCreator() {
    }

    public User createUser(int ID, String userID, String fullName) {
        return new PackageViewer(ID, userID, fullName);
    }
}
