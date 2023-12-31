package com.laca.bl.entity.Package.builder;

import com.laca.bl.entity.Package.components.PackageSize;
import com.laca.bl.entity.Package.components.PackageWeight;
import com.laca.bl.entity.Package.instanceEnum.PackageType;
import com.laca.bl.entity.Package.classes.Package;

public class PackageBuilder implements Builder {

    //Type, Name, Description, Cost, Size, Weight
    private int packageID;
    private PackageType packageType;
    private String packageRecipientsName;
    private String packageDescription;
    private double packagePrice;
    private PackageSize packageSize;
    private PackageWeight packageWeight;

    private String weightClassification;

    @Override
    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }
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
        return new Package(packageID, packageType, packageRecipientsName, packageDescription, packagePrice, packageSize, packageWeight, weightClassification);
    }
}
