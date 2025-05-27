package day_03;

import java.util.Scanner;

/*
 * Calcolo del resto della divisione tra due numeri
 * 
 * Implementa un programma che chieda all'utente di inserire due numeri e calcoli il resto della divisione tra il primo numero e il secondo numero 
 * utilizzando l'operatore modulo.
 */

public class RestoDivisione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci primo numero: ");
		int num1 = input.nextInt();
		
		System.out.println("Inserisci secondo numero: ");
		int num2 = input.nextInt();
		
		if(num2 == 0) {
			System.out.println("La divisione per 0 non è ammessa");
		}else {
			int resto = num1 % num2;
			System.out.println("Il resto della divisione è: " +resto);
		}
		
		input.close();
	}

}
