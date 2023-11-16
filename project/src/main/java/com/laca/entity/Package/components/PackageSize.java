package com.laca.entity.Package.components;

public class PackageSize {

    //Forma parte de size
    private double height;
    //Forma parte de size
    private double width;

    public PackageSize(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSize() {
        return height * width;
    }

}
