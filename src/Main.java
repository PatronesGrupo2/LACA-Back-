import Entities.Transport.AbstractCreator.TransportCreator;
import Entities.Transport.AbstractProduct.TransportUnit;
import Entities.Transport.ConcreteCreator.MotorcycleCreator;

public class Main {
    public static void main(String[] args) {
        TransportCreator motorcycleCreator = new MotorcycleCreator(6, "Hola","123AFW", 10, 5, 120.5);
        System.out.println(motorcycleCreator.toString());
        TransportUnit motorcycle = motorcycleCreator.createTransport();
        System.out.println(motorcycle.toString());
        motorcycle.deliver();
    }
}