package kz.aitu.oop.assignment6.factoryMethod;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Truck delivered cargo.");
    }
}
