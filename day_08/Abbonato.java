package day_08;

public class Abbonato {
	public String codiceFiscale;
	public String nome;
	public String cognome;
	public Abbonato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abbonato(String codiceFiscale, String nome, String cognome) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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
		return "Abbonati [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	

}
