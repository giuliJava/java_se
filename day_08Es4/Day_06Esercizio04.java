package day_08Es4;
/*
 * Data una stringa il programma dovrebbe verificare se la stringa fornita è un ISBN-10 valido. Per metterlo in atto è necessario pensare alla preelaborazione/analisi della stringa prima di calcolare la cifra di controllo per l'ISBN.
 * Il programma dovrebbe essere in grado di verificare ISBN-10 sia con che senza trattini di separazione.
 * Avvertenze: La conversione da stringhe a numeri può essere complicata in alcune linguaggi. Ora, è ancora più complicato poiché la cifra di controllo di un ISBN-10 potrebbe essere "X" (che rappresenta "10"). 
 * Ad esempio 3-598-21507-X è un ISBN-10 valido.
 */

import java.util.Scanner;

public class Day_06Esercizio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci codice isbn valido");
		String isbn = scanner.nextLine();
		isbn = isbn.replace("-", "");//per togliere eventuali spazi all'interno della stringa
		isbn = isbn.replace(" ", "");
		int somma = 0;
		for(int i = 10,j = 0; i >= 1; i--,j++) {
			
			somma += isbn.charAt(j) * i;
		}
		if(somma %11 == 0) {
			System.out.println("Valido");	
		}else {
			System.out.println("NON Valido");
		}
		
		scanner.close();

	}

}
