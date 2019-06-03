package builder;
import vehicles.Vehicle;

public abstract class VehicleBuilder {

	protected int wheels;
	protected String fuelType;
	protected double engineCapacity;

	public VehicleBuilder setWheels(int wheels) {
		this.wheels = wheels;
		return this;
	}


	public VehicleBuilder setFuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}


	public VehicleBuilder setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
		return this;
	}


	public abstract Vehicle build();

	
}