package day_11.giardinoAsilo;

//import java.util.List;
//import java.util.Map;
import java.util.*;

public class GiardinoAsilo {
	/* Con final le costanti sono maiuscole; chiave=Character, value=String */
	private static final Map<Character, String> MAPPA_PIANTINE = Map.of('G', "ERBA", 'C', "TRIFOGLIO", 'R', "RAVANELLO",
			'V', "VIOLA");

	private static final List<String> LIST_BAMBINI = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny",
			"Harriet", "Ileana", "Joseph", "Kincaid", "Larry");

	/*
	 * siccome non sappiamo quali saranno le associazioni, non mettiamo final che
	 * invece ci obbligherebbe ad inizializzare le costanti. Ma in questo caso non
	 * sappiamo quali saranno le associazioni. La variabile è di CLASSE e non di
	 * ISTANZA.
	 */
	private Map<String, List<String>> mappaBambinoPiante;

	private static final int tazzaPerBambino = 2;

	public GiardinoAsilo(String fila1, String fila2) {
		// se le due file non sono uguali oppure la fila1 dà resto diverso da zero
		// quindi non pari
		if (fila1.length() != fila2.length() || fila1.length() % 2 != 0) {
			throw new IllegalArgumentException(
					"Le righe devono avere la stessa lunghezza e contenere un numero pari di tazze.");
		}
		this.mappaBambinoPiante = new HashMap<>();

		for (int i = 0; i < LIST_BAMBINI.size(); i++) {
			String bambino = LIST_BAMBINI.get(i);
			int indiceInizio = i * tazzaPerBambino;
			int indiceFine = indiceInizio + 1;
			
			List<String> piante = new ArrayList<>();// lista dei nomi piante associate a ciascun bambino
			piante.add(MAPPA_PIANTINE.get(fila1.charAt(indiceInizio)));
			piante.add(MAPPA_PIANTINE.get(fila1.charAt(indiceFine)));
			piante.add(MAPPA_PIANTINE.get(fila2.charAt(indiceInizio)));
			piante.add(MAPPA_PIANTINE.get(fila2.charAt(indiceFine)));
			
			this.mappaBambinoPiante.put(bambino, piante);
		}

	}
	public void stampaAssociazionePianteBambino() {
		System.out.println("Associazioni " + mappaBambinoPiante);
	}
	
	public static void main(String[] args) {
		String fila1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
		String fila2 = "VRCCCGCRRGVCGCRVVCVGCGCV";
		
		GiardinoAsilo giardinoAsilo = new GiardinoAsilo(fila1, fila2);
		giardinoAsilo.stampaAssociazionePianteBambino();
	}
	

}
