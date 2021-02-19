
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garage garage = new Garage();

		Car skyline = new Car(0, 4, "Nissan", "Skyline", "White", "Manual", 500);
		Motorcycle multistrada = new Motorcycle(1, 2, "Ducati", "Multistrada", "Red", "Racing bike");
		Tank challenger2 = new Tank(3, 6, "BAE Systems", "Challenger 2", "Tan", 4);

		garage.addVehicle(skyline);
		garage.addVehicle(multistrada);
		garage.addVehicle(challenger2);

		garage.fix(skyline);

		System.out.println("BEFORE: \n" + garage.showVehicles());

		garage.removeVehicle(0);

		System.out.println("AFTER: \n" + garage.showVehicles());

	}

}
