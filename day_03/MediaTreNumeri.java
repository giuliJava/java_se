package day_03;
/*
 *  Calcolo della media di tre numeri
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire tre numeri e stampi la loro media.
 */
import java.util.Scanner;

public class MediaTreNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		int num1 = input.nextInt();
		
		System.out.println("Inserisci il secondo numero: ");
		int num2 = input.nextInt();
		
		System.out.println("Inserisci il terzo numero: ");
		int num3 = input.nextInt();		
		
		//Abbimao fatto il cast esplicito perché l'operazione era con 3 valori di tipo integer 
		double media =(double)(num1 + num2 + num3)/3;
		
		System.out.println("La media dei tre numeri inseriti è (num1: " + num1 + " num2: " + num2 + " num3: " + num3 + ") = " + media);
		
		input.close();
	}
}
