package Entities.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.TruckUnit;

public class TruckCreator implements TransportCreator {
    @Override
    public TransportUnit createTransport() {
        return new TruckUnit();
    }
}
