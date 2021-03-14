package kz.aitu.oop.assignment6.builder;

public class BuildHouseRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new WoodenHouseBuilder());
        House house = director.buildHouse();

        System.out.println(house);
    }
}
