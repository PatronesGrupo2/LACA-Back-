package Entities.Users.ConcreteCreator;

import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteProduct.Carrier;
import Entities.Users.ConcreteProduct.PackageViewer;

public class PackageViewerCreator implements UserCreator {
    public PackageViewerCreator() {
    }

    public User createUser() {
        return new PackageViewer();
    }
}
