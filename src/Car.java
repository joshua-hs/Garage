
public class Car extends Vehicle {

	private String transmission;
	private int horsepower;

	public Car(int id, int numWheels, String make, String model, String color, String transmission, int horsepower) {
		super(id, numWheels, make, model, color);
		this.transmission = transmission;
		this.horsepower = horsepower;
	}

}
