package com.laca.entity.Users.Strategy.ConcreteStrategy;

import com.laca.entity.Transport.AbstractCreator.TransportCreator;
import com.laca.entity.Users.Strategy.RegisterTransportUnitStrategy;

public class RegisterTruckUnitStrategy implements RegisterTransportUnitStrategy {
    @Override
    public void registerTransport(TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        transportCreator.createTransport(maxMeasureCapacity, name, plate, height, width, maxWeight);
    }
}
