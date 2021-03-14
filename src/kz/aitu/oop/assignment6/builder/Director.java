package kz.aitu.oop.assignment6.builder;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.createHouse();
        builder.buildHouse();
        builder.buildHouseType();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildWindows();
        builder.buildGarage();
        builder.buildSwimmingPool();
        builder.buildFancyStatues();
        builder.buildGarden();

        House house = builder.getHouse();

        return house;
    }
}

