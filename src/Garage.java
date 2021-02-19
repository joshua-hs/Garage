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

	public void removeVehicleById(int id) {
		boolean vehicleRemoved = false;
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getId() == id) {
				vehicles.remove(i);
				vehicleRemoved = true;
			}
		}
		if (!vehicleRemoved) {
			System.out.println("Couldn't find vehicle.");
		}
	}

	public void removeVehiclesByType(String vehicleClass) {
		System.out.println("Removing vehicles of type: " + vehicleClass + "...");
		int removalCount = 0;
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getClass().toString().toLowerCase().contains(vehicleClass.toLowerCase())) {
				vehicles.remove(vehicles.get(i));
				removalCount++;
				i--;
			}
		}

		System.out.println("Removed " + removalCount + " vehicle(s).");
	}

	public void fix(Vehicle vehicle) {
		System.out.println("Bill is: £" + String.format("%1.2f", calculateBill(vehicle)));
	}

	public void emptyGarage() {
		vehicles.clear();
	}

	public void showVehicles() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getName());
		}
	}

}
