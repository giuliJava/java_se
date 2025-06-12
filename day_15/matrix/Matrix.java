package day_15.matrix;

public class Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 9, 8, 7}, { 5, 3, 2 }, { 6, 6, 7} };
		int[][] matrix2 = { { 9, 8, 7, 2}, { 5, 3, 2 }, { 6, 6, 7, 1, 4} };

		// prima scrivo il ciclo interno con int i
		// Poi il ciclo esterno con int j
		System.out.println("Stampo per righe: ");
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix[j].length; i++) {
				System.out.print(matrix[j][i] + " ");

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Stampo per colonne: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[j][i] + " ");

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Stampo per righe: ");
		for (int j = 0; j < matrix2.length; j++) {
			for (int i = 0; i < matrix2[j].length; i++) {
				System.out.print(matrix2[j][i] + " ");

			}
			System.out.println();

		}
		System.out.println();
		 // Trova il numero massimo di colonne tra tutte le righe
	    int maxColonne = 0;
	    for (int i = 0; i < matrix2.length; i++) {
	        if (matrix2[i].length > maxColonne) {
	            maxColonne = matrix2[i].length;
	        }
	    }

	    // Stampa della matrice "trasposta"
	    // Per ogni colonna logica (finta riga nella trasposta)
	    System.out.println("Matrice trasposta:");
	    for (int colonna = 0; colonna < maxColonne; colonna++) {
	        for (int riga = 0; riga < matrix2.length; riga++) {
	            // Controlla che la colonna esista nella riga corrente
	            if (colonna < matrix2[riga].length) {
	                System.out.print(matrix2[riga][colonna] + " ");
	            } else {
	                System.out.print("  "); // spazio vuoto per allineamento
	            }
	        }
	        System.out.println();
	    }
		
	}
}
