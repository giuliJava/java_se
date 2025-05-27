package day_03;

import java.util.Scanner;

/*
 * Calcolo del valore assoluto di un numero
 * 
 * Implementa un programma che chieda all'utente di inserire un numero e 
 * calcoli il suo valore assoluto utilizzando il metodo abs() della classe Math.
 */

public class ValoreAssoluto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int numero = input.nextInt();
		
		int valoreAssoluto = Math.abs(numero);
		
		System.out.println("Il valore assoluto è: " + valoreAssoluto);//oppure
		System.out.println("Funzione modulo " + Math.abs(valoreAssoluto));
		
		input.close();
	}

}
