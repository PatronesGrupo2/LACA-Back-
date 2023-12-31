package com.laca.bl.entity.Transport.ConcreteProduct;

import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;

public class OnFootUnit implements TransportUnit {
    private double maxMeasureCapacity;
    private String name;
    private String plate;
    private double size;
    private double height;
    private double width;
    private double maxWeigth;

    public OnFootUnit() {
    }

    public OnFootUnit(double maxMeasureCapacity, String name, String plate, double height, double width, double maxWeigth) {
        this.maxMeasureCapacity = maxMeasureCapacity;
        this.name = name;
        this.plate = plate;
        this.size = height * width;
        this.maxWeigth = maxWeigth;
    }

    public double getMaxMeasureCapacity() {
        return maxMeasureCapacity;
    }

    public void setMaxMeasureCapacity(double maxMeasureCapacity) {
        this.maxMeasureCapacity = maxMeasureCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getMaxWeigth() {
        return maxWeigth;
    }

    public void setMaxWeigth(double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    @Override
    public String toString() {
        return "OnFootUnit{" +
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
    public void deliver() {

    }

    @Override
    public void assignRoute() {

    }

    @Override
    public void loadPackage() {

    }
}
