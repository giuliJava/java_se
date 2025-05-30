package day_07.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car panda = new Car();
		Car ferrari = new Car("MO124578","Ferrari", "Roma", 100.0, 1);
		Car bmw = new Car("gt998","BMW","M4",60.0,0.8);
		
		//questo è un esempio di come impostare i dati e richiamarli 
		//invece da CarController l'esempio è un esempio ottimizzato
		System.out.println("Targa Ferrari " + ferrari.getTarga());
		ferrari.setTarga("AAAAAAA");
		System.out.println("Targa Ferrari " + ferrari.getTarga());
		panda.setTarga("DY222YY");
		System.out.println("Targa Panda " + panda.getTarga());
		System.out.println(ferrari.toString());
		System.out.println("Targa Ferrari " + bmw.getTarga());
		bmw.setTarga("DY222YY");
		
		//-----------------------------------------------
		//sintassi nomeClasse.nomeMetodo(par1,par2)
		CarController.aggiornaFuel(ferrari, 10);//<--------- questa procedura è più corretta con gli static se cancello static non funziona più
		System.out.println(ferrari);
		
		/*
		CarController control = new CarController();//<----------------- dal punto di vista sintattico è corretto ma sbagliato dal punto di vista logico
		System.out.println("fuel" + ferrari.getFuel());
		System.out.println(panda);*/
		
	}

}