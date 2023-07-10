import resource.*;

public class Demo2 {
    public static void main(String[] args) {
        Vehicle car = new Factory().getVehicle(VehicleType.CAR);
        Vehicle van = new Factory().getVehicle(VehicleType.VAN);
        Vehicle bus = new Factory().getVehicle(VehicleType.BUS);
    }
}
