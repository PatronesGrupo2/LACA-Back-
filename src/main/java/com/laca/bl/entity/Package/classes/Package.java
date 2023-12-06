package com.laca.bl.entity.Package.classes;

import com.laca.bl.entity.Package.components.PackageSize;
import com.laca.bl.entity.Package.components.PackageWeight;
import com.laca.bl.entity.Package.instanceEnum.PackageType;

public class Package {

    private int packageID;
    private PackageType packageType;
    private String packageRecipientsName;
    private String packageDescription;
    private double packagePrice;
    private PackageSize packageSize;
    private PackageWeight packageWeight;
    private String weightClassification;


    public Package() {
    }

    public Package(int packageID, PackageType packageType, String packageRecipientsName, String packageDescription, double packageCost, PackageSize packageSize, PackageWeight packageWeight, String weightClassification) {
        this.packageID = packageID;
        this.packageType = packageType;
        this.packageRecipientsName = packageRecipientsName;
        this.packageDescription = packageDescription;
        this.packagePrice = packageCost;
        this.packageSize = packageSize;
        this.packageWeight = packageWeight;
        this.weightClassification =weightClassification;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public PackageWeight getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(PackageWeight packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getPackageRecipientsName() {
        return packageRecipientsName;
    }

    public void setPackageRecipientsName(String packageRecipientsName) {
        this.packageRecipientsName = packageRecipientsName;
    }

    public String getPackageDescription() {
        return packageDescription;
    }
    public String getWeightClassification() {
        return weightClassification;
    }

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public PackageSize getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }

    public void setWeightClassification(String weightClassification) {
        this.weightClassification = weightClassification;
    }


    public String toString() {
        String table = "ID\tType\tRecipient\tDescription\tPrice\tSize\tWeight\n";
        table += packageID + "\t" + packageType + "\t" + packageRecipientsName + "\t" + packageDescription + "\t$" + packagePrice + "\t" + packageSize.getSize() + "\t" + weightClassification;
        return table;
    }
}
