package com.laca.entity.Package.builder;


import Entities.Package.components.PackageSize;
import Entities.Package.components.PackageWeight;
import Entities.Package.instanceEnum.PackageType;

public interface Builder {

    //Type, Weight, Name, Description, Cost, Size

    void setPackageType(PackageType packageType);

    void setPackageRecipientsName(String packageRecipientsName);
    void setPackageDescription(String packageDescription);
    void setPackagePrice(double packagePrice);
    void setPackageSize(PackageSize packageSize);
    void setPackageWeight(PackageWeight packageWeight);
    void setWeightClassification(String weightClassification); // Add this method

}