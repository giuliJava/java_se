package day_03;

import java.util.Scanner;

public class CalcolaNumParole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire una frase: ");
		String frase = input.nextLine();
		
		/*----------------------------------------------per calcolare il numero di parole-------------*/
		/*1° tolgo eventuali spazi bianchi a destra e a sinistra della frase e uso trim()*/
		String fraseNoSpazi = frase.trim();
		
		//2° Suddivido la frase con il metodo split()
		//"\\s+" è un'espressione regolare che significa "uno o più caratteri di spazio bianco"
		int numeroParole;
		
		if(fraseNoSpazi.isEmpty()) {
			numeroParole = 0;
		}else {
			String[] parole = fraseNoSpazi.split("\\s+");
			//il numero di parole è la lunghezza dell'array
			numeroParole = parole.length;
		}
		
		// 4. Stampiamo il risultato all'utente
        System.out.println("La stringa inserita è: \"" + frase + "\"");
        System.out.println("Il numero di parole nella stringa è: " + numeroParole);

        // 5. Chiudiamo lo Scanner per rilasciare le risorse di sistema
        input.close();
	}

}
