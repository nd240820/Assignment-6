package kz.aitu.oop.assignment6.factoryMethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivered cargo.");
    }
}
