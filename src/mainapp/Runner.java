package mainapp;
import builder.*;
import factory.VehicleFactory;
import vehicles.VehicleType;


public class Runner {

	public static void main(String[] args) {
		

		Garage garage = new Garage();
		VehicleFactory vf = new VehicleFactory();
		
		garage.addVehicle(vf.getVehicle(VehicleType.CAR)
				.setEngineCapacity(1.4)
				.setFuelType("Petrol")
				.setWheels(4)
				.build());
		
		garage.returnGarage();
		

	}

}
