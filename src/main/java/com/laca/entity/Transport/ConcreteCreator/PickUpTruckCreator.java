package com.laca.entity.Transport.ConcreteCreator;

import com.laca.entity.Transport.AbstractCreator.TransportCreator;
import com.laca.entity.Transport.AbstractProduct.TransportUnit;
import com.laca.entity.Transport.ConcreteProduct.PickUpTruckUnit;

public class PickUpTruckCreator implements TransportCreator {

    @Override
    public TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        return new PickUpTruckUnit(maxMeasureCapacity, name,plate, height, width, maxWeight);
    }
}
