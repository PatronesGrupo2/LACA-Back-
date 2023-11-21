package com.laca.entity.Transport.ConcreteCreator;

import entity.Transport.AbstractCreator.TransportCreator;
import entity.Transport.AbstractProduct.TransportUnit;
import entity.Transport.ConcreteProduct.TruckUnit;

public class TruckCreator implements TransportCreator {

    @Override
    public TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        return new TruckUnit(maxMeasureCapacity, name,plate, height, width, maxWeight);
    }
}
