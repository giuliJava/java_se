package day_10.forma;

public abstract class Forma {
	private double raggioLato;
	
	public Forma() {
		super();
		
	}
	
	public Forma(double raggioLato) {
		super();
		this.raggioLato = raggioLato;
	}

	public double getRaggioLato() {
		return raggioLato;
	}

	public void setRaggioLato(double raggioLato) {
		this.raggioLato = raggioLato;
	}

	public abstract double area();
	public abstract double perimetroCirconferenza(); 
}
