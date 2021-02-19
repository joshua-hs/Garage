
public class Motorcycle extends Vehicle {

	private String subclass;

	public Motorcycle(int id, int numWheels, String make, String model, String color, String subclass) {
		super(id, numWheels, make, model, color);
		this.subclass = subclass;
	}

}