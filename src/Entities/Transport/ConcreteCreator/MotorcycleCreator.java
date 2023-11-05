package Entities.Transport.ConcreteCreator;

import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteProduct.MotorcycleUnit;

public class MotorcycleCreator implements TransportCreator {
    private double maxMeasureCapacity;
    private String name;
    private String plate;
    private double size;
    private double height;
    private double width;
    private double maxWeigth;

    public MotorcycleCreator(double maxMeasureCapacity, String name, String plate,
                             double height, double width,
                             double maxWeigth) {
        this.maxMeasureCapacity = maxMeasureCapacity;
        this.name = name;
        this.plate = plate;
        this.size = height * width;
        this.maxWeigth = maxWeigth;
    }

    @Override
    public String toString() {
        return "MotorcycleCreator{" +
                "maxMeasureCapacity=" + maxMeasureCapacity +
                ", name='" + name + '\'' +
                ", plate='" + plate + '\'' +
                ", size=" + size +
                ", height=" + height +
                ", width=" + width +
                ", maxWeigth=" + maxWeigth +
                '}';
    }

    @Override
    public TransportUnit createTransport() {
        return new MotorcycleUnit();
    }
}
