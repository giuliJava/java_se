package day_06;
/*
 * Esercizio_11: Verifica quanti numeri primi esistono fino al numero inserito dall'utente.
 * Scrivi un programma java per verificare quanti numeri primi con il metodo del Crivello di Eratostene.
 */
import java.util.Scanner;

public class Day04Esercizio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire un numero intero e ti mostro tutti i numeri primi fino a quel numero: ");
		int numero = input.nextInt();
		
		boolean[] isPrimo = new boolean[numero + 1];//creazione array booleani default false
		
		for(int i = 2; i <= numero; i++ ) {
			isPrimo[i] = true;//inizializzo tutti gli elementi a true
			
		}
		for(int i = 2; i*i <= numero; i++) {
			if(isPrimo[i]) {
				for(int j = i * i; j <= numero; j+=i) {
					isPrimo[j] = false;
					
				}
				
			}
		}
		System.out.println("I numeri primi fino a " + numero + ": ");
		for(int i = 2; i <= numero; i++ ) {
			if(isPrimo[i]) {
				System.out.println(i);
			}
		}
		input.close();
	}

}
