package day_04;
/*
 * Calcola numero parole di una frase - Scritto insieme con il docente
 */

import java.util.Scanner;

public class CalcolaNumeroParole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase: ");
		String frase = input.nextLine();
		
		char carattere =' ';
		boolean interruttore = true;
		int count = 0;
		for(int i = 0; i<frase.length(); i++) {
			carattere = frase.charAt(i);
			System.out.println("Carattere in posizione " + i + ": " + carattere);
			if(Character.isAlphabetic(carattere) && interruttore) {
				//count = count + 1;
				count++;
				interruttore = false;
			}else {
				if(!Character.isAlphabetic(carattere)) {
					interruttore = true;
				}
			}
		}
		System.out.println("Numero di parole che compongono la frase: " + count);
		
		
		input.close();	
	}

}
