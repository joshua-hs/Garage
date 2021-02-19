
public class Tank extends Vehicle {

	private int crewCount;

	public Tank(int id, int numWheels, String make, String model, String color, int crewCount) {
		super(id, numWheels, make, model, color);
		this.crewCount = crewCount;
	}

}
