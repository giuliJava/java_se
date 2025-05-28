package day_05;
/*
 * Esercizio_06: Calcolo della media di un array
 * Scrivi un programma Java che calcola la media dei valori presenti in un array 
 * di numeri in virgola mobile (double).
 */
public class CalcolaMediaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primo modo di dichiarare gli array con numeri statici
		double[] numeri = {10.15};
		
		// secondo modo di dichiarare un array
		// caso in cui possono essere inseriti dall'utente
		double[] numeri1 = new double[5];//5 rappresenta il numero di elementi che può contenere
		
		numeri1[0] = 15.5;
		numeri1[1] = 10.2;
		numeri1[2] = 9.5;
		numeri1[3] = 20.1;
		numeri1[4] = 30.6;
		
		System.out.println("Indirizzo di memoria numeri: " + numeri);
		System.out.println("Indirizzo di memoria numeri1: " + numeri1);
		double somma = 0;
		for(int i = 0; i < numeri.length; i++) {
			somma += numeri[i];//somma = somma + numeri[i];
			
		}
		double media = somma / numeri.length;
		System.out.println("array numeri :" + media);
	}

}
