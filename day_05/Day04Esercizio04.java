package day_05;
/*
 * Esercizio_04: Inversione di una stringa
 * Scrivi un programma Java che inverte una stringa data
 */
import java.util.Scanner;

public class Day04Esercizio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la stringa da invertire");
		String str = input.nextLine();
		
		//tennis
		//012345
		String invertita = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			invertita = invertita + str.charAt(i);
			
		}
		System.out.println("String invertita: " + invertita);
		input.close();
		
	}

}
