package day_06;
/*
 * Esercizio 3 - Isogramma(Medio)
 * Determinare se una parola o una frase è un isogramma.
 */
public class Day06Esercizio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "abcdefg";
		boolean [] lettereTrovate = new boolean[26];
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if(c >= 'a' && c <= 'z') {
				int indice = c - 'a';
				if(lettereTrovate[indice]) {
					System.out.println("La frase non è un Isogramma!");
					return;
				}else {
					lettereTrovate[indice] = true; 
				}
			}
			
		}
		System.out.println("La frase è un Isogramma!");
	}

}
