package day_05;

import java.util.Scanner;

public class Day04Esercizio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una frase: ");
		String frase = scanner.nextLine();

			System.out.println("Inserisci la lettera da contare: ");
			char lettera = scanner.nextLine().charAt(0);

			int conteggio = 0;

			for (int i = 0; i < frase.length(); i++)
			{
				if (frase.charAt(i) == lettera)
				conteggio++;
			}
			System.out.println("la " + lettera + " è presente " + conteggio + " volte all'interno della frase.");
			scanner.close();
	}

}
