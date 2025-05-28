package day_05;

import java.util.Scanner;

public class Day04Esercizio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire una parola");
		String frase = input.nextLine(); 
		 
		for(int i = 0; i < frase.length() / 2; i++) {
			if(!(frase.charAt(i) == frase.charAt(frase.length() - 1 - i))) {
				System.out.println("non è palindroma");
			}else {
				System.out.println("è palindroma");
			}
		}
		
		
		input.close();
	}
}
