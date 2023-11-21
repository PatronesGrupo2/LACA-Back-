package com.laca.entity.Package.builder;

import entity.Package.components.PackageSize;
import entity.Package.components.PackageWeight;
import entity.Package.instanceEnum.PackageType;

public class PackageBuilder implements Builder{

    //Type, Name, Description, Cost, Size, Weight

    private PackageType packageType;
    private String packageRecipientsName;
    private String packageDescription;
    private double packagePrice;
    private PackageSize packageSize;
    private PackageWeight packageWeight;

    private String weightClassification;


    @Override
    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    @Override
    public void setPackageRecipientsName(String packageRecipientsName) {
        this.packageRecipientsName = packageRecipientsName;
    }

    @Override
    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    @Override
    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    @Override
    public void setPackageSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }

    @Override
    public void setPackageWeight(PackageWeight packageWeight) {
        this.packageWeight = packageWeight;
    }

    @Override
    public void setWeightClassification(String weightClassification) {
        this.weightClassification = weightClassification;
    }

    public Package getResult() {
        return new Package(packageType, packageRecipientsName, packageDescription,packagePrice, packageSize, packageWeight, weightClassification);
    }
}