package com.laca.bl.entity.Transport.Decorator.abstractComponent;

import com.laca.bl.entity.Transport.AbstractProduct.TransportUnit;

public class BasicTransport implements TransportUnit {

        private int unitSerialNumber;
        private String licensePlate;

    public BasicTransport() {
    }

    public BasicTransport(int unitSerialNumber, String licensePlate) {
        this.unitSerialNumber = unitSerialNumber;
        this.licensePlate = licensePlate;
    }

    public int getUnitSerialNumber() {
        return unitSerialNumber;
    }

    public void setUnitSerialNumber(int unitSerialNumber) {
        this.unitSerialNumber = unitSerialNumber;
    }

    public String getPlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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

    @Override
    public String toString() {
        return "BasicTransport{" +
                "unitSerialNumber=" + unitSerialNumber +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
