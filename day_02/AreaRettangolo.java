package day_02;
/*
 * Calcolo dell'area di un rettangolo
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire la lunghezza e la larghezza di un rettangolo e stampi l'area corrispondente.
 */

import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner permette l'inserimento dall'esterno
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la base del rettangolo: ");
		double base = input.nextDouble();
		
		System.out.println("Inserisci l'altezza del rettangolo: ");
		double altezza = input.nextDouble();
		
		double area = base * altezza;
		System.out.println("L'area del rettangolo misura: " + area);
		input.close();
	}

}
