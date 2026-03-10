package ejercicios12_Arboles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Trees {
	public void show() {
		List<Employee> listaemp = new ArrayList<>();
		Employee employee1 = new Employee("Pepe", Category.EMPLOYEE, LocalDate.of(2011, 3, 21), LocalDate.of(2023, 4, 22));
		listaemp.add(employee1);
		Employee employee2 = new Employee("Juan", Category.MANAGER, LocalDate.of(2012, 2, 29), null);
		listaemp.add(employee2);
		Employee employee3 = new Employee("María", Category.BOSS, LocalDate.of(2010, 4, 30), LocalDate.of(2014, 5, 31));
		listaemp.add(employee3);
		Employee employee4 = new Employee("Laura", Category.EMPLOYEE, LocalDate.of(2010, 12, 30), null);
		listaemp.add(employee4);
		Employee employee5 = new Employee("Esteban", Category.MANAGER, LocalDate.of(2010, 11, 5), LocalDate.of(2024, 2, 20));
		listaemp.add(employee5);
		Employee employee6 = new Employee("Pedro", Category.BOSS, LocalDate.of(2009, 8, 16), null);
		listaemp.add(employee6);
		Employee employee7 = new Employee("Yolanda", Category.EMPLOYEE, LocalDate.of(2012, 7, 27), LocalDate.of(2013, 10, 1));
		listaemp.add(employee7);
		Employee employee8 = new Employee("Nuria", Category.BOSS, LocalDate.of(2009, 8, 31), null);
		listaemp.add(employee8);
		Employee employee9 = new Employee("Antonio", Category.MANAGER, LocalDate.of(2011, 1, 28), LocalDate.of(2024, 5, 14));
		listaemp.add(employee9);
		
		SortedSet<Employee> tree1 = new TreeSet<>();
		for(Employee emp : listaemp) {
			tree1.add(emp);
		}
		System.out.println("Árbol 1:\n");
		for(Employee emp : tree1) {
			System.out.println(emp);
		}
		
		
		SortedSet<Employee> tree2 = new TreeSet<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int result = (o2.name).compareTo(o1.name);
				return result;
			}
		});
		for(Employee emp : listaemp) {
			tree2.add(emp);
		}
		System.out.println("\nÁrbol 2:\n");
		for(Employee emp : tree2) {
			System.out.println(emp);
		}
		
		SortedMap<Key, Employee> treeMap = new TreeMap<>(new Comparator<Key>() {

			@Override
			public int compare(Key o1, Key o2) {
				int result = Integer.compare((o1.category.ordinal()), (o2.category.ordinal()));
				if (result == 0) {
					result = Integer.compare(o1.num, o2.num);
				}
				return result;
			}
			
		});
		for(Employee emp : listaemp) {
			treeMap.put(emp.key, emp);
		}
		System.out.println("\nÁrbol 3:\n");
		for(Map.Entry<Key, Employee> emp : treeMap.entrySet()) {
			System.out.println(emp.getValue());
		}
		
	}

	public static void main(String[] args) {
		new Trees().show();
	}
}
