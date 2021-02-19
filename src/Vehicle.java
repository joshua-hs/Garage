
public class Vehicle {

	private int id;
	private int numWheels;
	private String make;
	private String model;
	private String color;

	public Vehicle(int id, int numWheels, String make, String model, String color) {
		this.id = id;
		this.numWheels = numWheels;
		this.make = make;
		this.model = model;
		this.color = color;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return "Make: " + this.make + ", Model: " + this.model;
	}

}
