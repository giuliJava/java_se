package day_09.ereditarieta;

public class EsempioWrapper {

	public static void main(String[] args) {
		Double d = 34.6;
		Integer i = 10;
		Number[] numeri = {d,i};
		for(Number n : numeri) {
			/*
			if(n.isInstance(Double)) {
				
				
			}*/
			System.out.println(n);
		}

	}

}
