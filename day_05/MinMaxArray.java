package day_05;
/*
 * Esercizio_07: Calcolo del massimo e del minimo in un array
 * Scrivi un programma Java che calcola il valore massimo e il valore minimo 
 * presenti in un array di interi.
 */
public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeri = {10, 20, 30, 10, 40};
		//int min = numeri[0];
		//int max = numeri[0];
		//oppure
		int min = Integer.MAX_VALUE;//il valore massimo di questo tipo di variabile
		int max = Integer.MIN_VALUE;//il valore minimo di questo tipo di variabile
		for(int i = 0; i < numeri.length; i++) {
			
			if(min > numeri[i]) {
				min = numeri[i];
			}
			
			if(max < numeri[i]) {
				max = numeri[i];	
			}
			
		}
		System.out.println("Il numero min è: " + min);
		System.out.println("Il numero max è: " + max);
	}

}
