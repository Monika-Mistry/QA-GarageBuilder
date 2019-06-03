package builder;
import vehicles.Car;
import vehicles.Vehicle;
public class CarBuilder extends VehicleBuilder {

	@Override
	public Vehicle build() {
		Car car = new Car();
		car.setEngineCapacity(engineCapacity);
		car.setFuelType(fuelType);
		car.setWheels(wheels);
		return car;
	}


}
