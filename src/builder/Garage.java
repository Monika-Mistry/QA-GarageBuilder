package builder;
import java.util.ArrayList;
import java.util.List;

import vehicles.Vehicle;

public class Garage {
	
	private List<Vehicle> garage = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle v) {
		garage.add(v);
	}
	
	public void returnGarage(){
		garage.stream().forEach(v -> System.out.println(v));
	}

}
