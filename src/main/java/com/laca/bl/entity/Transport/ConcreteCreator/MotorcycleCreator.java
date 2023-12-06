package com.laca.bl.entity.Transport.ConcreteCreator;

import com.laca.bl.entity.Transport.ConcreteProduct.MotorcycleUnit;
import com.laca.bl.entity.Transport.AbstractCreator.TransportCreator;
import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;

public class MotorcycleCreator implements TransportCreator {
    @Override
    public TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        return new MotorcycleUnit(maxMeasureCapacity, name,plate, height, width, maxWeight);
    }
}
