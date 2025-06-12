package day_16.calcoloFattura;

//import java.math.BigDecimal;

public class FatturaTest {

	public static void main(String[] args) {

		/*
		 * //costuttore default Cliente paoloRossi = new Cliente();
		 * paoloRossi.setCf("cf1"); paoloRossi.setNome("paolo");
		 * paoloRossi.setCognome("rossi"); paoloRossi.setPrezzoDaPagare(new BigDecimal
		 * ("1200.00"));
		 * 
		 * System.out.println(paoloRossi.toString());
		 * 
		 * //oggetto con costruttore parametrico Cliente gianlucaVacchi = new Cliente(
		 * " cf2","gianluca","vacchi","1300.00");
		 * System.out.println(gianlucaVacchi.toString());
		 */
		//	ClienteLuce paolorossi = new ClienteLuce("cf2","paolo","rossi",80.00);
		//	System.out.println(paolorossi.toString());
		ClienteFisso marianeri = new ClienteFisso("cf3", "maria", "neri", ContrattoFisso.SPECIAL);

		System.out.println(marianeri.toString());
		
		FatturaController.calcoloFattura(marianeri);
		
		//Per ClienteLuce
		ClienteLuce paoloRossi = new ClienteLuce("cf3", "maria", "neri", 299.00);
		ClienteLuce lucaVerdi = new ClienteLuce("cf3", "luca", "Verdi", 450.00);
		ClienteLuce gianniGianni = new ClienteLuce("cf3", "gianni", "gianni", 299.00);
		
		FatturaController.calcoloFattura(paoloRossi);
		FatturaController.calcoloFattura(lucaVerdi);
		FatturaController.calcoloFattura(gianniGianni);
		
		System.out.println(paoloRossi);
		System.out.println(lucaVerdi);
		System.out.println(gianniGianni);
		
		//PEr ClienteGas
		ClienteGas lucioNeri = new ClienteGas("cf3", "lucio", "neri", 50.00);
		ClienteGas annaRosa = new ClienteGas("cf3", "anna", "rosa", 60.00);
		ClienteGas paoloVerde = new ClienteGas("cf3", "paolo", "verde", 90.00);
		
		FatturaController.calcoloFattura(lucioNeri);
		FatturaController.calcoloFattura(annaRosa);
		FatturaController.calcoloFattura(paoloVerde);
		
		System.out.println(lucioNeri);
		System.out.println(annaRosa);
		System.out.println(paoloVerde);
		
		//Per ClienteMobile
		ClienteMobile giulianaVecchi = new ClienteMobile("cf4", "giuliana", "vecchi", 29);
		ClienteMobile giovanninaFerrari = new ClienteMobile("cf5", "giovannina", "ferrari", 35);
		ClienteMobile ferdinandoVecchi = new ClienteMobile("cf6", "ferdinando", "vecchi", 90);
		
		FatturaController.calcoloFattura(giulianaVecchi);
		FatturaController.calcoloFattura(giovanninaFerrari);
		FatturaController.calcoloFattura(ferdinandoVecchi);
		
		System.out.println(giulianaVecchi);
		System.out.println(giovanninaFerrari);
		System.out.println(ferdinandoVecchi);
	}
}
