package Entities.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.TruckUnit;

public class TruckCreator implements TransportCreator {
    private double maxMeasureCapacity;
    private String name;
    private String plate;
    private double size;
    private double height;
    private double width;
    private double maxWeigth;

    public TruckCreator(double maxMeasureCapacity, String name, String plate,
                        double size, double height, double width,
                        double maxWeigth) {
        this.maxMeasureCapacity = maxMeasureCapacity;
        this.name = name;
        this.plate = plate;
        this.size = size;
        this.height = height;
        this.width = width;
        this.maxWeigth = maxWeigth;
    }

    @Override
    public TransportUnit createTransport() {
        return new TruckUnit();
    }
}
