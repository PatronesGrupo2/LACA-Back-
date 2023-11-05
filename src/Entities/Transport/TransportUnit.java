package Entities.Transport;

public class TransportUnit {
    private double maxMeasureCapacity;
    private String name;
    private String plate;
    private double size;
    private double height;
    private double width;
    private String type; // OnFoot, Motorcycle, Truck, PickUpTruck
    private double maxWeigth;

    public TransportUnit() {
    }

    public TransportUnit(double maxMeasureCapacity, String name, String plate, String type, double maxWeigth) {
        this.maxMeasureCapacity = maxMeasureCapacity;
        this.name = name;
        this.plate = plate;
        this.size = height * width;
        this.type = type;
        this.maxWeigth = maxWeigth;
    }
}
