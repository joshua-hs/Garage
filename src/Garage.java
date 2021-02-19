import java.util.ArrayList;
import java.util.Random;

public class Garage {

	static ArrayList<Vehicle> vehicles = new ArrayList<>();

	public static double calculateBill(Vehicle vehicle) {
		Random r = new Random();
		if (vehicle instanceof Car) {
			return (20000 + (20000 - 1500) * r.nextDouble());
		} else if (vehicle instanceof Motorcycle) {
			return (10000 + (10000 - 1000) * r.nextDouble());
		} else {
			return (250000 + (250000 - 75000) * r.nextDouble());
		}

	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(int id) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getId() == id) {
				vehicles.remove(i);
			}
		}
	}

	public void fix(Vehicle vehicle) {
		System.out.println("Bill is: " + calculateBill(vehicle));
	}

	public void emptyGarage() {
		vehicles.clear();
	}

	public String showVehicles() {
		String returnString = "";
		for (Vehicle vehicle : vehicles) {
			returnString += vehicle.getName() + "\n";
		}

		return returnString;
	}

}
