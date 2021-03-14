package kz.aitu.oop.assignment6.factoryMethod;

public class Company {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        //Logistics logistics = chooseLogisticsByType("Sea");
        Transport transport = logistics.createTransport();

        transport.deliver();

    }

    static Logistics chooseLogisticsByType(String type) {
        if (type.equalsIgnoreCase("sea")) {
            return new SeaLogistics();
        } else if (type.equalsIgnoreCase("road")) {
            return new RoadLogistics();
        } else {
            throw new RuntimeException(type + " is not available delivery type.");
        }
    }
}
