package vehicles;

public abstract class Vehicle {
	
	protected int wheels;
	protected String fuelType;
	protected double engineCapacity;
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public String toString() {
		return "Wheels: " + wheels + ", Fuel: " + fuelType + ", Engine Capacity: " + engineCapacity;
	}

}
