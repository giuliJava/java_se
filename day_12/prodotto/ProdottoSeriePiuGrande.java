package day_12.prodotto;

import java.util.Scanner;

public class ProdottoSeriePiuGrande {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la sequenza di cifre: ");
		String input = scan.nextLine();
		
		System.out.println("Inserisci la lunghezza della sottostringa (span): " );
		String serieMax = "";
		String serie = "";
		int span = scan.nextInt();
		int prodotto = 1;
		int maxProdotto = 0;
		
		for(int i= 0; i <= input.length() - span; i++) {
			serie = input.substring(i, i + span);
			prodotto = 1;
			for(char c : serie.toCharArray()) {
				if(!Character.isDigit(c)) {
					throw new IllegalArgumentException("Contine caratteri non numerici.");
				}
				prodotto = prodotto * (c - '0');
							
			}
			if(maxProdotto < prodotto) {
				maxProdotto = prodotto;
				serieMax = serie;
				
			}
		}
		System.out.println("La serie con il prodotto maggiore è: " + serieMax);
		System.out.println("il prodotto massimo è: " + maxProdotto);
		
		
		scan.close();
	}

}
