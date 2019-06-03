package factory;
import builder.*;
import vehicles.VehicleType;

public class VehicleFactory {

	public VehicleBuilder getVehicle(VehicleType vt) {
		switch(vt) {
		case CAR:
			return new CarBuilder();
		default:
			return null;
		}
	}
}
