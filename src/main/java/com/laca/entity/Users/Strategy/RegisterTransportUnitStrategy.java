package com.laca.entity.Users.Strategy;

import com.laca.entity.Transport.AbstractCreator.TransportCreator;

public interface RegisterTransportUnitStrategy {
    void registerTransport(TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight);
}
