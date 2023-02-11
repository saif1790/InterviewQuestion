package com.demo.interviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {

		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee("saif", 25, 000000));
		listEmp.add(new Employee("sam", 25, 65000));
		listEmp.add(new Employee("test", 20, 28000));
		listEmp.add(new Employee("waseem", 22, 30000));
		listEmp.add(new Employee("abc", 30, 61000));
		listEmp.add(new Employee("dumm", 23, 33000));
		listEmp.add(new Employee("riz", 35, 47880));

		System.out.println("Employee List before hike====");
		int c = 0;
		for (Employee employee : listEmp) {
			c++;
			System.out.println("Employee Name " + employee.getName());
			System.out.println("Employee Age " + employee.getAge());
			System.out.println("Employee Salary " + employee.getSalary());
			System.out.println("========================");
		}
		// employee get hiked who having age >25 then salary increamented by 25%
		/*
		 * List<Employee> increamentedSAlary = listEmp.stream().map(e -> {
		 * 
		 * if (e.getAge() > 25) { e.setSalary(e.getSalary()*1.25); } return e; }
		 * 
		 * ).collect(Collectors.toList());
		 */
		List<Employee> collect = listEmp.stream().filter(e -> e.getAge() > 25).collect(Collectors.toList());

		System.out.println("*****************increamentedSAlary***************");

		for (Employee employee : collect) {
			double salary = employee.getSalary();
			double incrementedSalary = salary * 1.25;

			System.out.println("Employee Name " + employee.getName());
			System.out.println("Employee Age " + employee.getAge());
			System.out.println("Employee Previous Salary " + employee.getSalary());
			System.out.println("Salary incremented By 25% " + (incrementedSalary-employee.getSalary()));
			System.out.println("Employee Current Salary " + incrementedSalary);
			System.out.println("********************");
		}

	}
}
