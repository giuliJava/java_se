package day_10.ereditarieta;

public class Camion extends Veicolo{
	private boolean cassoneRibaltabile;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String marca, String modello, String targa, boolean assicurazione) {
		super(marca, modello, targa, assicurazione);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Camion [cassoneRibaltabile=" + cassoneRibaltabile + "]";
	}

	
	

}
