package kz.aitu.oop.assignment6.factoryMethod;

public class SeaLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
