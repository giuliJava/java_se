package day_08;

import java.util.HashMap;

public class Libro {
	public String isbn;
	public String titolo;
	public HashMap<Autore,Boolean> autori;
	public Editore casaEditrice;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String isbn, String titolo, HashMap<Autore, Boolean> autori, Editore casaEditrice) {
		super();
		this.isbn = isbn;
		this.titolo = titolo;
		this.autori = autori;
		this.casaEditrice = casaEditrice;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public HashMap<Autore, Boolean> getAutori() {
		return autori;
	}
	public void setAutori(HashMap<Autore, Boolean> autori) {
		this.autori = autori;
	}
	public Editore getCasaEditrice() {
		return casaEditrice;
	}
	public void setCasaEditrice(Editore casaEditrice) {
		this.casaEditrice = casaEditrice;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titolo=" + titolo + ", autori=" + autori + ", casaEditrice=" + casaEditrice
				+ "]";
	}
	
	
	
	
	
	
}
