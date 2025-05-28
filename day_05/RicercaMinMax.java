package day_05;
/*
 * Esercizio_08: Ricerca di un elemento in un array
 * Scrivi un programma Java che ricerca un elemento specifico all'interno di un 
 * array di interi e restituisce la sua posizione (indice).
 */
import java.util.Scanner;

public class RicercaMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] numeri = {10,87,128,349};
		System.out.println("Inserisci il numero da cercare");
		int numero = input.nextInt();
		
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i] == numero) {
				System.out.println("Numero trovato: " + numero);
				break;
			}
		}
		System.out.println("Il numero non è stato trovato");
		input.close();
	}

}
