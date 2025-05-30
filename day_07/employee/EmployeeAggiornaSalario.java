package day_07.employee;

public class EmployeeAggiornaSalario {
	public static void raiseSalary(Employee employee, double byPercent) {
		double calcoloPerc = byPercent * employee.getStipendio() / 100;
		employee.setStipendio(employee.getStipendio() + calcoloPerc);
		
	}
}
