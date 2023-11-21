package com.laca.entity.Package.builder;


import com.laca.entity.Package.components.PackageSize;
import com.laca.entity.Package.components.PackageWeight;
import com.laca.entity.Package.instanceEnum.PackageType;

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