package day_09.car;

public class Car {
	private static int contaIstanze = 0;
	private double fuel;
	private double maxSpeed;
	
	public Car() {
		contaIstanze++;
	}
	
	public Car(double maxSpeed) {
		super();
		contaIstanze++;
		this.maxSpeed = maxSpeed;
	}
	
	//definizione costruttore èparametrico
	public Car(double fuel, double maxSpeed) {
		contaIstanze++;
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}

	public static int getContaIstanze() {
		return contaIstanze;
	}

	public static void setContaIstanze(int contaIstanze) {
		Car.contaIstanze = contaIstanze;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
