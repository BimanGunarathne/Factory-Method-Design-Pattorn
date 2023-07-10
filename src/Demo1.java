import resource.*;

public class Demo1 {
    public static void main(String[] args) {
        Vehicle car = Factory.getInstance().getVehicle(VehicleType.CAR);
        Vehicle van = Factory.getInstance().getVehicle(VehicleType.VAN);
        Vehicle bus = Factory.getInstance().getVehicle(VehicleType.BUS);
    }
}
