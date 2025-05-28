package day_04;
/*
 * Esercizio_04: Inversione di una stringa
 * Scrivi un programma Java che inverte una stringa data.
 * Variante: inverto le parole e non i caratteri
 */
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InvertiParole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1°) Creo l'oggetto Scanner
		Scanner input = new Scanner(System.in);
				
		//2°) Chiedo all'operatore di inserire una parola
		System.out.println("Inserire una parola");
		String frase = input.nextLine();
		
		//3°) Tolgo eventuali spazi a destra e a sinistra della frase
		String fraseNoSpazi = frase.trim();
		
		//4°) Suddivido la frase con il metodo split()
		String[] parole = fraseNoSpazi.split("\\s+");
		
		//5°) Invertire l'ordine delle parole.
        // Il modo più semplice è convertire l'array in una List e usare Collections.reverse().
        List<String> paroleLista = Arrays.asList(parole);
        Collections.reverse(paroleLista);
		
        //6°) Ricostruire la frase invertita.
        // Usare String.join() per unire le parole con uno spazio.
        String fraseRicostruita =  String.join(" ", paroleLista);
		
        System.out.println("La frase ricostruita è: " + fraseRicostruita);
		//7°) chiudo scanner
		input.close();
	}

}
