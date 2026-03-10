package ejercicios12_Arboles;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee implements Comparable<Employee>{

	Key key;
	String name;
	LocalDate startDate, endDate;
	
	Employee(String name,Category category,LocalDate startDate,LocalDate endDate){
		this.key = new Key(category);
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	private Employee(Employee employee) {
		this.key = employee.key;
		this.name = employee.name;
		this.startDate = employee.startDate;
		this.endDate = employee.endDate;	
	}
	
	public Employee copy() {
		return new Employee(this);
	}
	
	public long daysWorked() {
		long dias = (this.startDate).until((this.endDate != null)? this.endDate: LocalDate.now(), ChronoUnit.DAYS);
		return dias;
	}

	@Override
	public String toString() {
		String output = String.format("%-10s Nombre: %-10s Clave: %-4s Fecha alta: %-12s Fecha baja: %-12s Días en la empresa: %d", (this.key).category, this.name, this.key, (this.startDate).toString(), (this.endDate != null)? this.endDate.toString():"no tiene", (int)daysWorked());
		return output;
	}

	@Override
	public int compareTo(Employee o) {
		int result = (int)(daysWorked().compareTo(o.daysWorked()));
		return 0;
	}

	
	
	
}
