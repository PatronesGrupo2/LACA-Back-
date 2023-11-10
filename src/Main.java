import Entities.Routes.ConcretePrototype.*;
import Entities.Routes.PrototypeModel.RoutePrototype;
import Entities.Routes.RouteFactory.RouteFactory;

public class Main {
    public static void main(String[] args) {


        //Prototype
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

        //myroute1.setName("Ruta personalizada 1");
        //myroute2.setName("Ruta personalizada 2");

        System.out.println("Route 1: " + myroute1.getName());
        System.out.println("Route 2: " + myroute2.getName());
    }
}