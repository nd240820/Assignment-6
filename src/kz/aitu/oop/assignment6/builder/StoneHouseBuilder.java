package kz.aitu.oop.assignment6.builder;

public class StoneHouseBuilder extends HouseBuilder {
    @Override
    void buildHouse() {
        house.setHouse("Stone");
    }

    @Override
    void buildHouseType() {
        house.setHouseType(HouseType.STONE);
    }

    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
        house.setDoors(2);
    }

    @Override
    void buildRoof() {
        house.setRoof("Metallic");
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
        house.setFancyStatues(true);
    }

    @Override
    void buildGarden() {
        house.setGarden(true);
    }
}
