package com.laca.entity.Transport.AbstractCreator;

import entity.Transport.AbstractProduct.TransportUnit;

public interface TransportCreator {
    TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight);
}
