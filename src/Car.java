
public class Car extends Vehicle {

	private String transmission;
	private int horsepower;

	public Car(int numWheels, String make, String model, String color, String transmission, int horsepower) {
		super(numWheels, make, model, color);
		this.transmission = transmission;
		this.horsepower = horsepower;
	}

}
