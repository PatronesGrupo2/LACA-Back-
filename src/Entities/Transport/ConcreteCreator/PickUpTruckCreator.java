package Entities.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.PickUpTruckUnit;

public class PickUpTruckCreator implements TransportCreator {
    @Override
    public TransportUnit createTransport() {
        return new PickUpTruckUnit();
    }
}
