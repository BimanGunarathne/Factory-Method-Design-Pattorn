import resource.*;

public class Factory {
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType.name().equals("Car")) {
            return new Car();
        } else if (vehicleType.name().equals("Bus")) {
            return new Bus();
        }else {
            return new Van();
        }
    }
}
