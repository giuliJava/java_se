package day_07.car;

public class CarController {
	public static void aggiornaFuel(Car car, double km) {
		double consumo = km * car.getConsumoMedio();
		car.setFuel(car.getFuel() - consumo);
	
	}

}
