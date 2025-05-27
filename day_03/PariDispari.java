package day_03;

import java.util.Scanner;

/*
 * Verifica se un numero è pari o dispari
 * 
 * Implementa un programma che chieda all'utente di inserire un numero intero e verifichi se è pari o dispari utilizzando l'operatore modulo.
 */

public class PariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero: ");
		int numInt = input.nextInt();
		
		if(numInt % 2 == 0) {
			System.out.println("Il numero inserito è PARI");
		}else {
			System.out.println("Il numero inserito è DISPARI");
		}
		
		input.close();
	}

}
