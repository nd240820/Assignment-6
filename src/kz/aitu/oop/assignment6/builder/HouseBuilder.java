package kz.aitu.oop.assignment6.builder;

public abstract class HouseBuilder {
    House house;

    void createHouse() {
        house = new House();
    }

    abstract void buildHouse();

    abstract void buildHouseType();

    abstract void buildWalls();

    abstract void buildDoors();

    abstract void buildRoof();

    abstract void buildWindows();

    abstract void buildGarage();

    abstract void buildSwimmingPool();

    abstract void buildFancyStatues();

    abstract void buildGarden();

    House getHouse() {
        return house;
    }
}
