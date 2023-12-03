package com.laca.entity.Package.director;

import com.laca.entity.Package.builder.Builder;
import com.laca.entity.Package.components.PackageSize;
import com.laca.entity.Package.instanceEnum.*;

public class Director {

    //Type, Name, Description, Cost, Size, Weight

    public void constructPackage(Builder builder, PackageType packageType, String packageRecipientsName, String packageDescription, double packagePrice, PackageSize packageSize, String weightClassification) {
        builder.setPackageType(packageType);
        builder.setPackageRecipientsName(packageRecipientsName);
        builder.setPackageDescription(packageDescription);
        builder.setPackagePrice(packagePrice);
        builder.setPackageSize(packageSize);
        builder.setWeightClassification(weightClassification);
    }

}
