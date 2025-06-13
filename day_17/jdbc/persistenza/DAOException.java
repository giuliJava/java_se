package day_17.jdbc.persistenza;

public class DAOException extends Exception {
	//questo costruttore è utile quando si verifica un errore generico e non 
	//	sono disponibili dettagli specifici immediati.
	public DAOException() {
		super();
	}

	//questo costruttore è quello più completo e più comunemente usato per incapsulare eccezioni
	//	permette di fornire sia un messaggio descrittivo
	//	sia la causa originale dell'eccezione
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	
	//Permette di passare un messaggio descrittivo dell'errore. 
	//	Questo è molto utile per fornire dettagli leggibili sull'errore
	public DAOException(String message) {
		super(message);
	}

	//E' fondamentale per incapsulare le eccezioni di basso livello 
	//	(es. SQLException) e nasconderle al chiamante del DAO
	public DAOException(Throwable cause) {
		super(cause);
	}

}
