package com.laca.entity.Transport.ConcreteCreator;

import entity.Transport.AbstractCreator.TransportCreator;
import entity.Transport.AbstractProduct.TransportUnit;
import entity.Transport.ConcreteProduct.OnFootUnit;

public class OnFootCreator implements TransportCreator {

    @Override
    public TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        return new OnFootUnit(maxMeasureCapacity, name,plate, height, width, maxWeight);
    }
}