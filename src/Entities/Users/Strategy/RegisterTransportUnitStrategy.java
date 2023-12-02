package Entities.Users.Strategy;

import Entities.Transport.AbstractCreator.TransportCreator;

public interface RegisterTransportUnitStrategy {
    void registerTransport(TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight);
}
