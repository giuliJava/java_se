package day_04;
/*
 * Esercizio_03: Verifica se una stringa è un palindromo
 * 
 * Scrivi un programma Java che verifica se una stringa data è un palindromo 
 * (cioè se può essere letta allo stesso modo da destra a sinistra e viceversa)
 */

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		// 1°) Creo l'oggetto Scanner
		Scanner input = new Scanner(System.in);
		
		//2°) Chiedo all'operatore di inserire una parola
		System.out.println("Inserire una parola");
		String parola = input.nextLine(); 
		
		//3°) Procedo con la normalizzazione della parola, cioè tutta in minuscolo e senza caratteri particolari
		String parolaNormalizzata = parola.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		//4°) Utilizzo l'oggetto StringBuilder che mi permette di manipolare la stringa 
		String reversedText = new StringBuilder(parolaNormalizzata).reverse().toString();
		
		//5° Per confrontare queste due stringhe utilizzo il metodo equals()
		boolean palindroma =  parolaNormalizzata.equals(reversedText);
		
		if(palindroma == true) {
			System.out.println("La parola inserita è palindroma " + palindroma);
		}else {
			System.out.println("La parola inserita non è palindroma " + palindroma);
		}
		
		input.close();	
	}

}
