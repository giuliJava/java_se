package day_06;

public class Day04Esercizio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int [] arr1 = {1,2,3};
		int [] arr2 = {4,5,6};
		int [] arr3 = {7,8,9};
		
		int [][] arrContenitore = {arr1,arr2,arr3};//questa è una matrice*/
		
		//oppure posso creare una matrice in questo modo.
		int [][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
		for(int riga = 0; riga < matrice.length; riga++) {
			for(int colonna = 0; colonna < matrice[riga].length; colonna++) {
				System.out.print(matrice[riga][colonna] + " ");
			}
			System.out.println();
		}
		
	}

}
