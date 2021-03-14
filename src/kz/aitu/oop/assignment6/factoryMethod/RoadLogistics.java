package kz.aitu.oop.assignment6.factoryMethod;

public class RoadLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
