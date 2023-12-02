package Entities.Users.Strategy.ConcreteStrategy;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Users.Strategy.RegisterTransportUnitStrategy;

public class RegisterMotocycleUnitStrategy implements RegisterTransportUnitStrategy {
    @Override
    public void registerTransport(TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        transportCreator.createTransport(maxMeasureCapacity, name, plate, height, width, maxWeight);
    }
}
