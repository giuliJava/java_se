package day_03;

import java.util.Scanner;

public class NomeProprio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine(); 

        // Calcoliamo la lunghezza del nome per determinare la larghezza del rettangolo
        int lunghezzaNome = nome.length();

        // Le barre orizzontali devono essere lunghe quanto il nome + 2 (per gli spazi interni)
        String lineaOrizzontale = "+";
        for (int i = 0; i < lunghezzaNome + 2; i++) {
            lineaOrizzontale += "-";
        }
        lineaOrizzontale += "+";

        // Stampa il rettangolo
        System.out.println(lineaOrizzontale); // Prima riga del rettangolo (es. +-------+)
        System.out.println("| " + nome + " |"); // Riga con il nome (es. | Giuliana |)
        System.out.println(lineaOrizzontale); // Ultima riga del rettangolo (es. +-------+)

        input.close();

	}

}
