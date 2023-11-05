package Entities.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.OnFootUnit;

public class OnFootCreator implements TransportCreator {
    @Override
    public TransportUnit createTransport() {
        return new OnFootUnit();
    }
}
