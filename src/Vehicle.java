import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vehicle {

	private int id;
	private int numWheels;
	private String make;
	private String model;
	private String color;
	private List<Integer> ids = new ArrayList<>();

	public Vehicle(int numWheels, String make, String model, String color) {
		this.id = generateId();
		this.numWheels = numWheels;
		this.make = make;
		this.model = model;
		this.color = color;
	}

	public int generateId() {
		Random r = new Random();
		boolean generatedNewId = false;
		if (ids.size() == 0) {
			return 1 + r.nextInt(1000 - 1 + 1);
		} else {
			while (!generatedNewId) {
				int potentialId = 1 + r.nextInt(1000 - 1 + 1);
				if (!(ids.contains(potentialId))) {
					generatedNewId = true;
					return potentialId;
				}
			}

		}
		return Integer.MAX_VALUE; // code should never reach this...
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return "ID: " + this.id + ", Make: " + this.make + ", Model: " + this.model;
	}

}
