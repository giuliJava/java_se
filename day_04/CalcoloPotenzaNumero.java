package day_04;
/*
 * Esercizio_05: Calcolo della potenza di un numero
 * Scrivi un programma Java che calcola la potenza di un numero base elevato a un esponente dato.
 */
import java.util.Scanner;

public class CalcoloPotenzaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chiedo l'inserimento di numero base e valore esponente
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire il numero base");
		int numBase = input.nextInt();
		System.out.println("Inserire il valore dell'esponente");
		int esponente = input.nextInt();
		
		int calcolo = (int) Math.pow(numBase, esponente);
		System.out.println("La potenza di " + numBase + " elevato a " + esponente + " è = " + calcolo);
		
		input.close();
	}
	

}
