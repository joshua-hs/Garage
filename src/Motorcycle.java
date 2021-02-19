
public class Motorcycle extends Vehicle {

	private String motorcycleType;

	public Motorcycle(int numWheels, String make, String model, String color, String motorcycleType) {
		super(numWheels, make, model, color);
		this.motorcycleType = motorcycleType;
	}

}