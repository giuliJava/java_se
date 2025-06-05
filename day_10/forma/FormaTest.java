package day_10.forma;

public class FormaTest {

	public static void main(String[] args) {
		Quadrato quadrato1 = new Quadrato(10.0);
		Cerchio cerchio1 = new Cerchio(10.0);
		Triangolo triangolo1 = new Triangolo(3.0, 4.0, 5.0, 3.0);
		//Forma forma1 = new Forma(10.0);
		
		System.out.println("Perimetro Quadrato: " + FormaController.calcolaPerimetroCirconferenza(quadrato1));
		System.out.println("Area Quadrato: " + FormaController.calcolaArea(quadrato1));
		
		System.out.println("Circonferenza Cerchio: " + FormaController.calcolaPerimetroCirconferenza(cerchio1));
		System.out.println("Area Cerchio: " + FormaController.calcolaArea(cerchio1));
		
		System.out.println("Perimetro Triangolo: " + FormaController.calcolaPerimetroCirconferenza(triangolo1));
		System.out.println("Area Triangolo: " + FormaController.calcolaArea(triangolo1));
		
		//System.out.println("Circonferenza Cerchio: " + FormaController.calcolaPerimetroCirconferenza(forma1));
		//System.out.println("Area Cerchio: " + FormaController.calcolaArea(forma1));
	}

}
