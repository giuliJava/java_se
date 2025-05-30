package day_07.assicurazione;

import java.time.LocalDate;

public class Archivio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente bruno = new Cliente("cf1","Bruno", "Rossi", LocalDate.of(1966, 6, 6));
		Cliente maria = new Cliente("cf2","Maria", "Bianca", LocalDate.of(1945, 9, 10));
		Cliente veronica = new Cliente("cf3","Veronica", "Verdi", LocalDate.of(2000, 10, 10));
		System.out.println(bruno);
		System.out.println(maria);
		System.out.println(veronica);
		Veicolo veicolo1 = new Veicolo("GC163CM", bruno);
		Veicolo veicolo2 = new Veicolo("FC800CL", maria);
		Veicolo veicolo3 = new Veicolo("FC900MV", veronica);
		
		System.out.println(veicolo1);
		System.out.println(veicolo2);
		System.out.println(veicolo3);
		System.out.println("------------------------------------------------------------------");
		Veicolo[] archivio = {veicolo1, veicolo2, veicolo3};
		for(int i = 0; i < archivio.length; i++) {
			int a = i + 1;
			System.out.println("Veicolo "+ a + ": " + archivio[i]);
			
		}
		
		
	}

}
