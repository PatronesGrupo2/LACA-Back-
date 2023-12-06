package com.laca.bl.entity.Package;
import com.laca.bl.entity.Package.builder.PackageBuilder;
import com.laca.bl.entity.Package.components.PackageSize;
import com.laca.bl.entity.Package.components.PackageWeight;
import com.laca.bl.entity.Package.director.Director;
import com.laca.bl.entity.Package.instanceEnum.PackageType;
import com.laca.bl.entity.Package.classes.Package;

import java.util.Scanner;
public class InputProcessor {
        public Package processPackageInput(PackageBuilder builder, int option) {
            PackageType[] packageTypes = PackageType.values();
            PackageType selectedPackageType = packageTypes[option - 1];
            Scanner input = new Scanner(System.in);

            // General
            //Type, Name, Description, Cost, Size, Weight

            //Type, Name, Description, Cost, Size, Weight
            System.out.print("Enter the package recipients name: ");
            String packageRecipientsName = input.nextLine();
            builder.setPackageRecipientsName(packageRecipientsName);

            System.out.print("Enter the package description: ");
            String packageDescription = input.nextLine();
            builder.setPackageDescription(packageDescription);

            System.out.print("Enter the package cost: $");
            double packagePrice = input.nextDouble();
            builder.setPackagePrice(packagePrice);

            System.out.print("Enter the package height: ");
            double height = input.nextDouble();
            System.out.print("Enter the package width: ");
            double width = input.nextDouble();
            // Create a new PackageSize object with height and width
            PackageSize packageSize = new PackageSize(height, width);

            System.out.print("Enter the package weight (Max 20kg): ");
            double weight = input.nextDouble();
            if (weight > 20.0) {
                System.out.println("Weight exceeds the maximum limit of 20 kg. Please reduce the weight of your package.");
                // Return null to indicate an invalid package
                return null;
            }
            PackageWeight packageWeight = new PackageWeight(weight);
            String weightClassification = packageWeight.classifyPackage();

            // Director may know several building recipes.
            Director director = new Director();
            director.constructPackage(builder, selectedPackageType, packageRecipientsName, packageDescription, packagePrice, packageSize, weightClassification);
            // Asigna el resultado de la construcción al objeto newPackage
            return builder.getResult();
        }

}

