package com.laca.bl.entity.Users.Strategy;

import com.laca.bl.entity.Transport.AbstractCreator.TransportCreator;

public interface RegisterTransportUnitStrategy {
    void registerTransport(TransportCreator transportCreator, double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight);
}
