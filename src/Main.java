import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteCreator.MotorcycleCreator;
import Entities.Transport.ConcreteCreator.OnFootCreator;
import Entities.Transport.ConcreteCreator.PickUpTruckCreator;
import Entities.Transport.ConcreteCreator.TruckCreator;

public class Main {
    public static void main(String[] args) {
        TransportCreator motorcycleCreator = new MotorcycleCreator();
        TransportUnit motorcycle = motorcycleCreator.createTransport(20.5, "Ferrari", "454ADR", 4.3, 3.1, 500.25);
        System.out.println(motorcycle.toString());

        TransportCreator onFootCreator = new OnFootCreator();
        TransportUnit onfoot = onFootCreator.createTransport(50.5, "Indio", "None", 1.80, 50, 50);
        System.out.println(onfoot.toString());

        TransportCreator pickUpCreator = new PickUpTruckCreator();
        TransportUnit pickUp = pickUpCreator.createTransport(50.6, "Toyota", "EFG84T", 8.2, 5.4, 1500.50);
        System.out.println(pickUp.toString());

        TransportCreator truckCreator = new TruckCreator();
        TransportUnit truck = truckCreator.createTransport(100.2, "Volvo", "ERF988", 10.2, 5.8, 2500.25);
        System.out.println(truck.toString());
        motorcycle.deliver();
    }
}