package day_10.ereditarieta;

public class Auto extends Veicolo {
	private boolean roulotte;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca, String modello, String targa, boolean assicurazione, boolean roulotte) {
		super(marca, modello, targa, assicurazione);
		this.roulotte = roulotte;
	}

	public boolean isRoulotte() {
		return roulotte;
	}

	public void setRoulotte(boolean roulotte) {
		this.roulotte = roulotte;
	}

	@Override
	public String toString() {
		
		return "Auto [" + super.toString() + " roulotte=" + roulotte + "]";
	}
	
	
	
	
	
}
