package day_06;
/*
 * Esercizio_09: Calcolo del fattoriale
 * Scrivi un programma Java che calcola il fattoriale di un numero dato.
 * es. 9! = 9*8*7*6*5*4*3*2*1
 * 
 * A lezione lo abbiamo chiamato CalcoloFattoriale
 */
public class Day04Esercizio09 {

	public static void main(String[] args) {
		int numero = 4;				//si chiama parametro ATTUALE
		//richiamo la funzione fattoriale
		System.out.println("Fattoriale del numero "+ numero + ": " + fattoriale(numero));
	}
	//risoluzione del problema con metodo iterativo
	public static int fattoriale(int num) {//num è il parametro FORMALE
		int fatt = 1;
		
		for(int i = 1; i <= num; i++) {
			fatt *= i;//fatt = fatt * num;
		}
		return fatt;
	}
}

/*
if (num <= 1 && num >= 0) {
	return 1;
}*/