
import Entities.Package.builder.PackageBuilder;
import Entities.Package.instanceEnum.PackageType;
import Entities.Package.classes.Package;

import java.util.Scanner;

import Entities.Routes.ConcretePrototype.*;
import Entities.Routes.PrototypeModel.RoutePrototype;
import Entities.Routes.RouteFactory.RouteFactory;
//
import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteCreator.MotorcycleCreator;
import Entities.Transport.ConcreteCreator.OnFootCreator;
import Entities.Transport.ConcreteCreator.PickUpTruckCreator;
import Entities.Transport.ConcreteCreator.TruckCreator;
//
import Entities.Users.AbstractCreator.UserCreator;
import Entities.Users.AbstractProduct.User;
import Entities.Users.ConcreteCreator.SystemAdminCreator;
import Entities.Users.ConcreteCreator.RouteApproverCreator;
import Entities.Users.ConcreteCreator.CustomerCreator;
import Entities.Users.ConcreteCreator.CarrierCreator;
import Entities.Users.ConcreteCreator.PackageViewerCreator;
import Entities.Users.ConcreteProduct.Carrier;

public class Main {
    public static void main(String[] args) {
        //Prototype-Route
        RouteFactory factory = new RouteFactory();
        factory.addPrototype("route1", new Route(
                "Terrestre", "Cartago, San José",
                "Ruta terrestre de Cartago a San José",
                new StartPoint("Cartago",
                        "Cartago, plaza central, las Ruinas",
                        new Coordinates_Point("Cartago, plaza central",
                                new LatLng(95153.1, 835515.8), "V37H+VGP")),
                new ArrivalPoint("San José",
                        "San José, plaza de la Cultura",
                        new Coordinates_Point("",
                                new LatLng(95601.2, 840437.2), "WWMF+C66"))));

        factory.addPrototype("route2", new Route(
                "Terrestre", "San José, Heredia",
                "Ruta terrestre de Cartago a San José",
                new StartPoint("San José",
                        "San José, plaza de la Cultura",
                        new Coordinates_Point("",
                                new LatLng(95601.2, 840437.2), "WWMF+C66")),
                new ArrivalPoint("Heredia",
                        "Heredia, Central, Fatima.",
                        new Coordinates_Point("",
                                new LatLng(95953.5, 840700.8), "XVXM+94H"))));

        RoutePrototype myroute1 = factory.createRoute("route1");
        RoutePrototype myroute2 = factory.createRoute("route2");

        System.out.println("\n* Routes:\n"+"Route 1: " + myroute1.getName());
        System.out.println("Route 2: " + myroute2.getName());

        //Factory-Transport
        TransportCreator motorcycleCreator = new MotorcycleCreator();
        TransportUnit motorcycle = motorcycleCreator.createTransport(20.5, "Ferrari", "454ADR", 4.3, 3.1, 500.25);
        System.out.println("\n* Transports:\n"+motorcycle.toString());

        TransportCreator onFootCreator = new OnFootCreator();
        TransportUnit onfoot = onFootCreator.createTransport(50.5, "Indio", "None", 1.80, 50, 50);
        System.out.println(onfoot.toString());

        TransportCreator pickUpCreator = new PickUpTruckCreator();
        TransportUnit pickUp = pickUpCreator.createTransport(50.6, "Toyota", "EFG84T", 8.2, 5.4, 1500.50);
        System.out.println(pickUp.toString());

        TransportCreator truckCreator = new TruckCreator();
        TransportUnit truck = truckCreator.createTransport(100.2, "Volvo", "ERF988", 10.2, 5.8, 2500.25);
        System.out.println(truck.toString());

        //Factory-User
        UserCreator carrierCreator = new CarrierCreator();
        User carrier = carrierCreator.createUser(1, "111111111", "Joshua Bolanos");
        System.out.println("\n* Users:\n"+carrier.toString());

        UserCreator customerCreator = new CustomerCreator();
        User customer = customerCreator.createUser(2, "111111112", "Juan Diego Sequeira");
        System.out.println(customer.toString());

        UserCreator packageViewerCreator = new PackageViewerCreator();
        User packageViewer = packageViewerCreator.createUser(3, "111111113", "Cynthia Sancho");
        System.out.println(packageViewer.toString());

        UserCreator routeApproverCreator = new RouteApproverCreator();
        User routeApprover = routeApproverCreator.createUser(4, "111111114", "Jhonny Perez");
        System.out.println(routeApprover.toString());

        UserCreator systemAdminCreator = new SystemAdminCreator();
        User systemAdmin = systemAdminCreator.createUser(5, "111111115", "Alejandro Ortiz");
        System.out.println(systemAdmin.toString());

        //Builder-Package
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