package kz.aitu.oop.assignment6.builder;

public class House {
    private String house;
    private HouseType houseType;
    private int walls;
    private int doors;
    private String roof;
    private int windows;
    private boolean garage;
    private boolean swimmingPool;
    private boolean fancyStatues;
    private boolean garden;

    public void setHouse(String house) {
        this.house = house;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void setFancyStatues(boolean fancyStatues) {
        this.fancyStatues = fancyStatues;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "house='" + house + '\'' +
                ", houseType=" + houseType +
                ", walls=" + walls +
                ", doors=" + doors +
                ", roof='" + roof + '\'' +
                ", windows=" + windows +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", fancyStatues=" + fancyStatues +
                ", garden=" + garden +
                '}';
    }
}