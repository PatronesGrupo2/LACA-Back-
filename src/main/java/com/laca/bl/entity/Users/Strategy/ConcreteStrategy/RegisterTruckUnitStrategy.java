package com.laca.bl.entity.Users.Strategy.ConcreteStrategy;

import com.laca.bl.entity.Users.Strategy.RegisterTransportUnitStrategy;
import com.laca.bl.entity.Transport.AbstractCreator.TransportCreator;

public class RegisterTruckUnitStrategy implements RegisterTransportUnitStrategy {
    @Override
    public void registerTransport(TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        transportCreator.createTransport(maxMeasureCapacity, name, plate, height, width, maxWeight);
    }
}
