package com.joerg.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2Main {

	public static void main(String[] args) {
		Example2Employee employee1 = new Example2Employee("jkl", 20);
		Example2Employee employee2 = new Example2Employee("ghi", 30);
		Example2Employee employee3 = new Example2Employee("def", 40);
		Example2Employee employee4 = new Example2Employee("abc", 50);
		
		List<Example2Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		Collections.sort(employees, new Comparator<Example2Employee>() {
			@Override
			public int compare(Example2Employee employee1, Example2Employee employee2) {
				return employee1.getName().compareTo(employee2.getName());
			}
		});
		
		for (Example2Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}
}
