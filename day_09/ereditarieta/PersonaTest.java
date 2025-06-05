package day_09.ereditarieta;

import java.time.LocalDate;

public class PersonaTest {
	public static void main(String[] args) {
		
		/*
		Uomo adamo = new Uomo("CFU", "Romeo", "Rossi", LocalDate.of(1966, 6, 6), "Verona", true);
		Donna eva = new Donna("CFD", "Giulietta", "Verdi", LocalDate.of(1965, 5, 5), "Verona", "Rosa");*/
		
		//nell'ultima versione di Java possiamo utilizzare come nome di Classe quella padre in questo modo:
		Persona adamo = new Uomo("CFU", "Romeo", "Rossi", LocalDate.of(1966, 6, 6), "Verona", true);
		Persona eva = new Donna("CFD", "Giulietta", "Verdi", LocalDate.of(1965, 5, 5), "Verona", "Rosa");

		// NB: il toString viene ereditato dalla classe padre in questo caso Persona
		System.out.println(adamo.toString());
		System.out.println(eva.toString());
		
		//questo mi comporta che posso utilizzare delle matrici
		Persona[] persone = {adamo, eva};
		for(Persona p: persone) {
			System.out.println(p);
			
		}
		
	}

}
