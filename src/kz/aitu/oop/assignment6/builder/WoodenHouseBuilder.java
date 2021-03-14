package kz.aitu.oop.assignment6.builder;

public class WoodenHouseBuilder extends HouseBuilder {
    @Override
    void buildHouse() {
        house.setHouse("Wooden");
    }

    @Override
    void buildHouseType() {
        house.setHouseType(HouseType.WOODEN);
    }

    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
        house.setDoors(1);
    }

    @Override
    void buildRoof() {
        house.setRoof("Wooden");
    }

    @Override
    void buildWindows() {
        house.setWindows(4);
    }

    @Override
    void buildGarage() {
        house.setGarage(true);
    }

    @Override
    void buildSwimmingPool() {
        house.setSwimmingPool(false);
    }

    @Override
    void buildFancyStatues() {
        house.setFancyStatues(false);
    }

    @Override
    void buildGarden() {
        house.setGarden(true);
    }
}
