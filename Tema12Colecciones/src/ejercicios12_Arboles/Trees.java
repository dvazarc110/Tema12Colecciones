package ejercicios12_Arboles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trees {
	public void show() {
		Employee employee1 = new Employee("Pepe", Category.EMPLOYEE, LocalDate.of(2011, 3, 21), LocalDate.of(2023, 4, 22));
		Employee employee2 = new Employee("Juan", Category.MANAGER, LocalDate.of(2012, 2, 29), null);
		Employee employee3 = new Employee("María", Category.BOSS, LocalDate.of(2010, 4, 30), LocalDate.of(2014, 5, 31));
		Employee employee4 = new Employee("Laura", Category.EMPLOYEE, LocalDate.of(2010, 12, 30), null);
		Employee employee5 = new Employee("Esteban", Category.MANAGER, LocalDate.of(2010, 11, 5), LocalDate.of(2024, 2, 20));
		Employee employee6 = new Employee("Pedro", Category.BOSS, LocalDate.of(2009, 8, 16), null);
		Employee employee7 = new Employee("Yolanda", Category.EMPLOYEE, LocalDate.of(2012, 7, 27), LocalDate.of(2013, 10, 1));
		Employee employee8 = new Employee("Nuria", Category.BOSS, LocalDate.of(2009, 8, 31), null);
		Employee employee9 = new Employee("Antonio", Category.MANAGER, LocalDate.of(2011, 1, 28), LocalDate.of(2024, 5, 14));
		
	}

	public static void main(String[] args) {
		new Trees().show();
	}
}
