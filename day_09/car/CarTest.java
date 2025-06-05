package day_09.car;

public class CarTest {

	public static void main(String[] args) {
		Car panda = new Car();
		Car ferrari = new Car(100.0, 250);
		Car maserati = new Car(240);
		System.out.println("Fuel Maserati " + maserati.getFuel());
		Car y10 = new Car(20.0,100);
		System.out.println("Fuel Y10 " + y10.getFuel());
		System.out.println("Fuel Maserati " + maserati.getFuel());
		panda.setFuel(10);
		System.out.println("Fuel Ferrari " + ferrari.getFuel());
		System.out.println("Istanze classe Car create:  " + Car.getContaIstanze());

	}

}
