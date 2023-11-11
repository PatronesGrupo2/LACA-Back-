package Entities.Package.director;

import Entities.Package.builder.Builder;
import Entities.Package.components.PackageSize;
import Entities.Package.instanceEnum.*;

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
