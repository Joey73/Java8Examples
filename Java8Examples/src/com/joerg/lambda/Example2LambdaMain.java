package com.joerg.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2LambdaMain {

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
		
		// Lamda
		//Collections.sort(employees, (Example2Employee e1, Example2Employee e2) -> e1.getName().compareTo(e2.getName()));
		// Shorter
		Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		
		for (Example2Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}
}
