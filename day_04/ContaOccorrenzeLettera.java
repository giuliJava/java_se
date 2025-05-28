package day_04;
/*
 * Calcolo del numero di occorrenze di una lettera in una stringa
 * Scrivi un programma Java che calcola il numero di occorrenze di una lettera 
 * specificata all'interno di una stringa data.
 */

import java.util.Scanner;

public class ContaOccorrenzeLettera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1° Creo l'oggetto Scanner per leggere l'input dalla console
		Scanner input = new Scanner(System.in);
		
		//2° Chiediamo all'utente di inserire la stringa
		System.out.println("Inserisci una frase o una stringa di testo: ");
		String frase = input.nextLine(); //leggiamo l'intera riga
		
		//3° Chiediamo all'utente di inserire la lettera da cercare
		//poi aggiungo toLowerCase() per mettere tutto 
		System.out.println("Inserisci la lettera da cercare: ");
		char letteraCercata = input.nextLine().toLowerCase().charAt(0);
		
		//4° Inizializziamo un contatore per le occorrenze
		int contatoreOccorrenze = 0;
		
		//5° Converto l'intera frase in minuscolo
		String fraseMinuscola = frase.toLowerCase();
		
		//6° Con un ciclo for per iterare l'intera frase
		for(int i = 0; i < fraseMinuscola.length(); i++) {
			//Con charAt(i) seleziono la lettera nella posizione in cui si trova il ciclo for in 
			//quel momento
			char carattereCorrente = fraseMinuscola.charAt(i);
			
			//ora metto a confronto la letteraCorrente con quella cercata
			if(carattereCorrente == letteraCercata) {
				contatoreOccorrenze++;
			}
		}
		
		//7° Stampo il numero di occorrenze contate
		System.out.println("Nella frase " + frase); 
		System.out.println(" appare n° " + contatoreOccorrenze + " volte la lettera cercata che è: " + letteraCercata );
		
		input.close();
	}

}
