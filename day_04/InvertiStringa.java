package day_04;
/*
 * Esercizio_04: Inversione di una stringa
 * Scrivi un programma Java che inverte una stringa data.
 */

import java.util.Scanner;

public class InvertiStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1°) Creo l'oggetto Scanner
		Scanner input = new Scanner(System.in);
		
		//2°) Chiedo all'operatore di inserire una parola
		System.out.println("Inserire una parola");
		String frase = input.nextLine(); 
		
		//3°) Procedo con la normalizzazione della parola, cioè tutta in minuscolo e senza caratteri particolari
		//		String fraseNormalizzata = frase.toLowerCase().replaceAll("[^a-z0-9]", "");
				
		//4°) Utilizzo l'oggetto StringBuilder che mi permette di manipolare la stringa 
		String reversedText = new StringBuilder(frase).reverse().toString();
		
		//5°) Stampo entrambe le stringhe
		System.out.println("La stringa inserita è: " + frase);
		System.out.println("La stringa invertita è: " + reversedText);
		
		//6°) Chiudo Scanner
		input.close();
	}

}
