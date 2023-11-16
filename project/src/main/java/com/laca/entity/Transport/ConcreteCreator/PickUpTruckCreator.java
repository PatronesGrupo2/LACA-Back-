package com.laca.entity.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.PickUpTruckUnit;

public class PickUpTruckCreator implements TransportCreator {

    @Override
    public TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        return new PickUpTruckUnit(maxMeasureCapacity, name,plate, height, width, maxWeight);
    }
}
