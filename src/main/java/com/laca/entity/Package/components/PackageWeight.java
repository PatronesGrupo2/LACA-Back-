package com.laca.entity.Package.components;

public class PackageWeight {
    private double weight;

    public PackageWeight(double weight) {
        this.weight = weight;
    }

    public String classifyPackage() {
        if (weight >= 0 && weight <= 5) {
            return "Small";
        } else if (weight > 5 && weight <= 10) {
            return "Medium";
        } else if (weight > 10 && weight <= 20) {
            return "Big";
        } else {
            return "No valid";
        }
    }
}