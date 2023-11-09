
import Entities.Package.builder.PackageBuilder;
import Entities.Package.instanceEnum.PackageType;
import Entities.Package.classes.Package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PackageBuilder builder = new PackageBuilder();

        System.out.println("Choose a package type:");
        int option = displayPackageTypesAndGetOption(input);

        if (option >= 1 && option <= PackageType.values().length) {
            PackageInputProcessor inputProcessor = new PackageInputProcessor();
            Package newPackage = inputProcessor.processPackageInput(builder, option);
            if (newPackage != null) {
                System.out.println("Package built: \n" + newPackage);
            }
        } else {
            System.out.println("Invalid option. Please enter a valid number.");
        }

        input.close();
    }

    // Helper method to display package types and get user input
    private static int displayPackageTypesAndGetOption(Scanner input) {
        int index = 1;
        for (PackageType packageType : PackageType.values()) {
            System.out.println(index + ". " + packageType);
            index++;
        }

        System.out.print("Enter the number of the package type: ");
        return input.nextInt();
    }
}
