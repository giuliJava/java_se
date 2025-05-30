package day_07.car;

public class Car {
	private String targa;
	private String marca;
	private String modello;
	private double fuel;
	private double consumoMedio;
	
	//costruttore di default
	public Car() {
		super();//se non ce lo mettiamo, ci viene messo di default dal programma
	}
	
	//costruttore parametrico
	public Car(String tar, String mar, String mod, double fue, double conMed) {
		super();
		this.targa = tar;
		this.marca = mar;
		this.modello = mod;
		this.fuel = fue;
		this.consumoMedio = conMed;	
	}
	
	//-------------------------------------------------get e set targa
	public String getTarga() {
		return this.targa;
	}
	
	public void setTarga(String tar) {
		this.targa = tar;
	}
	
	//-------------------------------------------------get e set marca
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String mar) {
		this.marca = mar;
	}
	
	//-------------------------------------------------get e set modello
	public String getModello() {
		return this.modello;
	}
	
	public void setModello(String mod) {
		this.modello = mod;
	}
	
	//--------------------------------------------------get e set fuel
	public double getFuel() {
		return this.fuel;
	}
	
	public void setFuel(double fue) {
		this.fuel = fue;
	}
	
	//----------------------------------------------------get e set consumoMedio
	public double getConsumoMedio() {
		return this.consumoMedio;
	}
	
	public void setConsumoMedio(double conMed) {
		this.consumoMedio = conMed;
	}
	//-----------------------------------------------------------------------------
	//Con questo sistema evitiamo di scrivere tutto il codice sopra
	//settiamo un metodo generale: deve sempre avere come nome toString 
	// potremmo mettere altri nomi ma è meglio toString
	public String toString() {
		return "[" + "Targa: " + this.targa + " Marca: " + this.marca + " Modello: " + this.modello +
				" Fuel: " + this.fuel + " Consumo Medio: " + this.consumoMedio + "]";
	}
	
}
