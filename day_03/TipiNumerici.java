package day_03;

public class TipiNumerici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numeroByte = 122 ;//in binario: 01111010
		short numeroShort = numeroByte;//in binario: 00000000 01111010
		int numeroInt = numeroShort;//in binario sarebbe 00000000 00000000 00000000 01111010
		
		//in binario sarebbe 00000000 00000000 00000000 00000000 00000000 00000000 00000000 01111010
		long numeroLong = numeroInt; 
		float numeroFloat = numeroLong;
		double numeroDouble = numeroFloat; 
		
		
		System.out.println("Il valore inserito in numeroByte è = " + numeroByte);
		System.out.println("Il valore inserito in numeroShort è = " + numeroShort);
		System.out.println("Il valore inserito in numeroDouble è = " + numeroDouble);
		
		
	}

}
