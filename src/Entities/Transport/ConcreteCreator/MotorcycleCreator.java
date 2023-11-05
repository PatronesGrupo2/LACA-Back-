package Entities.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.MotorcycleUnit;

public class MotorcycleCreator implements TransportCreator {
    public MotorcycleCreator() {
    }


    @Override
    public TransportUnit createTransport() {
        return new MotorcycleUnit();
    }
}
