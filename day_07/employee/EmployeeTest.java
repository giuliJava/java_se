package day_07.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee impiegato1 = new Employee();
		Employee impiegato2 = new Employee("Giuliana", "Vecchi", 12.000);
		
		impiegato1.setCognome("Ferrari");
		impiegato1.setNome("Giovannina");
		impiegato1.setStipendio(15.000);
		System.out.println("Nome impiegato codice 1: " + impiegato1.getNome());
		System.out.println("Cognome impiegato codice 1: " + impiegato1.getCognome());
		System.out.println("Stipendio impiegato codice 1: " + impiegato1.getStipendio());
		
		System.out.println("Nome impiegato codice 1: " + impiegato2.getNome());
		System.out.println("Cognome impiegato codice 1: " + impiegato2.getCognome());
		System.out.println("Stipendio impiegato codice 1: " + impiegato2.getStipendio());
		
		//----------------------------------------------------
		EmployeeAggiornaSalario.raiseSalary(impiegato1, 10);
		System.out.println(impiegato1);
		
		EmployeeAggiornaSalario.raiseSalary(impiegato2, 50);
		System.out.println(impiegato2);
	}

}
