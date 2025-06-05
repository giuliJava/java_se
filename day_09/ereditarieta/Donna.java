package day_09.ereditarieta;

import java.time.LocalDate;

public class Donna extends Persona {
	
	private String coloreRossetto;

	public Donna() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donna(String codiceFiscale, String nome, String cognome, LocalDate nascita, String luogo, String coloreRossetto) {
		super(codiceFiscale, nome, cognome, nascita, luogo);
		this.coloreRossetto = coloreRossetto;
	}

	@Override
	public String toString() {
		return " Donna [" + super.toString() + " coloreRossetto=" + coloreRossetto + "]";
			
	}
	
}
