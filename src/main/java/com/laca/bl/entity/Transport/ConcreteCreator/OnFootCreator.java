package com.laca.bl.entity.Transport.ConcreteCreator;

import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;
import com.laca.bl.entity.Transport.ConcreteProduct.OnFootUnit;
import com.laca.bl.entity.Transport.AbstractCreator.TransportCreator;

public class OnFootCreator implements TransportCreator {

    @Override
    public TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight) {
        return new OnFootUnit(maxMeasureCapacity, name,plate, height, width, maxWeight);
    }
}
