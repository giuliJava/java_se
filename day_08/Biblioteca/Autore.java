package day_08.Biblioteca;

public class Autore {
	private String nome;
	private String cognome;
	public Autore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Autore(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Autore [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	

}
