package com.laca.entity.Package.builder;

import com.laca.entity.Package.classes.Package;
import com.laca.entity.Package.components.PackageSize;
import com.laca.entity.Package.components.PackageWeight;
import com.laca.entity.Package.instanceEnum.PackageType;

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
        return new Package(this.packageType,
                this.packageRecipientsName,
                this.packageDescription,
                this.packagePrice,
                this.packageSize,
                this.packageWeight,
                this.weightClassification);
    }
}