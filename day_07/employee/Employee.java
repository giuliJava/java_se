package day_07.employee;

public class Employee {
	private String nome;
	private String cognome;
	private double stipendio;
	
	/*
	 * costruttore di default
	 */
	public Employee() {
		super();
	}
	
	/*
	 * costruttore parametrico
	 */
	public Employee(String nome, String cognome, double stipendio) {
		super();
		this.nome = nome;
		this.cognome = cognome;	
		this.stipendio = stipendio;	
	}
	
	//-------------------------------------------------get e set nome
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//-------------------------------------------------get e set cognome
	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//--------------------------------------------------get e set stipendio
	public double getStipendio() {
		return this.stipendio;
	}
	
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Employee: [nome: " + nome + ", cognome: " + cognome + ", stipendio: " + stipendio + "]";
	}
	
	
	
	
	
	
}
