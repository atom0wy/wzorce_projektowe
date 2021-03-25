package wzorce_projektowe.factoryMethod;

public abstract class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car();
            case MOTORCYCLE:
                return new Motorcycle();
            case QUAD:
                return new Quad();
            default:
                return null;
        }
    }
}