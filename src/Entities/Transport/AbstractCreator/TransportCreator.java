package Entities.Transport.AbstractCreator;

import Entities.Transport.AbstractProduct.TransportUnit;

public interface TransportCreator {
    TransportUnit createTransport(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeight);
}
