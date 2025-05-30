package day_06;
/*
 * Congettura di Collatz(Medio)
 */
import java.util.Scanner;

public class Day06Esercizio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int passi = 0;//conta il numero dei passi
		
		System.out.println("Inserisci il numero iniziale");
		//ciclo che porta ad uno come risultato finale
		
		int numero = input.nextInt();
		while(numero != 1) {
			if(numero % 2 == 0) {
				numero /= 2;//numero = numero / 2;
			}else {
				numero = 3*numero +1;
			}
			passi++;
			System.out.println(numero);
		}
		System.out.println("Il numero di passi per risolvere la congettura è: "+ passi);
		input.close();
	}

}
