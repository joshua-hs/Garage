
public class Tank extends Vehicle {

	private int crewCount;

	public Tank(int numWheels, String make, String model, String color, int crewCount) {
		super(numWheels, make, model, color);
		this.crewCount = crewCount;
	}

	public int getCrewCount() {
		return this.crewCount;
	}

	public void setCrewCount(int crewCount) {
		this.crewCount = crewCount;
	}

}
