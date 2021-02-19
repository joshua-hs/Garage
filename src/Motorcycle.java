
public class Motorcycle extends Vehicle {

	private String motorcycleType;

	public Motorcycle(int numWheels, String make, String model, String color, String motorcycleType) {
		super(numWheels, make, model, color);
		this.motorcycleType = motorcycleType;
	}

	public String getMotorcycleType() {
		return this.motorcycleType;
	}

	public void setMotorcycleType(String motorcycleType) {
		this.motorcycleType = motorcycleType;
	}

}