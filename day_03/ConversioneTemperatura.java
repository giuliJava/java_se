package day_03;
/*
 * Conversione di temperatura
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire una 
 * temperatura in gradi Celsius e stampi la corrispondente temperatura in 
 * gradi Fahrenheit. Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32
 */
import java.util.Scanner;

public class ConversioneTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una temperatura in gradi Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = celsius * 9/5 + 32;
		System.out.println("Gradi celsius: " + celsius + " corrisponde a gradi fahrenheit: " + fahrenheit);
		input.close();
	}

}
