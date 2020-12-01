package code.microsystem;

public class MainApp {

	public static void main(String[] args) {
		Car car=new Car();
		Bike bike=new Bike();
		Bus bus=new Bus();
		
		Travel travel=new Travel();
		travel.go(bus);

	}

}
