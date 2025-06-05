package day_10.ereditarieta;

public class Motocicletta extends Veicolo{
	private boolean sidecar;

	public Motocicletta() {
		super();//questo "super" chiama il costruttore di default della classe Genitore
		// TODO Auto-generated constructor stub
	}

	public Motocicletta(String marca, String modello, String targa, boolean assicurazione, boolean sidecar) {
		super(marca, modello, targa, assicurazione);
		this.sidecar = sidecar;
		// TODO Auto-generated constructor stub
	}
	

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public String toString() {
		
		return "Motocicletta [" + super.toString() + " sidecar=" + sidecar + "]";
	}
	
	

	
	
	
}
