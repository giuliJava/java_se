package day_05;

public class MediaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Dichiarazione e inizializzazione dell'array di numeri double
        double[] numeri = {10.5, 20.8, 15.4, 5.6, 25.8};
        double somma = 0;
        //int contaElementi = numeri.length;
        for(int i = 0; i< numeri.length; i++) {
        	System.out.println("numero: " + numeri[i]);
        	somma = somma + numeri[i];
        }
        System.out.println("La media è: " + somma / numeri.length);
	}

}
