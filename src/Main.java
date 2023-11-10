import Entities.Routes.ConcretePrototype.*;
import Entities.Routes.PrototypeModel.RoutePrototype;
import Entities.Routes.RouteFactory.RouteFactory;
import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteCreator.MotorcycleCreator;
import Entities.Transport.ConcreteCreator.OnFootCreator;
import Entities.Transport.ConcreteCreator.PickUpTruckCreator;
import Entities.Transport.ConcreteCreator.TruckCreator;


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
        System.out.println("Route 2: " + myroute2.getName()+"\n");

        //Factory-Transport
        TransportCreator motorcycleCreator = new MotorcycleCreator();
        TransportUnit motorcycle = motorcycleCreator.createTransport(20.5, "Ferrari", "454ADR", 4.3, 3.1, 500.25);
        System.out.println("* Transports:\n"+motorcycle.toString());

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

        //Builder-Package
    }
}