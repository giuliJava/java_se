package day_06;
/*
 * Esercizio_10: Verifica se un numero è primo
 * Scrivi un programma Java che verifica se un numero dato è primo o meno.
 */
import java.util.Scanner;

public class Day04Esercizio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero positivo > 1: ");
		int numero = input.nextInt();
		
		boolean isPrimo = true;
		//se un numero è uguale a 1 non è numero primo
		if(numero <= 1) {
			isPrimo = false;
		}else {
			for(int i = 2; i < numero; i++) {
				if(numero % i == 0) {
					isPrimo = false;
					break;
				}
			}
			System.out.println("Numero: " + numero + (isPrimo? " è primo" : " non è primo"));
			
		}
		
		input.close();
	}

}
