package day_14.Luhn;

import java.util.Scanner;

public class VerificaLuhn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una sequenza numerica intera di 16 cifre: ");
		String numeri = input.nextLine();
		numeri = numeri.replace(" ", "");
		numeri = numeri.replace("-", "");
		int somma = 0;
		for (int i = numeri.length() - 1; i >= 0; i--) {
			int prodotto = (numeri.charAt(i) - '0');
			if (i % 2 == 0) {// così prendi gli indici pari
				prodotto *= 2; //prodotto = prodotto * 2
				if (prodotto > 9) {
					prodotto -= 9;// prodotto = prodotto - 9
					// somma = somma + prodotto
				}

			}
			somma += prodotto;
			System.out.println("somma: " + somma);
		}
		if (somma % 10 == 0) {
			System.out.println("Numero di Luhn valido: ");
		} else {
			System.out.println("Numero di Luhn NON valido: ");
		}
		input.close();

	}

}
