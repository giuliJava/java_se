package day_03;

import java.util.Scanner;

public class AreaCerchio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner permette l'inserimento dall'esterno
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il raggio del cerchio: ");
		double raggio = input.nextDouble();
		//double pGreco = 3.14159;
		double area = Math.PI * raggio * raggio;
		System.out.println("L'area del cerchio misura: " + area);
		input.close();

	}

}
