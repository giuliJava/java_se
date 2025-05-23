package day_02;

import java.util.Random;

/*
 * Gioco del lancio del dado
 * Traccia: Scrivi un programma Java che simuli il lancio di un dado a sei facce. 
 * Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e stamparlo a schermo.
 */

public class LancioDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		// Genera un intero tra 0 e 6 inclusi, poi aggiungi 1
		int numeroCasuale = rand.nextInt(6) + 1;

		System.out.println("Numero casuale generato: " + numeroCasuale);
	}

}
