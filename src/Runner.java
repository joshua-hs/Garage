
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garage garage = new Garage();

		Car skyline = new Car(4, "Nissan", "Skyline", "Blue", "Manual", 276);
		Car panamera = new Car(4, "Porsche", "Panamera", "White", "Automatic", 671);
		Motorcycle multistrada = new Motorcycle(2, "Ducati", "Multistrada", "Red", "Racing bike");
		Tank challenger2 = new Tank(6, "BAE Systems", "Challenger 2", "Tan", 4);

		garage.addVehicle(skyline);
		garage.addVehicle(panamera);
		garage.addVehicle(multistrada);
		garage.addVehicle(challenger2);

		garage.fix(skyline);

		System.out.println("Before removing:");

		garage.showVehicles();

		System.out.println("After removing via id:");

		garage.removeVehicleById(challenger2.getId());

		garage.showVehicles();

		System.out.println("After removing via type");

		garage.removeVehiclesByType("car");

		garage.showVehicles();

	}

}
