package day_10.ereditarieta;

public class VeicoloTest {

	public static void main(String[] args) {
		
		Motocicletta moto = new Motocicletta("Honda", "Cbr1000", "Targa1", true, false);
		//Veicolo moto = new Motocicletta("Honda", "Cbr1000", "Targa1", true, false);
		System.out.println(moto);
		
		Elettrica cinquecentoE = new Elettrica();
		System.out.println(cinquecentoE);
		
		Veicolo[] veicoli = {moto, cinquecentoE};
		Class b = Elettrica.class;
		for(Veicolo v: veicoli) {
			System.out.println(v);
			if(v instanceof Elettrica) {
				System.out.println(((Elettrica)v).isBatteriaLitio());
			}
			if(b.isInstance(v) ) {
				System.out.println(((Elettrica)v).isBatteriaLitio());
			}
			
		}
			
	}

}
